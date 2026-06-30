package lq5;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.WePicker f320487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f320489f;

    public k(com.tencent.mm.wepicker.WePicker wePicker, java.util.List list, int i17) {
        this.f320487d = wePicker;
        this.f320488e = list;
        this.f320489f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f320488e;
        com.tencent.mm.wepicker.WePicker wePicker = this.f320487d;
        wePicker.setAdapter(new lq5.h(list, wePicker.getShowSize(), wePicker.getTextColor(), wePicker.getTextSideColor(), wePicker.getTextSelectMedium(), wePicker.getTextSize(), wePicker.f214329g2, new lq5.j(wePicker, this.f320488e)));
        int i17 = this.f320489f;
        if (i17 < 0) {
            i17 = 0;
        }
        com.tencent.mm.wepicker.WePicker wePicker2 = this.f320487d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wePicker2, arrayList.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        wePicker2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(wePicker2, "com/tencent/mm/wepicker/WePicker$setData$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        yz5.l lVar = wePicker.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
    }
}
