public class Object_Volume
{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume()
    {
        return(getLength() * getWidth() * getHeight());
    }

    public static void main(String[]args)
    {
        Object_Volume volume = new Object_Volume();
        volume.setLength(20);
        volume.setWidth(20);
        volume.setHeight(20);

        System.out.println(volume.getVolume());
    }


}
