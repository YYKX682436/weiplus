package qi2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, qi2.n nVar) {
        super(0);
        this.f363512d = context;
        this.f363513e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.n nVar = this.f363513e;
        zh2.c cVar = nVar.f363577h;
        android.content.Context context = this.f363512d;
        return new ni2.x(context, cVar, new qi2.c(nVar, context));
    }
}
