package hr3;

/* loaded from: classes11.dex */
public class jb extends hr3.va {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f283697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        super(normalUserFooterPreference);
        this.f283697f = normalUserFooterPreference;
    }

    @Override // hr3.va
    public void f() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283697f;
        android.view.View view = normalUserFooterPreference.f153734x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        normalUserFooterPreference.D1.setVisibility(0);
        if (normalUserFooterPreference.Q() || normalUserFooterPreference.L.d1().equals(c01.z1.r()) || c01.e2.D(normalUserFooterPreference.L.d1()) || com.tencent.mm.storage.z3.R3(normalUserFooterPreference.L.d1())) {
            normalUserFooterPreference.E1.setVisibility(8);
        } else {
            normalUserFooterPreference.E1.setVisibility(0);
        }
        normalUserFooterPreference.D1.setText(com.tencent.mm.R.string.f490984bh0);
        normalUserFooterPreference.C1.setVisibility(8);
        android.view.View view2 = normalUserFooterPreference.f153738z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$TContactHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        normalUserFooterPreference.H1.setVisibility(8);
    }

    @Override // hr3.va
    public void g() {
    }
}
