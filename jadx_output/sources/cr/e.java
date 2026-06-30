package cr;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr.g f221564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f221565f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l lVar, cr.g gVar, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        super(2);
        this.f221563d = lVar;
        this.f221564e = gVar;
        this.f221565f = emojiInfo;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cr.i iVar = (cr.i) obj2;
        yz5.l lVar = this.f221563d;
        if (booleanValue && iVar != null) {
            this.f221564e.a(this.f221565f, lVar);
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
