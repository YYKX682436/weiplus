package l00;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00.m f314728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l00.m mVar) {
        super(0);
        this.f314728d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init with viewGroupId: ");
        l00.m mVar = this.f314728d;
        sb6.append(mVar.f314730d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        java.lang.String str = "open_animation_" + ((int) (java.lang.System.currentTimeMillis() / 1000));
        kotlin.jvm.internal.o.g(str, "<set-?>");
        mVar.f314732f = str;
        l00.h hVar = new l00.h(new xq0.c("MagicEcsGiftEasterEgg", null, kz5.c0.i(new vd3.f(), new l00.e()), null, null, 0.0d, new l00.j(mVar), null, false, null, 904, null));
        hVar.f314726y = mVar;
        return hVar;
    }
}
