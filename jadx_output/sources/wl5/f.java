package wl5;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447109d;

    public f(wl5.x xVar) {
        this.f447109d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "dismiss all runnable.", new java.lang.Object[0]);
        wl5.u uVar = this.f447109d.Y;
        if (uVar != null) {
            uVar.a();
        }
    }
}
