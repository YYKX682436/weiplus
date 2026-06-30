package df2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.o f230736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(df2.o oVar) {
        super(0);
        this.f230736d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.o oVar = this.f230736d;
        com.tencent.mars.xlog.Log.i(oVar.f230899p, "Switch to formal live countdown finished");
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = oVar.f230901r;
        if (gdVar != null) {
            pm0.v.B(gdVar);
        }
        com.tencent.mm.plugin.finder.live.widget.gd gdVar2 = oVar.f230901r;
        if (gdVar2 != null) {
            gdVar2.f118425i.d();
            gdVar2.f118426m = null;
        }
        oVar.f230901r = null;
        return jz5.f0.f302826a;
    }
}
