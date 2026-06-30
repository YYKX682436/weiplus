package qr3;

/* loaded from: classes4.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent implements qr3.a0 {

    /* renamed from: m, reason: collision with root package name */
    public static r45.n14 f366102m;

    /* renamed from: d, reason: collision with root package name */
    public int f366103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f366104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f366105f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f366106g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f366107h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f366108i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366107h = jz5.h.b(new qr3.m(activity));
    }

    public final com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI O6() {
        return (com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI) ((jz5.n) this.f366107h).getValue();
    }

    public final void P6(boolean z17, com.tencent.mm.ui.base.preference.r rVar) {
        if (!z17) {
            if (rVar != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).w("preference_key_tip");
            }
            if (rVar != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
                return;
            }
            return;
        }
        com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(getContext());
        preference.f197785v = false;
        preference.C("preference_key_tip");
        preference.G = com.tencent.mm.R.layout.f488009eb;
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.bc7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f366104e}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        preference.L(format);
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).w("preference_key_tip");
        }
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).d(preference, -1);
        }
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "create");
        if (!O6().f154175e.r2()) {
            ((com.tencent.mm.ui.base.preference.h0) O6().f154174d).t();
        }
        if (O6().f154175e.l2()) {
            return;
        }
        if (O6().f154176f != null && !x51.t1.b(O6().f154176f.field_appId)) {
            this.f366106g = O6().f154176f.field_appId;
        }
        this.f366105f = getIntent().getStringExtra("Contact_User");
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Nick");
        this.f366104e = stringExtra;
        if (stringExtra == null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f366105f;
            ((sg3.a) v0Var).getClass();
            this.f366104e = c01.a2.e(str);
        }
        java.lang.String str2 = this.f366105f;
        r45.m14 m14Var = new r45.m14();
        m14Var.f380070d = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = m14Var;
        lVar.f70665b = new r45.n14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-getalluseuserinfo";
        lVar.f70667d = 4975;
        o01.c cVar = o01.d.f341891a;
        qr3.e eVar = new qr3.e(cVar.a(lVar.a()));
        java.lang.String str3 = this.f366105f;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        r45.o14 o14Var = new r45.o14();
        o14Var.f381819d = str3;
        o14Var.f381820e = currentTimeMillis;
        o14Var.f381821f = 10;
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = o14Var;
        lVar2.f70665b = new r45.p14();
        lVar2.f70666c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
        lVar2.f70667d = 1850;
        qr3.h hVar = new qr3.h(cVar.a(lVar2.a()));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        v65.i.b(((um3.b) a17).O6(), null, new qr3.l(eVar, hVar, this, null), 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "finish");
        f366102m = null;
    }
}
