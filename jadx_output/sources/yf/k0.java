package yf;

/* loaded from: classes7.dex */
public class k0 implements com.tencent.rtmp.TXLivePusher.ITXSnapshotListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f461407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461408c;

    public k0(yf.i0 i0Var, sf.f fVar) {
        this.f461408c = i0Var;
        this.f461407b = fVar;
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        sf.f fVar = this.f461407b;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        zf.c cVar = this.f461408c.f461365o;
        if (cVar != null) {
            ((bg1.h) cVar).e(fVar, bitmap);
        }
    }
}
