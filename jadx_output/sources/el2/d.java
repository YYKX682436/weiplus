package el2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, el2.i0 i0Var) {
        super(1);
        this.f253767d = context;
        this.f253768e = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f253767d;
            db5.t7.h(context, context.getString(com.tencent.mm.R.string.e8e));
            wt2.a aVar = this.f253768e.I;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            aVar.V3();
        }
        return jz5.f0.f302826a;
    }
}
