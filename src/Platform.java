public class Platform {
    private Integer platformNum;
    private Train train;

    public Platform(Integer platformNum) {
        this.platformNum = platformNum;
    }

    public Integer getPlatformNum() {
        return platformNum;
    }

    public void setPlatformNum(Integer platformNum) {
        this.platformNum = platformNum;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNum=" + platformNum +
                ", train=" + train +
                '}';
    }
}
