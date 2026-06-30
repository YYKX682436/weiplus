package hr3;

/* loaded from: classes3.dex */
public final class wc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        super(0);
        this.f284154d = recommendDeleteContactUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f284154d.getIntent().getStringExtra("INTENT_KEY_LAST_CGI_CONTEXT");
        return stringExtra == null ? "" : stringExtra;
    }
}
