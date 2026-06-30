package jt3;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt3.h f301618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f301619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f301620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f301621g;

    public d(jt3.h hVar, int i17, int i18, android.content.Intent intent) {
        this.f301618d = hVar;
        this.f301619e = i17;
        this.f301620f = i18;
        this.f301621g = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = this.f301618d.f301635g;
        if (basePluginLayout != null) {
            basePluginLayout.onActivityResult(this.f301619e, this.f301620f, this.f301621g);
        }
    }
}
