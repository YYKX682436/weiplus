package com.tencent.mm.plugin.gallery.picker.tab;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/tab/MediaTabFragment;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MediaTabFragment extends com.tencent.mm.ui.vas.VASCommonFragment {
    public boolean R;
    public boolean S;

    @Override // com.tencent.mm.ui.vas.VASCommonFragment
    public void C0() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        androidx.appcompat.app.b mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
        lk5.e eVar = mActionBar instanceof lk5.e ? (lk5.e) mActionBar : null;
        android.view.ViewGroup viewGroup = eVar != null ? eVar.f319028b : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.vas.VASCommonFragment, com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]onCreateView fixStatusBar:");
        sb6.append(this.R);
        sb6.append(" ActClz=");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        sb6.append(vASActivity != null ? vASActivity.getClass().getSimpleName() : null);
        sb6.append(" topMargin=");
        sb6.append(h17);
        com.tencent.mars.xlog.Log.i(this.f211120o, sb6.toString());
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView == null) {
            return onCreateView;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(onCreateView.getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        if (this.R) {
            layoutParams.topMargin = h17;
        }
        if (this.S) {
            layoutParams.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.aa6);
        }
        frameLayout.addView(onCreateView, layoutParams);
        return frameLayout;
    }
}
