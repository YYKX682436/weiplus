package oq3;

/* loaded from: classes12.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final int a(int i17, int i18, int i19, int i27) {
        int b17 = b(i19, i27);
        if (i18 == 0) {
            return 0;
        }
        if (b17 != 1 && b17 != 2 && b17 != 3) {
            i18 = 0;
        }
        return i18;
    }

    public final int b(int i17, int i18) {
        if (i17 == 1) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleMidImg());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadRoomMidImg());
        }
        if (i17 == 2) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleLargeImg());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadRoomLargeImg());
        }
        if (i17 == 3) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleVideo());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadRoomVideo());
        }
        if (i17 != 4) {
            return 0;
        }
        if (i18 == 0) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleFile());
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadRoomFile());
    }

    public final int c(int i17, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return b(i17, d(str));
    }

    public final int d(java.lang.String msgInfoTalker) {
        kotlin.jvm.internal.o.g(msgInfoTalker, "msgInfoTalker");
        return r26.i0.n(msgInfoTalker, "@chatroom", false) ? 1 : 0;
    }

    public final oq3.h e(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null);
        oq3.h hVar = new oq3.h();
        if (d17 == null || !d17.containsKey(".msgsource.appmsg_pd.$cdnattachurl_pd_pri")) {
            if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleFile()) == 4) {
                hVar.f347387c = 1;
            }
            return hVar;
        }
        hVar.f347385a = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_size"), 0L);
        hVar.f347386b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_pd_pri"), 0);
        hVar.f347387c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_pd"), 0);
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleFile()) == 4) {
            hVar.f347387c = 1;
        }
        return hVar;
    }

    public final oq3.j f(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null);
        oq3.j jVar = new oq3.j();
        if (d17 == null || !d17.containsKey(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri")) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            if (o1Var.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleMidImg()) == 4) {
                jVar.f347390c = 1;
            }
            if (o1Var.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleLargeImg()) == 4) {
                jVar.f347393f = 1;
            }
            return jVar;
        }
        jVar.f347388a = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_size"), 0L);
        jVar.f347389b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri"), 0);
        jVar.f347390c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd"), 0);
        jVar.f347391d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_size"), 0L);
        jVar.f347392e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd_pri"), 0);
        jVar.f347393f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd"), 0);
        bm5.o1 o1Var2 = bm5.o1.f22719a;
        if (o1Var2.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleMidImg()) == 4) {
            jVar.f347390c = 1;
        }
        if (o1Var2.h(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadSingleLargeImg()) == 4) {
            jVar.f347393f = 1;
        }
        return jVar;
    }
}
