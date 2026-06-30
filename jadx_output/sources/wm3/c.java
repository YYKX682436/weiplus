package wm3;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f447261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f447262e;

    public c(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f447261d = appCompatActivity;
        this.f447262e = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f447261d;
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = appCompatActivity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) appCompatActivity : null;
        com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference != null ? mMPreference.getPreferenceScreen() : null;
        com.tencent.mm.ui.base.preference.h0 h0Var = preferenceScreen instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) preferenceScreen : null;
        com.tencent.mm.ui.base.preference.MMPreference mMPreference2 = appCompatActivity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) appCompatActivity : null;
        if (mMPreference2 != null) {
            mMPreference2.dispatchClick(h0Var, this.f447262e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
