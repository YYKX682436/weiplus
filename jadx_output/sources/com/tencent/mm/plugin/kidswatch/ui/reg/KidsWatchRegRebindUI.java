package com.tencent.mm.plugin.kidswatch.ui.reg;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class KidsWatchRegRebindUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f143166q = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143169f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143170g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143171h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143172i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f143173m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f143174n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f143175o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f143176p = jz5.h.b(new z83.a0(this));

    public final w83.j T6() {
        return (w83.j) ((jz5.n) this.f143176p).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489192bn3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f444020e;
        java.lang.String string = getString(com.tencent.mm.R.string.g7n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f444020e.setCloseBtnCallBack(new z83.w(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143170g = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        kotlin.jvm.internal.o.d(stringExtra2);
        this.f143171h = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra3);
        this.f143167d = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.reg.mobile");
        kotlin.jvm.internal.o.d(stringExtra4);
        this.f143168e = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("intent.key.reg.nickname");
        kotlin.jvm.internal.o.d(stringExtra5);
        this.f143169f = stringExtra5;
        this.f143172i = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f143175o = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        java.lang.String stringExtra6 = getIntent().getStringExtra("intent.key.reg.last.nickname");
        java.lang.String stringExtra7 = getIntent().getStringExtra("intent.key.reg.last.head.img.url");
        T6().f444022g.setText(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6) ? "" : stringExtra6);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra7)) {
            int a17 = com.tencent.mm.ui.zk.a(getContext(), 16);
            o11.f fVar = new o11.f();
            fVar.f342091o = com.tencent.mm.R.drawable.bhm;
            fVar.f342097u = a17;
            fVar.f342096t = true;
            n11.a.b().h(stringExtra7, T6().f444021f, fVar.a());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileID:");
        java.lang.String str = this.f143170g;
        if (str == null) {
            kotlin.jvm.internal.o.o("headImgFileID");
            throw null;
        }
        sb6.append(str);
        sb6.append(", aeskey:");
        java.lang.String str2 = this.f143171h;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("headImgAesKey");
            throw null;
        }
        sb6.append(str2);
        sb6.append(", loginUrl:");
        java.lang.String str3 = this.f143167d;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        sb6.append(str3);
        sb6.append(", nickName:");
        java.lang.String str4 = this.f143169f;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("nickName");
            throw null;
        }
        sb6.append(str4);
        sb6.append(", regSessionId:");
        sb6.append(this.f143172i);
        sb6.append(", hasSetAvatar:");
        sb6.append(this.f143175o);
        sb6.append(", lastNickName:");
        sb6.append(stringExtra6);
        sb6.append(", lastImgUrl:");
        sb6.append(stringExtra7);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
        T6().f444023h.setOnClickListener(new z83.x(this));
        T6().f444019d.setOnClickListener(new z83.y(this));
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.c(context, T6().f444018c, T6().f444017b);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof x83.h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegRebindUI", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f143174n;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            gm0.j1.d().q(5888, this);
            if (i17 != 0 || i18 != 0) {
                x83.f[] fVarArr = x83.f.f452567d;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21256, true, true, false, "", 2, java.lang.Integer.valueOf(i18));
                x51.r1 r1Var = new x51.r1(i17, i18, str);
                ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                if (new x51.f().c(this, r1Var)) {
                    return;
                }
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    b17.c(this, null, null);
                    return;
                }
                java.lang.String string = getString(com.tencent.mm.R.string.f492365g82, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                db5.e1.s(getContext(), string, "");
                return;
            }
            x83.h hVar = (x83.h) m1Var;
            com.tencent.mm.protobuf.f fVar = hVar.f452570e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
            java.lang.String str2 = ((r45.hn0) fVar).f376308e;
            com.tencent.mm.protobuf.f fVar2 = hVar.f452570e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
            java.lang.String OpenID = ((r45.hn0) fVar2).f376311h;
            kotlin.jvm.internal.o.f(OpenID, "OpenID");
            this.f143173m = OpenID;
            java.lang.String str3 = str2 != null ? str2 : "";
            x83.f[] fVarArr2 = x83.f.f452567d;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21256, true, true, false, str3, 1, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoRegSuccessUI, nickName:");
            java.lang.String str4 = this.f143169f;
            if (str4 == null) {
                kotlin.jvm.internal.o.o("nickName");
                throw null;
            }
            sb6.append(str4);
            sb6.append(", openId:");
            sb6.append(this.f143173m);
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI.class);
            java.lang.String str5 = this.f143167d;
            if (str5 == null) {
                kotlin.jvm.internal.o.o("loginUrl");
                throw null;
            }
            intent.putExtra("intent.key.login.url", str5);
            java.lang.String str6 = this.f143169f;
            if (str6 == null) {
                kotlin.jvm.internal.o.o("nickName");
                throw null;
            }
            intent.putExtra("intent.key.reg.nickname", str6);
            intent.putExtra("intent.key.reg.openid", this.f143173m);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
