package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124574a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f124575b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124576c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124577d;

    public i2(android.view.View header, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124574a = activity;
        this.f124575b = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.h2(header));
        this.f124576c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.e2(this));
        this.f124577d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.f2(this));
    }

    public final void a(java.lang.String source, java.lang.String username, ya2.b2 b2Var) {
        r45.fw0 fw0Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "[handleMIniProgramList] source:".concat(source));
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(username);
        jz5.f0 f0Var = null;
        java.util.LinkedList list = (l2Var == null || (fw0Var = l2Var.f123918g) == null) ? null : fw0Var.getList(1);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        jz5.g gVar = this.f124576c;
        ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
        java.util.LinkedList linkedList = ((list == null || list.isEmpty()) || isTeenMode) ? false : true ? list : null;
        if (linkedList != null) {
            boolean b17 = kotlin.jvm.internal.o.b("onSceneEnd:[NetSceneFinderUserPage]", source);
            androidx.appcompat.app.AppCompatActivity activity = this.f124574a;
            if (b17) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                java.lang.String string = ((r45.ch2) linkedList.get(0)).getString(0);
                if (string == null) {
                    string = "";
                }
                kotlin.jvm.internal.o.g(activity, "activity");
                o3Var.Ak(5, username, "", string, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            }
            ((android.widget.TextView) ((jz5.n) this.f124577d).getValue()).setText(activity.getResources().getString(com.tencent.mm.R.string.ez9, ((r45.ch2) linkedList.get(0)).getString(2)));
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.g2(username, linkedList, this, b2Var));
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(0);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
        }
    }
}
