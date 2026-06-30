package kr3;

/* loaded from: classes11.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f311414e;

    public m1(kr3.q1 q1Var, java.lang.Boolean bool) {
        this.f311413d = q1Var;
        this.f311414e = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kr3.q1 q1Var = this.f311413d;
        q1Var.getClass();
        java.lang.Boolean bool = this.f311414e;
        if (bool != null) {
            com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct remarkTagOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct();
            if (bool.booleanValue()) {
                androidx.appcompat.app.AppCompatActivity activity = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1) zVar.a(activity).a(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1.class)).f311480h;
                androidx.appcompat.app.AppCompatActivity activity2 = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0) zVar.a(activity2).a(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0.class)).f311480h;
                androidx.appcompat.app.AppCompatActivity activity3 = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
                java.util.List list = ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0) zVar.a(activity3).a(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0.class)).f154072s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((mr3.l) it.next()).f330879h;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                androidx.appcompat.app.AppCompatActivity activity4 = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity4, "activity");
                pf5.z zVar2 = pf5.z.f353948a;
                ((gc0.p2) zVar2.a(activity4).a(gc0.p2.class)).f270248m.b(mMLimitedClearEditText != null ? mMLimitedClearEditText.getActualText() : null, profileEditPhoneNumberView != null ? profileEditPhoneNumberView.getPhoneNumberList() : null, arrayList, mMLimitedClearEditText);
                androidx.appcompat.app.AppCompatActivity activity5 = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity5, "activity");
                ((hr3.w1) zVar2.a(activity5).a(hr3.w1.class)).O6();
                remarkTagOperateLogStruct.f59976o = 1L;
            } else {
                remarkTagOperateLogStruct.f59976o = 2L;
            }
            remarkTagOperateLogStruct.f59974m = java.lang.System.currentTimeMillis() - q1Var.f311468y;
            remarkTagOperateLogStruct.p((java.lang.String) ((jz5.n) q1Var.f311452f).getValue());
            remarkTagOperateLogStruct.f59984w = remarkTagOperateLogStruct.b("sessionid", q1Var.f311469z, true);
            com.tencent.mm.contact.o R6 = q1Var.R6();
            remarkTagOperateLogStruct.f59977p = R6 != null && ((yq3.v) R6).k() ? 1L : 3L;
            if (q1Var.getIntent().getIntExtra("key_label_click_source", 0) > 0) {
                remarkTagOperateLogStruct.f59979r = 22L;
            }
            for (java.lang.Class cls : q1Var.Q6()) {
                androidx.appcompat.app.AppCompatActivity activity6 = q1Var.getActivity();
                kotlin.jvm.internal.o.g(activity6, "activity");
                ((kr3.t) pf5.z.f353948a.a(activity6).a(cls)).f7(remarkTagOperateLogStruct);
            }
            remarkTagOperateLogStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "22865 report:\n" + remarkTagOperateLogStruct.n());
        }
    }
}
