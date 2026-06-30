package pk2;

/* loaded from: classes3.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f356363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f356361d = z17;
        this.f356362e = o9Var;
        this.f356363f = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue) {
            boolean z17 = this.f356361d;
            pk2.o9 o9Var = this.f356362e;
            java.lang.String string = z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwl) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwu);
            kotlin.jvm.internal.o.d(string);
            db5.t7.b(o9Var.f356078d, string + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cud));
        }
        this.f356363f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
