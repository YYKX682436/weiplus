package um2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428950d = x5Var;
        this.f428951e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) this.f428950d.f19605b;
        fm2.c cVar = this.f428951e;
        return new fe2.h(mMActivity, cVar, cVar);
    }
}
