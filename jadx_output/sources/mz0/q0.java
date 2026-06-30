package mz0;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mz0.b2 b2Var) {
        super(0);
        this.f333026d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kz0.a aVar = kz0.a.f313647o;
        mz0.b2 b2Var = this.f333026d;
        java.lang.Integer num = (java.lang.Integer) ((java.util.Map) b2Var.H.getValue()).get(aVar);
        int intValue = num != null ? num.intValue() : 0;
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        gv3.d dVar = new gv3.d(b2Var.getContext(), (com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout) ((zy0.e) ((dz0.f) b2Var.G.getValue())).f477321j.getValue(), mz0.b2.O6(b2Var) + intValue);
        uu3.u uVar = dVar.f222571f;
        if (uVar != null) {
            uVar.setAnimDurationMs(300L);
        }
        dVar.f222577m = new mz0.p0(intValue, e0Var, b2Var);
        return dVar;
    }
}
