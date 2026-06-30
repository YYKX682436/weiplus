package x51;

/* loaded from: classes5.dex */
public class c extends com.tencent.mm.sdk.platformtools.n3 {
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (gm0.j1.a()) {
            fp.j jVar = new fp.j();
            java.util.HashSet hashSet = x51.e.f451989a;
            int size = hashSet.size();
            boolean parseBoolean = java.lang.Boolean.parseBoolean(message.obj.toString());
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((y61.f) it.next()).a(parseBoolean);
            }
            x51.e.f451989a.clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "callBackHandler setSize:%d time:%d", java.lang.Integer.valueOf(size), java.lang.Long.valueOf(jVar.a()));
        }
    }
}
