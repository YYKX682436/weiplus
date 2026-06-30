package wr;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f448740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f448741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.api.IEmojiInfo iEmojiInfo, wr.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448740d = iEmojiInfo;
        this.f448741e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wr.f(this.f448740d, this.f448741e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wr.f fVar = (wr.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wr.j jVar = this.f448741e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f448740d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mm.feature.emoji.api.t6 t6Var = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
            java.lang.String md52 = iEmojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            java.lang.String Ri = ((com.tencent.mm.feature.emoji.r4) t6Var).Ri(md52);
            android.graphics.Bitmap decodeThumb = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.decodeThumb((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
            if (decodeThumb != null) {
                com.tencent.mm.sdk.platformtools.x.D0(decodeThumb, 100, android.graphics.Bitmap.CompressFormat.PNG, Ri, false);
            }
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "thumb local gen success. md5: " + ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).getMd5());
            jVar.getClass();
            pm0.v.X(new wr.e(jVar, Ri));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EmoticonThumbImageMgr", e17, "failed to generate thumb image for md5: " + iEmojiInfo.getMd5(), new java.lang.Object[0]);
            jVar.b();
        }
        return jz5.f0.f302826a;
    }
}
