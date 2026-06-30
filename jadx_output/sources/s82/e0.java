package s82;

/* loaded from: classes9.dex */
public class e0 extends s82.c {
    public static java.lang.String n(java.util.List list, java.util.List list2, android.view.View view, java.lang.String str) {
        java.lang.String[] strArr;
        for (int i17 = 1; i17 < list2.size(); i17++) {
            r45.gp0 gp0Var = (r45.gp0) list2.get(i17);
            int i18 = gp0Var.I;
            if (gp0Var.I == 1) {
                java.lang.String str2 = gp0Var.f375408f;
                int i19 = 0;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    strArr = null;
                } else {
                    if (str2.length() > 1000) {
                        str2 = str2.substring(0, 1000);
                    }
                    strArr = str2.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replace(" ", " ").split("\n");
                }
                if (strArr != null && strArr.length > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i27 = 0;
                    while (true) {
                        if (i27 >= strArr.length) {
                            i27 = 0;
                            break;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(strArr[i27].trim())) {
                            arrayList.add(strArr[i27]);
                            break;
                        }
                        i27++;
                    }
                    java.lang.String str3 = "";
                    for (int i28 = i27 + 1; i28 < strArr.length; i28++) {
                        str3 = str3 + strArr[i28] + " ";
                    }
                    java.lang.String trim = str3.trim();
                    if (trim.length() > 0) {
                        arrayList.add(trim);
                    }
                    if (arrayList.size() > 0 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = (java.lang.String) arrayList.get(0);
                        if (str != null && str.length() > 20) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str.substring(0, 20));
                            sb6.append("...");
                        }
                        i19 = 1;
                    }
                    while (i19 < arrayList.size()) {
                        list.add((java.lang.String) arrayList.get(i19));
                        i19++;
                    }
                }
            } else if (view != null) {
                try {
                    java.lang.String b17 = com.tencent.mm.plugin.fav.ui.qa.b(view.getContext(), gp0Var);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                        list.add(b17);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavNoteListItem", "getDataItemDesc exception:" + e17);
                }
            }
        }
        return str;
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String str = r2Var.field_realChatName;
        if (str != null && !str.isEmpty()) {
            return o72.x1.w(r2Var.field_realChatName);
        }
        java.lang.String str2 = r2Var.field_fromUser;
        return (str2 == null || str2.isEmpty()) ? "" : o72.x1.w(r2Var.field_fromUser);
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.fav_type_note);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c A[EDGE_INSN: B:93:0x033c->B:94:0x033c BREAK  A[LOOP:1: B:34:0x02bc->B:40:0x0338], SYNTHETIC] */
    @Override // s82.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View e(android.view.View r45, android.view.ViewGroup r46, o72.r2 r47) {
        /*
            Method dump skipped, instructions count: 3245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.e0.e(android.view.View, android.view.ViewGroup, o72.r2):android.view.View");
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.d0 d0Var = (s82.d0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, d0Var.f404774a, dq0Var);
    }

    public final void l(final o72.r2 r2Var, final r45.gp0 gp0Var) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.x(gp0Var));
        if (!r6Var.m()) {
            java.util.Map map = com.tencent.mm.plugin.fav.ui.ra.f101381e;
            final java.lang.String x17 = o72.x1.x(gp0Var);
            final boolean z17 = true;
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$e
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z18 = z17;
                    if (z18 || com.tencent.mm.plugin.fav.ui.ra.k(x17)) {
                        o72.x1.y0(r2Var, gp0Var, z18);
                    }
                }
            }, "FavImageServer");
            return;
        }
        if (gp0Var.P1 == null) {
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
            am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
            zlVar.f8578a = 10;
            zlVar.field_localId = r2Var.field_localId;
            zlVar.f8587j = r6Var.o();
            notifyWNNoteOperationEvent.e();
        }
    }

    public final java.lang.String m(r45.pp0 pp0Var) {
        if (pp0Var != null) {
            return pp0Var.f383274o;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavNoteListItem", "getPoiname but locItem is null");
        return "";
    }
}
