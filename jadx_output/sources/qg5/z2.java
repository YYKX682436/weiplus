package qg5;

@j95.b
/* loaded from: classes5.dex */
public final class z2 extends jm0.o implements ct.j3 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f363271m = jz5.h.b(qg5.x2.f363253d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f363272n = jz5.h.b(qg5.r2.f363154d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f363273o = jz5.h.b(qg5.y2.f363267d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f363274p = jz5.h.b(qg5.q2.f363140d);

    /* renamed from: q, reason: collision with root package name */
    public boolean f363275q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f363276r;

    /* renamed from: s, reason: collision with root package name */
    public xj.m f363277s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.zp f363278t;

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(sy.g.class);
        set.add(qg5.u3.class);
        set.add(qg5.q4.class);
        set.add(qg5.n5.class);
    }

    public final xj.i Zi() {
        return (xj.i) ((jz5.n) this.f363274p).getValue();
    }

    public final ct.q2 aj() {
        return (ct.q2) ((jz5.n) this.f363272n).getValue();
    }

    public boolean bj() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableC2CFileAISummary", 0) == 1;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), qg5.p2.class);
        if (iPCBoolean != null) {
            return iPCBoolean.f68400d;
        }
        return false;
    }

    public void cj() {
        com.tencent.mm.ui.chatting.component.zp zpVar = this.f363278t;
        xj.m mVar = null;
        if (zpVar != null && !zpVar.f200403d) {
            xj.m mVar2 = zpVar.f200401b;
            if (mVar2 == null) {
                mVar2 = zpVar.f200400a;
            }
            if (mVar2 != null) {
                zpVar.f200403d = true;
                if (zpVar.f200401b == null) {
                    zpVar.f200401b = mVar2;
                    ((wj.j0) ((xj.i) ((jz5.n) zpVar.f200404e).getValue())).mj(mVar2.f454753a, wj.w0.f446541d, null);
                }
                ((wj.j0) ((xj.i) ((jz5.n) zpVar.f200404e).getValue())).mj(mVar2.f454753a, wj.w0.f446542e, null);
            }
        }
        com.tencent.mm.ui.chatting.component.zp zpVar2 = this.f363278t;
        if (zpVar2 != null && (mVar = zpVar2.f200401b) == null) {
            mVar = zpVar2.f200400a;
        }
        this.f363277s = mVar;
    }

    public void fj(android.content.Context uiCtx, java.util.List msgList, com.tencent.mm.storage.z3 z3Var, boolean z17, yz5.a onLaunchSuccess) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        kotlin.jvm.internal.o.g(onLaunchSuccess, "onLaunchSuccess");
        xj.m mVar = this.f363277s;
        this.f363277s = null;
        if (mVar == null) {
            ((wj.j0) Zi()).Vi(wj.t0.f446507J, 2000L, new qg5.u2(this, uiCtx, msgList, z3Var, z17, onLaunchSuccess));
        } else {
            if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
                throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(qg5.q4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((qg5.q4) ((jm0.g) a17)).W6(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
        }
    }

    public void hj(android.content.Context uiCtx, com.tencent.mm.storage.f9 msg, com.tencent.mm.storage.z3 z3Var) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = this.f363276r;
        if (!jm0.g.class.isAssignableFrom(qg5.n5.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(qg5.n5.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qg5.n5 n5Var = (qg5.n5) ((jm0.g) a17);
        n5Var.W6(uiCtx, new qg5.d5(n5Var, uiCtx, z3Var, msg, str));
    }

    public void ij(android.content.Context uiCtx, com.tencent.mm.storage.f9 msg, com.tencent.mm.storage.z3 z3Var) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = this.f363276r;
        if (!jm0.g.class.isAssignableFrom(qg5.n5.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(qg5.n5.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qg5.n5 n5Var = (qg5.n5) ((jm0.g) a17);
        n5Var.W6(uiCtx, new qg5.e5(n5Var, uiCtx, z3Var, msg, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        if (r9 >= 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mj(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.z2.mj(android.content.Context, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r4 != r3.longValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if ((r9 != null && (r26.n0.N(r9) ^ true)) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean nj(com.tencent.mm.storage.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.z2.nj(com.tencent.mm.storage.f9, boolean):boolean");
    }

    public boolean oj(com.tencent.mm.storage.f9 message, boolean z17) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(message, "message");
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigYuanBaoSummaryEntrance()) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "RepairerConfigYuanBaoSummaryEntrance is negative");
            return false;
        }
        if (!bj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isMainlandHkMoUser is negative");
            return false;
        }
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        java.lang.String U1 = message.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null || (string = k17.getString(k17.f368365d + 9)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "targetUrl is null");
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isMpArticle is negative");
            return false;
        }
        if (((wj.j0) Zi()).Ui(wj.t0.L) != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "adInfo is null");
        return false;
    }
}
