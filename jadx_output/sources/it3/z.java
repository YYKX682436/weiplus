package it3;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.MMRecordUI f294586d;

    public z(com.tencent.mm.plugin.recordvideo.activity.MMRecordUI mMRecordUI) {
        this.f294586d = mMRecordUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout;
        jt3.h hVar = this.f294586d.f155629i;
        if (hVar == null || (basePluginLayout = hVar.f301635g) == null) {
            return;
        }
        basePluginLayout.s();
    }
}
