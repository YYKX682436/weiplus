package si0;

/* loaded from: classes4.dex */
public final class q1 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.r0 f408153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f408155c;

    public q1(ca4.r0 r0Var, yz5.l lVar, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f408153a = r0Var;
        this.f408154b = lVar;
        this.f408155c = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long l17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserDatePickerFlutterPlugin", "choosePickerDate result:" + z17 + " year:" + obj + " month:" + obj2);
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            ca4.r0 r0Var = this.f408153a;
            java.util.Map map = (java.util.Map) ((java.util.HashMap) r0Var.f40011c).get(obj);
            if ((map != null ? (java.lang.Long) map.get(obj2) : null) != null) {
                bw5.tk0 tk0Var = new bw5.tk0();
                tk0Var.f33497d = java.lang.Integer.parseInt((java.lang.String) obj);
                boolean[] zArr = tk0Var.f33500g;
                zArr[1] = true;
                tk0Var.f33498e = java.lang.Integer.parseInt((java.lang.String) obj2);
                zArr[2] = true;
                java.util.Map map2 = (java.util.Map) ((java.util.HashMap) r0Var.f40011c).get(obj);
                tk0Var.f33499f = (map2 == null || (l17 = (java.lang.Long) map2.get(obj2)) == null) ? 0L : l17.longValue();
                zArr[3] = true;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f408154b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(pm0.v.D(tk0Var))));
            }
        }
        this.f408155c.d();
    }
}
