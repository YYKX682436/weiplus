package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.p8 f161383d;

    public o8(com.tencent.mm.plugin.setting.ui.setting.p8 p8Var) {
        this.f161383d = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        o25.t1 b17 = f14.g.b();
        android.app.Activity context = this.f161383d.getContext();
        ((com.tencent.mm.app.y7) b17).getClass();
        com.tencent.mm.process.KillProcessHelperActivity.f192149d.a(context, false);
    }
}
