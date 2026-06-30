package pn4;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1 f357240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.z f357241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1 textToSpeechService$readVoiceMessageAndWait$3$downloadListener$1, pn4.z zVar) {
        super(1);
        this.f357240d = textToSpeechService$readVoiceMessageAndWait$3$downloadListener$1;
        this.f357241e = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dead();
        pn4.z zVar = this.f357241e;
        tl.h hVar = zVar.f357262n;
        if (hVar != null) {
            hVar.stop();
        }
        zVar.f357262n = null;
        return jz5.f0.f302826a;
    }
}
