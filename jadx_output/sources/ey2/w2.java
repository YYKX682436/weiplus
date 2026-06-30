package ey2;

/* loaded from: classes2.dex */
public final class w2 extends ey2.f2 {
    @Override // ey2.f2
    public int N6(java.lang.String source, int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E3).getValue()).r()).intValue() == 1;
        g92.b bVar = g92.b.f269769e;
        r45.e33 e33Var = (r45.e33) bVar.k2().d().getCustom(17);
        boolean z18 = e33Var != null ? e33Var.getBoolean(2) : true;
        r45.e33 e33Var2 = (r45.e33) bVar.k2().d().getCustom(17);
        com.tencent.mars.xlog.Log.i("Finder.FinderWxMessageTabStateCacheVM", "[findTabIndex] isEnable=" + z17 + " enableLike=" + z18 + " enableComment=" + (e33Var2 != null ? e33Var2.getBoolean(3) : true));
        int i18 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(vy2.a.f441454m[1]) != null ? 1 : 0;
        if (i17 == 3) {
            int O6 = O6(source, "WxMessageEntryRight", username);
            com.tencent.mars.xlog.Log.i("Finder.FinderWxMessageTabStateCacheVM", "[findTabIndex] use extInfo index=" + O6);
            if (O6 != -1) {
                return O6;
            }
        }
        return i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ey2.f2
    public int O6(java.lang.String source, java.lang.String path, java.lang.String str) {
        r45.k03 k03Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(path, "path");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(path);
        int i17 = 1;
        if ((I0 != null && I0.f373894n == 4) != true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" [getEnterTabIndexBy] path=");
            sb6.append(path);
            sb6.append(", index=-1,show_ext_info_type:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373894n) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderWxMessageTabStateCacheVM", sb6.toString());
            return -1;
        }
        com.tencent.mm.protobuf.g gVar = I0.f373895o;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            k03Var = new r45.k03();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(k03Var.parseFrom(g17));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        } else {
            k03Var = new r45.k03();
        }
        if (k03Var.getInteger(0) == 1) {
            i17 = 0;
        } else if (k03Var.getInteger(0) != 2) {
            i17 = -1;
        }
        this.f257373f.put(str, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("Finder.FinderWxMessageTabStateCacheVM", source + " [getEnterTabIndexBy] path=" + path + ", index=" + i17);
        return i17;
    }

    @Override // ey2.f2
    public void R6(int i17, java.lang.Integer[] redDotFlags, java.lang.String username) {
        kotlin.jvm.internal.o.g(redDotFlags, "redDotFlags");
        kotlin.jvm.internal.o.g(username, "username");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageLike");
        r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageComment");
        redDotFlags[0] = java.lang.Integer.valueOf(Q6(I0));
        redDotFlags[1] = java.lang.Integer.valueOf(Q6(I02));
    }
}
