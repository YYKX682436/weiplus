package vf5;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf5.d f436410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vf5.d dVar, java.lang.String str, int i17) {
        super(0);
        this.f436410d = dVar;
        this.f436411e = str;
        this.f436412f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "blacklist_user_clicks");
        hashMap.put("black_list_sid", (java.lang.String) ((jz5.n) this.f436410d.f436414e).getValue());
        hashMap.put("wx_username", this.f436411e);
        hashMap.put("account_index", java.lang.String.valueOf(this.f436412f));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 33328);
        return jz5.f0.f302826a;
    }
}
