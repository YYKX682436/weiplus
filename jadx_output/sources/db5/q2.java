package db5;

/* loaded from: classes15.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s2 f228476e;

    public q2(db5.s2 s2Var, int i17) {
        this.f228476e = s2Var;
        this.f228475d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.s2 s2Var = this.f228476e;
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = (com.tencent.mm.ui.base.MMGridPaperGridView) s2Var.f228503a.f197398d.getChildAt(r1.getChildCount() - 1);
        int childCount = this.f228475d - (s2Var.f228503a.f197398d.getChildCount() >> 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaper", "move up, old index[%d], new index[%d]", java.lang.Integer.valueOf(s2Var.f228503a.f197398d.getChildCount() - 1), java.lang.Integer.valueOf(childCount));
        s2Var.f228503a.f197398d.removeViewAt(r2.getChildCount() - 1);
        com.tencent.mm.ui.base.MMGridPaper mMGridPaper = s2Var.f228503a;
        mMGridPaperGridView.b(childCount, mMGridPaper.f197412u, mMGridPaper.f197411t, mMGridPaper.f197400f);
        s2Var.f228503a.f197398d.addView(mMGridPaperGridView, 0);
        s2Var.f228503a.f197398d.a(s2Var.f228503a.f197398d.getChildCount() >> 1);
        com.tencent.mm.ui.base.MMGridPaper.a(s2Var.f228503a, -1);
    }
}
