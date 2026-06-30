package gf;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f271026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.util.LinkedList linkedList) {
        super(1);
        this.f271026d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof org.json.JSONObject) {
            java.lang.String optString = ((org.json.JSONObject) it).optString("param_name");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            if (r26.i0.y(optString, "wx_wxapp_expt_skyline", false)) {
                this.f271026d.add(it);
            }
        }
        return jz5.f0.f302826a;
    }
}
