package p05;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f350549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(int i17, int i18) {
        super(1);
        this.f350548d = i17;
        this.f350549e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.w87 w87Var = (r45.w87) obj;
        return java.lang.Boolean.valueOf(w87Var.f388971d == this.f350548d && w87Var.f388972e == this.f350549e);
    }
}
