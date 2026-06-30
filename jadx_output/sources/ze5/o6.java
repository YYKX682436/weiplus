package ze5;

/* loaded from: classes9.dex */
public abstract class o6 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r5 == 14) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z01.x a(com.tencent.mm.storage.f9 r18, com.tencent.mm.ui.chatting.viewitems.a0 r19, yb5.d r20, ze5.w6 r21) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.o6.a(com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.a0, yb5.d, ze5.w6):z01.x");
    }

    public static void b(android.widget.LinearLayout linearLayout, rd5.d dVar, yb5.d ui6, com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        java.lang.Object[] objArr = {ze5.y8.a(te5.q0.f418727d, te5.t0.f418750d, te5.u0.f418751d)};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        ze5.y8.b(java.util.Collections.unmodifiableList(arrayList), linearLayout, ui6, dVar, g0Var);
    }

    public static void c(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar) {
        ot0.q w17 = ot0.q.w(2, f9Var.j());
        if (w17 == null || com.tencent.mm.sdk.platformtools.t8.K0(w17.f348646d)) {
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = w17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j17 == null || !j17.k()) {
            return;
        }
        a0Var.getClass();
        if (m33.a1.a() != null) {
            int i17 = dVar.D() ? 2 : 1;
            java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var);
            android.content.Context g17 = dVar.g();
            java.lang.String str2 = w17.f348646d;
            java.lang.String str3 = j17.field_packageName;
            int i18 = w17.f348666i;
            java.lang.String str4 = w17.X;
            ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportDelGameMsg fail, appId is null");
                return;
            }
            if (g17 == null) {
                g17 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.pm.PackageInfo a17 = ik1.b.a(g17, str3);
            com.tencent.mm.game.report.k.a(jj0.b.a(10583, str2, java.lang.Integer.valueOf(a17 == null ? 0 : a17.versionCode), nj0.a.b(), t17, java.lang.Integer.valueOf(i18), str4, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(nj0.a.a(g17))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) r17.f460708c.a(sb5.f.class))).f198754s == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(yb5.d r17, android.view.MenuItem r18, com.tencent.mm.storage.f9 r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.o6.d(yb5.d, android.view.MenuItem, com.tencent.mm.storage.f9):boolean");
    }

    public static qd5.a e(rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        ic5.e eVar = ic5.f.f290437c;
        if (eVar.b(f9Var).isEmpty()) {
            return null;
        }
        java.lang.String b17 = eVar.b(dVar.f394254d.f445300b);
        java.lang.String v17 = dVar.v();
        if (v17 == null) {
            v17 = "";
        }
        return new ze5.p6(b17, v17);
    }
}
