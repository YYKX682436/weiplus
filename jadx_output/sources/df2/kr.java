package df2;

/* loaded from: classes10.dex */
public final class kr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(df2.lt ltVar) {
        super(0);
        this.f230598d = ltVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.lt ltVar = this.f230598d;
        if (ltVar.f230717y.size() == 1) {
            ltVar.f230717y.remove(0);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRemoved(0);
            }
            if2.d0 d0Var = ltVar.K;
            if (d0Var != null) {
                d0Var.d(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
