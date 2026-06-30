package qi2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.v f363618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context, qi2.v vVar) {
        super(0);
        this.f363617d = context;
        this.f363618e = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.v vVar = this.f363618e;
        return new qi2.w0(this.f363617d, vVar.f363631m, new qi2.q(vVar));
    }
}
