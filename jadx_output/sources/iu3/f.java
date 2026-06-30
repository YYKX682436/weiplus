package iu3;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu3.i f295001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f295002e;

    public f(iu3.i iVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        this.f295001d = iVar;
        this.f295002e = audioCacheInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f295001d.b(this.f295002e);
    }
}
