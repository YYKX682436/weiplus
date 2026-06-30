package r45;

/* loaded from: classes2.dex */
public enum ch7 implements com.tencent.mm.protobuf.h {
    English(1),
    origin(2),
    Chinese(0);


    /* renamed from: d, reason: collision with root package name */
    public final int f371561d;

    ch7(int i17) {
        this.f371561d = i17;
    }

    public static r45.ch7 a(int i17) {
        if (i17 == 0) {
            return Chinese;
        }
        if (i17 == 1) {
            return English;
        }
        if (i17 != 2) {
            return null;
        }
        return origin;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f371561d;
    }
}
