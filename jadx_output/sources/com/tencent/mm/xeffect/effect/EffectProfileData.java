package com.tencent.mm.xeffect.effect;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nJ\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/xeffect/effect/EffectProfileData;", "", "", "nGetCreatePAGFile", "", "ptr", "nGetCreatePAGSurface", "nGetRenderPAG", "Ljz5/f0;", "nReset", "uq5/h", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class EffectProfileData {

    /* renamed from: a, reason: collision with root package name */
    public final long f214807a;

    public EffectProfileData(long j17) {
        this.f214807a = j17;
    }

    private final native long[] nGetCreatePAGFile();

    private final native long[] nGetCreatePAGSurface(long ptr);

    private final native long[] nGetRenderPAG(long ptr);

    private final native void nReset(long j17);

    public final uq5.h a(long[] jArr) {
        uq5.h hVar = new uq5.h(0, 0, 0L, 7, null);
        if (jArr.length >= 3) {
            hVar.f430236a = (int) jArr[0];
            hVar.f430237b = (int) jArr[1];
            hVar.f430238c = jArr[2];
        }
        return hVar;
    }

    public final uq5.h b() {
        return this.f214807a == 0 ? new uq5.h(0, 0, 0L, 7, null) : a(nGetCreatePAGFile());
    }

    public final uq5.h c() {
        long j17 = this.f214807a;
        return j17 == 0 ? new uq5.h(0, 0, 0L, 7, null) : a(nGetRenderPAG(j17));
    }
}
