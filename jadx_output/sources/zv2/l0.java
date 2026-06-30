package zv2;

/* loaded from: classes10.dex */
public final class l0 extends zv2.b {

    /* renamed from: i, reason: collision with root package name */
    public static final zv2.h0 f476408i = new zv2.h0(null);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f476409m = jz5.h.b(zv2.g0.f476405d);

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f476410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476410h = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        char c17;
        if (f476408i.b()) {
            r45.n74 n74Var = (r45.n74) ((jz5.n) f476409m).getValue();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.ta.f(ya2.e1.f460472a, this.f476395d, n74Var.f381130d, n74Var.f381131e, n74Var.f381132f, false, false, false, null, new zv2.i0(this), 240, null);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f476395d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ry2.o k76 = ((com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).k7();
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderTencentVideoChooseLink");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            d17 = "https://m.v.qq.com/video/selection/index.html";
        }
        r45.tn2 tn2Var = k76.f401411J;
        boolean z17 = true;
        char c18 = '&';
        if (tn2Var != null && tn2Var.getInteger(0) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append("?" + ("businessType=" + tn2Var + "?.businessType"));
            d17 = sb6.toString();
            c17 = '&';
        } else {
            c17 = '?';
        }
        java.lang.String string = tn2Var != null ? tn2Var.getString(1) : null;
        if (!(string == null || string.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(d17);
            sb7.append(c17 + ("cid=" + tn2Var + "?.cid"));
            d17 = sb7.toString();
            c17 = '&';
        }
        java.lang.String string2 = tn2Var != null ? tn2Var.getString(2) : null;
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c18 = c17;
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(d17);
            sb8.append(c17 + ("lid=" + tn2Var + "?.lid"));
            d17 = sb8.toString();
        }
        java.lang.String str = d17 + c18 + "callBackKey=" + com.tencent.mm.sdk.platformtools.w2.a(d17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // zv2.b
    public boolean c() {
        return f476408i.a(this.f476395d);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String wording = jumpInfo.getWording();
        if (wording == null) {
            wording = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, wording, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        boolean b17 = f476408i.b();
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        if (!b17) {
            finderJumperView.setFilledIconId(com.tencent.mm.R.drawable.f481892c70);
            finderJumperView.setFilledIconColor(0);
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f476395d;
        java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f7z);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.icons_filled_square_play);
        finderJumperView.setFilledIconColor(appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478502m));
    }

    @Override // zv2.b
    public void g() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
            k17 = com.tencent.mm.app.w.INSTANCE.j();
        }
        java.lang.Object element = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if ((k17 != null ? (android.app.Activity) k17.get() : null) != null) {
            element = k17.get();
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo != null) {
            xc2.y2 y2Var = xc2.y2.f453343a;
            kotlin.jvm.internal.o.f(element, "element");
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453256r = 6;
            p0Var.f453257s = 2;
            p0Var.f453253o = "commentScene=" + this.f476410h.getInteger(5);
            xc2.y2.i(y2Var, (android.content.Context) element, p0Var, 0, null, 12, null);
        }
    }

    @Override // zv2.b
    public void k() {
        this.f476410h.set(5, 74);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, this.f476410h, "button_post_choose_tencentVideo", 0, null, false, null, 56, null);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.j0(this), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.k0(this), null, 20, null)), null);
    }

    public final r45.wf6 m(int i17, int i18, org.json.JSONObject jSONObject) {
        r45.wf6 wf6Var = new r45.wf6();
        wf6Var.set(1, java.lang.Integer.valueOf(i17));
        wf6Var.set(2, java.lang.Integer.valueOf(i18));
        r45.c74 c74Var = new r45.c74();
        c74Var.set(0, jSONObject.optString("iconUrl"));
        c74Var.set(1, jSONObject.optString("wording"));
        wf6Var.set(5, c74Var);
        wf6Var.set(0, 1);
        return wf6Var;
    }
}
