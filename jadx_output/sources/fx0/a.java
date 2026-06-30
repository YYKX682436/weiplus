package fx0;

/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final r45.h70 a(java.lang.String originPath, java.lang.String outputPath, com.tencent.mm.modelcontrol.VideoTransPara videoParams) {
        kotlin.jvm.internal.o.g(originPath, "originPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        android.graphics.Rect rect = new android.graphics.Rect();
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(originPath, true);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.e("FinderPostProcessMediaLogic", "getVideoInfo failed. path:".concat(originPath));
            return null;
        }
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.vlog.model.l0 Z2 = bg0.v.Z2((bg0.v) c17, originPath, false, 2, null);
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) Z2;
        long j17 = Ai.f361366d;
        i1Var.c(j17);
        i1Var.a(j17);
        com.tencent.mm.plugin.vlog.model.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
        int i17 = Ai.f361363a;
        int i18 = Ai.f361364b;
        int i19 = Ai.f361368f;
        if (i19 == 90 || i19 == 270) {
            i18 = i17;
            i17 = i18;
        }
        com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
        yVar.f175787d.set(0, 0, i17, i18);
        yVar.f175785b.set(0, 0, i17, i18);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = (com.tencent.mm.plugin.vlog.model.h1) Bi;
        h1Var.u(i17, i18);
        rect.set(0, 0, i17, i18);
        h1Var.t(rect);
        com.tencent.mm.plugin.vlog.model.p pVar = (com.tencent.mm.plugin.vlog.model.p) ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
        pVar.e(outputPath, videoParams, new android.util.Size(i17, i18), rect, false, true);
        r45.h70 f17 = pVar.f();
        r45.i70 i70Var = f17.f375902i;
        i70Var.f376775d = outputPath;
        i70Var.f376792x = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ui(false, h1Var.g());
        r45.g70 g70Var = f17.f375904n;
        r45.vl5 vl5Var = new r45.vl5();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(rect.left));
        linkedList.add(java.lang.Integer.valueOf(rect.top));
        linkedList.add(java.lang.Integer.valueOf(rect.right));
        linkedList.add(java.lang.Integer.valueOf(rect.bottom));
        vl5Var.f388350d = linkedList;
        g70Var.f374938d = vl5Var;
        r45.g70 g70Var2 = f17.f375904n;
        r45.vl5 vl5Var2 = new r45.vl5();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(rect.left));
        linkedList2.add(java.lang.Integer.valueOf(rect.top));
        linkedList2.add(java.lang.Integer.valueOf(rect.right));
        linkedList2.add(java.lang.Integer.valueOf(rect.bottom));
        vl5Var2.f388350d = linkedList2;
        g70Var2.f374941g = vl5Var2;
        return f17;
    }
}
