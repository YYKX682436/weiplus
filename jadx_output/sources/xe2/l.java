package xe2;

/* loaded from: classes3.dex */
public final class l implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe2.n f453877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f453878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f453879c;

    public l(xe2.n nVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo, dk2.zf zfVar) {
        this.f453877a = nVar;
        this.f453878b = iEmojiInfo;
        this.f453879c = zfVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        xe2.n nVar = this.f453877a;
        com.tencent.mars.xlog.Log.i(nVar.f453884b, "[addMsgAfterEmojiLoaded] md5 = " + this.f453878b.getMd5() + ", success = " + z17);
        if (z17) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f453879c);
            nVar.e(linkedList);
        }
    }
}
