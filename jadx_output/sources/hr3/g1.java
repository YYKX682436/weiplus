package hr3;

/* loaded from: classes11.dex */
public class g1 implements com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283569d;

    public g1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283569d = contactInfoUI;
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void b(int i17) {
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "story_cat onMuteIn");
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        this.f283569d.getClass();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void j(int i17) {
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostClose() {
        android.view.View view;
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference;
        bi4.i0 R;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283569d;
        androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).Q6();
        com.tencent.mm.ui.base.preference.r rVar = contactInfoUI.f153654d;
        if (rVar != null && (normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal")) != null && (R = normalProfileHeaderPreference.R()) != null) {
            R.W(false);
            R.onPostClose();
        }
        contactInfoUI.showTitleView();
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference2 = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).h("contact_profile_header_normal");
        android.view.View view2 = (normalProfileHeaderPreference2 == null || (view = normalProfileHeaderPreference2.T) == null) ? null : ((hr3.u9) view.getTag()).H;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view3 = view2;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostOpen(boolean z17) {
        android.view.View view;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283569d;
        androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).R6();
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        bi4.i0 Z6 = contactInfoUI.Z6();
        if (Z6 != null) {
            Z6.onPostOpen(z17);
        }
        contactInfoUI.hideTitleView();
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).h("contact_profile_header_normal");
        android.view.View view2 = (normalProfileHeaderPreference == null || (view = normalProfileHeaderPreference.T) == null) ? null : ((hr3.u9) view.getTag()).H;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreClose() {
        bi4.i0 R;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283569d;
        com.tencent.mm.ui.base.preference.r rVar = contactInfoUI.f153654d;
        if (rVar != null) {
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal");
            if (normalProfileHeaderPreference != null && (R = normalProfileHeaderPreference.R()) != null) {
                R.onPreClose();
            }
            androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).S6();
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreOpen() {
        bi4.i0 R;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283569d;
        com.tencent.mm.ui.base.preference.r rVar = contactInfoUI.f153654d;
        if (rVar != null) {
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal");
            if (normalProfileHeaderPreference != null && (R = normalProfileHeaderPreference.R()) != null) {
                R.W(true);
                R.onPreOpen();
            }
            androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.textstatus.ui.n2 U6 = ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).U6();
            if (U6 != null) {
                U6.onPreOpen();
            }
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void p() {
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        this.f283569d.getClass();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void q(int i17) {
    }
}
