package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderAtSearchHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/lifecycle/x;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderAtSearchHalfScreenDialogFragment extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAtSearchHalfScreenDialogFragment(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.res.Resources resources;
        kotlin.jvm.internal.o.g(inflaterOri, "inflaterOri");
        android.view.View onCreateView = super.onCreateView(inflaterOri, viewGroup, bundle);
        android.view.View findViewById = onCreateView.findViewById(com.tencent.mm.R.id.gwe);
        android.content.Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            int color = resources.getColor(com.tencent.mm.R.color.a9e);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
        }
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        return (int) (w0() * 0.75d);
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public float s0() {
        return 0.5f;
    }
}
