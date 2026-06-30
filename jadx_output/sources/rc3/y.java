package rc3;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rc3.w0 w0Var, int i17, java.lang.String str) {
        super(0);
        this.f394110d = w0Var;
        this.f394111e = i17;
        this.f394112f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = (yz5.l) this.f394110d.f394097r.remove(java.lang.Integer.valueOf(this.f394111e));
        if (lVar != null) {
            lVar.invoke(this.f394112f);
        }
        return jz5.f0.f302826a;
    }
}
