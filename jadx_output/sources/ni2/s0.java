package ni2;

/* loaded from: classes10.dex */
public final class s0 implements zh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.x0 f337464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337465b;

    public s0(ni2.x0 x0Var, android.content.Context context) {
        this.f337464a = x0Var;
        this.f337465b = context;
    }

    @Override // zh2.c
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f337464a.I;
    }

    @Override // zh2.c
    public void b(dk2.m battleData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
    }

    @Override // zh2.c
    public boolean c() {
        return true;
    }

    @Override // zh2.c
    public void d() {
    }

    @Override // zh2.c
    public void e(int i17) {
    }

    @Override // zh2.c
    public qo0.c f() {
        return this.f337464a.H;
    }

    @Override // zh2.c
    public gk2.e g() {
        return ((df2.d3) this.f337464a.f337502J).a();
    }

    @Override // zh2.c
    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController getController(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return null;
    }

    @Override // zh2.c
    public void i() {
    }

    @Override // zh2.c
    public com.tencent.mm.live.core.view.LivePreviewView j() {
        return new com.tencent.mm.live.core.view.LivePreviewView(this.f337465b, null);
    }

    @Override // zh2.c
    public dk2.xf k() {
        return null;
    }
}
