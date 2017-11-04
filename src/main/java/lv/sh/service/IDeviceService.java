package lv.sh.service;

import lv.sh.models.Device;

public interface IDeviceService {

    /**
     * Creates new device entity in DB.
     * @param device
     * @return
     */
    public Device addBird(Device device);
}