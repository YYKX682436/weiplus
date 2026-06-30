package zi4;

/* loaded from: classes4.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.k1 f473229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.zb f473230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zi4.k1 k1Var, bw5.zb zbVar) {
        super(0);
        this.f473229d = k1Var;
        this.f473230e = zbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f473229d.f473181e;
        if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = "Data from Flutter: " + this.f473230e.getData();
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
