package ws2;

/* loaded from: classes3.dex */
public final class k implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.l f449064d;

    public k(ws2.l lVar) {
        this.f449064d = lVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        this.f449064d.b("onPause");
    }

    @Override // f25.f
    public void onResume() {
        this.f449064d.a("onResume");
    }

    @Override // f25.f
    public void onStop() {
        ws2.l lVar = this.f449064d;
        lVar.b("onStop");
        lVar.f449087a = null;
    }
}
