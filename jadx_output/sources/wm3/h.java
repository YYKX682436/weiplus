package wm3;

/* loaded from: classes9.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm3.j f447268d;

    public h(wm3.j jVar) {
        this.f447268d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm3.j jVar = this.f447268d;
        java.util.ArrayList arrayList = jVar.f447278n;
        arrayList.clear();
        androidx.appcompat.app.AppCompatActivity activity = jVar.getActivity();
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = activity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) activity : null;
        com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference != null ? mMPreference.getPreferenceScreen() : null;
        if (preferenceScreen != null) {
            java.util.Iterator it = ((java.util.List) ((jz5.n) jVar.f447277m).getValue()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) it.next()).get();
                if (preference != null) {
                    if (((com.tencent.mm.ui.base.preference.h0) preferenceScreen).q(preference.f197780q)) {
                        arrayList.add(new java.lang.ref.WeakReference(preference));
                    }
                }
            }
        }
        jVar.V6();
    }
}
