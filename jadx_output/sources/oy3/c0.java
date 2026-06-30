package oy3;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350015e;

    public c0(int i17, com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350014d = i17;
        this.f350015e = rtosWatchLoginUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = this.f350014d;
        g0Var.A(1904, i17);
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350015e;
        rtosWatchLoginUI.A = false;
        rtosWatchLoginUI.Z6();
        if (i17 == 3) {
            android.widget.TextView textView = rtosWatchLoginUI.f158594i;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.l3c);
            }
        } else if (i17 == 4) {
            android.widget.TextView textView2 = rtosWatchLoginUI.f158594i;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.l3b);
            }
        } else if (i17 == 5) {
            android.widget.TextView textView3 = rtosWatchLoginUI.f158594i;
            if (textView3 != null) {
                textView3.setText(com.tencent.mm.R.string.l3c);
            }
        } else if (i17 == 9) {
            android.widget.TextView textView4 = rtosWatchLoginUI.f158594i;
            if (textView4 != null) {
                textView4.setText(com.tencent.mm.R.string.l3l);
            }
        } else if (i17 == 11) {
            android.widget.TextView textView5 = rtosWatchLoginUI.f158594i;
            if (textView5 != null) {
                textView5.setText(com.tencent.mm.R.string.l3h);
            }
        } else if (i17 == 13) {
            android.widget.TextView textView6 = rtosWatchLoginUI.f158594i;
            if (textView6 != null) {
                textView6.setText(com.tencent.mm.R.string.l38);
            }
        } else if (i17 != 15) {
            android.widget.TextView textView7 = rtosWatchLoginUI.f158594i;
            if (textView7 != null) {
                textView7.setText(com.tencent.mm.R.string.l3g);
            }
        } else {
            android.widget.TextView textView8 = rtosWatchLoginUI.f158594i;
            if (textView8 != null) {
                textView8.setText(com.tencent.mm.R.string.l3_);
            }
        }
        android.widget.TextView textView9 = rtosWatchLoginUI.f158594i;
        if (textView9 == null) {
            return;
        }
        textView9.setVisibility(0);
    }
}
