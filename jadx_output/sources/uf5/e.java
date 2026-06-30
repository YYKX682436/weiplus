package uf5;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.k f427214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f427216f;

    public e(uf5.k kVar, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        this.f427214d = kVar;
        this.f427215e = arrayList;
        this.f427216f = hashSet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uf5.k kVar = this.f427214d;
        android.app.Activity activity = kVar.f427254a;
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            androidx.fragment.app.Fragment findFragmentByTag = ((androidx.appcompat.app.AppCompatActivity) activity).getSupportFragmentManager().findFragmentByTag("halfScreenDialog");
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = findFragmentByTag instanceof com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment ? (com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment) findFragmentByTag : null;
            if (mMHalfScreenDialogFragment != null) {
                try {
                    mMHalfScreenDialogFragment.u0().a();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        kVar.f427256c.invoke(this.f427215e, this.f427216f);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
