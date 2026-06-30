package sm2;

/* loaded from: classes3.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409503d = o4Var;
        this.f409504e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.h5 h5Var = new sm2.h5(this.f409504e);
        sm2.o4 o4Var = this.f409503d;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) o4Var.N(h5Var);
        o4Var.f409636v = r60Var;
        return r60Var;
    }
}
