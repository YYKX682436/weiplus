package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public class hy extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.xs2 f134677d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f134678e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f134679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134678e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.gy(this));
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134679f = (ey2.t0) a17;
    }

    public java.lang.String O6() {
        return "FinderEntrance";
    }

    public boolean P6() {
        boolean f07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f0();
        com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowEntranceRedDot=" + f07);
        return !f07;
    }

    public void Q6() {
        int c17 = com.tencent.mm.plugin.finder.extension.reddot.ta.f105879a.c("Finder.TlTabStateVM", ((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderEntrance");
        com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", "[markHardRefresh] aliveType=" + c17);
        this.f134679f.N6(c17).a(ey2.q0.f257472e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        java.lang.String str;
        r45.xs2 xs2Var;
        r45.pc1 pc1Var;
        java.lang.String string;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) ((jz5.n) this.f134678e).getValue();
        this.f134677d = jbVar != null ? jbVar.N : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterCtrlInfoExt=");
        sb6.append(this.f134677d != null);
        sb6.append(" enter_action=");
        r45.xs2 xs2Var2 = this.f134677d;
        sb6.append(xs2Var2 != null ? java.lang.Integer.valueOf(xs2Var2.getInteger(13)) : null);
        sb6.append(" jump_config=");
        r45.xs2 xs2Var3 = this.f134677d;
        r45.pc1 pc1Var2 = xs2Var3 != null ? (r45.pc1) xs2Var3.getCustom(18) : null;
        if (pc1Var2 == null) {
            str = "";
        } else {
            str = "miniapp_path=" + pc1Var2.getString(1) + ", miniapp_scene=" + pc1Var2.getInteger(3) + ", miniapp_username=" + pc1Var2.getString(0) + "web_url=" + pc1Var2.getString(2);
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.RedDotUIJumpUIC", sb6.toString());
        if (P6() || (xs2Var = this.f134677d) == null || (pc1Var = (r45.pc1) xs2Var.getCustom(18)) == null) {
            return;
        }
        r45.xs2 xs2Var4 = this.f134677d;
        if (xs2Var4 != null && xs2Var4.getInteger(13) == 6) {
            java.lang.String string2 = pc1Var.getString(2);
            if (string2 != null) {
                if (!(string2.length() > 0)) {
                    string2 = null;
                }
                if (string2 != null) {
                    Q6();
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    androidx.appcompat.app.AppCompatActivity context = getActivity();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[enterWebViewForRedDot] url=".concat(string2));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", string2);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            }
            return;
        }
        r45.xs2 xs2Var5 = this.f134677d;
        if (!(xs2Var5 != null && xs2Var5.getInteger(13) == 7) || (string = pc1Var.getString(0)) == null) {
            return;
        }
        java.lang.String str2 = string.length() > 0 ? string : null;
        if (str2 != null) {
            Q6();
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            androidx.appcompat.app.AppCompatActivity context2 = getActivity();
            java.lang.String string3 = pc1Var.getString(1);
            java.lang.String str3 = string3 != null ? string3 : "";
            int integer = pc1Var.getInteger(3);
            i0Var.getClass();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[enterWeAppForRedDot] appId=" + str2 + " enterPath=" + str3 + " scene=" + integer);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = str2;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b1Var.f317022f = str3;
            b1Var.f317032k = integer;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context2, b1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134678e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.gy(this));
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134679f = (ey2.t0) a17;
    }
}
