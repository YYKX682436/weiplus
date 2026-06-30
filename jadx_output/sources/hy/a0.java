package hy;

/* loaded from: classes14.dex */
public final class a0 implements wx.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f285721a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.w f285722b;

    /* renamed from: c, reason: collision with root package name */
    public final hy.b0 f285723c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f285724d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f285725e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f285726f;

    public a0(java.lang.String voipSessionID, com.tencent.wechat.aff.chatbot.w wVar, hy.b0 mgr) {
        kotlin.jvm.internal.o.g(voipSessionID, "voipSessionID");
        kotlin.jvm.internal.o.g(mgr, "mgr");
        this.f285721a = voipSessionID;
        this.f285722b = wVar;
        this.f285723c = mgr;
        this.f285724d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f285725e = new java.util.concurrent.CopyOnWriteArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hy.b0.f285729b;
        concurrentHashMap.put(voipSessionID, this);
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", "registerSession id=" + voipSessionID + " mapSize=" + concurrentHashMap.size());
    }

    public static final java.util.List a(hy.a0 a0Var) {
        a0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a0Var.f285725e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            wx.g1 g1Var = (wx.g1) weakReference.get();
            if (g1Var != null) {
                arrayList.add(g1Var);
            } else {
                arrayList2.add(weakReference);
            }
        }
        if (!arrayList2.isEmpty()) {
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList2));
        }
        return arrayList;
    }

    public void b(wx.g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        synchronized (this.f285725e) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f285725e;
            boolean z17 = false;
            if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((java.lang.ref.WeakReference) it.next()).get() == g1Var) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (!z17) {
                this.f285725e.add(new java.lang.ref.WeakReference(g1Var));
            }
        }
        if (this.f285726f) {
            this.f285724d.post(new hy.a(g1Var));
        }
    }

    public void c(com.tencent.wechat.aff.chatbot.d3 d3Var, yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroySession reason=");
        sb6.append(d3Var);
        sb6.append(" voipSessionID=");
        java.lang.String str = this.f285721a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSession", sb6.toString());
        com.tencent.wechat.aff.chatbot.w0.f216518b.b(d3Var, this.f285722b, str, new hy.b(lVar));
        this.f285723c.c(this);
    }

    public void d(wx.g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        synchronized (this.f285725e) {
            kz5.h0.B(this.f285725e, new hy.y(g1Var));
        }
    }

    public void e(java.lang.String str, boolean z17, com.tencent.wechat.aff.chatbot.n0 roomScene, int i17, boolean z18, boolean z19, byte[] transferCtx, boolean z27, com.tencent.wechat.aff.chatbot.x1 responseState, java.util.ArrayList imagePaths, yz5.a aVar) {
        kotlin.jvm.internal.o.g(roomScene, "roomScene");
        kotlin.jvm.internal.o.g(transferCtx, "transferCtx");
        kotlin.jvm.internal.o.g(responseState, "responseState");
        kotlin.jvm.internal.o.g(imagePaths, "imagePaths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.chatbot.k0.f216317b.a(str, z17, roomScene, i17, z18, z19, transferCtx, z27, responseState.f216545d, imagePaths, arrayList, arrayList, this.f285721a, new hy.z(aVar));
    }

    public java.lang.String toString() {
        return "ChatBotVoIPSession(voipSessionID='" + this.f285721a + "', openScene=" + this.f285722b + ", delegateCount=" + this.f285725e.size() + ')';
    }
}
