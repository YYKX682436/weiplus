package ut2;

/* loaded from: classes3.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f431138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ut2.s3 s3Var, cm2.m0 m0Var, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431136e = s3Var;
        this.f431137f = m0Var;
        this.f431138g = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.w1(this.f431136e, this.f431137f, this.f431138g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431135d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ut2.s3 s3Var = this.f431136e;
            xt2.k1 k1Var = s3Var.E;
            if (k1Var != null) {
                cm2.m0 m0Var = this.f431137f;
                r45.y23 y23Var = m0Var.f43368v;
                android.widget.LinearLayout I = s3Var.I();
                kotlin.jvm.internal.o.f(I, "<get-saleInfoGroup>(...)");
                int i18 = this.f431138g.f310116d;
                ut2.v1 v1Var = new ut2.v1(s3Var, m0Var);
                this.f431135d = 1;
                java.lang.String str = "MicroMsg.FinderLiveShoppingViewHolder_" + y23Var.getString(1) + '_' + y23Var.getLong(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saleInfo ");
                mm2.x5 x5Var = mm2.f6.G1;
                java.util.LinkedList list = y23Var.getList(49);
                kotlin.jvm.internal.o.f(list, "getEvalution_label_list(...)");
                sb6.append(x5Var.a(list));
                sb6.append(", showDiscountSelling:true, leftSpace:");
                sb6.append(i18);
                sb6.append(",promoteGroupWidth:");
                sb6.append(I.getMeasuredWidth());
                sb6.append(",countdownFinish:");
                sb6.append(v1Var.hashCode());
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                java.util.LinkedList list2 = y23Var.getList(49);
                kotlin.jvm.internal.o.f(list2, "getEvalution_label_list(...)");
                java.lang.Object c17 = k1Var.c("MicroMsg.FinderLiveShoppingViewHolder", list2, true, I, i18, v1Var, this);
                if (c17 != aVar) {
                    c17 = f0Var;
                }
                if (c17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
