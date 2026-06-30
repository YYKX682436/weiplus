package gg1;

/* loaded from: classes7.dex */
public final class b0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f271531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gg1.c1 c1Var, yz5.l lVar) {
        super(c1Var);
        this.f271531a = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", "get volume  fail" + eVar.f2487c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        aa1.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.Map map = response.f2489b;
        java.lang.String str = (map == null || (aVar = (aa1.a) map.get("CurrentVolume")) == null) ? null : aVar.f2481a;
        if (!android.text.TextUtils.isEmpty(str)) {
            gg1.j jVar = new gg1.j(true);
            kotlin.jvm.internal.o.d(str);
            jVar.f271576a = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
            this.f271531a.invoke(jVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "get volume success : " + str);
    }
}
