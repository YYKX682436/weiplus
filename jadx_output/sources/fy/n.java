package fy;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.n f267175d = new fy.n();

    public n() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "cancel_session invoke");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SUCCESS, true);
        onComplete.invoke(jSONObject);
        return jz5.f0.f302826a;
    }
}
