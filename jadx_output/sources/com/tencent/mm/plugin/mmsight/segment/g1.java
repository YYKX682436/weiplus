package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes3.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow f149028f;

    public g1(com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow segmentClipWindow, int i17, int i18) {
        this.f149028f = segmentClipWindow;
        this.f149026d = i17;
        this.f149027e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow segmentClipWindow = this.f149028f;
        int i17 = this.f149026d;
        segmentClipWindow.f148937i = i17;
        segmentClipWindow.f148932d = java.lang.Math.min(this.f149027e, segmentClipWindow.getWidth() - (i17 * 2));
        segmentClipWindow.invalidate();
    }
}
