package hr3;

/* loaded from: classes11.dex */
public class ya extends hr3.eb {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f284209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        super(normalUserFooterPreference);
        this.f284209g = normalUserFooterPreference;
    }

    @Override // hr3.eb, hr3.va
    public void f() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284209g;
        android.view.View view = normalUserFooterPreference.f153734x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!normalUserFooterPreference.L.r2() || (normalUserFooterPreference.L.r2() && com.tencent.mm.storage.z3.H3(normalUserFooterPreference.L.d1()))) {
            android.view.View view2 = normalUserFooterPreference.f153738z1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            normalUserFooterPreference.D1.setVisibility(8);
            normalUserFooterPreference.G1.setVisibility(8);
            normalUserFooterPreference.E1.setVisibility(8);
        } else {
            android.view.View view3 = normalUserFooterPreference.f153738z1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            normalUserFooterPreference.D1.setVisibility(0);
            if (normalUserFooterPreference.Q() || normalUserFooterPreference.L.d1().equals(c01.z1.r())) {
                normalUserFooterPreference.E1.setVisibility(8);
            } else {
                normalUserFooterPreference.E1.setVisibility(0);
            }
        }
        normalUserFooterPreference.C1.setVisibility(8);
        normalUserFooterPreference.F1.setVisibility(8);
        normalUserFooterPreference.H1.setVisibility(8);
        if (normalUserFooterPreference.Y) {
            android.view.View view4 = normalUserFooterPreference.f153738z1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            normalUserFooterPreference.C1.setVisibility(0);
            normalUserFooterPreference.C1.setOnClickListener(new hr3.wa(this));
        }
        normalUserFooterPreference.B1.setOnClickListener(new hr3.xa(this));
    }

    @Override // hr3.va
    public void g() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284209g;
        com.tencent.mm.storage.z3 z3Var = normalUserFooterPreference.L;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NormalUserFooterPreference", "contact is null in NearByFriendHandler");
            return;
        }
        if (z3Var.r2() && (!normalUserFooterPreference.L.r2() || !com.tencent.mm.storage.z3.H3(normalUserFooterPreference.L.d1()))) {
            j();
        } else {
            if (com.tencent.mm.storage.z3.H3(normalUserFooterPreference.L.d1())) {
                return;
            }
            k(false, true);
        }
    }
}
