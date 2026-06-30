package rx4;

/* loaded from: classes.dex */
public final class q2 extends rx4.p2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // rx4.p2
    public int T6() {
        return com.tencent.mm.R.layout.bjb;
    }

    @Override // rx4.p2, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("ftsQuery");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gzd);
        if (textView != null) {
            textView.setText(stringExtra);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gyn);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
