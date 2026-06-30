package fg1;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.u f261890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fg1.u uVar) {
        super(1);
        this.f261890d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gg1.j it = (gg1.j) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume now:" + it.f271576a);
        fg1.j jVar = fg1.u.f261893l;
        gg1.c1 b17 = this.f261890d.b();
        java.lang.Object obj2 = it.f271576a;
        kotlin.jvm.internal.o.d(obj2);
        b17.e(((java.lang.Number) obj2).intValue() + 1);
        return jz5.f0.f302826a;
    }
}
