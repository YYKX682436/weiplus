package wl5;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447108d;

    public e(wl5.x xVar) {
        this.f447108d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wl5.x xVar = this.f447108d;
        if (xVar.I) {
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "isReInit, return.", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "in mShowSelectViewRunnable. opener: %s, inScrolling: %s.", java.lang.Boolean.valueOf(xVar.O), java.lang.Boolean.valueOf(xVar.P));
        if (xVar.f447166k == null) {
            if (!xVar.M) {
                xVar.q();
            }
            if (xVar.N) {
                return;
            }
            xVar.o();
            return;
        }
        if (xVar.O) {
            if (!xVar.Q) {
                com.tencent.mm.ui.yk.a("SelectableTextHelper", "Oh, bypass the judge logic! Don't worry, that's reasonable.", new java.lang.Object[0]);
                return;
            }
            xVar.Q = false;
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "judge result(delay), click outside.", new java.lang.Object[0]);
            wl5.u uVar = xVar.Y;
            if (uVar != null) {
                uVar.a();
                return;
            }
            return;
        }
        xVar.O = true;
        if (xVar.P) {
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "menu is hide: %s, cursor is hide: %s.", java.lang.Boolean.valueOf(xVar.M), java.lang.Boolean.valueOf(xVar.N));
            if (!xVar.M && xVar.f447161f) {
                xVar.q();
            }
            if (!xVar.N) {
                xVar.o();
                wl5.w wVar = xVar.f447158c;
                xVar.l(wVar.f447151a, wVar.f447152b);
                xVar.N = false;
            }
            wl5.v vVar = xVar.f447166k;
            if (vVar != null && xVar.M && !xVar.N && xVar.f447161f) {
                vVar.f(xVar.f447165j);
            }
        }
        xVar.P = false;
    }
}
