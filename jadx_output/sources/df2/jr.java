package df2;

/* loaded from: classes10.dex */
public final class jr implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f230496e;

    public jr(df2.lt ltVar, kotlin.jvm.internal.h0 h0Var) {
        this.f230495d = ltVar;
        this.f230496e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str = df2.lt.W;
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "dismiss half dialog");
        df2.lt ltVar = this.f230495d;
        ltVar.T = null;
        ltVar.f230715w = true;
        ltVar.x7();
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).Ai((java.lang.String) this.f230496e.f310123d);
        dk2.ef.f233372a.V(false);
    }
}
