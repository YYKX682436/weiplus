package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f131688d;

    public b2(com.tencent.mm.plugin.finder.view.g2 g2Var) {
        this.f131688d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.g2 g2Var;
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue();
        kz5.p0 p0Var = kz5.p0.f313996d;
        com.tencent.mm.plugin.finder.view.g2 g2Var2 = this.f131688d;
        if (booleanValue) {
            long j17 = g2Var2.f132131c;
            java.lang.String str = g2Var2.f132132d;
            int i17 = g2Var2.f132134f;
            java.lang.String string = g2Var2.f132135g.getString(3);
            java.lang.String str2 = string == null ? "" : string;
            java.lang.String string2 = g2Var2.f132135g.getString(4);
            new db2.n(1, p0Var, j17, str, i17, str2, string2 == null ? "" : string2, null, null, 384, null).l();
            g2Var = g2Var2;
        } else {
            int i18 = 1;
            long j18 = g2Var2.f132131c;
            java.lang.String str3 = g2Var2.f132132d;
            int i19 = g2Var2.f132134f;
            java.lang.String string3 = g2Var2.f132135g.getString(3);
            java.lang.String str4 = string3 == null ? "" : string3;
            java.lang.String string4 = g2Var2.f132135g.getString(4);
            g2Var = g2Var2;
            gm0.j1.d().g(new db2.j5(i18, p0Var, j18, str3, i19, str4, string4 == null ? "" : string4, null, null, 384, null));
        }
        android.content.Context context = g2Var.f132130b;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491301cp3));
        g2Var.f132137i = 1;
        g2Var.dismiss();
    }
}
