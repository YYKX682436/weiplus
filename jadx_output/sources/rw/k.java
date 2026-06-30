package rw;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI f400579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI ecsTLTestUI) {
        super(0);
        this.f400579d = ecsTLTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI ecsTLTestUI = this.f400579d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(ecsTLTestUI);
        j0Var.setTitle("Pkg Info");
        ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).getClass();
        java.lang.String str = "";
        for (java.lang.String str2 : he3.e.f280902d) {
            str = str + str2 + " is: " + ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(str2) + "  \t\n";
        }
        j0Var.t(str);
        j0Var.p(3);
        j0Var.C(3);
        j0Var.A(ecsTLTestUI.getString(com.tencent.mm.R.string.f492294fz1), true, null);
        j0Var.show();
        com.tencent.mm.sdk.platformtools.b0.d(ecsTLTestUI.getContext(), null, str, null);
        return jz5.f0.f302826a;
    }
}
