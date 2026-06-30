package df2;

/* loaded from: classes3.dex */
public final class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f230125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f230126f;

    public f8(df2.s8 s8Var, r45.d42 d42Var, r45.ch1 ch1Var) {
        this.f230124d = s8Var;
        this.f230125e = d42Var;
        this.f230126f = ch1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.f(null, new df2.e8(this.f230124d, this.f230125e, this.f230126f, null), 1, null);
    }
}
