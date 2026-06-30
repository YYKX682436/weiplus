package ns4;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339571a;

    public k(ns4.s sVar) {
        this.f339571a = sVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        js4.o oVar;
        ns4.s sVar = this.f339571a;
        if (sVar.f339647l) {
            return;
        }
        sVar.f339640e.O6(2);
        js4.n nVar = sVar.f339640e.f331028d;
        if (nVar == null || (oVar = nVar.f301546d) == null) {
            return;
        }
        oVar.a(3, -3, "");
    }
}
