package i91;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f289701a = new java.util.HashMap();

    public void a(i91.b bVar) {
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f289691a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", bVar.f289691a, bVar.f289692b);
            this.f289701a.put(bVar.f289691a, bVar);
        }
    }
}
