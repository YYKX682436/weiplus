package fg1;

/* loaded from: classes7.dex */
public final class m extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.u f261874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.Object obj, fg1.u uVar) {
        super(obj);
        this.f261874b = uVar;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "isForeground = " + booleanValue + ' ');
        fg1.u uVar = this.f261874b;
        if (booleanValue && !booleanValue2) {
            uVar.b().f();
        }
        if (booleanValue || booleanValue2) {
            return;
        }
        gg1.c1 b17 = uVar.b();
        com.tencent.mm.sdk.platformtools.b4 b4Var = b17.f271550p;
        if (b4Var.e()) {
            b17.f271549o = false;
            b4Var.c(5000L, 5000L);
        }
    }
}
