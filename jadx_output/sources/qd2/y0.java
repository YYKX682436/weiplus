package qd2;

/* loaded from: classes10.dex */
public final class y0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f361856b;

    public y0(qd2.g1 g1Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f361855a = g1Var;
        this.f361856b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        qd2.g1 g1Var = this.f361855a;
        g1Var.f361761o = true;
        g1Var.f361762p = true;
        android.widget.CheckBox checkBox = g1Var.f361753g;
        if (checkBox != null) {
            checkBox.setChecked(true);
        }
        this.f361856b.B();
        y9.i iVar = g1Var.f361754h;
        if (iVar != null) {
            iVar.dismiss();
        }
        yz5.a aVar = g1Var.f361764r;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
