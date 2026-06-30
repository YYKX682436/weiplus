package lq5;

/* loaded from: classes9.dex */
public final class c extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f320467d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.RemindTimePickerRemake f320469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.WePicker f320470g;

    public c(int i17, com.tencent.mm.wepicker.RemindTimePickerRemake remindTimePickerRemake, com.tencent.mm.wepicker.WePicker wePicker) {
        this.f320468e = i17;
        this.f320469f = remindTimePickerRemake;
        this.f320470g = wePicker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if ((r4 != null && r4.getItemCount() == r6.f320470g.getShowSize() + 59) == false) goto L20;
     */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq5.c.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wepicker/RemindTimePickerRemake$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.lang.Object tag = recyclerView.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.tencent.mm.wepicker.RemindTimePickerRemake remindTimePickerRemake = this.f320469f;
        int currentIndex = ((com.tencent.mm.wepicker.WePicker) remindTimePickerRemake.f214322p.get(intValue)).getCurrentIndex();
        java.util.List list = remindTimePickerRemake.f214323q;
        if (currentIndex != ((java.lang.Number) list.get(intValue)).intValue()) {
            list.set(intValue, java.lang.Integer.valueOf(((com.tencent.mm.wepicker.WePicker) remindTimePickerRemake.f214322p.get(intValue)).getCurrentIndex()));
            int i19 = android.os.Build.VERSION.SDK_INT;
            android.os.Vibrator vibrator = remindTimePickerRemake.f214328v;
            if (i19 >= 26) {
                android.os.VibrationEffect createOneShot = android.os.VibrationEffect.createOneShot(10L, 255);
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                }
            } else if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        }
        if (remindTimePickerRemake.getListener() != null) {
            java.util.Calendar time = remindTimePickerRemake.getSelectCalendar();
            kotlin.jvm.internal.o.g(time, "time");
        }
        yj0.a.h(this, "com/tencent/mm/wepicker/RemindTimePickerRemake$1$picker$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
