package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124784a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f124785b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124786c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124787d;

    public u(android.view.View header, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124784a = activity;
        this.f124785b = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.t(header));
        this.f124786c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.r(this));
        this.f124787d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.s(this));
    }

    public final void a(java.lang.String username) {
        java.lang.String str;
        r45.sf2 sf2Var;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(username);
        java.lang.String str2 = "";
        if (l2Var == null || (sf2Var = l2Var.f123927p) == null || (str = sf2Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "[handleIPAndMcn] agencyName:".concat(str));
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128040ya).getValue()).r()).intValue() == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str2 = "" + this.f124784a.getResources().getString(com.tencent.mm.R.string.ez7, str);
        }
        boolean z17 = str2.length() > 0;
        jz5.g gVar = this.f124786c;
        if (!z17) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
        } else {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) this.f124787d).getValue()).setText(r26.n0.u0(str2).toString());
        }
    }
}
