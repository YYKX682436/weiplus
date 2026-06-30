package lq5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f320482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.WePicker f320483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320484f;

    public i(int i17, com.tencent.mm.wepicker.WePicker wePicker, java.util.List list) {
        this.f320482d = i17;
        this.f320483e = wePicker;
        this.f320484f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f320482d;
        if (i17 >= 0 && i17 <= this.f320483e.getCurrentIndex()) {
            com.tencent.mm.wepicker.WePicker wePicker = this.f320483e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wePicker, arrayList.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            wePicker.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wePicker, "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if (i17 < this.f320484f.size()) {
            com.tencent.mm.wepicker.WePicker wePicker2 = this.f320483e;
            int showSize = (i17 + wePicker2.getShowSize()) - 1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(showSize));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(wePicker2, arrayList2.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            wePicker2.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(wePicker2, "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
