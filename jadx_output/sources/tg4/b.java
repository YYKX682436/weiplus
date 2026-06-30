package tg4;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f419228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg4.c f419229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f419230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer, tg4.c cVar, lc3.a0 a0Var) {
        super(0);
        this.f419228d = magicSclViewContainer;
        this.f419229e = cVar;
        this.f419230f = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lc3.a0 data = this.f419230f;
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f419228d;
        wq0.a f68675e = magicSclViewContainer.getF68675e();
        tg4.c cVar = this.f419229e;
        if (f68675e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "MagicCardCustomViewContainer null");
            cVar.v("coverView null");
        } else {
            try {
                cVar.getClass();
                kotlin.jvm.internal.o.g(data, "data");
                cVar.w(data, magicSclViewContainer, data.getInt("viewId"));
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "invalid viewId");
                cVar.v("invalid viewId");
            }
        }
        return jz5.f0.f302826a;
    }
}
