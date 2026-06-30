package nm4;

/* loaded from: classes13.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView f338493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.lm6 f338494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f338495c;

    public h(com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView, r45.lm6 lm6Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f338493a = tingCategoryMvvmView;
        this.f338494b = lm6Var;
        this.f338495c = mMPAGView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView.f174848t;
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = this.f338493a;
        tingCategoryMvvmView.getClass();
        boolean z18 = (!z17 || bitmap == null || bitmap.isRecycled()) ? false : true;
        r45.lm6 lm6Var = this.f338494b;
        if (lm6Var.f379640g == 2) {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f338495c;
            if (z18) {
                tingCategoryMvvmView.f(mMPAGView, bitmap);
                java.lang.String str2 = lm6Var.f379639f;
                if (str2 == null) {
                    str2 = "";
                }
                tingCategoryMvvmView.e(str2, bitmap);
                return;
            }
            tingCategoryMvvmView.f(mMPAGView, bitmap);
            android.view.View view2 = tingCategoryMvvmView.f174859q;
            if (view2 != null) {
                view2.setBackground(null);
            } else {
                kotlin.jvm.internal.o.o("mTingCategoryPagCoverBg");
                throw null;
            }
        }
    }
}
