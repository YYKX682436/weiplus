package f22;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f22.e f258966a = new f22.e();

    public final void a(android.content.Context context, f22.a pageContext) {
        kotlin.jvm.internal.o.g(pageContext, "pageContext");
        if (context == null) {
            com.tencent.mars.xlog.Log.e("StoreEmoticonDesignerProfileJumpLogic", "view context is null");
        } else {
            b(context, pageContext, true, false, new f22.b(context, pageContext));
        }
    }

    public final void b(android.content.Context context, f22.a pageContext, boolean z17, boolean z18, yz5.l callback) {
        com.tencent.mm.ui.widget.dialog.f4 f4Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageContext, "pageContext");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Vi(pageContext.f364027g);
        com.tencent.mm.ui.widget.dialog.f4 f4Var2 = null;
        if (!(pageContext.f364029i.length() == 0)) {
            pageContext.f364027g = com.tencent.mm.plugin.emoji.model.EmojiLogic.d(pageContext.f364029i);
            java.lang.String str2 = pageContext.f364029i;
            r45.v75 v75Var = new r45.v75();
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "xml", null);
            try {
                v75Var.f387965e = (java.lang.String) d17.get(".xml.designername");
                v75Var.f387964d = kk.v.b((java.lang.String) d17.get(".xml.designeruin"));
                v75Var.f387967g = (java.lang.String) d17.get(".xml.finderusername");
                v75Var.f387969i = (java.lang.String) d17.get(".xml.finderheadimgurl");
                v75Var.f387970m = (java.lang.String) d17.get(".xml.findernickname");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerBySnsObjData exception. %s", e17.toString());
            }
            try {
                str = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(pageContext.f364029i, "xml", null).get(".xml.designerrediretcturl");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerRediretctUrlBySnsObjData exception. %s", e18.toString());
                str = "";
            }
            kotlin.jvm.internal.o.f(str, "getDesignerRediretctUrlBySnsObjData(...)");
            pageContext.f364036p = str;
            java.lang.String str3 = pageContext.f364029i;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            try {
                if (((java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(str3, "xml", null).get(".xml.finderusername")) != null) {
                    bool = java.lang.Boolean.TRUE;
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLogic", "isFinderNameExistInDesignerSnsObjData exception. %s", e19.toString());
            }
            kotlin.jvm.internal.o.f(bool, "isFinderNameExistInDesignerSnsObjData(...)");
            if (bool.booleanValue()) {
                pageContext.f364035o = true;
            }
        }
        if (pageContext.f364035o) {
            r45.v75 v75Var2 = new r45.v75();
            v75Var2.f387964d = pageContext.f364027g;
            v75Var2.f387965e = pageContext.f364030j;
            v75Var2.f387967g = pageContext.f364032l;
            v75Var2.f387970m = pageContext.f364033m;
            v75Var2.f387969i = pageContext.f364034n;
            y12.p.f458877a.e(v75Var2, pageContext.f364028h);
            callback.invoke(v75Var2);
            return;
        }
        if (!(pageContext.f364028h.length() > 0)) {
            if (pageContext.f364027g != 0) {
                if (z17) {
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211780g = 2;
                    f4Var2 = e4Var.c();
                }
                y12.p.f458877a.b(pageContext.f364027g, z18, new f22.d(f4Var2, callback));
                return;
            }
            return;
        }
        if (z17) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211780g = 2;
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.gga);
            f4Var = e4Var2.c();
        } else {
            f4Var = null;
        }
        y12.p pVar = y12.p.f458877a;
        java.lang.String designerId = pageContext.f364028h;
        f22.c cVar = new f22.c(f4Var, callback);
        kotlin.jvm.internal.o.g(designerId, "designerId");
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) y12.p.f458878b).get(designerId);
        if (num != null) {
            pVar.b(num.intValue(), z18, cVar);
        } else if (z18) {
            cVar.invoke(null);
        } else {
            new z12.b0(designerId, 0).a(new y12.n(cVar));
        }
    }
}
