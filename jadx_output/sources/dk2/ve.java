package dk2;

/* loaded from: classes3.dex */
public final class ve implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final f25.l0 f234249d;

    public ve(f25.l0 l0Var) {
        this.f234249d = l0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        dk2.ef.f233372a.E(dk2.ad.f233204d, "onPause scene: " + this.f234249d);
    }

    @Override // f25.f
    public void onResume() {
        dk2.ef.f233372a.p("onResume scene: " + this.f234249d, false);
    }

    @Override // f25.f
    public void onStop() {
        dk2.ef.f233372a.E(dk2.ad.f233205e, "onStop scene: " + this.f234249d);
        dk2.ef.f233401p = null;
    }
}
