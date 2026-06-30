package h63;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.l1 f279206a;

    public a0(h63.l1 l1Var) {
        this.f279206a = l1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        h63.l1 l1Var = this.f279206a;
        if (l1Var != null) {
            mc1.b bVar = (mc1.b) l1Var;
            bVar.f325577a.a(bVar.f325578b, bVar.f325579c.o("fail:user cancel"));
        }
    }
}
