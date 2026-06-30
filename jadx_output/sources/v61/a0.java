package v61;

/* loaded from: classes4.dex */
public class a0 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f433422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v61.b0 b0Var, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference) {
        super(i17, m3Var);
        this.f433422e = weakReference;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleUnavailableAccountTipClickListener", "onClickDetail", null);
        android.content.Context context = (android.content.Context) this.f433422e.get();
        if (context != null) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, true);
            z2Var.y(context.getString(com.tencent.mm.R.string.f490454vi));
            z2Var.F = new v61.a0$$a(z2Var);
            z2Var.x(1);
            z2Var.j(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dpi, (android.view.ViewGroup) null));
            z2Var.C();
        }
    }
}
