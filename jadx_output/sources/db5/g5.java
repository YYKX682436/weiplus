package db5;

/* loaded from: classes9.dex */
public class g5 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMPullDownView f228347a;

    public g5(com.tencent.mm.ui.base.MMPullDownView mMPullDownView) {
        this.f228347a = mMPullDownView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        db5.m5 m5Var;
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = this.f228347a;
        int i17 = mMPullDownView.B;
        boolean z17 = false;
        if (i17 == 0) {
            db5.o5 o5Var = mMPullDownView.f197528f;
            if (o5Var != null) {
                mMPullDownView.f197537r = o5Var.a();
            }
            if (mMPullDownView.f197537r && mMPullDownView.f197545z.getVisibility() == 0) {
                mMPullDownView.scrollTo(0, mMPullDownView.f197531i);
            }
        } else if (i17 == 1) {
            db5.l5 l5Var = mMPullDownView.f197530h;
            if (l5Var != null) {
                mMPullDownView.f197537r = l5Var.J6();
            }
            if (mMPullDownView.f197537r && mMPullDownView.A.getVisibility() == 0) {
                mMPullDownView.scrollTo(0, mMPullDownView.f197531i);
            }
        } else if (i17 == 2 && (m5Var = mMPullDownView.f197529g) != null) {
            com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = (com.tencent.mm.ui.chatting.view.MMChattingListView) m5Var;
            if (mMChattingListView.V.isLoading()) {
                z17 = true;
            } else {
                mMChattingListView.E1 = mMChattingListView.getCurCount();
                mMChattingListView.n();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[onPreTopLoadData] mPreCount:" + mMChattingListView.E1 + " isForceTopLoadDataForPosition:" + mMChattingListView.C1);
                if (mMChattingListView.V != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("IS_PRELOAD", true);
                    mMChattingListView.V.a(hd5.n.ACTION_TOP, false, bundle);
                }
                mMChattingListView.D1 = null;
                mMChattingListView.C1 = false;
            }
            mMPullDownView.f197537r = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "updateDelayHandler handleMessage loadDataType[%d] loadDataEnd[%b]", java.lang.Integer.valueOf(mMPullDownView.B), java.lang.Boolean.valueOf(mMPullDownView.f197537r));
    }
}
