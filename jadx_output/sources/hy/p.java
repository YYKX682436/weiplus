package hy;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.chatbot.u f285751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f285753g;

    public p(hy.a0 a0Var, com.tencent.wechat.aff.chatbot.u uVar, java.lang.String str, byte[] bArr) {
        this.f285750d = a0Var;
        this.f285751e = uVar;
        this.f285752f = str;
        this.f285753g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285750d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).lb(this.f285751e, this.f285752f, this.f285753g);
        }
    }
}
