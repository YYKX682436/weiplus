package st3;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f412587a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f412588b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f412589c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f412590d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f412591e;

    /* renamed from: f, reason: collision with root package name */
    public final int f412592f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412593g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f412594h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f412595i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f412596j;

    public s(boolean z17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.util.ArrayList editItems, java.util.ArrayList editData, float[] drawingRect, int i17, int i18, java.util.ArrayList fakeImagesList, java.lang.String str, float[] validRect) {
        kotlin.jvm.internal.o.g(editItems, "editItems");
        kotlin.jvm.internal.o.g(editData, "editData");
        kotlin.jvm.internal.o.g(drawingRect, "drawingRect");
        kotlin.jvm.internal.o.g(fakeImagesList, "fakeImagesList");
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.f412587a = z17;
        this.f412588b = audioCacheInfo;
        this.f412589c = editItems;
        this.f412590d = editData;
        this.f412591e = drawingRect;
        this.f412592f = i17;
        this.f412593g = i18;
        this.f412594h = fakeImagesList;
        this.f412595i = str;
        this.f412596j = validRect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r5 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final st3.r a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r26, ct0.b r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.s.a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, ct0.b, boolean):st3.r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final st3.r b(java.lang.String r18, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r19, st3.r r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.s.b(java.lang.String, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, st3.r):st3.r");
    }

    public java.lang.String toString() {
        return "RemuxMediaEditConfig(muteOrigin=" + this.f412587a + ", audioCacheInfo=" + this.f412588b + ", editItems=" + this.f412589c + ", drawingRect=" + java.util.Arrays.toString(this.f412591e) + ", reMuxStartTimeMs=" + this.f412592f + ", reMuxEndTimeMs=" + this.f412593g + ')';
    }

    public /* synthetic */ s(boolean z17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, float[] fArr, int i17, int i18, java.util.ArrayList arrayList3, java.lang.String str, float[] fArr2, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? false : z17, (i19 & 2) != 0 ? null : audioCacheInfo, (i19 & 4) != 0 ? new java.util.ArrayList() : arrayList, (i19 & 8) != 0 ? new java.util.ArrayList() : arrayList2, (i19 & 16) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : fArr, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? new java.util.ArrayList() : arrayList3, (i19 & 256) != 0 ? null : str, fArr2);
    }
}
