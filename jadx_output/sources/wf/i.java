package wf;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.plugin.appbrand.jsapi.media.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445469a;

    public i(wf.b bVar) {
        this.f445469a = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onPause() {
        wf.b bVar = this.f445469a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "onPause");
        wf.b.r(bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onResume() {
        wf.b bVar = this.f445469a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "onResume");
        bVar.P();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onStop() {
        wf.b bVar = this.f445469a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "onStop");
        wf.b.r(bVar);
    }
}
