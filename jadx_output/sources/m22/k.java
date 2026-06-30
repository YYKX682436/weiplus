package m22;

/* loaded from: classes12.dex */
public final class k extends m22.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiGroupInfo f323054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.storage.emotion.EmojiGroupInfo groupInfo) {
        super(0);
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        this.f323054a = groupInfo;
    }

    @Override // m22.i
    public java.lang.String a() {
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = this.f323054a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(emojiGroupInfo.field_packIconUrl)) {
            java.lang.String str = emojiGroupInfo.field_packGrayIconUrl;
            return str == null ? "" : str;
        }
        java.lang.String str2 = emojiGroupInfo.field_packIconUrl;
        kotlin.jvm.internal.o.f(str2, "getPackIconUrl(...)");
        return str2;
    }

    @Override // m22.i
    public java.lang.String b() {
        java.lang.String str = this.f323054a.field_productID;
        return str == null ? "" : str;
    }

    @Override // m22.i
    public java.lang.String c() {
        java.lang.String str = this.f323054a.field_packName;
        return str == null ? "" : str;
    }
}
