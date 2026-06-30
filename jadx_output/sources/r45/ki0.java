package r45;

/* loaded from: classes2.dex */
public enum ki0 implements com.tencent.mm.protobuf.h {
    EDU_BIZ_TYPE_LIKE(1),
    EDU_BIZ_TYPE_CANCEL_LIKE(2),
    EDU_BIZ_TYPE_UNKNOWN(0);


    /* renamed from: d, reason: collision with root package name */
    public final int f378713d;

    ki0(int i17) {
        this.f378713d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f378713d;
    }
}
