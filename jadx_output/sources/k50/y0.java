package k50;

/* loaded from: classes.dex */
public final class y0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f304270d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f304271e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f304272f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f304273g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f304274h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f304275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f304270d = jz5.h.b(new k50.v0(this));
        this.f304271e = jz5.h.b(k50.x0.f304268d);
        this.f304272f = jz5.h.b(k50.w0.f304266d);
        this.f304273g = jz5.h.b(new k50.s0(this));
        this.f304274h = kz5.p0.f313996d;
        this.f304275i = new java.util.LinkedHashMap();
    }

    public final void T6(java.lang.String username) {
        k50.g0.f304214a.b(k50.o0.f304246g);
        jz5.g gVar = px.g.f358747a;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String concat = "forward_clawbot_last_used_".concat(username);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object value = ((jz5.n) px.g.f358747a).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).B(concat, currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.Forward.ClawBotUsage", "recordUsage: " + username + ", time=" + currentTimeMillis);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("selected_app", "CLAWBOT");
        intent.putExtra("selected_clawbot_username", username);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489111ef2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra != null) {
                T6(stringExtra);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[SYNTHETIC] */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.y0.onCreate(android.os.Bundle):void");
    }
}
