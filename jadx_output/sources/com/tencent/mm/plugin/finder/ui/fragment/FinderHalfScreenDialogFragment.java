package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/lifecycle/x;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderHalfScreenDialogFragment extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHalfScreenDialogFragment(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        android.content.Context context = this.f208803d;
        return context.getResources().getConfiguration().orientation == 2 ? w0() - com.tencent.mm.ui.bl.h(context) : (int) (w0() * 0.75d);
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int r0() {
        return this.f208803d.getResources().getConfiguration().orientation == 2 ? w0() : ((java.lang.Number) ((jz5.n) this.f208807h).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public float s0() {
        return 0.5f;
    }
}
