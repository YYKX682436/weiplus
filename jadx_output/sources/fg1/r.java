package fg1;

/* loaded from: classes7.dex */
public final class r extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg1.u f261880c;

    public r(fg1.u uVar) {
        this.f261880c = uVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume down");
        fg1.u uVar = this.f261880c;
        gg1.c1 b17 = uVar.b();
        fg1.q qVar = new fg1.q(uVar);
        b17.getClass();
        x91.h b18 = b17.f271539e.b();
        gg1.b0 b0Var = new gg1.b0(b17, qVar);
        x91.l lVar = b18.f452650d;
        if (lVar == null) {
            return true;
        }
        b18.f452648b.g(new w91.c(b18.a(lVar), b18.f452650d.f452664a), b0Var);
        return true;
    }
}
