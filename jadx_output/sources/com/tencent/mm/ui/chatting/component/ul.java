package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class ul extends android.speech.tts.UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f200087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f200088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f200089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f200090d;

    public ul(com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar, long j17, java.util.ArrayList arrayList) {
        this.f200087a = fmVar;
        this.f200088b = dVar;
        this.f200089c = j17;
        this.f200090d = arrayList;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(java.lang.String utteranceId) {
        kotlin.jvm.internal.o.g(utteranceId, "utteranceId");
        java.util.List f07 = r26.n0.f0(utteranceId, new java.lang.String[]{"_"}, false, 0, 6, null);
        long parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
        int parseInt = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
        int i17 = parseInt + 1;
        java.util.ArrayList arrayList = this.f200090d;
        java.lang.Object obj = arrayList.get(parseInt);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f200087a;
        com.tencent.mm.sdk.platformtools.b4 b4Var = fmVar.f199064m;
        if (b4Var != null) {
            b4Var.d();
        }
        int length = tc6Var.f386316e + tc6Var.f386315d.length();
        sb5.h2 h2Var = fmVar.f199063i;
        if (h2Var != null) {
            h2Var.a(length, java.lang.Long.valueOf(parseLong));
        }
        if (parseInt == arrayList.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
            fmVar.m0(2);
            fmVar.t0(this.f200088b);
            return;
        }
        r45.tc6 tc6Var2 = (r45.tc6) arrayList.get(i17);
        if (tc6Var2 != null && tc6Var2.f386317f) {
            java.lang.String subText = ((r45.tc6) arrayList.get(i17)).f386315d;
            kotlin.jvm.internal.o.f(subText, "subText");
            fmVar.s0(i17, parseLong, subText);
        } else {
            x21.l lVar = fmVar.f199061g;
            com.tencent.mars.xlog.Log.i(lVar.f451545b, "resume");
            lVar.f451548e.a(false);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(java.lang.String utteranceId) {
        kotlin.jvm.internal.o.g(utteranceId, "utteranceId");
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(java.lang.String utteranceId) {
        kotlin.jvm.internal.o.g(utteranceId, "utteranceId");
        java.util.List f07 = r26.n0.f0(utteranceId, new java.lang.String[]{"_"}, false, 0, 6, null);
        long parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
        int parseInt = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "play with android tts onStart:%s, msgId:%s, index:%s", utteranceId, java.lang.Long.valueOf(parseLong), java.lang.Integer.valueOf(parseInt));
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f200087a;
        if (parseInt == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
            yb5.d dVar = this.f200088b;
            fmVar.n0(dVar);
            fmVar.o0(dVar);
            fmVar.f199059e = parseLong;
            fmVar.f199066o.f387226d = this.f200089c;
            fmVar.f199060f = 0L;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.sl(dVar));
        }
        r45.uc6 uc6Var = fmVar.f199066o;
        if (parseInt >= uc6Var.f387227e) {
            uc6Var.f387227e = parseInt + 1;
        }
        java.lang.Object obj = this.f200090d.get(parseInt);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        int i17 = tc6Var.f386316e;
        f0Var.f310116d = i17;
        sb5.h2 h2Var = fmVar.f199063i;
        if (h2Var != null) {
            h2Var.a(i17, java.lang.Long.valueOf(parseLong));
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.chatting.component.tl(f0Var, tc6Var, this.f200087a, parseLong), true);
        b4Var.c(0L, 200L);
        fmVar.f199064m = b4Var;
    }
}
