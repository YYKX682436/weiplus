package hy;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.chatbot.w f285759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285760f;

    public t(hy.a0 a0Var, com.tencent.wechat.aff.chatbot.w wVar, int i17) {
        this.f285758d = a0Var;
        this.f285759e = wVar;
        this.f285760f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285758d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).V5(this.f285759e, this.f285760f);
        }
    }
}
