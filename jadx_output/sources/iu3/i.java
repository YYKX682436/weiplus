package iu3;

/* loaded from: classes5.dex */
public final class i implements iu3.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f295006a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295007b;

    /* renamed from: c, reason: collision with root package name */
    public kk4.v f295008c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Float f295009e;

    /* renamed from: f, reason: collision with root package name */
    public pk4.v f295010f;

    /* renamed from: g, reason: collision with root package name */
    public long f295011g;

    public i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f295006a = context;
        this.f295007b = "MicroMsg.EditMusicController" + hashCode();
        this.f295011g = 100L;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i(this.f295007b, "pause music");
        com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = nu3.i.f340221d;
        storyDoPublishStruct.f60879n = storyDoPublishStruct.b("MusicId", "", true);
        com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct2 = nu3.i.f340221d;
        storyDoPublishStruct2.f60880o = 0L;
        storyDoPublishStruct2.f60882q = 0L;
        nu3.i.f340224g.f60953m = 0L;
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.c();
        }
        kk4.v vVar2 = this.f295008c;
        if (vVar2 != null) {
            kk4.b.i(vVar2, false, false, 3, null);
        }
    }

    public final void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        java.lang.String str = this.f295007b;
        com.tencent.mars.xlog.Log.i(str, "play music");
        try {
            c(audioCacheInfo);
            e();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "play music " + audioCacheInfo + " fail:" + e17.getLocalizedMessage());
        }
    }

    public final void c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        kk4.v vVar;
        a();
        if (audioCacheInfo == null) {
            return;
        }
        java.lang.String str = audioCacheInfo.f155712f;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String valueOf = java.lang.String.valueOf(audioCacheInfo.f155711e);
        java.lang.String str3 = audioCacheInfo.f155715i;
        dk4.a aVar = new dk4.a(valueOf, str3 == null ? "" : str3, str2, 0, 0);
        aVar.f234468e = audioCacheInfo.f155716m;
        aVar.f234467d = audioCacheInfo.f155724u;
        if (audioCacheInfo.f155729z) {
            aVar.f234481r = "A0";
        }
        kk4.v vVar2 = this.f295008c;
        if (vVar2 != null) {
            vVar2.stop();
        }
        kk4.v vVar3 = this.f295008c;
        if (vVar3 != null) {
            vVar3.recycle();
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kk4.v vVar4 = new kk4.v(context);
        this.f295008c = vVar4;
        vVar4.M = true;
        vVar4.f308585j = true;
        vVar4.A(true);
        kk4.v vVar5 = this.f295008c;
        if (vVar5 != null) {
            vVar5.C(false);
        }
        kk4.v vVar6 = this.f295008c;
        if (vVar6 != null) {
            vVar6.B(aVar);
        }
        kk4.v vVar7 = this.f295008c;
        jz5.l lVar = null;
        kk4.h hVar = vVar7 != null ? vVar7.f308580e : null;
        if (hVar != null) {
            hVar.f308551m = new iu3.g(audioCacheInfo, this);
        }
        if (audioCacheInfo.g()) {
            long c17 = audioCacheInfo.c();
            lVar = new jz5.l(java.lang.Long.valueOf(c17), java.lang.Long.valueOf(audioCacheInfo.b() + c17));
        }
        if (lVar != null) {
            long longValue = ((java.lang.Number) lVar.f302833d).longValue();
            long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
            kk4.v vVar8 = this.f295008c;
            if (vVar8 != null) {
                vVar8.A(true);
            }
            kk4.v vVar9 = this.f295008c;
            if (vVar9 != null) {
                vVar9.H(longValue, longValue2);
            }
        }
        java.lang.Float f17 = this.f295009e;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            kk4.v vVar10 = this.f295008c;
            if (vVar10 != null) {
                vVar10.K(floatValue);
            }
        }
        pk4.v vVar11 = this.f295010f;
        if (vVar11 == null || (vVar = this.f295008c) == null) {
            return;
        }
        vVar.I(vVar11, this.f295011g);
    }

    public void d() {
        com.tencent.mars.xlog.Log.i(this.f295007b, "release");
        kk4.v vVar = this.f295008c;
        if (vVar != null) {
            vVar.stop();
        }
        kk4.v vVar2 = this.f295008c;
        if (vVar2 != null) {
            vVar2.recycle();
        }
        this.f295008c = null;
    }

    public void e() {
        kk4.v vVar;
        com.tencent.mars.xlog.Log.i(this.f295007b, "resume music");
        kk4.v vVar2 = this.f295008c;
        if (vVar2 != null) {
            vVar2.O();
        }
        android.content.Context context = this.f295006a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        if (((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).a7() || (vVar = this.f295008c) == null) {
            return;
        }
        vVar.C(true);
    }

    public final void f(long j17) {
        kk4.c cVar;
        kk4.v vVar = this.f295008c;
        long max = java.lang.Math.max(0L, (vVar == null || (cVar = vVar.f308577b) == null) ? 0L : ((kk4.f0) cVar).getDurationMs());
        long j18 = (j17 == 0 || max == 0 || j17 < max) ? j17 : j17 % max;
        com.tencent.mars.xlog.Log.i(this.f295007b, "seek music to " + j17 + ", durationMs " + max + ", seek to " + j18);
        kk4.v vVar2 = this.f295008c;
        if (vVar2 != null) {
            kk4.b.f(vVar2, (int) j18, false, null, 6, null);
        }
    }
}
