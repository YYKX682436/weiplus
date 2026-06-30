package com.tencent.mm.ui.vas;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class VASCommonFragmentForCommonActivity extends com.tencent.mm.ui.vas.VASCommonFragment {
    public boolean R;

    @Override // com.tencent.mm.ui.vas.VASCommonFragment
    public void B0() {
        super.B0();
        this.R = z0();
        A0();
    }

    @Override // com.tencent.mm.ui.vas.VASCommonFragment, na5.b
    public void onPagePopEnterAnimEnd() {
        super.onPagePopEnterAnimEnd();
        A0();
        s0(this.R);
    }

    @Override // com.tencent.mm.ui.vas.VASCommonFragment, com.tencent.mm.ui.vas.fragment.VASBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        w0(null);
        boolean z17 = false;
        if (!A0()) {
            r0(false);
            return;
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null && vASActivity.getF65848t()) {
            z17 = true;
        }
        r0(z17);
    }

    @Override // com.tencent.mm.ui.vas.VASCommonFragment
    public java.lang.Class u0() {
        return com.tencent.mm.ui.vas.VASCommonFragmentForCommonActivity.class;
    }

    @Override // com.tencent.mm.ui.vas.VASCommonFragment
    public void y0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window;
        android.view.View decorView;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (!((((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 2) == 0)) {
            android.view.View view = this.f211128w;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f211128w;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f211128w;
        if (view3 == null || (layoutParams = view3.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = com.tencent.mm.ui.bl.c(getContext());
        android.view.View view4 = this.f211128w;
        if (view4 == null) {
            return;
        }
        view4.setLayoutParams(layoutParams);
    }
}
