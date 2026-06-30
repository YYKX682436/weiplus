package ws2;

/* loaded from: classes3.dex */
public final class e1 implements dt2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449029a;

    public e1(ws2.k1 k1Var) {
        this.f449029a = k1Var;
    }

    @Override // dt2.d0
    public void a(boolean z17) {
        ws2.k1 k1Var = this.f449029a;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        int i17 = jVar != null ? jVar.f222273q : 0;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "onPlayBtnClick start to play:" + z17 + ",offset:" + i17);
        if (z17) {
            ws2.k1.c(k1Var, i17);
        }
    }

    @Override // dt2.d0
    public void b() {
        ws2.k1 k1Var = this.f449029a;
        dt2.b0 b0Var = k1Var.f449073e;
        if (b0Var == null || b0Var.getUIContext() == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
        k1Var.r(intent);
    }

    @Override // dt2.d0
    public void c(qs5.o mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "FullScreenUI onCloseClick mode:" + mode + '!');
        if (mode != qs5.o.f366455h) {
            ws2.k1 k1Var = this.f449029a;
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            k1Var.l(4, jVar != null ? jVar.O6() : 0L, true);
        }
    }
}
