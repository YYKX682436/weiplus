package cw2;

/* loaded from: classes2.dex */
public final class t9 implements cw2.z9 {

    /* renamed from: d, reason: collision with root package name */
    public final cw2.f8 f224030d;

    /* renamed from: e, reason: collision with root package name */
    public dw2.c0 f224031e;

    /* renamed from: f, reason: collision with root package name */
    public final cw2.i0 f224032f;

    public t9(cw2.f8 pageVideoCore, androidx.lifecycle.y lifecycleOwner, android.content.Context context) {
        kotlin.jvm.internal.o.g(pageVideoCore, "pageVideoCore");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(context, "context");
        this.f224030d = pageVideoCore;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f224032f = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127663df).getValue()).r()).booleanValue() ? new cw2.i0(lifecycleOwner, context) : null;
    }

    @Override // cw2.z9
    public boolean A() {
        return this.f224030d.A();
    }

    @Override // cw2.z9
    public cw2.w9 C() {
        return this.f224032f;
    }

    @Override // cw2.z9
    public void D(long j17) {
    }

    @Override // cw2.z9
    public com.tencent.mm.plugin.finder.viewmodel.component.nb0 F() {
        return this.f224030d.f223700h;
    }

    @Override // cw2.z9
    public ec2.i I() {
        return this.f224030d.f223702m;
    }

    @Override // cw2.z9
    public void Z() {
        this.f224030d.Z();
    }

    @Override // cw2.z9
    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f224030d.c(context);
    }

    @Override // cw2.z9
    public void g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f224030d.g(context);
    }

    @Override // cw2.z9
    public void i() {
        this.f224030d.i();
    }

    @Override // cw2.z9
    public void j0() {
        this.f224030d.j0();
    }

    @Override // cw2.z9
    public dw2.c0 v() {
        return this.f224031e;
    }
}
