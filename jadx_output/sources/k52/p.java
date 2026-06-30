package k52;

/* loaded from: classes15.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (b52.b.o(valueOf)) {
            java.lang.String r17 = b52.b.r(i17);
            kotlin.jvm.internal.o.f(r17, "toHexString(...)");
            return r17;
        }
        try {
            java.lang.String r18 = b52.b.r(i17);
            kotlin.jvm.internal.o.f(r18, "toHexString(...)");
            return r18;
        } catch (java.lang.Exception unused) {
            return valueOf;
        }
    }

    public final java.lang.String b(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (-1 == view.getId()) {
            return "-1";
        }
        try {
            java.lang.String resourceName = view.getResources().getResourceName(view.getId());
            if (resourceName == null) {
                return a(view.getId());
            }
            java.util.List f07 = r26.n0.f0(r26.i0.t(resourceName, "/", ":", false), new java.lang.String[]{":"}, false, 0, 6, null);
            return "R:" + ((java.lang.String) f07.get(1)) + ':' + ((java.lang.String) f07.get(2));
        } catch (android.content.res.Resources.NotFoundException unused) {
            return a(view.getId());
        }
    }

    public final java.lang.String c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b52.b.g(view.getClass().getName()));
        for (java.lang.Object parent = view.getParent(); parent != null && (parent instanceof android.view.View); parent = ((android.view.View) parent).getParent()) {
            sb6.append("|");
            sb6.append(b52.b.g(parent.getClass().getName()));
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        java.lang.String g17;
        java.lang.String g18;
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str) || (g17 = b52.b.g(str2)) == null || (g18 = b52.b.g(str)) == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.ViewUtil", "isViewCallerOk: " + g17 + ", " + g18);
        if (r26.i0.n(g17, "$", false)) {
            if (!r26.i0.y(g18, g17, false)) {
                return false;
            }
        } else if (!kotlin.jvm.internal.o.b(g17, g18)) {
            return false;
        }
        return true;
    }

    public final boolean e(r45.a07 viewNode, r45.b07 viewOp) {
        kotlin.jvm.internal.o.g(viewNode, "viewNode");
        kotlin.jvm.internal.o.g(viewOp, "viewOp");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.ViewUtil", "viewEqual: " + viewNode.f369601d + ", " + viewOp.f370417d + ", " + viewNode.f369602e + ", " + viewOp.f370422i);
        if (kotlin.jvm.internal.o.b(viewNode.f369601d, viewOp.f370417d) || kotlin.jvm.internal.o.b(viewNode.f369602e, viewOp.f370422i)) {
            return d(viewNode.f369605h, viewOp.f370423m);
        }
        return false;
    }
}
