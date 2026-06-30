package cw1;

/* loaded from: classes5.dex */
public final class b6 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Calendar f222824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f222825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f222826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView[] f222827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f222828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222830g;

    public b6(java.util.Calendar calendar, long[] jArr, int i17, android.widget.TextView[] textViewArr, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, android.widget.Button button, android.widget.TextView textView) {
        this.f222824a = calendar;
        this.f222825b = jArr;
        this.f222826c = i17;
        this.f222827d = textViewArr;
        this.f222828e = cleanFilterDialog;
        this.f222829f = button;
        this.f222830g = textView;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public final void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            this.f222824a.set(i17, i18 - 1, i19, 0, 0, 0);
            java.util.Calendar calendar = this.f222824a;
            calendar.clear(14);
            long timeInMillis = calendar.getTimeInMillis();
            int i27 = this.f222826c;
            if (i27 != 0) {
                timeInMillis = (long) java.lang.Math.min(java.lang.System.currentTimeMillis(), timeInMillis + 86399999);
            }
            long[] jArr = this.f222825b;
            jArr[i27] = timeInMillis;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.c(jArr, this.f222827d, this.f222828e, this.f222829f, this.f222830g);
        }
    }
}
