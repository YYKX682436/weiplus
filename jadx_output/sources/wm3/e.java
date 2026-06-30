package wm3;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f447265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f447265d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f447265d;
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = appCompatActivity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) appCompatActivity : null;
        com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference != null ? mMPreference.getPreferenceScreen() : null;
        if (preferenceScreen != null) {
            java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).j()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) it.next();
                if (preference instanceof com.tencent.mm.ui.base.preference.ButtonPreference) {
                    arrayList.add(new java.lang.ref.WeakReference(preference));
                }
            }
        }
        return arrayList;
    }
}
