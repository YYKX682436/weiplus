package t23;

/* loaded from: classes10.dex */
public class v1 implements t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.w1 f415282d;

    public v1(t23.w1 w1Var) {
        this.f415282d = w1Var;
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "queryMediaItemsInAlbum callback, size: %d.", java.lang.Integer.valueOf(linkedList.size()));
        t23.x1.a(this.f415282d.f415288g, linkedList, j17, z17);
    }
}
