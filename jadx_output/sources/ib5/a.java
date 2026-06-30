package ib5;

/* loaded from: classes13.dex */
public class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib5.d f290245d;

    public a(ib5.d dVar) {
        this.f290245d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ib5.d dVar = this.f290245d;
        if (!dVar.f290259l) {
            dVar.f290259l = true;
            dVar.f290254g.invalidate();
        }
        return true;
    }
}
