package er4;

/* loaded from: classes6.dex */
public enum t implements com.tencent.mm.protobuf.h {
    SHUTDOWN_CODE_OTHER_APP_BROKEN(1),
    SHUTDOWN_CODE_CRASH(2),
    SHUTDOWN_CODE_WEAK_NET_BROKEN(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f256175d;

    t(int i17) {
        this.f256175d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256175d;
    }
}
