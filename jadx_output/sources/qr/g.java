package qr;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr.h f366012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qr.h hVar, java.lang.String str) {
        super(1);
        this.f366012d = hVar;
        this.f366013e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        fr.d dVar = fr.d.f265687a;
        qr.h hVar = this.f366012d;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = hVar.f366014f;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        new fr.b().b(dVar.a(emojiInfo));
        hVar.b(fp0.u.f265290f);
        qr.e.f366008a.a(hVar.f366016h, true, this.f366013e);
        return jz5.f0.f302826a;
    }
}
