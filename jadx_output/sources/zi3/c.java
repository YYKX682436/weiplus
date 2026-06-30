package zi3;

/* loaded from: classes14.dex */
public final class c implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi3.f f473165d;

    public c(zi3.f fVar) {
        this.f473165d = fVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        this.f473165d.N(true);
    }

    @Override // f25.f
    public void onResume() {
        boolean h17 = j65.e.h();
        zi3.f fVar = this.f473165d;
        if (h17) {
            fVar.N(false);
        } else {
            fVar.N(j65.e.g());
        }
    }

    @Override // f25.f
    public void onStop() {
    }
}
