package nm4;

/* loaded from: classes13.dex */
public final class i implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView f338496a;

    public i(com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView) {
        this.f338496a = tingCategoryMvvmView;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = this.f338496a;
        if (zVar != null) {
            android.view.View view = tingCategoryMvvmView.f174859q;
            if (view != null) {
                view.setBackgroundColor(zVar.f261595a);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingCategoryPagCoverBg");
                throw null;
            }
        }
        android.view.View view2 = tingCategoryMvvmView.f174859q;
        if (view2 != null) {
            view2.setBackground(null);
        } else {
            kotlin.jvm.internal.o.o("mTingCategoryPagCoverBg");
            throw null;
        }
    }
}
