package qd1;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.k0 f361625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.f f361626e;

    public e(qd1.f fVar, com.tencent.mm.plugin.appbrand.widget.k0 k0Var) {
        this.f361626e = fVar;
        this.f361625d = k0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        qd1.f fVar = this.f361626e;
        int i17 = fVar.f361629f;
        com.tencent.mm.plugin.appbrand.widget.k0 k0Var = this.f361625d;
        k0Var.getClass();
        com.tencent.mars.xlog.Log.i("Luggage.ActionSheetManager", "removeBottomSheet id:" + i17);
        k0Var.f91747a.remove(i17);
        fVar.f361627d.a(fVar.f361633m, fVar.f361634n.o("fail cancel"));
    }
}
