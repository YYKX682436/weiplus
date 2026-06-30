package z32;

/* loaded from: classes.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f469925d;

    public n(z32.s sVar) {
        this.f469925d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z32.s sVar = this.f469925d;
        android.content.Intent intent = new android.content.Intent(sVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI.class);
        androidx.appcompat.app.AppCompatActivity activity = sVar.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
