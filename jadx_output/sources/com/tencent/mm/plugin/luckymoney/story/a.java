package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145817d;

    public a(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145817d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145817d;
        if (envelopeAppBarLayout.N1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", envelopeAppBarLayout.E1.f381506o);
            intent.putExtra("Contact_Scene", 240);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(envelopeAppBarLayout.E1.f381515x)) {
                java.lang.String uri = android.net.Uri.parse(envelopeAppBarLayout.E1.f381515x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "1").build().toString();
                intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", uri);
                gb3.m.f270028i = uri;
            }
            intent.putExtra("force_get_contact", true);
            j45.l.n(envelopeAppBarLayout.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 2);
            gb3.n.a(7);
            gb3.m.a(88, envelopeAppBarLayout.G1);
            com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
