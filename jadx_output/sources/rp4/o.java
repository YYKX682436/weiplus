package rp4;

/* loaded from: classes5.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f398678b;

    public o(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, kotlinx.coroutines.y0 y0Var) {
        this.f398677a = editorVideoCompositionPluginLayout;
        this.f398678b = y0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map k17 = kz5.c1.k(new jz5.l("view_id", "video_edit_other_miaojian_jump_ack"), new jz5.l("post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()));
        cy1.a aVar = (cy1.a) rVar;
        if (aVar.oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(32337);
            if (aVar.oj()) {
                aVar.Dj("view_clk", null, k17, 0, arrayList, true, false, false);
            }
        }
        rp4.n nVar = rp4.n.f398676d;
        dw3.n0 n0Var = dw3.o0.f244241e;
        com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f398677a;
        dw3.o0 a17 = n0Var.a(editorVideoCompositionPluginLayout.L, editorVideoCompositionPluginLayout.D());
        java.lang.Integer num = editorVideoCompositionPluginLayout.L;
        java.lang.String str = (num != null && num.intValue() == 1) ? "session" : "moments";
        java.lang.Integer num2 = editorVideoCompositionPluginLayout.L;
        kotlinx.coroutines.l.d(this.f398678b, null, null, new rp4.m(this.f398677a, str, a17, (num2 != null && num2.intValue() == 1) ? 0 : null, nVar, null), 3, null);
    }
}
