package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 f148340d;

    public b0(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 mallIndexBaseUIv2) {
        this.f148340d = mallIndexBaseUIv2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 mallIndexBaseUIv2 = this.f148340d;
        com.tencent.mm.plugin.mall.ui.b.c(mallIndexBaseUIv2);
        mallIndexBaseUIv2.n7();
    }
}
