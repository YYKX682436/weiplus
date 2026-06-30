package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class q3 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayout f191091a;

    public q3(com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout) {
        this.f191091a = voiceInputLayout;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        for (java.lang.String str : strArr) {
        }
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191091a;
        com.tencent.mm.pluginsdk.ui.u3 u3Var = voiceInputLayout.f189853d;
        if (u3Var != null) {
            u3Var.a(strArr, list);
        }
        voiceInputLayout.f189861o.removeMessages(0);
        voiceInputLayout.f189861o.sendEmptyMessageDelayed(0, voiceInputLayout.f189858i);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191091a;
        voiceInputLayout.f189861o.removeMessages(0);
        voiceInputLayout.f189861o.removeMessages(1);
        com.tencent.mm.pluginsdk.ui.u3 u3Var = voiceInputLayout.f189853d;
        if (u3Var != null) {
            u3Var.e();
        }
        voiceInputLayout.h(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191091a;
        voiceInputLayout.f189861o.removeMessages(0);
        voiceInputLayout.f189861o.removeMessages(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        voiceInputLayout.f189862p.sendMessage(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f191091a;
        int i17 = voiceInputLayout.f189856g;
        com.tencent.mm.sdk.platformtools.b4 b4Var = voiceInputLayout.f189863q;
        if (b4Var != null) {
            b4Var.d();
        }
        voiceInputLayout.f189862p.sendEmptyMessage(0);
    }
}
