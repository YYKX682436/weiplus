package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class q1 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout f138317a;

    public q1(com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout) {
        this.f138317a = voiceInputLayout;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138317a;
        com.tencent.mm.plugin.fts.ui.widget.y0 y0Var = (com.tencent.mm.plugin.fts.ui.widget.y0) voiceInputLayout.f138231d;
        y0Var.getClass();
        if (strArr != null && strArr.length > 0 && strArr[0].length() > 0) {
            y0Var.f138364a = strArr[0];
            y0Var.b();
        }
        if (list != null && !list.isEmpty() && list.iterator().hasNext()) {
            y0Var.f138365b = (java.lang.String) list.iterator().next();
        }
        voiceInputLayout.f138238n.removeMessages(0);
        voiceInputLayout.f138238n.sendEmptyMessageDelayed(0, voiceInputLayout.f138235h);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138317a;
        voiceInputLayout.f138238n.removeMessages(0);
        voiceInputLayout.f138238n.removeMessages(1);
        com.tencent.mm.plugin.fts.ui.widget.y0 y0Var = (com.tencent.mm.plugin.fts.ui.widget.y0) voiceInputLayout.f138231d;
        y0Var.c();
        com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = y0Var.f138366c;
        b1Var.f138248c = false;
        y0Var.b();
        b1Var.f138251f.setVisibility(8);
        b1Var.f138247b.a(y0Var.f138365b, y0Var.f138364a);
        y0Var.f138364a = "";
        y0Var.f138365b = "";
        voiceInputLayout.k(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138317a;
        voiceInputLayout.f138238n.removeMessages(0);
        voiceInputLayout.f138238n.removeMessages(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        voiceInputLayout.f138239o.sendMessage(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout voiceInputLayout = this.f138317a;
        int i17 = voiceInputLayout.f138233f;
        com.tencent.mm.sdk.platformtools.b4 b4Var = voiceInputLayout.f138240p;
        if (b4Var != null) {
            b4Var.d();
        }
        voiceInputLayout.f138239o.sendEmptyMessage(0);
    }
}
