package fk1;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263273d;

    public g(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263273d = wAGameRecordShareUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "share to wegame center ok");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263273d;
        android.widget.TextView textView = wAGameRecordShareUI.f90188n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("shareText");
            throw null;
        }
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(wAGameRecordShareUI.getString(com.tencent.mm.R.string.a1m));
        f0Var.c(((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Di("", b3.l.getColor(wAGameRecordShareUI, com.tencent.mm.R.color.f479308vo), b3.l.getColor(wAGameRecordShareUI, com.tencent.mm.R.color.BW_0_Alpha_0_2), true, new fk1.q(wAGameRecordShareUI)), 7, 16, 18);
        textView.setText(f0Var);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        db5.t7.h(wAGameRecordShareUI, wAGameRecordShareUI.getResources().getString(com.tencent.mm.R.string.j3v));
    }
}
