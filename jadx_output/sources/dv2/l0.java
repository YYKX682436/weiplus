package dv2;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.m0 f243887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f243888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(dv2.m0 m0Var, yz5.a aVar) {
        super(1);
        this.f243887d = m0Var;
        this.f243888e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        dv2.m0.O6(this.f243887d, it);
        boolean z17 = false;
        if (it instanceof org.json.JSONObject) {
            try {
                boolean optBoolean = ((org.json.JSONObject) it).optBoolean("postDirectly", false);
                com.tencent.mars.xlog.Log.i("FinderPostAddTagUIC", "needPostDirectly: data:" + it + ", postDirectly:" + optBoolean);
                z17 = optBoolean;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderPostAddTagUIC", java.lang.String.valueOf(e17.getMessage()));
            }
        }
        if (z17) {
            this.f243888e.invoke();
        }
        return jz5.f0.f302826a;
    }
}
