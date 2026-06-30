package dk5;

/* loaded from: classes8.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject f234737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject, yz5.l lVar) {
        super(2);
        this.f234737d = wXMusicVideoObject;
        this.f234738e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        if (intValue == 2) {
            this.f234737d.hdAlbumThumbFilePath = str;
        }
        this.f234738e.invoke(java.lang.Integer.valueOf(intValue));
        return jz5.f0.f302826a;
    }
}
