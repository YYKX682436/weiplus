package v01;

/* loaded from: classes11.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432200d;

    public d(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment) {
        this.f432200d = bizProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initPublishBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment.r0(this.f432200d, tk.u.f419872f);
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initPublishBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
