package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.c0 f150028a;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f150030c;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.ArrayMap f150029b = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f150031d = kz5.c1.k(new jz5.l(100, new com.tencent.mm.plugin.multitalk.model.g2(this)), new jz5.l(101, new com.tencent.mm.plugin.multitalk.model.i2(this)), new jz5.l(102, new com.tencent.mm.plugin.multitalk.model.h2(this)), new jz5.l(104, new com.tencent.mm.plugin.multitalk.model.j2(this)));

    public static final void a(com.tencent.mm.plugin.multitalk.model.k2 k2Var, java.lang.String wxUserName) {
        com.tencent.mm.plugin.multitalk.model.c0 c0Var = k2Var.f150028a;
        if (c0Var != null) {
            com.tencent.mm.plugin.multitalk.model.a aVar = (com.tencent.mm.plugin.multitalk.model.a) c0Var;
            kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                n17.j(wxUserName);
            }
            aVar.f149873a.l(wxUserName, 3);
        }
    }

    public static final void b(com.tencent.mm.plugin.multitalk.model.k2 k2Var, java.lang.String wxUserName) {
        com.tencent.mm.plugin.multitalk.model.c0 c0Var = k2Var.f150028a;
        if (c0Var != null) {
            com.tencent.mm.plugin.multitalk.model.a aVar = (com.tencent.mm.plugin.multitalk.model.a) c0Var;
            kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                n17.k();
            }
            aVar.f149873a.l(wxUserName, 0);
        }
    }

    public final int c(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        java.lang.Integer num = (java.lang.Integer) this.f150029b.get(wxUserName);
        if (num == null) {
            return 100;
        }
        return num.intValue();
    }

    public final void d(java.lang.String wxUserName) {
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        com.tencent.mm.plugin.multitalk.model.c0 c0Var = this.f150028a;
        if (c0Var != null) {
            com.tencent.mm.plugin.multitalk.model.a aVar = (com.tencent.mm.plugin.multitalk.model.a) c0Var;
            kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                n17.j(wxUserName);
            }
            com.tencent.mm.plugin.multitalk.model.j jVar = aVar.f149873a;
            jVar.l(wxUserName, 3);
            sj3.j jVar2 = jVar.f150008h;
            if (kotlin.jvm.internal.o.b((jVar2 == null || (multitalkFrameView = jVar2.f408577d) == null) ? null : multitalkFrameView.getF150344m(), wxUserName)) {
                jVar.l(wxUserName, 4);
            }
        }
    }
}
