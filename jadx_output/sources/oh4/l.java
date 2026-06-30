package oh4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh4.n f345479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph4.b f345480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rs4 f345481f;

    public l(oh4.n nVar, ph4.b bVar, r45.rs4 rs4Var) {
        this.f345479d = nVar;
        this.f345480e = bVar;
        this.f345481f = rs4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f345479d.e(this.f345480e, this.f345481f);
    }
}
