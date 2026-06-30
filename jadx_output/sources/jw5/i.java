package jw5;

/* loaded from: classes11.dex */
public final class i implements com.tencent.wechat.zrpc.h {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f302355c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f302356d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f302357e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f302358f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f302359g;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.zrpc.g f302360a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f302361b = "";

    static {
        new jw5.h(null);
        f302356d = new java.lang.Object();
        f302357e = new java.util.HashMap();
        f302358f = new java.util.HashMap();
        f302359g = jz5.h.b(jw5.e.f302353d);
    }

    @Override // com.tencent.wechat.zrpc.h
    public void a(com.tencent.wechat.zrpc.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f302360a = callback;
    }

    @Override // com.tencent.wechat.zrpc.h
    public boolean b(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        try {
            this.f302361b = new org.json.JSONObject(jsonStr).getString("bizName");
            java.lang.String msg = "listen: bizName " + this.f302361b;
            kotlin.jvm.internal.o.g(msg, "msg");
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
            }
            if (this.f302361b.length() == 0) {
                return false;
            }
            java.lang.String bizName = this.f302361b;
            com.tencent.wechat.zrpc.g gVar = this.f302360a;
            kotlin.jvm.internal.o.d(gVar);
            kotlin.jvm.internal.o.g(bizName, "bizName");
            synchronized (f302356d) {
                java.util.HashMap hashMap = f302357e;
                if (hashMap.containsKey(bizName)) {
                    java.lang.String msg2 = "awaitChannel bizName " + bizName + " has exist";
                    kotlin.jvm.internal.o.g(msg2, "msg");
                    if (iw5.o.f295275a != null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AidlZChannelServerFactory", msg2);
                    }
                } else {
                    java.lang.String msg3 = "awaitChannel " + bizName + " add";
                    kotlin.jvm.internal.o.g(msg3, "msg");
                    if (iw5.o.f295275a != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg3);
                    }
                    hashMap.put(bizName, gVar);
                    jz5.o oVar = (jz5.o) f302358f.remove(bizName);
                    if (oVar != null) {
                        java.lang.String msg4 = "awaitChannel bizName " + bizName + " matched with waiting channel";
                        kotlin.jvm.internal.o.g(msg4, "msg");
                        if (iw5.o.f295275a != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg4);
                        }
                        ((android.os.Handler) ((jz5.n) f302359g).getValue()).removeCallbacks((java.lang.Runnable) oVar.f302842e);
                        gVar.O0(new com.tencent.wechat.zrpc.b((com.tencent.wechat.zrpc.d) oVar.f302841d));
                        ((yz5.l) oVar.f302843f).invoke(java.lang.Boolean.TRUE);
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            java.lang.String msg5 = "listen: parse json error " + e17;
            kotlin.jvm.internal.o.g(msg5, "msg");
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg5);
            }
            return false;
        }
    }

    @Override // com.tencent.wechat.zrpc.h
    public void j() {
        if (iw5.o.f295275a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", "unInit");
        }
        java.lang.String bizName = this.f302361b;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        synchronized (f302356d) {
            java.lang.String msg = "cancelAwaitChannel " + bizName + " remove";
            kotlin.jvm.internal.o.g(msg, "msg");
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
            }
        }
    }
}
