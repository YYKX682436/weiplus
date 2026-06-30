package ea;

/* loaded from: classes15.dex */
public class e implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea.l f250471d;

    public e(ea.l lVar) {
        this.f250471d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ea.l lVar = this.f250471d;
        float rotation = lVar.f250498s.getRotation();
        if (lVar.f250486g == rotation) {
            return true;
        }
        lVar.f250486g = rotation;
        lVar.getClass();
        fa.d dVar = lVar.f250489j;
        if (dVar == null) {
            return true;
        }
        float f17 = -lVar.f250486g;
        if (f17 == dVar.f260592m) {
            return true;
        }
        dVar.f260592m = f17;
        dVar.invalidateSelf();
        return true;
    }
}
