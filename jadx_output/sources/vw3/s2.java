package vw3;

/* loaded from: classes.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f441105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441106e;

    public s2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI, java.lang.String str) {
        this.f441105d = repairerMagicBootsUI;
        this.f441106e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f441105d.getContext(), "check fail:" + this.f441106e, 1).show();
    }
}
