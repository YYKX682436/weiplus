package r35;

/* loaded from: classes11.dex */
public class k implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f369150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.o f369151b;

    public k(r35.o oVar, com.tencent.mm.storage.z3 z3Var) {
        this.f369151b = oVar;
        this.f369150a = z3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        r35.o oVar = this.f369151b;
        if (z17) {
            oVar.c(this.f369150a);
        } else {
            oVar.b(0);
        }
        oVar.f369225q.dismiss();
    }
}
