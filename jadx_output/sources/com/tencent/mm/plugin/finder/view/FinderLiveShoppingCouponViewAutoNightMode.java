package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponViewAutoNightMode;", "Lcom/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView;", "", "getBgColorRes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingCouponViewAutoNightMode extends com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingCouponViewAutoNightMode(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView
    public android.view.View d(int i17) {
        zl2.w4 w4Var = zl2.w4.f474017a;
        zl2.u4 u4Var = zl2.u4.f473988d;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        kotlin.jvm.internal.o.f(from, "from(...)");
        return w4Var.b(i17, this, false, u4Var, context, from);
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView
    public int getBgColorRes() {
        return com.tencent.mm.R.color.acl;
    }
}
