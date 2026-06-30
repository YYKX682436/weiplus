package fn4;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.j f264592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.p f264593e;

    public o(fn4.p pVar, sm4.j jVar) {
        this.f264593e = pVar;
        this.f264592d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.e t07 = this.f264593e.f264595d.t0();
        sm4.j jVar = this.f264592d;
        fn4.m E = t07.E(jVar.f409955g);
        if (E != null) {
            if (E instanceof hn4.d0) {
                E.p();
            } else if (E instanceof gn4.d0) {
                ((gn4.c0) E.i().getControlBar()).B(jVar.f409955g);
            }
        }
    }
}
