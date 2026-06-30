package tp2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f421132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tp2.f f421133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent, tp2.f fVar, so2.j5 j5Var) {
        super(1);
        this.f421132d = intent;
        this.f421133e = fVar;
        this.f421134f = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("enter_page_type", "live_replay_card");
        jSONObject.put("is_lrfeed", "1");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        android.content.Intent intent = this.f421132d;
        intent.putExtra("key_extra_info", t17);
        intent.putExtra("KEY_CHECK_FEED_VALID", true);
        i95.m c17 = i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.ba((s40.w0) c17, this.f421133e.f421139b, ((vp2.u) this.f421134f).getFeedObject().getFeedObject(), false, this.f421132d, 4, null);
        return jz5.f0.f302826a;
    }
}
