package ns4;

/* loaded from: classes.dex */
public final class o1 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.p1 f339604a;

    public o1(ns4.p1 p1Var) {
        this.f339604a = p1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        ns4.p1 p1Var = this.f339604a;
        js4.g gVar = p1Var.f339618c;
        if (gVar != null) {
            gVar.a(p1Var);
        }
    }
}
