package fb5;

/* loaded from: classes9.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.sortview.BaseSortView f260890d;

    public h(com.tencent.mm.ui.base.sortview.BaseSortView baseSortView) {
        this.f260890d = baseSortView;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f260890d.f197868i;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
        }
        return false;
    }
}
