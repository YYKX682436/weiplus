package tt2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f422018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tt2.e1 e1Var, r45.y23 y23Var, int i17, java.lang.Object obj) {
        super(2);
        this.f422017d = e1Var;
        this.f422018e = y23Var;
        this.f422019f = i17;
        this.f422020g = obj;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        tt2.e1 e1Var = this.f422017d;
        e1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProductItem ");
        r45.y23 y23Var = this.f422018e;
        sb6.append(y23Var.getString(1));
        sb6.append(", source:");
        sb6.append(this.f422019f);
        sb6.append(", sellingPrice:");
        sb6.append(y23Var.getInteger(5));
        sb6.append(" dataPos:");
        sb6.append(intValue);
        sb6.append("(realPos:");
        sb6.append(intValue);
        sb6.append("),size:");
        sb6.append(e1Var.getItemCount());
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
        if (intValue >= 0 && intValue < e1Var.getItemCount()) {
            pm0.v.X(new tt2.x(this.f422017d, intValue, this.f422018e, intValue, this.f422020g));
        }
        return jz5.f0.f302826a;
    }
}
