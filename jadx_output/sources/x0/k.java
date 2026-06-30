package x0;

/* loaded from: classes14.dex */
public final class k implements x0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f450900a;

    public k(yz5.p pVar) {
        this.f450900a = pVar;
    }

    @Override // x0.i
    public final void dispose() {
        yz5.p pVar = this.f450900a;
        synchronized (x0.z.f450963b) {
            ((java.util.ArrayList) x0.z.f450967f).remove(pVar);
        }
    }
}
