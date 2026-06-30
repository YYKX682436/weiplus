package hr3;

/* loaded from: classes4.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference f283932d;

    public r0(com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference bizInfoHeaderPreference) {
        this.f283932d = bizInfoHeaderPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference bizInfoHeaderPreference = this.f283932d;
        java.lang.String d17 = bizInfoHeaderPreference.R.d1();
        android.content.Intent intent = new android.content.Intent(bizInfoHeaderPreference.V, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.class);
        intent.putExtra(dm.i4.COL_USERNAME, d17);
        intent.putExtra("brand_icon_url", bizInfoHeaderPreference.S);
        com.tencent.mm.ui.MMActivity mMActivity = bizInfoHeaderPreference.V;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
