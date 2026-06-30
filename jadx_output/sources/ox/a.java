package ox;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk.p f349439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox.g f349440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tk.p pVar, ox.g gVar, android.content.Context context) {
        super(2);
        this.f349439d = pVar;
        this.f349440e = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.wechat.mm.biz.b bVar = (com.tencent.wechat.mm.biz.b) obj;
        com.tencent.wechat.mm.biz.b bVar2 = (com.tencent.wechat.mm.biz.b) obj2;
        tk.p pVar = this.f349439d;
        if (bVar == null || bVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPublishApiFeatureService", "checkRemoteBizAndPhotoBizAcct failed, bizAcct=" + bVar + ", photoAcct=" + bVar2);
            pVar.a(false, "cgi error", null);
        } else {
            this.f349440e.getClass();
            pVar.a(true, "", null);
        }
        return jz5.f0.f302826a;
    }
}
