package yi2;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yi2.i0 i0Var) {
        super(0);
        this.f462595d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.i0 i0Var = this.f462595d;
        android.content.Context context = i0Var.f462519e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new yi2.c(context, new yi2.x(i0Var));
    }
}
