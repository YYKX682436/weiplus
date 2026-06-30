package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f176254d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f176255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f176256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f176258h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f176256f = i17;
        this.f176257g = voicePrintStateSettingUI;
        this.f176258h = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.voiceprint.ui.i0 i0Var = new com.tencent.mm.plugin.voiceprint.ui.i0(this.f176256f, this.f176257g, this.f176258h, continuation);
        i0Var.f176255e = obj;
        return i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.voiceprint.ui.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voiceprint.ui.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
