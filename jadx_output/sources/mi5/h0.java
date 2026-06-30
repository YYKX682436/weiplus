package mi5;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi5.i0 f326850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f326852g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.storage.f9 f9Var, mi5.i0 i0Var, android.content.Context context, b11.f fVar) {
        super(0);
        this.f326849d = f9Var;
        this.f326850e = i0Var;
        this.f326851f = context;
        this.f326852g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [z01.j0, b11.d] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        b11.b bVar;
        com.tencent.mm.storage.f9 f9Var = this.f326849d;
        boolean J2 = f9Var.J2();
        android.content.Context context = this.f326851f;
        mi5.i0 i0Var = this.f326850e;
        if (J2) {
            b11.b bVar2 = new b11.b();
            af5.y0.b(bVar2, f9Var);
            i0Var.getClass();
            bVar2.f469141f = new mi5.g0(context, f9Var);
            bVar = bVar2;
        } else if (f9Var.isVideo()) {
            ?? dVar = new b11.d();
            ze5.ia.c(dVar, f9Var, null, context);
            i0Var.getClass();
            dVar.f469081y = new mi5.g0(context, f9Var);
            bVar = dVar;
        } else {
            bVar = new b11.b();
        }
        bVar.Q2(this.f326852g);
        bVar.setPreview(true);
        return bVar;
    }
}
