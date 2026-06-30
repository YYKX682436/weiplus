package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class cm implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f198897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f198898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f198900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f198901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f198903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f198904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f198905i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f198906j;

    public cm(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar, long j17, long j18, java.lang.String str, kotlin.jvm.internal.f0 f0Var, java.util.ArrayList arrayList, kotlin.jvm.internal.c0 c0Var2, pn4.e1 e1Var) {
        this.f198897a = c0Var;
        this.f198898b = fmVar;
        this.f198899c = dVar;
        this.f198900d = j17;
        this.f198901e = j18;
        this.f198902f = str;
        this.f198903g = f0Var;
        this.f198904h = arrayList;
        this.f198905i = c0Var2;
        this.f198906j = e1Var;
    }

    @Override // y21.a
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "onPlayInterrupt");
        this.f198898b.t0(this.f198899c);
        this.f198906j.f357089h = null;
    }

    @Override // y21.a
    public void onComplete() {
        if (this.f198904h.size() > 0) {
            kotlin.jvm.internal.c0 c0Var = this.f198905i;
            if (!c0Var.f310112d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
                c0Var.f310112d = true;
                com.tencent.mm.ui.chatting.component.fm fmVar = this.f198898b;
                fmVar.m0(2);
                fmVar.t0(this.f198899c);
            }
        }
        this.f198906j.f357089h = null;
    }

    @Override // y21.a
    public void onProgress(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "onProgress " + f17);
        kotlin.jvm.internal.c0 c0Var = this.f198897a;
        boolean z17 = c0Var.f310112d;
        long j17 = this.f198900d;
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f198898b;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
            yb5.d dVar = this.f198899c;
            fmVar.n0(dVar);
            fmVar.o0(dVar);
            fmVar.f199059e = j17;
            fmVar.f199066o.f387226d = this.f198901e;
            fmVar.f199060f = 0L;
            c0Var.f310112d = true;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.bm(dVar));
        }
        int ceil = (int) java.lang.Math.ceil((this.f198902f != null ? r0.length() : 0) * f17);
        kotlin.jvm.internal.f0 f0Var = this.f198903g;
        if (ceil != f0Var.f310116d) {
            sb5.h2 h2Var = fmVar.f199063i;
            if (h2Var != null) {
                h2Var.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f310116d = ceil;
        }
    }
}
