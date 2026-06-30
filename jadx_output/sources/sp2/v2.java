package sp2;

/* loaded from: classes2.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(sp2.d3 d3Var) {
        super(1);
        this.f411243d = d3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        sp2.d3 d3Var = this.f411243d;
        az2.f fVar = d3Var.f411015i;
        if (fVar != null) {
            fVar.b();
        }
        d3Var.f411015i = null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mm.ui.MMActivity mMActivity = d3Var.f411007a;
            db5.t7.g(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ops));
        } else {
            linkedList.size();
            d3Var.c(linkedList);
        }
        return jz5.f0.f302826a;
    }
}
