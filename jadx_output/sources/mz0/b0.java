package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.m implements yz5.l {
    public b0(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "bottomSheetTotalExpandHeightGetter", "bottomSheetTotalExpandHeightGetter(Lcom/tencent/mm/mj_template/sns/compose/BottomSheetState;)I", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kz0.a p07 = (kz0.a) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        java.lang.Integer num = (java.lang.Integer) ((java.util.Map) ((mz0.b2) this.receiver).H.getValue()).get(p07);
        return java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
    }
}
