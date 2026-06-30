package qi2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.v f363624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, qi2.v vVar) {
        super(0);
        this.f363623d = context;
        this.f363624e = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.v vVar = this.f363624e;
        return new ni2.x(this.f363623d, vVar.f363630i, new qi2.s(vVar));
    }
}
