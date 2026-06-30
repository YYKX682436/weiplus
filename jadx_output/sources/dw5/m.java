package dw5;

/* loaded from: classes15.dex */
public enum m implements com.tencent.mm.protobuf.h {
    Weixin(0),
    MP(1),
    Finder(2),
    Fake(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f244389d;

    m(int i17) {
        this.f244389d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f244389d;
    }
}
