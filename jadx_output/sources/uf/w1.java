package uf;

/* loaded from: classes7.dex */
public final class w1 extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427119c;

    public w1(uf.c2 c2Var) {
        this.f427119c = c2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (1 == event.getAction()) {
            return false;
        }
        uf.c2 c2Var = this.f427119c;
        uf.c2.b(c2Var, null, 0);
        c2Var.f();
        return true;
    }
}
