package ud2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.d f426588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f426589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ud2.d dVar, yz5.p pVar) {
        super(0);
        this.f426588d = dVar;
        this.f426589e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ud2.c0 c0Var = this.f426588d.f426612c;
        c0Var.getClass();
        yz5.p onPlayEventCallback = this.f426589e;
        kotlin.jvm.internal.o.g(onPlayEventCallback, "onPlayEventCallback");
        java.lang.String str = c0Var.f426595f;
        com.tencent.mars.xlog.Log.i(str, c0Var + " init");
        c0Var.f426609t = onPlayEventCallback;
        c0Var.f426603n = true;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = c0Var.f426591b;
        if (finderObject != null) {
            c0Var.f426596g = com.tencent.mm.plugin.finder.storage.h90.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion, finderObject, 0, 2, null);
            c0Var.d();
        } else {
            com.tencent.mars.xlog.Log.e(str, "finderObject is null!");
        }
        return jz5.f0.f302826a;
    }
}
