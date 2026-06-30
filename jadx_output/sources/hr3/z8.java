package hr3;

/* loaded from: classes.dex */
public final class z8 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f284235d;

    /* renamed from: e, reason: collision with root package name */
    public final int f284236e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f284237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f284236e = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 50);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.n().f273288b.a(3990, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.n().f273288b.q(3990, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        java.lang.String errMsg;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteContactUIC", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + scene);
        if (scene instanceof w11.h0) {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f284235d;
            if (f4Var != null) {
                f4Var.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                yz5.l lVar = this.f284237f;
                if (lVar != null) {
                    java.util.List list = ((w11.h0) scene).f442046o;
                    kotlin.jvm.internal.o.f(list, "getReqNames(...)");
                    lVar.invoke(list);
                    return;
                }
                return;
            }
            if (i18 != -3503) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
                if (i18 == -3500) {
                    w11.h0 h0Var = (w11.h0) scene;
                    errMsg = getActivity().getString(com.tencent.mm.R.string.bba, java.lang.Integer.valueOf(h0Var.f442045n - ((java.util.LinkedList) h0Var.f442039e).size()));
                } else {
                    errMsg = scene.getReqResp().getRespObj().getErrMsg();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
                        errMsg = ((w11.h0) scene).H() == null ? getString(com.tencent.mm.R.string.bbb) : getString(com.tencent.mm.R.string.bbc);
                    }
                }
                u1Var.g(errMsg);
                u1Var.m(com.tencent.mm.R.string.f490507x1);
                u1Var.l(hr3.y8.f284206a);
                u1Var.q(false);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            java.lang.String errMsg2 = scene.getReqResp().getRespObj().getErrMsg();
            java.lang.String string = getString(com.tencent.mm.R.string.bbc);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (errMsg2 == null) {
                errMsg2 = string;
            }
            u1Var2.g(errMsg2);
            u1Var2.a(true);
            u1Var2.j(getString(com.tencent.mm.R.string.hmr));
            u1Var2.m(com.tencent.mm.R.string.hms);
            u1Var2.b(new hr3.x8(this));
            u1Var2.q(false);
        }
    }
}
