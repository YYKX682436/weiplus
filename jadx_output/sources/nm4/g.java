package nm4;

/* loaded from: classes13.dex */
public final class g implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView f338489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f338490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f338491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338492d;

    public g(com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView, com.tencent.mm.view.MMPAGView mMPAGView, int i17, java.lang.String str) {
        this.f338489a = tingCategoryMvvmView;
        this.f338490b = mMPAGView;
        this.f338491c = i17;
        this.f338492d = str;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        boolean z18 = (!z17 || bitmap == null || bitmap.isRecycled()) ? false : true;
        int i17 = this.f338491c;
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = this.f338489a;
        if (z18) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(new nm4.d(bitmap, i17));
            int i18 = com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView.f174848t;
            tingCategoryMvvmView.d(this.f338490b, linkedList);
        }
        if (i17 == 0) {
            if (z18) {
                java.lang.String str2 = this.f338492d;
                if (str2 == null) {
                    str2 = "";
                }
                int i19 = com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView.f174848t;
                tingCategoryMvvmView.e(str2, bitmap);
                return;
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
}
