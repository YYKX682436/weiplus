package r45;

/* loaded from: classes3.dex */
public enum vw4 implements com.tencent.mm.protobuf.h {
    Auto(0),
    Manual(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f388624d;

    vw4(int i17) {
        this.f388624d = i17;
    }

    public static r45.vw4 a(int i17) {
        if (i17 == 0) {
            return Auto;
        }
        if (i17 != 1) {
            return null;
        }
        return Manual;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f388624d;
    }
}
