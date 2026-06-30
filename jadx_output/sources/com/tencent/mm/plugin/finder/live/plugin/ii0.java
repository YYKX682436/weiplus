package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ii0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ji0 f112979d;

    public ii0(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var) {
        this.f112979d = ji0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var = this.f112979d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = ji0Var.f113109r;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.f();
        }
        com.tencent.mars.xlog.Log.i(ji0Var.f113107p, "show");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Rj((ml2.r0) c17, 1, null, 0, 6, null);
        r45.a73 a73Var = ((mm2.c1) ji0Var.P0(mm2.c1.class)).f328830k3;
        if (a73Var != null) {
            android.widget.TextView textView = ji0Var.f113110s;
            if (textView != null) {
                java.lang.String string = a73Var.getString(3);
                if (string == null) {
                    string = "";
                }
                textView.setText(string);
            }
            android.widget.ImageView imageView = ji0Var.f113111t;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                java.lang.String string2 = a73Var.getString(4);
                e17.c(new mn2.q3(string2 != null ? string2 : "", com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.f329965s));
            }
        }
    }
}
