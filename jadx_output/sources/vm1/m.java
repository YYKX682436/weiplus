package vm1;

/* loaded from: classes.dex */
public final class m implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm1.n f438029d;

    public m(vm1.n nVar) {
        this.f438029d = nVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        com.tencent.pigeon.ting.TingInsertedContentCallBack tingInsertedContentCallBack = this.f438029d.f438032e;
        if (tingInsertedContentCallBack != null) {
            tingInsertedContentCallBack.onDialogChange(1 - f17, vm1.l.f438027d);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.pigeon.ting.TingInsertedContentCallBack tingInsertedContentCallBack = this.f438029d.f438032e;
        if (tingInsertedContentCallBack != null) {
            tingInsertedContentCallBack.onDialogChange(0.0d, vm1.k.f438018d);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
    }
}
