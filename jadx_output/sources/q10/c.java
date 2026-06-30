package q10;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f359500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f359502f;

    public c(boolean z17, java.lang.String str, yz5.p pVar) {
        this.f359500d = z17;
        this.f359501e = str;
        this.f359502f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ku5.t0) ku5.t0.f312615d).B(new q10.b(this.f359500d, this.f359501e, this.f359502f));
    }
}
