package com.tencent.mm.ui.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/MMHalfScreenMaxHeightDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class MMHalfScreenMaxHeightDialogFragment extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMHalfScreenMaxHeightDialogFragment(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
    }

    public int C0() {
        return super.p0();
    }

    public int F0() {
        return 0;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489169eh0;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflaterOri, "inflaterOri");
        android.view.View onCreateView = super.onCreateView(inflaterOri, viewGroup, bundle);
        android.view.View o07 = o0();
        com.tencent.mm.view.MaxHeightFrameLayout maxHeightFrameLayout = o07 instanceof com.tencent.mm.view.MaxHeightFrameLayout ? (com.tencent.mm.view.MaxHeightFrameLayout) o07 : null;
        if (maxHeightFrameLayout != null) {
            maxHeightFrameLayout.setMaxHeight(C0());
            int F0 = F0();
            if (F0 > 0) {
                maxHeightFrameLayout.setOnUPSlideListener(new bh5.w0(this, F0));
            }
        }
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        return -2;
    }
}
