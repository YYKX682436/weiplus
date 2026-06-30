package w21;

/* loaded from: classes12.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg0.e f442516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w21.w0 f442517e;

    public y0(w21.z0 z0Var, dg0.e eVar, w21.w0 w0Var) {
        this.f442516d = eVar;
        this.f442517e = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        w21.w0 w0Var = this.f442517e;
        ((com.tencent.mm.ui.chatting.v0) this.f442516d).p(cj6.o2(w0Var.f442486c, w0Var.f442488e));
    }
}
