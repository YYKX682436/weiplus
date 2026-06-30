package n10;

/* loaded from: classes.dex */
public final class n extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setNirvanaStatusBar";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("isLight");
        lc3.e eVar = this.f317890a;
        if (!((eVar != null ? eVar.B0() : null) instanceof com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI)) {
            s().invoke(i(lc3.x.f317936c));
            return;
        }
        com.tencent.mars.xlog.Log.i("MBJsApiSetNirvanaStatusBar", "setNirvanaStatusBar: " + optBoolean);
        lc3.e eVar2 = this.f317890a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        ((com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI) B0).Y6(optBoolean);
        s().invoke(k());
    }
}
