package u85;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu85/l;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class l implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCStickerTask", "invoke: ");
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = (com.tencent.mm.sticker.loader.StickerLoadInfo) data.getParcelable("load_info");
        android.os.Bundle bundle = new android.os.Bundle();
        if (stickerLoadInfo == null) {
            bundle.putBoolean("task_result", false);
            if (rVar != null) {
                rVar.a(bundle);
                return;
            }
            return;
        }
        u85.i iVar = u85.i.f425707a;
        u85.k kVar = new u85.k(bundle, rVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerFileManager", "loadFromRemote: " + stickerLoadInfo.a());
        u85.o qVar = stickerLoadInfo.f193689d == 1 ? new u85.q(stickerLoadInfo) : new u85.e(stickerLoadInfo);
        java.util.LinkedList linkedList = qVar.f425720g;
        if (!linkedList.contains(kVar)) {
            linkedList.add(kVar);
        }
        u85.i.f425714h.put(stickerLoadInfo.a(), qVar);
        u85.i.f425713g.a(qVar);
    }
}
