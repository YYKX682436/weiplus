package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI;", "Lcom/tencent/mm/ui/MMActivity;", "Luh4/i0;", "<init>", "()V", "com/tencent/mm/plugin/teenmode/ui/e", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class AuthorizationDetailUI extends com.tencent.mm.ui.MMActivity implements uh4.i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f172796t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f172797d = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.g(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172798e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.m(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172799f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.t(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f172800g = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.u(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f172801h = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.f(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f172802i = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.k(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f172803m = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.j(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f172804n = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.l(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f172805o = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.v(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f172806p = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.i(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f172807q = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.h(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f172808r = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.s(this));

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.teenmode.ui.e f172809s = new com.tencent.mm.plugin.teenmode.ui.e(null, 1, null);

    public final ot0.q T6() {
        return (ot0.q) ((jz5.n) this.f172797d).getValue();
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f172798e).getValue()).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00df, code lost:
    
        if (r4 == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI.V6():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cy8;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getBooleanExtra("intent_extra_need_anim", false)) {
            overridePendingTransition(0, 0);
        }
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.n(this));
        c01.z1.r();
        java.lang.String stringExtra = getIntent().getStringExtra("intent_extra_guardian_username");
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent_extra_ward_username");
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent_extra_cdn_img_path");
        com.tencent.mm.plugin.teenmode.ui.e eVar = this.f172809s;
        eVar.f427958b = stringExtra3;
        iz5.a.d(null, stringExtra);
        iz5.a.d(null, stringExtra2);
        ((android.widget.Button) ((jz5.n) this.f172801h).getValue()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.p(this, stringExtra2));
        ((android.widget.Button) ((jz5.n) this.f172802i).getValue()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.q(this));
        eVar.f427963g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483304a94);
        eVar.f427964h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a8u);
        eVar.f427965i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.a8y);
        eVar.f427966j = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483300a90);
        eVar.f427967k = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a8z);
        eVar.f427968l = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483301a91);
        eVar.f427969m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a8w);
        rt0.e eVar2 = (rt0.e) T6().y(rt0.e.class);
        eVar.f427957a = T6();
        eVar.f427959c = getIntent().getLongExtra("intent_extra_request_time", 0L);
        wh4.c a17 = wh4.j.f446012a.a();
        int i17 = eVar2.f399379d;
        java.lang.String str = eVar2.f399378c;
        kotlin.jvm.internal.o.d(str);
        uh4.g0 y07 = a17.y0(i17, str, U6());
        eVar.f172974n = y07;
        eVar.f427960d = y07;
        eVar.f427961e = stringExtra;
        eVar.f427962f = stringExtra2;
        V6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this);
    }

    @Override // uh4.i0
    public void onDataChanged() {
        rt0.e eVar = (rt0.e) T6().y(rt0.e.class);
        wh4.c a17 = wh4.j.f446012a.a();
        int i17 = eVar.f399379d;
        java.lang.String str = eVar.f399378c;
        kotlin.jvm.internal.o.d(str);
        uh4.g0 y07 = a17.y0(i17, str, U6());
        com.tencent.mm.plugin.teenmode.ui.e eVar2 = this.f172809s;
        eVar2.f172974n = y07;
        eVar2.f427960d = eVar2.f172974n;
        pm0.v.X(new com.tencent.mm.plugin.teenmode.ui.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((uh4.c) ((jz5.n) this.f172808r).getValue()).getClass();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this);
        super.onDestroy();
    }
}
