package y21;

/* loaded from: classes14.dex */
public final class f extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final x21.d f459050e;

    /* renamed from: f, reason: collision with root package name */
    public final x21.f f459051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y21.h f459052g;

    public f(y21.h hVar, x21.d audioDecoder, x21.f audioPlayer) {
        kotlin.jvm.internal.o.g(audioDecoder, "audioDecoder");
        kotlin.jvm.internal.o.g(audioPlayer, "audioPlayer");
        this.f459052g = hVar;
        this.f459050e = audioDecoder;
        this.f459051f = audioPlayer;
    }

    @Override // wu5.b, wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "StreamSilkPlayer-" + this.f459052g.f459055a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (kotlin.Result.m527isFailureimpl(r0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        r4 = (jz5.f0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0044, code lost:
    
        com.tencent.mars.xlog.Log.i(r3.f459056b, "decode result is null");
        r5 = r3.f459059e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
    
        r5.onProgress(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0052, code lost:
    
        r5 = r3.f459059e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0054, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0056, code lost:
    
        r5.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0059, code lost:
    
        y21.h.e(r3, false, true, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        if (kotlin.Result.m527isFailureimpl(r0) != false) goto L54;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y21.f.run():void");
    }
}
