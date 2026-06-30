package ke5;

/* loaded from: classes9.dex */
public class d0 extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f307072i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f307073j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307074k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f307075l;

    /* renamed from: m, reason: collision with root package name */
    public final he5.q f307076m;

    public d0(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f307072i = 0;
        this.f307073j = 0L;
        this.f307074k = 0L;
        this.f307075l = 0L;
        this.f307076m = new ke5.b0(this);
    }

    @Override // ke5.a, hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        sb5.t tVar;
        super.c(mMChattingListView, qVar);
        hd5.n nVar = qVar.f280630b;
        java.util.List list = qVar.f280633e;
        int size = ((java.util.LinkedList) qVar.f280631c).size();
        int i17 = qVar.f280634f;
        int i18 = qVar.f280635g;
        android.os.Bundle bundle = qVar.f280629a;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) list.get(0);
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f307073j = f9Var.getCreateTime();
        }
        if (f9Var2 != null) {
            this.f307074k = f9Var2.getCreateTime();
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView.d(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f307041b.f460708c.a(sb5.z.class))).I0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView.c(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0()) - mMChattingListView.getBottomHeight(), false, false);
        } else if (ordinal == 3) {
            this.f307041b.N(false);
        } else if (ordinal == 4) {
            int i19 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i19 != -1) {
                int max = java.lang.Math.max(0, mMChattingListView.getCurCount() - (qVar.f280634f - i19));
                qVar.f280635g = max;
                i18 = max;
            }
            mMChattingListView.getListView().post(new ke5.c0(this, bundle, i18, mMChattingListView));
        }
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        if (nVar != nVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f307073j), java.lang.Long.valueOf(this.f307074k), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.String x17 = this.f307041b.x();
            long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
            int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, m07);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
            mMChattingListView.setIsTopShowAll(i17 - F2 <= size);
            mMChattingListView.setIsBottomShowAll(true);
        }
        if ((nVar == nVar2 || nVar == hd5.n.ACTION_UPDATE) && (tVar = (sb5.t) this.f307041b.f460708c.a(sb5.t.class)) != null) {
            ((com.tencent.mm.ui.chatting.component.u3) tVar).q0(nVar);
        }
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        he5.t rVar;
        he5.t tVar;
        hd5.q qVar2;
        int i17;
        int j76 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).j7(this.f307042c);
        int ordinal = nVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                int i18 = j76 - this.f307072i;
                tVar = new he5.r(this.f307042c, (i18 > 0 ? i18 : 0) + this.f307043d, j76, nVar, this.f307076m);
            } else if (ordinal != 3) {
                tVar = null;
                if (ordinal == 4) {
                    if (bundle == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "null == sourceArgs!");
                        return null;
                    }
                    if (bundle.getInt("SCENE", 0) == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[handlePositionForSearch]");
                        java.lang.String str = this.f307042c;
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        if (android.text.TextUtils.isEmpty(string)) {
                            string = str;
                        }
                        boolean z17 = bundle.getBoolean("IS_LOAD_ALL", false);
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(string, j17);
                        if (Li.getMsgId() != j17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "get msg info by id %d error", java.lang.Long.valueOf(j17));
                            rVar = new he5.k(str, this.f307073j, this.f307074k);
                        } else {
                            if (!android.text.TextUtils.equals(string, str)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "talker is not same[%s -> %s]", string, str);
                            }
                            long createTime = Li.getCreateTime();
                            if (createTime < this.f307073j || createTime > this.f307074k) {
                                this.f307073j = createTime;
                                this.f307075l = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(str);
                                if (z17) {
                                    this.f307074k = this.f307075l;
                                } else {
                                    this.f307074k = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v3(str, createTime, 48);
                                }
                                if (((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(str, this.f307073j, this.f307074k) < 48) {
                                    this.f307073j = ((com.tencent.mm.storage.g9) c01.d9.b().u()).v9(str, this.f307073j, 48);
                                    r6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(str, this.f307073j, createTime);
                                }
                                qVar2 = qVar;
                                i17 = r6;
                            } else {
                                i17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(str, this.f307073j, createTime);
                                qVar2 = qVar;
                            }
                            qVar2.f280635g = i17;
                            rVar = new he5.k(str, this.f307073j, this.f307074k);
                        }
                    } else if (bundle.getInt("SCENE", 0) == 2) {
                        he5.q qVar3 = this.f307076m;
                        hd5.n nVar2 = hd5.n.ACTION_POSITION;
                        int i19 = bundle.getInt("MSG_POSITION");
                        int i27 = j76 - i19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[handlePositionForTongue] totalCount:%s position:%s count:%s", java.lang.Integer.valueOf(j76), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                        rVar = new he5.r(this.f307042c, i27, j76, nVar2, qVar3);
                    }
                }
            } else {
                rVar = new he5.r(this.f307042c, 16, j76, nVar, this.f307076m);
            }
            this.f307072i = j76;
            return tVar;
        }
        rVar = new he5.r(this.f307042c, this.f307043d + 48, j76, nVar, this.f307076m);
        tVar = rVar;
        this.f307072i = j76;
        return tVar;
    }
}
