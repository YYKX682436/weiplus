package fk1;

/* loaded from: classes8.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263270d;

    public e(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263270d = wAGameRecordShareUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263270d;
        java.util.ArrayList arrayList = wAGameRecordShareUI.f90185h;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("shareOptionsInParam");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null && num.intValue() == 0) {
                java.lang.String r17 = i65.a.r(wAGameRecordShareUI.getContext(), com.tencent.mm.R.string.a1y);
                kotlin.jvm.internal.o.f(r17, "getString(...)");
                java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{wAGameRecordShareUI.f90183f.f323304b}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                g4Var.f(0, format);
            }
            if (num != null && num.intValue() == 1) {
                g4Var.f(1, i65.a.r(wAGameRecordShareUI.getContext(), com.tencent.mm.R.string.a1x));
            }
            if (num != null && num.intValue() == 2) {
                g4Var.f(2, i65.a.r(wAGameRecordShareUI.getContext(), com.tencent.mm.R.string.a2x));
            }
        }
    }
}
