package cr;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f221579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, yz5.l lVar) {
        super(2);
        this.f221579d = emojiInfo;
        this.f221580e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cr.i iVar = (cr.i) obj2;
        yz5.l lVar = this.f221580e;
        if (!booleanValue || iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.FetcherFactory", "fetch: get config fail " + this.f221579d.getMd5());
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = iVar.f221572e;
            sb6.append(i17);
            sb6.append(' ');
            sb6.append(iVar.f221568a.getMd5());
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.FetcherFactory", sb6.toString());
            (i17 == 3 ? new cr.b() : new cr.d()).a(iVar, lVar);
        }
        return jz5.f0.f302826a;
    }
}
