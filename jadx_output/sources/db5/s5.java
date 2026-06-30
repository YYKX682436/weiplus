package db5;

/* loaded from: classes15.dex */
public class s5 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMRadioGroupView f228505d;

    public s5(com.tencent.mm.ui.base.MMRadioGroupView mMRadioGroupView, db5.p5 p5Var) {
        this.f228505d = mMRadioGroupView;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.MMRadioGroupView mMRadioGroupView = this.f228505d;
        if (view == mMRadioGroupView && (view2 instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
            if (view2.getId() == -1) {
                int hashCode = view2.hashCode();
                if (hashCode <= -1) {
                    hashCode &= Integer.MAX_VALUE;
                }
                view2.setId(hashCode);
            }
            ((com.tencent.mm.ui.base.MMRadioImageButton) view2).setOnOtherMMRadioButtonCheckedChangeListener(mMRadioGroupView.f197548f);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view == this.f228505d && (view2 instanceof com.tencent.mm.ui.base.MMRadioImageButton)) {
            ((com.tencent.mm.ui.base.MMRadioImageButton) view2).setOnOtherMMRadioButtonCheckedChangeListener(null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
