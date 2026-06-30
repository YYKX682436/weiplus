package ke5;

/* loaded from: classes9.dex */
public class u extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public volatile long f307128i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f307129j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307130k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f307131l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yb5.d chattingContext, hd5.r loader) {
        super(chattingContext, loader);
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(loader, "loader");
        java.lang.String x17 = chattingContext.x();
        this.f307131l = x17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[ChattingSearchDataPresenter] talker:%s", x17);
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n action, boolean z17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(action, "action");
        if (bundle == null && action == hd5.n.ACTION_ENTER) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[onLoad] sourceArgs is null!");
        } else {
            super.a(action, z17, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
    
        if (r2.booleanValue() != false) goto L35;
     */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView r12, hd5.q r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.u.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    @Override // ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        int i17;
        int i18;
        long v37;
        hd5.q qVar2;
        int i19;
        kotlin.jvm.internal.o.g(action, "action");
        int ordinal = action.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                long v38 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v3(this.f307131l, this.f307129j, 48);
                int max = java.lang.Math.max(0, ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, this.f307129j, v38) - 1);
                this.f307129j = v38;
                i17 = max;
            } else if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    if (bundle == null || qVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[handleEnter] sourceArgs is null!");
                    } else {
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        this.f307132m = bundle.getBoolean("IS_LOAD_ALL", false);
                        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(string, j17);
                        if (n17.getMsgId() != j17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "get msg info by id %d error", java.lang.Long.valueOf(j17));
                        } else {
                            if (!android.text.TextUtils.equals(string, this.f307131l)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "talker is not same[%s -> %s]", string, this.f307131l);
                            }
                            long createTime = n17.getCreateTime();
                            if (createTime < this.f307128i || createTime > this.f307129j) {
                                this.f307128i = createTime;
                                this.f307130k = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(this.f307131l);
                                if (this.f307132m) {
                                    v37 = this.f307130k;
                                } else {
                                    v37 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v3(this.f307131l, createTime, 48);
                                }
                                this.f307129j = v37;
                                if (((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, this.f307128i, this.f307129j) < 48) {
                                    this.f307128i = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v9(this.f307131l, this.f307128i, 48);
                                    i19 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, this.f307128i, createTime);
                                    qVar2 = qVar;
                                } else {
                                    qVar2 = qVar;
                                    i19 = 1;
                                }
                            } else {
                                qVar2 = qVar;
                                i19 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, this.f307128i, createTime);
                            }
                            qVar2.f280636h = j17;
                            qVar2.f280635g = (i19 - 1) + this.f307041b.m();
                        }
                    }
                }
                i18 = 0;
                i17 = 0;
            } else {
                com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f307131l);
                if (q57 == null) {
                    i17 = 0;
                } else {
                    this.f307130k = q57.getCreateTime();
                    int max2 = java.lang.Math.max(0, ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, this.f307129j, this.f307130k) - 1);
                    if (this.f307132m || max2 <= 480) {
                        this.f307129j = this.f307130k;
                    } else if (q57.A0() == 1 && this.f307130k != q57.getCreateTime()) {
                        this.f307130k = q57.getCreateTime();
                        this.f307128i = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v9(this.f307131l, this.f307128i, 48);
                        this.f307129j = this.f307130k;
                    }
                    i17 = max2;
                }
            }
            i18 = 0;
        } else {
            long v96 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v9(this.f307131l, this.f307128i, 48);
            int max3 = java.lang.Math.max(0, ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(this.f307131l, v96, this.f307128i) - 1);
            this.f307128i = v96;
            i17 = 0;
            i18 = max3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "mode[%s] query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", action, java.lang.Long.valueOf(this.f307128i), java.lang.Long.valueOf(this.f307129j), java.lang.Long.valueOf(this.f307130k), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.lang.String mTalkerUserName = this.f307042c;
        kotlin.jvm.internal.o.f(mTalkerUserName, "mTalkerUserName");
        return new he5.k(mTalkerUserName, this.f307128i, this.f307129j);
    }

    public boolean h() {
        return this.f307129j >= this.f307130k;
    }

    public boolean i() {
        long w37 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(this.f307131l);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[isShowTopAll] firstMsgCreateTime:%s lastTopMsgCreateTime:%s", java.lang.Long.valueOf(w37), java.lang.Long.valueOf(this.f307128i));
        return this.f307128i <= w37;
    }
}
