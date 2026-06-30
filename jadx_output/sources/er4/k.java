package er4;

/* loaded from: classes5.dex */
public enum k implements com.tencent.mm.protobuf.h {
    VoIPMPIlinkSDKStatTypeNotifyAction(0),
    /* JADX INFO: Fake field, exist only in values array */
    VoIPMPIlinkSDKStatTypeOnTemperatureChange(1),
    /* JADX INFO: Fake field, exist only in values array */
    VoIPMPIlinkSDKStatTypeOnBatteryChange(2),
    /* JADX INFO: Fake field, exist only in values array */
    VoIPMPIlinkSDKStatTypeOnCpuUsageChange(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f256113d;

    k(int i17) {
        this.f256113d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256113d;
    }
}
