package p05;

/* loaded from: classes10.dex */
public final class c2 implements com.tencent.mm.xeffect.IWeJsonMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350471a;

    public c2(p05.d2 d2Var) {
        this.f350471a = d2Var;
    }

    @Override // com.tencent.mm.xeffect.IWeJsonMessageCallback
    public int a(int i17, java.lang.String message, tq5.g type) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        p05.d2 d2Var = this.f350471a;
        d2Var.e(0L, new p05.b2(d2Var, i17, message));
        return 0;
    }
}
