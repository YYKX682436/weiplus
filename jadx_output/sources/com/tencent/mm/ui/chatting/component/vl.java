package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class vl implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f200135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f200136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f200137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f200138d;

    public vl(com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar, long j17, java.util.ArrayList arrayList) {
        this.f200135a = fmVar;
        this.f200136b = dVar;
        this.f200137c = j17;
        this.f200138d = arrayList;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        android.speech.tts.TextToSpeech textToSpeech;
        if (i17 != 0 || (textToSpeech = com.tencent.mm.ui.tools.b1.f210281a) == null) {
            return;
        }
        textToSpeech.setOnUtteranceProgressListener(new com.tencent.mm.ui.chatting.component.ul(this.f200135a, this.f200136b, this.f200137c, this.f200138d));
    }
}
