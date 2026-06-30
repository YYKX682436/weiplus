package wr;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f448742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f448743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.api.IEmojiInfo iEmojiInfo, wr.j jVar) {
        super(1);
        this.f448742d = iEmojiInfo;
        this.f448743e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        wr.j jVar = this.f448743e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f448742d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "downloaded origin emoticon. start gen thumb. md5: " + iEmojiInfo.getMd5());
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new wr.f(iEmojiInfo, jVar, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageMgr", "failed to download origin emoticon. md5: " + iEmojiInfo.getMd5());
            jVar.b();
        }
        return jz5.f0.f302826a;
    }
}
