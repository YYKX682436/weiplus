package ze5;

/* loaded from: classes9.dex */
public abstract class g2 {
    public static final void a(db5.g4 g4Var, yb5.d dVar, android.view.View view, int i17, com.tencent.mm.storage.f9 f9Var) {
        if (((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).nj(f9Var, true)) {
            ((db5.h4) g4Var.c(i17, 174, 0, dVar.s().getString(com.tencent.mm.R.string.nh7), com.tencent.mm.R.raw.doc_ai_filled)).f228369m = view.getContext().getString(com.tencent.mm.R.string.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
    }

    public static final void b(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d J0;
        if (sc5.g.f406573b) {
            e40.w wVar = (e40.w) i95.n0.c(e40.w.class);
            long I0 = f9Var.I0();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.d(Q0);
            h40.f fVar = new h40.f(Q0, I0);
            fVar.f278745f = h40.b.f278721f;
            ((d40.q) wVar).aj(fVar);
        } else {
            com.tencent.mm.pluginsdk.model.app.e wi6 = com.tencent.mm.pluginsdk.model.app.u5.wi();
            if (wi6 != null && (J0 = wi6.J0(f9Var.getMsgId(), f9Var.Q0())) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = false, stack = ");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
                J0.field_status = 101;
                J0.field_lastModifyTime = c01.id.e();
                com.tencent.mm.pluginsdk.model.app.e wi7 = com.tencent.mm.pluginsdk.model.app.u5.wi();
                if (wi7 != null) {
                    wi7.update(J0, new java.lang.String[0]);
                }
                c01.d9.e().g(new bt3.l0(f9Var.getMsgId(), f9Var.Q0(), str, null));
                d35.h.f226344a.c(f9Var);
            }
        }
        com.tencent.mm.ui.report.b.f209619a.d(f9Var, true);
    }

    public static final boolean c(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFileMvvm", "[onYuanBaoSummaryClick] AppMsgFile, msgId: " + f9Var.getMsgId());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).pj("journey_summarize");
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((qg5.z2) j3Var).hj(g17, f9Var, dVar.u());
        ((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).vj(f9Var, dVar.x());
        return false;
    }

    public static final void d(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        if (sc5.g.f406573b) {
            e40.w wVar = (e40.w) i95.n0.c(e40.w.class);
            long I0 = f9Var.I0();
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.d(Q0);
            ((d40.q) wVar).Zi(new h40.f(Q0, I0));
        } else {
            long msgId = f9Var.getMsgId();
            java.lang.String Q02 = f9Var.Q0();
            java.lang.String n17 = qVar.n();
            com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(msgId, Q02);
            if (J0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + n17);
            } else {
                long j17 = J0.field_status;
                com.tencent.mm.pluginsdk.model.app.k0.m(false);
                if (j17 != 101) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + n17 + " status:" + J0.field_status);
                } else {
                    J0.field_status = 102L;
                    J0.field_lastModifyTime = c01.id.e();
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
                    java.lang.String mediaId = bt3.l0.K(J0.field_createTime, Q02, msgId);
                    java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(null);
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:".concat(mediaId));
                    com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
                    kotlinx.coroutines.flow.n2 U6 = aj6 != null ? aj6.U6(mediaId) : null;
                    if (U6 != null && (lifecycleScope = gm0.j1.b().f273245h.f273145e) != null) {
                        v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.b0(U6, weakReference, null), 1, null);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "pauseDownloadAttach %s %s %s %s", java.lang.Long.valueOf(msgId), Q02, n17, mediaId);
                }
            }
            d35.h.f226344a.a(f9Var);
        }
        com.tencent.mm.ui.report.b.f209619a.d(f9Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0263, code lost:
    
        if ((r14 != null && r14.field_status == 102) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x035c, code lost:
    
        if (((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).bj(r21.getMsgId(), r21.Q0(), 4) == false) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z01.m e(com.tencent.mm.storage.f9 r21, yb5.d r22) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.g2.e(com.tencent.mm.storage.f9, yb5.d):z01.m");
    }
}
