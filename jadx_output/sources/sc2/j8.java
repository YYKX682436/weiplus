package sc2;

/* loaded from: classes2.dex */
public final class j8 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f406001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406003f;

    public j8(sc2.p8 p8Var, in5.s0 s0Var, android.view.View view) {
        this.f406001d = p8Var;
        this.f406002e = s0Var;
        this.f406003f = view;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 miniholder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(miniholder, "miniholder");
        sc2.v8 v8Var = (sc2.v8) miniholder.f293125i;
        sc2.p8 p8Var = this.f406001d;
        com.tencent.mars.xlog.Log.i(p8Var.f406152w, "onCarouselCardClick: position=" + i17 + ", jumpId=" + v8Var.f406317d.f453234a.getJump_id());
        xc2.z2 z2Var = p8Var.f3151o;
        if (z2Var != null) {
            xc2.j jVar = (xc2.j) z2Var;
            in5.s0 holder = this.f406002e;
            kotlin.jvm.internal.o.g(holder, "holder");
            android.view.View jumpView = this.f406003f;
            kotlin.jvm.internal.o.g(jumpView, "jumpView");
            xc2.p0 infoEx = v8Var.f406317d;
            kotlin.jvm.internal.o.g(infoEx, "infoEx");
            jVar.r(holder, jumpView, infoEx);
            jVar.q(holder, jumpView, infoEx);
        }
    }
}
