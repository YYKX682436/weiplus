package el2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(el2.i0 i0Var, android.content.Context context) {
        super(1);
        this.f253939d = i0Var;
        this.f253940e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Context context = this.f253940e;
        java.lang.String string = (intValue == 2 && el2.i0.e0(this.f253939d)) ? context.getString(com.tencent.mm.R.string.f491788e93) : context.getString(com.tencent.mm.R.string.f491787e92);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
