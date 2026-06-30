package hy;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285736d;

    public h(hy.a0 a0Var, com.tencent.wechat.aff.chatbot.f fVar) {
        this.f285736d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285736d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).getClass();
        }
    }
}
