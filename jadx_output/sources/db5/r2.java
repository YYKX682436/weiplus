package db5;

/* loaded from: classes15.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s2 f228491e;

    public r2(db5.s2 s2Var, int i17) {
        this.f228491e = s2Var;
        this.f228490d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.s2 s2Var = this.f228491e;
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = (com.tencent.mm.ui.base.MMGridPaperGridView) s2Var.f228503a.f197398d.getChildAt(0);
        int childCount = this.f228490d + (s2Var.f228503a.f197398d.getChildCount() >> 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaper", "move down, old index[0], new index[%d]", java.lang.Integer.valueOf(childCount));
        s2Var.f228503a.f197398d.removeViewAt(0);
        com.tencent.mm.ui.base.MMGridPaper mMGridPaper = s2Var.f228503a;
        mMGridPaperGridView.b(childCount, mMGridPaper.f197412u, mMGridPaper.f197411t, mMGridPaper.f197400f);
        s2Var.f228503a.f197398d.addView(mMGridPaperGridView);
        s2Var.f228503a.f197398d.a(s2Var.f228503a.f197398d.getChildCount() >> 1);
        com.tencent.mm.ui.base.MMGridPaper.a(s2Var.f228503a, 1);
    }
}
