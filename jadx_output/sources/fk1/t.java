package fk1;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263291d;

    public t(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263291d = wAGameRecordShareUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263291d;
        android.widget.Button button = wAGameRecordShareUI.f90187m;
        if (button == null) {
            kotlin.jvm.internal.o.o("shareButton");
            throw null;
        }
        android.widget.Button button2 = wAGameRecordShareUI.f90186i;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("stashButton");
            throw null;
        }
        wAGameRecordShareUI.Y6(button, button2);
        android.widget.TextView textView = wAGameRecordShareUI.f90188n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("shareText");
            throw null;
        }
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1o));
        f0Var.c(((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Di("", b3.l.getColor(wAGameRecordShareUI, com.tencent.mm.R.color.f479308vo), b3.l.getColor(wAGameRecordShareUI, com.tencent.mm.R.color.BW_0_Alpha_0_2), true, new fk1.r(wAGameRecordShareUI)), 7, 16, 18);
        textView.setText(f0Var);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        db5.t7.h(wAGameRecordShareUI, wAGameRecordShareUI.getResources().getString(com.tencent.mm.R.string.a1n));
    }
}
