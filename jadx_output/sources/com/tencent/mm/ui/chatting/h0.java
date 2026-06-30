package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Button f201626a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f201627b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f201628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f201629d;

    public h0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI, android.widget.Button button, android.widget.TextView textView) {
        this.f201629d = appAttachNewDownloadUI;
        this.f201626a = button;
        this.f201627b = textView;
        if (textView != null) {
            if (((int) java.lang.Math.floor(((((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgFileExpiredInterval", 432000) - c01.id.f(appAttachNewDownloadUI.f198117v.getCreateTime() / 1000)) * 1.0d) / 86400.0d)) >= 1) {
                textView.setText("");
            } else {
                textView.setText("");
            }
        }
    }

    public void a(int i17) {
        android.widget.Button button = this.f201626a;
        if (button != null) {
            button.setVisibility(i17);
        }
        android.widget.TextView textView = this.f201627b;
        if (textView != null && !textView.getText().toString().isEmpty()) {
            textView.setVisibility(i17);
        }
        if (textView.getVisibility() != 8) {
            ((android.widget.LinearLayout.LayoutParams) button.getLayoutParams()).bottomMargin = 0;
        } else {
            ((android.widget.LinearLayout.LayoutParams) button.getLayoutParams()).bottomMargin = i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479657bu);
        }
    }

    public void b(boolean z17) {
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f201629d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "showErrorTip overtime %s", java.lang.Long.valueOf(appAttachNewDownloadUI.f198117v.getMsgId()));
        android.widget.Button button = this.f201626a;
        if (button != null) {
            button.setVisibility(4);
        }
        android.widget.TextView textView = this.f201627b;
        if (textView != null) {
            textView.setVisibility(0);
            if (z17) {
                textView.setText(com.tencent.mm.R.string.cew);
                appAttachNewDownloadUI.y7(17, -1);
            } else {
                textView.setText(com.tencent.mm.R.string.cex);
                java.lang.String str = appAttachNewDownloadUI.C;
                if (str == null || str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length <= 255) {
                    jx3.f.INSTANCE.d(31328, 3, 5000);
                } else {
                    textView.setText(com.tencent.mm.R.string.f491236le2);
                }
            }
            textView.setTextColor(appAttachNewDownloadUI.getResources().getColor(com.tencent.mm.R.color.Red_120));
            if (this.f201628c) {
                return;
            }
            this.f201628c = true;
            appAttachNewDownloadUI.y7(8, 6);
        }
    }
}
