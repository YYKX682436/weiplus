package cw1;

/* loaded from: classes5.dex */
public final class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView[] f222852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f222853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f222854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222855g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222856h;

    public c6(android.widget.TextView[] textViewArr, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, long[] jArr, android.widget.Button button, android.widget.TextView textView) {
        this.f222852d = textViewArr;
        this.f222853e = cleanFilterDialog;
        this.f222854f = jArr;
        this.f222855g = button;
        this.f222856h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$popupDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = v17 == this.f222852d[0] ? 0 : 1;
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(this.f222853e.getContext());
        long[] jArr = this.f222854f;
        oVar.f212307n = new cw1.b6(calendar, jArr, i17, this.f222852d, this.f222853e, this.f222855g, this.f222856h);
        calendar.setTimeInMillis(jArr[i17]);
        oVar.d(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        oVar.e(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        oVar.f(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 1, 21);
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$popupDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
