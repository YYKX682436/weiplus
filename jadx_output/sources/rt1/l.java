package rt1;

/* loaded from: classes7.dex */
public final class l implements rt1.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f399444a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f399445b;

    /* renamed from: c, reason: collision with root package name */
    public rt1.a f399446c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f399447d;

    /* renamed from: e, reason: collision with root package name */
    public int f399448e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView[] f399449f;

    public l(com.tencent.mm.ui.MMActivity activity, android.widget.LinearLayout inputLayout) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(inputLayout, "inputLayout");
        this.f399444a = activity;
        this.f399445b = inputLayout;
        this.f399447d = "";
    }

    public void a() {
        android.widget.TextView[] textViewArr = this.f399449f;
        if (textViewArr == null) {
            kotlin.jvm.internal.o.o("charViews");
            throw null;
        }
        android.widget.TextView textView = textViewArr[this.f399448e];
        kotlin.jvm.internal.o.d(textView);
        textView.setText("");
        b(java.lang.Math.max(this.f399448e - 1, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r30) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.l.b(int):void");
    }
}
