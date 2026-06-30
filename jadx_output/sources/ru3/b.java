package ru3;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer f399750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zv3.g f399751e;

    public b(com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer, zv3.g gVar) {
        this.f399750d = fakeVideoViewLayer;
        this.f399751e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer.f155885s;
        this.f399750d.a(this.f399751e);
    }
}
