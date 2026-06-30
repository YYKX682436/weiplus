package ke5;

/* loaded from: classes9.dex */
public class x extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f307138i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f307139j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307140k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f307141l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.s7 f307142m;

    /* renamed from: n, reason: collision with root package name */
    public final he5.l f307143n;

    public x(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f307138i = 0;
        this.f307139j = 0L;
        this.f307140k = 0L;
        this.f307141l = 0L;
        this.f307143n = new ke5.v(this);
        if (te5.s1.f418747a.a()) {
            this.f307142m = new com.tencent.mm.ui.chatting.component.s7(dVar);
        }
    }

    @Override // ke5.a, hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        boolean z17;
        sb5.t tVar;
        boolean z18;
        int i17;
        int i18;
        int i19;
        super.c(mMChattingListView, qVar);
        hd5.n nVar = qVar.f280630b;
        java.util.List list = qVar.f280633e;
        int size = ((java.util.LinkedList) qVar.f280631c).size();
        int i27 = qVar.f280634f;
        int i28 = qVar.f280635g;
        android.os.Bundle bundle = qVar.f280629a;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) list.get(0);
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f307139j = f9Var.getCreateTime();
        }
        if (f9Var2 != null) {
            this.f307140k = f9Var2.getCreateTime();
        }
        boolean a17 = te5.s1.f418747a.a();
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        hd5.n nVar3 = hd5.n.ACTION_UPDATE;
        if (a17 && (nVar3.equals(nVar) || nVar2.equals(nVar))) {
            sb5.x1 n07 = ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f307041b.f460708c.a(sb5.g0.class))).n0();
            if (n07 != null) {
                com.tencent.mm.ui.chatting.component.m7 m7Var = (com.tencent.mm.ui.chatting.component.m7) n07;
                synchronized (m7Var.f199482a) {
                    i19 = m7Var.f199484c;
                }
            } else {
                i19 = 0;
            }
            int curCount = mMChattingListView.getCurCount() - i19;
            boolean z19 = n07 != null && ((com.tencent.mm.ui.chatting.component.m7) n07).f199485d;
            if (curCount > -1 && curCount < mMChattingListView.getCurCount() && i19 > 0 && !z19) {
                ((com.tencent.mm.ui.chatting.component.m7) n07).f199485d = true;
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f307041b.f460708c.a(sb5.z.class))).V0(curCount);
            }
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView.d(false);
            z17 = false;
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0() + mMChattingListView.getTopHeight(), false, false);
            int curCount2 = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount2 > 0) {
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f307041b.f460708c.a(sb5.z.class))).I0(curCount2);
            }
        } else if (ordinal != 1) {
            if (ordinal == 3) {
                z18 = false;
                this.f307041b.N(false);
            } else if (ordinal != 4) {
                z18 = false;
            } else {
                if (bundle == null) {
                    i18 = -1;
                    i17 = -1;
                } else {
                    i17 = -1;
                    i18 = bundle.getInt("MSG_POSITION", -1);
                }
                if (i18 != i17) {
                    int curCount3 = mMChattingListView.getCurCount() - (qVar.f280634f - i18);
                    z18 = false;
                    i28 = java.lang.Math.max(0, curCount3);
                    qVar.f280635g = i28;
                } else {
                    z18 = false;
                }
                mMChattingListView.getListView().post(new ke5.w(this, bundle, i28, mMChattingListView));
            }
            z17 = z18;
        } else {
            mMChattingListView.c(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0()) - mMChattingListView.getBottomHeight(), false, false);
            z17 = false;
        }
        if (nVar != nVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f307139j), java.lang.Long.valueOf(this.f307140k), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            java.lang.String x17 = this.f307041b.x();
            long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
            int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, m07);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
            if (i27 - F2 <= size) {
                z17 = true;
            }
            mMChattingListView.setIsTopShowAll(z17);
            mMChattingListView.setIsBottomShowAll(true);
        }
        if ((nVar == nVar2 || nVar == nVar3) && (tVar = (sb5.t) this.f307041b.f460708c.a(sb5.t.class)) != null) {
            ((com.tencent.mm.ui.chatting.component.u3) tVar).q0(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r17, android.os.Bundle r18, hd5.q r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.x.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public final he5.t h(java.lang.String str, int i17, int i18, hd5.n nVar) {
        return te5.s1.f418747a.a() ? new he5.n(str, i17, i18, nVar, this.f307142m) : new he5.m(str, i17, i18, nVar, this.f307143n);
    }
}
