package tl2;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f420267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f420268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tl2.u uVar, l81.b1 b1Var, android.content.Context context) {
        super(0);
        this.f420266d = uVar;
        this.f420267e = b1Var;
        this.f420268f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tl2.u uVar = this.f420266d;
        uVar.l(new tl2.o(uVar, this.f420267e, this.f420268f));
        return jz5.f0.f302826a;
    }
}
