package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI f176244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        super(0);
        this.f176244d = voicePrintCreateFinishUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f176244d.getIntent().getIntExtra("kscene_type", 0));
    }
}
