package sp2;

/* loaded from: classes2.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.m3 f411046d;

    public h3(sp2.m3 m3Var) {
        this.f411046d = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp2.m3 m3Var = this.f411046d;
        m3Var.f411100n = true;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView P6 = m3Var.P6();
        P6.f122127r = true;
        P6.a();
    }
}
