package hy;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.chatbot.j f285763e;

    public v(hy.a0 a0Var, com.tencent.wechat.aff.chatbot.j jVar) {
        this.f285762d = a0Var;
        this.f285763e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285762d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).J6(this.f285763e);
        }
    }
}
