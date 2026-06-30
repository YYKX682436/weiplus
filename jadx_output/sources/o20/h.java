package o20;

/* loaded from: classes14.dex */
public final class h implements o20.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o20.i f342381a;

    public h(o20.i iVar) {
        this.f342381a = iVar;
    }

    @Override // o20.u
    public void a(o20.t oldState, o20.t newState) {
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        boolean b17 = kotlin.jvm.internal.o.b(newState, o20.p.f342396a);
        o20.i iVar = this.f342381a;
        if (b17) {
            ((kk4.v) iVar.f342382a).O();
            iVar.c(this);
        } else if (newState instanceof o20.k) {
            iVar.c(this);
        }
    }
}
