package um2;

/* loaded from: classes3.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428843d = x5Var;
        this.f428844e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428843d;
        pe2.h hVar = x5Var.B;
        if (hVar != null) {
            return hVar;
        }
        fm2.c cVar = this.f428844e;
        return new pe2.h((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.euu, cVar), cVar);
    }
}
