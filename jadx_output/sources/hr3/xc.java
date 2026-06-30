package hr3;

/* loaded from: classes3.dex */
public final class xc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        super(0);
        this.f284180d = recommendDeleteContactUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = this.f284180d.getIntent().getStringArrayListExtra("INTENT_KEY_USERNAME_LIST");
        return stringArrayListExtra == null ? new java.util.ArrayList() : stringArrayListExtra;
    }
}
