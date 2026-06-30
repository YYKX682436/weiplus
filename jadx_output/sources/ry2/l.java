package ry2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fp5 f401403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.fp5 fp5Var) {
        super(4);
        this.f401403d = fp5Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String coverUrl = (java.lang.String) obj;
        java.lang.String fullCoverUrl = (java.lang.String) obj2;
        java.lang.String shareCoverUrl = (java.lang.String) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(fullCoverUrl, "fullCoverUrl");
        kotlin.jvm.internal.o.g(shareCoverUrl, "shareCoverUrl");
        r45.fp5 fp5Var = this.f401403d;
        fp5Var.f374528d = coverUrl;
        fp5Var.f374529e = fullCoverUrl;
        fp5Var.f374536o = shareCoverUrl;
        fp5Var.f374530f = intValue;
        return jz5.f0.f302826a;
    }
}
