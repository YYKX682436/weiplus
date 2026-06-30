package x11;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f451387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.a f451388e;

    public s(x11.t tVar, x11.a aVar) {
        this.f451387d = tVar;
        this.f451388e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x11.t tVar = this.f451387d;
        tVar.f451400q = true;
        ((java.util.LinkedList) tVar.f451402s).add(this.f451388e);
        do {
        } while (tVar.g());
        tVar.f451400q = false;
    }
}
