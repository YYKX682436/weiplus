package ls1;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f320962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ls1.e0 e0Var) {
        super(1);
        this.f320962d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            str = "";
        }
        return java.lang.Boolean.valueOf(this.f320962d.Y0(str));
    }
}
