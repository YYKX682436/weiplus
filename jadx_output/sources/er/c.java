package er;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.d f255926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(er.d dVar) {
        super(1);
        this.f255926d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        er.d dVar = this.f255926d;
        java.lang.String str = dVar.f255927q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = dVar.f255930f;
        sb6.append(iEmojiInfo.getMd5());
        sb6.append(" fetch ");
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (booleanValue) {
            boolean b17 = new fr.b().b(fr.d.f265687a.a((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo));
            com.tencent.mars.xlog.Log.i(dVar.f255927q, iEmojiInfo.getMd5() + " verify " + b17);
            dVar.f(b17);
        } else {
            dVar.f(false);
        }
        return jz5.f0.f302826a;
    }
}
