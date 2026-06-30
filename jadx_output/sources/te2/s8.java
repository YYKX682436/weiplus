package te2;

/* loaded from: classes3.dex */
public final class s8 extends te2.p8 {
    public boolean J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // te2.p8
    public java.lang.String q7() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.e0e);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void y7() {
        if (this.E1 == 1) {
            this.E1 = 3;
            te2.p8.s7(this, false, 1, null);
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.umn);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
