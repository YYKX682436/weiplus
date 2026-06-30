package hy;

/* loaded from: classes14.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final hy.b0 f285728a = new hy.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f285729b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f285730c;

    public final java.util.List a() {
        java.util.Collection values = f285729b.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        return kz5.n0.S0(values);
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroyAllSessions count=");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f285729b;
        sb6.append(concurrentHashMap.size());
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", sb6.toString());
        f285730c = false;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((hy.a0) it.next()).f285725e.clear();
        }
        f285729b.clear();
    }

    public final void c(hy.a0 session) {
        kotlin.jvm.internal.o.g(session, "session");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroySession id=");
        java.lang.String str = session.f285721a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", sb6.toString());
        session.f285725e.clear();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f285729b;
        concurrentHashMap.remove(str);
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", "unregisterSession id=" + str + " mapSize=" + concurrentHashMap.size());
    }

    public final hy.a0 d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (hy.a0) f285729b.get(str);
    }

    public final hy.a0 e(java.lang.String str, java.util.Optional optional, java.util.Optional welcomeInfo, java.lang.String str2, java.lang.String str3, com.tencent.wechat.aff.chatbot.w wVar, java.util.Optional optional2) {
        kotlin.jvm.internal.o.g(welcomeInfo, "welcomeInfo");
        if (str3 == null || str3.length() == 0) {
            com.tencent.mars.xlog.Log.w("ChatBotVoIPSessionMgr", "startSession: sessionID is null or empty");
            return null;
        }
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", "startSession identifier=" + str2 + " sessionID=" + str3 + " openScene=" + wVar);
        wx.o oVar = wx.o.f450424a;
        oVar.getClass();
        if (!wx.o.f450425b) {
            oVar.a();
        }
        int h17 = gm0.j1.b().h();
        com.tencent.wechat.aff.chatbot.w0 w0Var = com.tencent.wechat.aff.chatbot.w0.f216518b;
        com.tencent.wechat.aff.chatbot.v k17 = w0Var.k(str == null ? "" : str, optional == null ? java.util.Optional.empty() : optional, welcomeInfo, h17, str2 == null ? "" : str2, str3, wVar == null ? com.tencent.wechat.aff.chatbot.w.ChatBotOpenScene_Asst : wVar, optional2 == null ? java.util.Optional.empty() : optional2);
        if (k17 == null || k17.f216486d != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSession failed ret=");
            sb6.append(k17 != null ? java.lang.Integer.valueOf(k17.f216486d) : null);
            sb6.append(" for sessionID=");
            sb6.append(str3);
            com.tencent.mars.xlog.Log.e("ChatBotVoIPSessionMgr", sb6.toString());
            return null;
        }
        java.lang.String str4 = k17.f216488f[2] ? k17.f216487e : "";
        if (str4 == null || str4.length() == 0) {
            com.tencent.mars.xlog.Log.e("ChatBotVoIPSessionMgr", "startSession returned empty voipSessionID for sessionID=".concat(str3));
            return null;
        }
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", "startSession success voipSessionID=" + str4 + " for sessionID=" + str3);
        kotlin.jvm.internal.o.d(str4);
        com.tencent.mars.xlog.Log.i("ChatBotVoIPSessionMgr", "createSession voipSessionID=" + str4 + " openScene=" + wVar);
        hy.a0 a0Var = new hy.a0(str4, wVar, this);
        f285729b.put(str4, a0Var);
        if (f285730c) {
            a0Var.f285726f = true;
        }
        java.lang.String str5 = a0Var.f285721a;
        if (str5.length() == 0) {
            com.tencent.mars.xlog.Log.i("ChatBotVoIPSession", "resetActiveVoIPSession: nil ID");
        } else {
            w0Var.g(str5);
        }
        return a0Var;
    }
}
