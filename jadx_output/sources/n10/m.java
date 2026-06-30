package n10;

/* loaded from: classes7.dex */
public final class m extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "handleTextInput";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        data.toString();
        lc3.e eVar = this.f317890a;
        boolean z17 = (eVar != null ? eVar.B0() : null) instanceof com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI;
        lc3.z zVar = lc3.x.f317936c;
        if (!z17) {
            s().invoke(i(zVar));
            return;
        }
        lc3.e eVar2 = this.f317890a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        com.tencent.mm.feature.ecs.nirvana.input.c0 textInputPlugin = ((com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI) B0).V6().getTextInputPlugin();
        if (textInputPlugin == null) {
            s().invoke(i(zVar));
        } else {
            pm0.v.X(new n10.l(textInputPlugin, data, this));
        }
    }
}
