package te2;

/* loaded from: classes14.dex */
public final class f2 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f417995d;

    public f2(te2.l2 l2Var) {
        this.f417995d = l2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        te2.l2 l2Var = this.f417995d;
        if (i17 != l2Var.f418193f) {
            return true;
        }
        x91.h hVar = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar2 != null) {
            hVar2.h();
        }
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null) {
            hVar3.i();
        }
        x91.h hVar4 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar4 != null) {
            hVar4.f452654h = null;
        }
        te2.c2 c2Var = l2Var.f418196i;
        if (c2Var == null) {
            return true;
        }
        te2.a3 a3Var = (te2.a3) c2Var;
        com.tencent.mars.xlog.Log.i(a3Var.f417860h, "onLinkError errCode:" + it.arg1);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327728m, a3Var.a());
        return true;
    }
}
