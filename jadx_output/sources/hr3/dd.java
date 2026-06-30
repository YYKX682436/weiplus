package hr3;

/* loaded from: classes3.dex */
public final class dd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f283486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        super(0);
        this.f283486d = recommendDeleteContactUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f283486d.getIntent().getStringExtra("INTENT_KEY_REPORT_SESSION_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
