package ji2;

/* loaded from: classes10.dex */
public final class a extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        jz5.g gVar = ki2.e.f308109b;
        gi2.g gVar2 = (gi2.g) ((jz5.n) ki2.e.f308109b).getValue();
        kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.ktv.adapter.FinderLiveKTVRoomCoverAdapter.getMicLayout>");
        return gVar2;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).l(pm2.a.f356864t, g(i17));
        }
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f272271e;
        lj2.v0 v0Var = this.f272270d;
        android.content.Context context = this.f272269c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new li2.h(context, v0Var, x0Var) : new li2.o(context, v0Var, x0Var) : new li2.g(context, v0Var, x0Var);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "MultiVoiceRoomAdapter";
    }
}
