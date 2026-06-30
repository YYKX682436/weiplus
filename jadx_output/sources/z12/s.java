package z12;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.t f469359d;

    public s(z12.t tVar) {
        this.f469359d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z12.t tVar = this.f469359d;
        java.util.ArrayList arrayList = tVar.f469368o;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList: %s", java.lang.Integer.valueOf(arrayList.size()));
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.d b17 = com.tencent.mm.storage.n5.f().b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
            return;
        }
        b17.p1(arrayList);
        if (!tVar.f469367n) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().b();
            return;
        }
        if (arrayList.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", java.lang.Integer.valueOf(arrayList.size()));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.zj0 zj0Var = (r45.zj0) it.next();
                if (zj0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392128d)) {
                    if (zj0Var.f392128d.equals(java.lang.String.valueOf(17))) {
                        arrayList2.add(new b22.b("com.tencent.xin.emoticon.tusiji"));
                    } else {
                        arrayList2.add(new b22.a(zj0Var.f392128d, true));
                    }
                }
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.b(arrayList2);
            if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97632c) {
                return;
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f();
        }
    }
}
