package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public abstract class b {
    public static final java.lang.String a(int i17, java.util.LinkedList linkedList) {
        if (i17 > 0 && linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.j36 j36Var = (r45.j36) it.next();
                if (j36Var.f377543d == i17) {
                    java.lang.String Wording = j36Var.f377544e;
                    kotlin.jvm.internal.o.f(Wording, "Wording");
                    return Wording;
                }
            }
        }
        return "";
    }

    public static final java.lang.String b(android.content.Context context, int i17, r45.wl wlVar) {
        java.util.LinkedList linkedList;
        r45.l53 l53Var;
        if (wlVar != null && (wlVar.f389239m & i17) != 0 && (linkedList = wlVar.f389240n) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                l53Var = (r45.l53) it.next();
                if (l53Var.f379147d == i17) {
                    break;
                }
            }
        }
        l53Var = null;
        java.lang.String str = l53Var != null ? l53Var.f379149f : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", new android.content.Intent().putExtra("rawUrl", str), null);
            if (context != null) {
                if (!(context instanceof android.app.Activity)) {
                    context = null;
                }
                if (context != null) {
                    android.app.Activity activity = (android.app.Activity) context;
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
        if (l53Var != null) {
            return l53Var.f379148e;
        }
        return null;
    }

    public static final java.lang.String c(r45.wl wlVar, android.content.Context context) {
        return b(context, 8, wlVar);
    }

    public static final jz5.l d(r45.wl wlVar) {
        r45.td5 td5Var;
        r45.td5 td5Var2;
        java.util.LinkedList linkedList = null;
        java.lang.String a17 = a(1, (wlVar == null || (td5Var2 = wlVar.f389249w) == null) ? null : td5Var2.f386328e);
        if (wlVar != null && (td5Var = wlVar.f389249w) != null) {
            linkedList = td5Var.f386328e;
        }
        return new jz5.l(a17, a(2, linkedList));
    }
}
