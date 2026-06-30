package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124841a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f124842b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124843c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124844d;

    public z1(android.view.View header, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124841a = activity;
        this.f124842b = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.y1(header));
        this.f124843c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.u1(this));
        this.f124844d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.v1(this));
    }

    public final void a(java.lang.String username, ya2.b2 b2Var) {
        r45.xk xkVar;
        java.lang.String string;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(username);
        if (l2Var == null) {
            l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        r45.fw0 fw0Var = l2Var.f123918g;
        jz5.g gVar = this.f124843c;
        jz5.f0 f0Var = null;
        if (fw0Var != null) {
            java.util.LinkedList list = fw0Var.getList(0);
            if (list != null) {
                if (!((list.isEmpty() ^ true) && !isTeenMode)) {
                    list = null;
                }
                if (list != null) {
                    java.lang.String string2 = ((r45.xk) list.get(0)).getString(0);
                    if (!(!(string2 == null || string2.length() == 0))) {
                        list = null;
                    }
                    if (list != null && (xkVar = (r45.xk) list.get(0)) != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) gVar).getValue();
                        kotlin.jvm.internal.o.f(relativeLayout, "<get-finderMediaEntrance>(...)");
                        ym5.a1.h(relativeLayout, new com.tencent.mm.plugin.finder.profile.widget.w1(b2Var, xkVar, this, username));
                        ((android.widget.RelativeLayout) ((jz5.n) gVar).getValue()).setVisibility(0);
                        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f124844d).getValue();
                        java.lang.String string3 = xkVar.getString(6);
                        if (string3 == null || string3.length() == 0) {
                            string = this.f124841a.getResources().getString(com.tencent.mm.R.string.ey_, xkVar.getString(1));
                        } else {
                            string = xkVar.getString(6) + ": " + xkVar.getString(1);
                        }
                        textView.setText(string);
                        ((android.widget.RelativeLayout) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.x1(b2Var, xkVar, this, username));
                        f0Var = jz5.f0.f302826a;
                    }
                }
            }
        }
        if (f0Var == null) {
            ((android.widget.RelativeLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
        }
    }
}
