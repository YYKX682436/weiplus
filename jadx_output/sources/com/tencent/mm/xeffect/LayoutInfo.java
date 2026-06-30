package com.tencent.mm.xeffect;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0086 J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086 J\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 ¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/xeffect/LayoutInfo;", "", "", "nInit", "ptr", "", "centerX", "centerY", "", "scale", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "scaleBase", "Ljz5/f0;", "nUpdate", "nDestroy", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class LayoutInfo {

    /* renamed from: b, reason: collision with root package name */
    public int f214793b;

    /* renamed from: c, reason: collision with root package name */
    public int f214794c;

    /* renamed from: e, reason: collision with root package name */
    public int f214796e;

    /* renamed from: d, reason: collision with root package name */
    public float f214795d = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final long f214792a = nInit();

    public final void finalize() {
        nDestroy(this.f214792a);
    }

    public final native void nDestroy(long j17);

    public final native long nInit();

    public final native void nUpdate(long j17, int i17, int i18, float f17, float f18, int i19);
}
