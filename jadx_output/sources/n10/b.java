package n10;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "enableNirvanaBackPress";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("enable");
        lc3.e eVar = this.f317890a;
        if (!((eVar != null ? eVar.B0() : null) instanceof com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI)) {
            s().invoke(i(lc3.x.f317936c));
            return;
        }
        com.tencent.mars.xlog.Log.i("MBJsApiEnableNirvanaBackPress", "enableNirvanaBackPress: " + optBoolean);
        lc3.e eVar2 = this.f317890a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "setEnableBackPress, enable:" + optBoolean);
        ((com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI) B0).f65847s = optBoolean;
        s().invoke(k());
    }
}
