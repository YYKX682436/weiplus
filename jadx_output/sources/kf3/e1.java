package kf3;

/* loaded from: classes5.dex */
public class e1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f307337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.p3 f307338b;

    public e1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.ui.widget.dialog.p3 p3Var) {
        this.f307337a = z2Var;
        this.f307338b = p3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f307337a.B();
        com.tencent.mm.ui.widget.dialog.p3 p3Var = this.f307338b;
        if (p3Var != null) {
            p3Var.a();
        }
    }
}
