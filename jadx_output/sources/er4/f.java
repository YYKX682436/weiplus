package er4;

/* loaded from: classes6.dex */
public enum f implements com.tencent.mm.protobuf.h {
    BANNER_STATUS_EXIT(0),
    BANNER_STATUS_ENTER(1),
    BANNER_STATUS_WAIT(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f256081d;

    f(int i17) {
        this.f256081d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256081d;
    }
}
