package ey2;

/* loaded from: classes2.dex */
public final class s1 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f257498a;

    public s1(ey2.z1 z1Var) {
        this.f257498a = z1Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        ey2.z1 z1Var = this.f257498a;
        z1Var.getClass();
        z1Var.f257595h = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT, 0) > 0;
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "enter foreground isEnable=" + z1Var.f257595h);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "exit foreground isEnable=" + this.f257498a.f257595h);
    }
}
