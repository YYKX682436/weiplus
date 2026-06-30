package i31;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i31.i f288105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i31.b f288106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288107f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i31.i iVar, i31.b bVar, java.lang.String str) {
        super(1);
        this.f288105d = iVar;
        this.f288106e = bVar;
        this.f288107f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) obj;
        i31.i iVar = this.f288105d;
        iVar.f288110d = subscribeMsgSettingData;
        i31.b bVar = this.f288106e;
        if (subscribeMsgSettingData == null) {
            ((m31.j) bVar).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
        } else {
            ((m31.j) bVar).a(subscribeMsgSettingData);
        }
        iVar.h(subscribeMsgSettingData, this.f288107f);
        iVar.i(0);
        return jz5.f0.f302826a;
    }
}
