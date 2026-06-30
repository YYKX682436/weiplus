package zi4;

/* loaded from: classes4.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.n1 f473238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.zb f473239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(zi4.n1 n1Var, bw5.zb zbVar) {
        super(0);
        this.f473238d = n1Var;
        this.f473239e = zbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f473238d.f473181e;
        if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Native Handle: ");
            bw5.zb zbVar = this.f473239e;
            sb6.append(zbVar != null ? zbVar.f35927e[1] ? zbVar.f35926d : "" : null);
            e4Var.f211776c = sb6.toString();
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
