package pr;

/* loaded from: classes4.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiGroupInfo f357747a;

    public n(com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo) {
        this.f357747a = emojiGroupInfo;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "CgiGetEmotionDetail end: " + i17 + ", " + i18);
        r45.se3 se3Var = (r45.se3) fVar.f70618d;
        if (i17 == 0 && i18 == 0) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().d().z0(this.f357747a.field_productID, se3Var, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        return jz5.f0.f302826a;
    }
}
