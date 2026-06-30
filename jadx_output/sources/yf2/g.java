package yf2;

/* loaded from: classes3.dex */
public final class g implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f461695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461696f;

    public g(mm2.n0 n0Var, kotlin.jvm.internal.c0 c0Var, yf2.o oVar) {
        this.f461694d = n0Var;
        this.f461695e = c0Var;
        this.f461696f = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean O6 = this.f461694d.O6();
        if (this.f461695e.f310112d && !O6) {
            boolean z17 = this.f461694d.f329274s;
            this.f461694d.f329274s = false;
            mm2.m0 m0Var = this.f461694d.f329275t;
            mm2.n0 n0Var = this.f461694d;
            mm2.m0 m0Var2 = mm2.m0.f329230d;
            n0Var.getClass();
            n0Var.f329275t = m0Var2;
            com.tencent.mars.xlog.Log.i("Finder.CoLiveController", "co-live invitation invalidated, skipToast=" + z17 + ", reason=" + m0Var + ", restore last mode + reopen camera");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f461696f.f461756m;
            if (u3Var != null) {
                if (!u3Var.isShowing()) {
                    u3Var = null;
                }
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
            this.f461696f.f461756m = null;
            if (!z17) {
                int i17 = yf2.f.f461687a[m0Var.ordinal()] == 1 ? com.tencent.mm.R.string.f493465oo4 : com.tencent.mm.R.string.omc;
                android.content.Context O62 = this.f461696f.O6();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O62);
                e4Var.f211776c = this.f461696f.O6().getString(i17);
                e4Var.c();
            }
            mm2.s1 s1Var = (mm2.s1) this.f461696f.business(mm2.s1.class);
            r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329068f).getValue();
            if (q12Var != null && q12Var.getInteger(0) == 5) {
                r45.q12 P6 = s1Var.P6();
                com.tencent.mars.xlog.Log.i(s1Var.f329386f, "[restoreToLastNonCoLiveMode] CoLive -> mode=" + P6.getInteger(0) + '/' + P6.getInteger(1));
                ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329068f).k(P6);
                ((mm2.e1) s1Var.business(mm2.e1.class)).n7(P6);
            }
            mm2.c1 c1Var = (mm2.c1) this.f461696f.business(mm2.c1.class);
            if (c1Var.l7()) {
                c1Var.D8(0);
            }
            yf2.o oVar = this.f461696f;
            qo0.b bVar = qo0.b.f365390n5;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true);
            oVar.X6(bVar, bundle);
        }
        this.f461695e.f310112d = O6;
        return jz5.f0.f302826a;
    }
}
