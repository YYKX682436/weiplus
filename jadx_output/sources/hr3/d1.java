package hr3;

/* loaded from: classes11.dex */
public class d1 implements ql5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283463b;

    public d1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, int i17) {
        this.f283463b = contactInfoUI;
        this.f283462a = i17;
    }

    @Override // ql5.n
    public void a(float f17) {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283463b;
        contactInfoUI.R.setTranslationY(f17);
        int i17 = this.f283462a;
        float f18 = f17 / i17;
        if (f17 < 0.0f) {
            f18 = 0.0f;
        }
        if (f17 > i17) {
            f18 = 1.0f;
        }
        androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).Y6(f18, f17, i17);
        if (contactInfoUI.f153656f == null) {
            contactInfoUI.f153656f = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).h("contact_profile_header_normal");
        }
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = contactInfoUI.f153656f;
        if (normalProfileHeaderPreference != null) {
            android.view.View view = normalProfileHeaderPreference.T;
            android.widget.LinearLayout linearLayout = view != null ? ((hr3.u9) view.getTag()).f284074v : null;
            if (linearLayout != null) {
                float f19 = 1.0f * (1.0f - f18);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(f19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                linearLayout.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(linearLayout, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = contactInfoUI.f153656f.T;
                android.view.View view3 = view2 != null ? ((hr3.u9) view2.getTag()).f284076x : null;
                if (view3 != null) {
                    if (f19 <= 0.0f) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            bi4.i0 R = contactInfoUI.f153656f.R();
            if (R != null) {
                R.r(f18, f17, i17);
            }
        }
    }
}
