package zv2;

/* loaded from: classes10.dex */
public final class q extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final ya2.b2 f476422h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f476423i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476423i = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.f476422h = ya2.h.f460484a.b(xy2.c.e(activity));
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        ya2.b2 b2Var = this.f476422h;
        java.lang.String str = b2Var != null ? b2Var.field_username : null;
        androidx.appcompat.app.AppCompatActivity activity = this.f476395d;
        if (str == null) {
            str = xy2.c.e(activity);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI.class);
        intent.putExtra("finder_username", str);
        activity.startActivityForResult(intent, 20004);
    }

    @Override // zv2.b
    public boolean c() {
        return ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).oj(this.f476422h);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String string = this.f476395d.getResources().getString(com.tencent.mm.R.string.evg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, string + (char) 65306 + jumpInfo.getWording(), false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        java.lang.String string = this.f476395d.getResources().getString(com.tencent.mm.R.string.evg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.icons_outlined_sticker);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.icons_outlined_sticker);
    }

    @Override // zv2.b
    public void g() {
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        java.lang.String necessary_params;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo == null || (native_info = finderJumpInfo.getNative_info()) == null || (necessary_params = native_info.getNecessary_params()) == null) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(necessary_params).optString("productId");
            kotlin.jvm.internal.o.d(optString);
            qk.c0 c0Var = new qk.c0(optString);
            c0Var.f364198g = 0;
            ((com.tencent.mm.feature.emoji.f4) ((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class))).wi(this.f476395d, c0Var);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // zv2.b
    public void k() {
        this.f476423i.set(5, 74);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, this.f476423i, "button_post_choose_emoji", 0, null, false, null, 56, null);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.o(this), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.p(this), null, 20, null)), null);
    }
}
