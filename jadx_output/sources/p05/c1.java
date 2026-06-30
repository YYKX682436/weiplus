package p05;

/* loaded from: classes3.dex */
public final class c1 implements com.tencent.mm.xeffect.IWeJsonMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.d1 f350470a;

    public c1(p05.d1 d1Var) {
        this.f350470a = d1Var;
    }

    @Override // com.tencent.mm.xeffect.IWeJsonMessageCallback
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        p05.d1 d1Var = this.f350470a;
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(type, "type");
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        try {
            java.util.Iterator it = d1Var.f350483e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.a1) obj).f350436a == ((long) i17)) {
                    break;
                }
            }
            if (((p05.a1) obj) != null) {
                com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
                int optInt = new org.json.JSONObject(message).optInt("animStatus");
                if (optInt == 1 || optInt == 3) {
                    com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end.");
                    p05.r0 r0Var = d1Var.f350484f;
                    if (r0Var != null) {
                        ((df2.r9) r0Var).a();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("InteractiveGiftEffect", e17.toString());
        }
        return 0;
    }
}
