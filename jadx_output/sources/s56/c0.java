package s56;

/* loaded from: classes16.dex */
public class c0 implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p56.r f403192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p56.p f403193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s56.d0 f403194f;

    public c0(s56.d0 d0Var, p56.r rVar, p56.p pVar) {
        this.f403194f = d0Var;
        this.f403192d = rVar;
        this.f403193e = pVar;
    }

    @Override // r56.a
    public void call() {
        this.f403194f.f403200e.h(new s56.b0(this, this.f403192d, java.lang.Thread.currentThread()));
    }
}
