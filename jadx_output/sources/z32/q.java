package z32;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f469929d;

    public q(z32.s sVar) {
        this.f469929d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z32.s sVar = this.f469929d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(sVar.f469935d) && !kotlin.jvm.internal.o.b("#", sVar.f469935d)) {
            android.content.Intent intent = new android.content.Intent(sVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI.class);
            java.lang.String str = sVar.f469936e;
            if (str == null) {
                str = "";
            }
            intent.putExtra("app_username", str);
            java.lang.String str2 = sVar.f469935d;
            intent.putExtra("rank_id", str2 != null ? str2 : "");
            intent.putExtra("key_is_like_read_only", true);
            androidx.appcompat.app.AppCompatActivity activity = sVar.getActivity();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
