package db5;

/* loaded from: classes8.dex */
public class x2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaperGridView f228569d;

    public x2(com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView) {
        this.f228569d = mMGridPaperGridView;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228569d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaperGridView", "on item long click, but main adapter is null");
            return false;
        }
        int i18 = mMGridPaperGridView.f197421g;
        v2Var.getClass();
        return false;
    }
}
