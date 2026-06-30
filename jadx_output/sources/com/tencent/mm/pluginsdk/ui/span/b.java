package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes9.dex */
public abstract class b {
    public static r35.m3 a(android.content.Context context, java.lang.String str, int i17, int i18, int i19, int i27) {
        r35.m3 c17;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.app.plugin.s sVar = (com.tencent.mm.app.plugin.s) com.tencent.mm.pluginsdk.ui.span.n.a();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f53682h;
        copyOnWriteArrayList.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = sVar.f53683i;
        copyOnWriteArrayList2.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = sVar.f53684m;
        copyOnWriteArrayList3.size();
        com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = sVar.f53680f;
        r35.m3 m3Var = null;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl error, context is null!");
            uRISpanHandlerSet.f53590a = null;
        } else {
            sVar.f53681g = context;
            uRISpanHandlerSet.f53590a = context;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                sVar.f53681g = null;
                uRISpanHandlerSet.f53590a = null;
            } else {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c17 = ((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it.next()).c(str);
                        if (c17 != null) {
                            sVar.f53681g = null;
                            uRISpanHandlerSet.f53590a = null;
                            break;
                        }
                    } else {
                        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                c17 = ((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it6.next()).c(str);
                                if (c17 != null) {
                                    sVar.f53681g = null;
                                    uRISpanHandlerSet.f53590a = null;
                                    break;
                                }
                            } else {
                                java.util.Iterator it7 = copyOnWriteArrayList3.iterator();
                                while (it7.hasNext()) {
                                    c17 = ((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it7.next()).c(str);
                                    if (c17 != null) {
                                        sVar.f53681g = null;
                                        uRISpanHandlerSet.f53590a = null;
                                    }
                                }
                                sVar.f53681g = null;
                                uRISpanHandlerSet.f53590a = null;
                            }
                        }
                    }
                }
                m3Var = c17;
            }
        }
        if (m3Var != null) {
            m3Var.f369192a = i17;
            m3Var.f369193b = i18;
            m3Var.f369202k = i19;
            m3Var.f369203l = i27;
        }
        return m3Var;
    }

    public static java.util.ArrayList b(android.content.Context context, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191176k.matcher(str);
        while (matcher.find()) {
            r35.m3 a17 = a(context, matcher.group(), matcher.start(), matcher.end(), 0, 0);
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        return arrayList;
    }
}
