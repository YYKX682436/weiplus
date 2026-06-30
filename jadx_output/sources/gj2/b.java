package gj2;

/* loaded from: classes10.dex */
public final class b extends gj2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // gj2.c, gi2.e
    public android.view.View f(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f272271e;
        lj2.v0 v0Var = this.f272270d;
        android.content.Context context = this.f272269c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new kj2.f0(context, v0Var, x0Var) : new kj2.j0(context, v0Var, x0Var) : new kj2.u(context, v0Var, x0Var);
    }

    @Override // gj2.c, gi2.e
    public java.lang.String i() {
        return "MultiPrepareVoiceRoomAdapter";
    }
}
