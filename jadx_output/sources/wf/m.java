package wf;

/* loaded from: classes7.dex */
public class m implements com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf.f f445474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf.b f445475b;

    public m(wf.b bVar, sf.f fVar) {
        this.f445475b = bVar;
        this.f445474a = fVar;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        sf.f fVar = this.f445474a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        xf.a aVar = this.f445475b.f445421o;
        if (aVar != null) {
            ((yf1.e) aVar).d(fVar, bitmap);
        }
    }
}
