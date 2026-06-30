package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f140367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140368e;

    public m2(com.tencent.mm.plugin.game.model.r2 r2Var, int i17, android.content.Context context) {
        this.f140367d = i17;
        this.f140368e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f140368e;
        int i17 = this.f140367d;
        if (i17 == 0) {
            ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).f140985d.getGameTabWidget().setTabSwitchEnable(false);
        } else if (i17 == 1) {
            ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).f140985d.getGameTabWidget().setTabSwitchEnable(true);
        }
    }
}
