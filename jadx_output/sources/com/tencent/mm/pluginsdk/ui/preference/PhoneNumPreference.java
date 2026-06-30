package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes8.dex */
public class PhoneNumPreference extends com.tencent.mm.ui.base.preference.Preference implements android.view.View.OnClickListener {
    public com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView L;
    public android.view.View M;

    public PhoneNumPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/PhoneNumPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        throw null;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.L.b();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.M == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView = new com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView(u17.getContext(), this);
            this.L = profileMobilePhoneView;
            viewGroup2.addView(profileMobilePhoneView, new android.widget.AbsListView.LayoutParams(-1, -2));
            com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView2 = this.L;
            profileMobilePhoneView2.f189812d = null;
            profileMobilePhoneView2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", null, null);
            profileMobilePhoneView2.f189814e = null;
            profileMobilePhoneView2.f189815f = null;
            profileMobilePhoneView2.b();
            this.M = u17;
        }
        return this.M;
    }

    public PhoneNumPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
