package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class xl implements x21.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f200238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f200239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f200240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f200241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f200242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f200243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f200244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f200245h;

    public xl(java.util.ArrayList arrayList, com.tencent.mm.ui.chatting.component.fm fmVar, kotlin.jvm.internal.c0 c0Var, yb5.d dVar, long j17, long j18, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f200238a = arrayList;
        this.f200239b = fmVar;
        this.f200240c = c0Var;
        this.f200241d = dVar;
        this.f200242e = j17;
        this.f200243f = j18;
        this.f200244g = f0Var;
        this.f200245h = c0Var2;
    }

    public void a(java.lang.String filePath, int i17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "MicroMsg.MSP " + filePath + " oncomp");
        java.util.ArrayList arrayList = this.f200238a;
        if (i17 < arrayList.size() && arrayList.size() > 0 && filePath.length() > 0) {
            int size = arrayList.size() - 1;
            com.tencent.mm.ui.chatting.component.fm fmVar = this.f200239b;
            if (i17 == size) {
                kotlin.jvm.internal.c0 c0Var = this.f200245h;
                if (!c0Var.f310112d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
                    c0Var.f310112d = true;
                    fmVar.m0(2);
                    fmVar.t0(this.f200241d);
                }
            }
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.tc6 tc6Var = (r45.tc6) obj;
            int i18 = tc6Var.f386316e;
            java.lang.String str = tc6Var.f386315d;
            boolean z17 = false;
            int length = i18 + (str != null ? str.length() : 0);
            kotlin.jvm.internal.f0 f0Var = this.f200244g;
            int i19 = f0Var.f310116d;
            long j17 = this.f200242e;
            if (length != i19) {
                sb5.h2 h2Var = fmVar.f199063i;
                if (h2Var != null) {
                    h2Var.a(length, java.lang.Long.valueOf(j17));
                }
                f0Var.f310116d = length;
            }
            int i27 = i17 + 1;
            if (i27 < arrayList.size()) {
                r45.tc6 tc6Var2 = (r45.tc6) arrayList.get(i27);
                if (tc6Var2 != null && tc6Var2.f386317f) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify pausePlay, index: %s", java.lang.Integer.valueOf(i17));
                    x21.l lVar = fmVar.f199061g;
                    com.tencent.mars.xlog.Log.i(lVar.f451545b, "pausePlay");
                    lVar.f451548e.a(true);
                    r45.tc6 tc6Var3 = (r45.tc6) arrayList.get(i27);
                    java.lang.String str2 = tc6Var3 != null ? tc6Var3.f386315d : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    fmVar.s0(i27, j17, str2);
                }
            }
        }
    }

    public void b(java.lang.String filePath, int i17, float f17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.util.ArrayList arrayList = this.f200238a;
        if (i17 >= arrayList.size()) {
            return;
        }
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f200239b;
        r45.uc6 uc6Var = fmVar.f199066o;
        if (i17 >= uc6Var.f387227e) {
            uc6Var.f387227e = i17 + 1;
            uc6Var.f387228f++;
        }
        long j17 = this.f200242e;
        if (i17 == 0) {
            kotlin.jvm.internal.c0 c0Var = this.f200240c;
            if (!c0Var.f310112d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
                yb5.d dVar = this.f200241d;
                fmVar.n0(dVar);
                fmVar.o0(dVar);
                fmVar.f199059e = j17;
                fmVar.f199066o.f387226d = this.f200243f;
                fmVar.f199060f = 0L;
                c0Var.f310112d = true;
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.wl(dVar));
            }
        }
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.tc6 tc6Var = (r45.tc6) obj;
        int ceil = tc6Var.f386316e + ((int) java.lang.Math.ceil((tc6Var.f386315d != null ? r10.length() : 0) * f17));
        kotlin.jvm.internal.f0 f0Var = this.f200244g;
        if (ceil != f0Var.f310116d) {
            sb5.h2 h2Var = fmVar.f199063i;
            if (h2Var != null) {
                h2Var.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f310116d = ceil;
        }
    }
}
