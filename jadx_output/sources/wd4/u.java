package wd4;

/* loaded from: classes.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd4.w f445036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f445037f;

    public u(android.view.View view, long j17, wd4.w wVar, com.tencent.mm.storage.z3 z3Var) {
        this.f445035d = view;
        this.f445036e = wVar;
        this.f445037f = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f445035d;
        view2.setClickable(false);
        view2.postDelayed(new wd4.t(view2), 1000L);
        java.lang.String d17 = this.f445037f.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        wd4.w wVar = this.f445036e;
        wVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Context context = wVar.f445048d;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        intent.putExtra("Contact_Scene", 0);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
    }
}
