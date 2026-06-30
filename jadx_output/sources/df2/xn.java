package df2;

/* loaded from: classes3.dex */
public final class xn implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zn f231790d;

    public xn(df2.zn znVar) {
        this.f231790d = znVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        co0.s sVar;
        kn0.p pVar;
        km2.w wVar = (km2.w) obj;
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z17 = (w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true;
        com.tencent.mars.xlog.Log.i("LiveMiniWindowController", "liveInfoChangeLiveData collect value " + wVar + " isFloatMode: " + z17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            boolean z18 = wVar instanceof km2.h;
            df2.zn znVar = this.f231790d;
            if (z18) {
                znVar.getClass();
                java.lang.String str = ((km2.h) wVar).f309104a.f338718d;
                if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) znVar.business(mm2.c1.class)).m8(), str != null ? str : "")) {
                    tn0.w0 w0Var2 = dk2.ef.f233378d;
                    sVar = w0Var2 instanceof co0.s ? (co0.s) w0Var2 : null;
                    if (sVar != null) {
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = new com.tencent.mm.live.core.view.LiveVideoView(context);
                        fo0.n nVar = sVar.f420767p;
                        if (nVar != null) {
                            nVar.c(liveVideoView);
                        }
                        if (sVar.R1.f282409a == null) {
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            sVar.Y0(context2, zl2.r4.f473950a.d0("LiveMiniWindowController"), new df2.vn(), ((mm2.c1) znVar.business(mm2.c1.class)).g8());
                        }
                        sVar.S0(1, liveVideoView, df2.wn.f231702d);
                    }
                }
            } else if (wVar instanceof km2.a) {
                znVar.getClass();
                java.lang.String str2 = ((km2.a) wVar).f309048a.f338702c;
                if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) znVar.business(mm2.c1.class)).m8(), str2 != null ? str2 : "")) {
                    tn0.w0 w0Var3 = dk2.ef.f233378d;
                    sVar = w0Var3 instanceof co0.s ? (co0.s) w0Var3 : null;
                    if (sVar != null) {
                        sVar.T0(true);
                    }
                }
            }
        }
        return f0Var;
    }
}
