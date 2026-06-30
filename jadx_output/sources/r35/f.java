package r35;

/* loaded from: classes11.dex */
public class f implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.a f369104a;

    public f(r35.a aVar) {
        this.f369104a = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        r35.a aVar = this.f369104a;
        aVar.K = false;
        gm0.j1.n().f273288b.q(30, aVar);
        gm0.j1.n().f273288b.q(ma1.a.CTRL_INDEX, aVar);
    }
}
