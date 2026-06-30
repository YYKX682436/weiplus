package te3;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI f418578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI, java.lang.String str) {
        super(0);
        this.f418578d = magicSnsTimelineDemoUI;
        this.f418579e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f418579e;
        com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI = this.f418578d;
        int i17 = magicSnsTimelineDemoUI.f148137f;
        magicSnsTimelineDemoUI.f148137f = i17 + 1;
        android.util.DisplayMetrics displayMetrics = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();
        float f17 = displayMetrics.widthPixels - 50.0f;
        float f18 = displayMetrics.heightPixels - 50.0f;
        ((v12.i) ((aq0.g) i95.n0.c(aq0.g.class))).Ai(new aq0.h(java.lang.String.valueOf(i17), java.lang.System.currentTimeMillis(), new android.graphics.RectF(f17 - 50.0f, f18 - 50.0f, f17, f18), aq0.e.f13014f, "", str, true, magicSnsTimelineDemoUI.f148138g.c()));
        return jz5.f0.f302826a;
    }
}
