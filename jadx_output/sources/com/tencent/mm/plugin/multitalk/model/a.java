package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class a implements com.tencent.mm.plugin.multitalk.model.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.j f149873a;

    public a(com.tencent.mm.plugin.multitalk.model.j jVar) {
        this.f149873a = jVar;
    }

    public void a(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            n17.k();
        }
        com.tencent.mm.plugin.multitalk.model.j jVar = this.f149873a;
        sj3.j g17 = jVar.g(wxUserName);
        boolean z17 = false;
        if (g17 != null) {
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = g17.f408577d;
            if (!(multitalkFrameView != null ? multitalkFrameView.j() : false)) {
                g17 = null;
            }
            if (g17 != null) {
                g17.n(true, false);
            }
        }
        sj3.j jVar2 = jVar.f150008h;
        if (jVar2 != null) {
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView2 = jVar2.f408577d;
            if (kotlin.jvm.internal.o.b(multitalkFrameView2 != null ? multitalkFrameView2.getF150344m() : null, wxUserName)) {
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView3 = jVar2.f408577d;
                if (multitalkFrameView3 != null ? multitalkFrameView3.j() : false) {
                    z17 = true;
                }
            }
            sj3.j jVar3 = z17 ? jVar2 : null;
            if (jVar3 != null) {
                jVar3.n(true, true);
            }
        }
    }
}
