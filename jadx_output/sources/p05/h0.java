package p05;

/* loaded from: classes3.dex */
public final class h0 implements com.tencent.mm.xeffect.IWeJsonMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.i0 f350531a;

    public h0(p05.i0 i0Var) {
        this.f350531a = i0Var;
    }

    @Override // com.tencent.mm.xeffect.IWeJsonMessageCallback
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        p05.i0 i0Var = this.f350531a;
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(type, "type");
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        try {
            java.util.Iterator it = i0Var.f350545f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.d0) obj).f350477a == ((long) i17)) {
                    break;
                }
            }
            if (((p05.d0) obj) != null) {
                com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
                if (new org.json.JSONObject(message).optInt("animEnd") == 2) {
                    com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end.");
                    p05.n0 n0Var = i0Var.f350546g;
                    if (n0Var != null) {
                        ((df2.b1) n0Var).a();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLive.FallingGiftEffect", e17.toString());
        }
        return 0;
    }
}
