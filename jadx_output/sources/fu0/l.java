package fu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f266787a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.AppCompatActivity f266788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f266789c;

    /* renamed from: d, reason: collision with root package name */
    public fu0.q f266790d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f266791e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f266792f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f266793g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f266794h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f266795i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f266796j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.app.s2 f266797k;

    public l(kotlin.jvm.internal.i iVar) {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f266791e = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    public static final void a(fu0.l lVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, fu0.m mVar) {
        java.util.Collection collection;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = lVar.f266788b;
        if (appCompatActivity == null) {
            return;
        }
        fu0.q qVar = new fu0.q(null, appCompatActivity, fu0.k.f266786d);
        lVar.f266790d = qVar;
        lVar.f266792f = audioCacheInfo;
        if (audioCacheInfo != null) {
            java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> c17 = kz5.b0.c(audioCacheInfo);
            qVar.g().setLocalAudioList(c17);
            if (z17 && (audioCacheInfo2 = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) kz5.n0.Z(c17)) != null) {
                qVar.f222355e = audioCacheInfo2;
                qVar.f222357g = ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) qVar.g().e()).getDefaultSelectPageTabType();
                cu0.y g17 = qVar.g();
                kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerDrawerImpl");
                ((fu0.u) g17).onSelectMusic(audioCacheInfo2);
            }
        }
        boolean z18 = audioCacheInfo != null && z17;
        cu0.y g18 = qVar.g();
        kotlin.jvm.internal.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerDrawerImpl");
        fu0.u uVar = (fu0.u) g18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupConfig: autoPlayAudio=");
        sb6.append(z18);
        sb6.append(", hasRecommendContext=");
        sb6.append(mVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CreationComposingMusicPickerDrawerImpl", sb6.toString());
        st3.k kVar = new st3.k();
        kVar.f412551f = st3.v.f412609h;
        kVar.f412547b = false;
        kVar.f412549d = false;
        if (mVar == null || (collection = mVar.f266798a) == null) {
            collection = kz5.p0.f313996d;
        }
        ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) uVar.e()).setupConfig(new yu3.b(new yu3.a(10, true, "", new java.util.ArrayList(collection), 0L, 0L, z18, 2, mVar != null ? mVar.f266799b : null, mVar != null ? mVar.f266800c : null), false, kVar, false));
        qVar.f222361k = new fu0.j(lVar);
        lVar.f266795i = true;
        com.tencent.mm.app.s2 s2Var = lVar.f266797k;
        if (s2Var != null) {
            s2Var.dead();
        }
        fu0.i iVar = new fu0.i(lVar);
        iVar.alive();
        lVar.f266797k = iVar;
        yz5.a aVar = lVar.f266793g;
        if (aVar != null) {
            aVar.invoke();
        }
        if (qVar.f222354d) {
            return;
        }
        qVar.g().setShow(true);
    }

    public final org.json.JSONObject b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        if (audioCacheInfo == null) {
            return null;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(audioCacheInfo.f155715i, false);
        if (i17 == null) {
            i17 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musicID", audioCacheInfo.C);
        jSONObject.put("musicName", audioCacheInfo.f155723t);
        java.lang.String str = (java.lang.String) kz5.n0.Z(audioCacheInfo.f155714h);
        jSONObject.put("authorName", str != null ? str : "");
        jSONObject.put("coverUrl", audioCacheInfo.f155725v);
        jSONObject.put("musicFilePath", i17);
        jSONObject.put("durationInMs", audioCacheInfo.f155720q);
        jSONObject.put("isMusicOn", true);
        return jSONObject;
    }

    public final void c(org.json.JSONObject jSONObject, boolean z17) {
        if (this.f266789c) {
            return;
        }
        this.f266789c = true;
        com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "finish: musicResult=" + jSONObject + ", musicChanged=" + z17);
        if (this.f266795i) {
            yz5.l lVar = this.f266794h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.valueOf(z17));
            }
            this.f266795i = false;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
            com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "finish: musicResult is null");
            jSONObject.put("errCode", -1);
        }
        yz5.l lVar2 = this.f266787a;
        if (lVar2 != null) {
            lVar2.invoke(jSONObject);
        }
        kotlinx.coroutines.z0.e(this.f266791e, null, 1, null);
        com.tencent.mm.app.s2 s2Var = this.f266797k;
        if (s2Var != null) {
            s2Var.dead();
        }
        this.f266797k = null;
        this.f266796j = false;
        fu0.q qVar = this.f266790d;
        if (qVar != null) {
            qVar.e();
        }
        this.f266790d = null;
        this.f266787a = null;
        this.f266793g = null;
        this.f266794h = null;
        this.f266792f = null;
        this.f266788b = null;
    }
}
