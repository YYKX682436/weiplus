package mc2;

/* loaded from: classes2.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final mc2.b a(int i17, zy2.fa manager) {
        com.tencent.mm.protobuf.g gVar;
        kotlin.jvm.internal.o.g(manager, "manager");
        java.lang.String a17 = com.tencent.mm.plugin.finder.extension.reddot.ba.a(i17);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = manager.L0(a17);
        r45.f03 I0 = L0 != null ? L0.I0(a17) : null;
        r45.j03 j03Var = new r45.j03();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderTipsShowTabExt#transform] tabType=");
        sb6.append(i17);
        sb6.append(" path=");
        sb6.append(a17);
        sb6.append(" show_ext_info_type=");
        sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373894n) : null);
        sb6.append(" show_ext_info=");
        int i18 = 0;
        sb6.append((I0 != null ? I0.f373895o : null) != null);
        com.tencent.mars.xlog.Log.i("Finder.TipsShowTabExt", sb6.toString());
        if ((I0 != null && I0.f373894n == 2) && (gVar = I0.f373895o) != null) {
            j03Var.parseFrom(gVar != null ? gVar.g() : null);
            com.tencent.mars.xlog.Log.i("Finder.TipsShowTabExt", "tabType=" + i17 + " serverJumpPriority=" + j03Var.f377465d);
        } else if (I0 != null) {
            if (i17 == 1) {
                i18 = 700000;
            } else if (i17 == 3) {
                i18 = 600000;
            } else if (i17 == 4) {
                i18 = 500000;
            }
            j03Var.f377465d = i18;
        }
        return new mc2.b(i17, j03Var);
    }
}
