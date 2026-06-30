package hy;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.chatbot.b3 f285747e;

    public m(hy.a0 a0Var, com.tencent.wechat.aff.chatbot.b3 b3Var) {
        this.f285746d = a0Var;
        this.f285747e = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285746d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).c6(this.f285747e);
        }
    }
}
