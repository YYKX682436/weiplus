package mj;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f326953d;

    public b(mj.i iVar) {
        this.f326953d = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        dj.b bVar;
        oj.j.c("Matrix.FrameDecorator", "onViewAttachedToWindow", new java.lang.Object[0]);
        if (!ih.d.c() || (bVar = (dj.b) ih.d.d().a(dj.b.class)) == null) {
            return;
        }
        bVar.f232817n.k(this.f326953d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        dj.b bVar;
        oj.j.c("Matrix.FrameDecorator", "onViewDetachedFromWindow", new java.lang.Object[0]);
        if (!ih.d.c() || (bVar = (dj.b) ih.d.d().a(dj.b.class)) == null) {
            return;
        }
        bVar.f232817n.l(this.f326953d, false);
    }
}
