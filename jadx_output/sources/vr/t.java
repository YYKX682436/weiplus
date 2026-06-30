package vr;

/* loaded from: classes5.dex */
public final class t implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f439437c;

    public t(java.lang.String str, yz5.l lVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f439435a = str;
        this.f439436b = lVar;
        this.f439437c = iEmojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        yz5.l lVar = this.f439436b;
        if (z17) {
            java.lang.String T = this.f439437c.T();
            lVar.invoke(T != null ? T : "");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "loadFile failed. md5=" + this.f439435a);
            lVar.invoke("");
        }
    }
}
