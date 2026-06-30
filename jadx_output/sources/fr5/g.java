package fr5;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.h f265944d;

    public g(fr5.h hVar) {
        this.f265944d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fr5.h hVar = this.f265944d;
        if (hVar.f265958i) {
            android.widget.OverScroller overScroller = hVar.f265956g;
            if (!overScroller.computeScrollOffset()) {
                hVar.f265958i = false;
                hVar.f265955f.invoke();
            } else {
                hVar.f265954e.invoke(new zq5.c(zq5.d.a(overScroller.getCurrX(), overScroller.getCurrY())));
                hVar.f265950a.postOnAnimation(hVar.f265957h);
            }
        }
    }
}
