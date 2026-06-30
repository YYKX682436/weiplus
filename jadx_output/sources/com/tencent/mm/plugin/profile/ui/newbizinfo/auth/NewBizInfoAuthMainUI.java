package com.tencent.mm.plugin.profile.ui.newbizinfo.auth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthMainUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NewBizInfoAuthMainUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154193e;

    public final java.lang.String U6() {
        java.lang.String str = this.f154192d;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
        throw null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a1r;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        java.util.Set i17 = importUIComponents != null ? kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{rr3.k.class, rr3.z.class})) : null;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return i17;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154192d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_add_contact_openim_appid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f154193e = stringExtra2;
        setTitleDividerVis(false);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackBtn(new rr3.l(this));
    }
}
