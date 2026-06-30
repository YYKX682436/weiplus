package jq4;

/* loaded from: classes14.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.c1 f301125d;

    public b1(jq4.c1 c1Var) {
        this.f301125d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.f301125d.C.get();
        if (gVar != null) {
            gVar.x(true);
        }
    }
}
