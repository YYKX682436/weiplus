package ke5;

/* loaded from: classes9.dex */
public class j extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final long f307096i;

    /* renamed from: j, reason: collision with root package name */
    public int f307097j;

    public j(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f307096i = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).w0();
    }

    @Override // ke5.a, hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        super.c(mMChattingListView, qVar);
        int size = ((java.util.LinkedList) qVar.f280631c).size();
        int i17 = qVar.f280634f;
        int ordinal = qVar.f280630b.ordinal();
        yb5.d dVar = this.f307041b;
        if (ordinal == 0) {
            mMChattingListView.d(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).r0() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).I0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView.c(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, mMChattingListView.getListView().getHeight() - ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).r0(), false, false);
        } else if (ordinal == 3) {
            dVar.N(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[onViewUpdate] result:%s", qVar.toString());
        java.lang.String x17 = dVar.x();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        mMChattingListView.setIsTopShowAll(i17 - F2 <= size);
        mMChattingListView.setIsBottomShowAll(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        he5.h hVar;
        int h17 = c01.d9.b().j().h(this.f307042c, this.f307096i);
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            hVar = new he5.h(this.f307042c, this.f307096i, this.f307043d + 48, h17);
        } else if (ordinal != 2) {
            hVar = ordinal != 3 ? null : new he5.h(this.f307042c, this.f307096i, 48, h17);
        } else {
            int i17 = h17 - this.f307097j;
            java.lang.String str = this.f307042c;
            long j17 = this.f307096i;
            int i18 = this.f307043d;
            if (i17 <= 0) {
                i17 = 0;
            }
            hVar = new he5.h(str, j17, i18 + i17, h17);
        }
        this.f307097j = h17;
        return hVar;
    }
}
