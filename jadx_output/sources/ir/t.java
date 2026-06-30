package ir;

/* loaded from: classes12.dex */
public final class t extends ir.r {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiGroupInfo f293900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, com.tencent.mm.storage.emotion.EmojiGroupInfo info) {
        super(i17);
        kotlin.jvm.internal.o.g(info, "info");
        this.f293900b = info;
    }

    @Override // ir.r
    public java.lang.String c() {
        java.lang.String str = this.f293900b.field_productID;
        return str == null ? "" : str;
    }

    @Override // ir.r
    public java.lang.String d() {
        java.lang.String str = this.f293900b.field_packGrayIconUrl;
        return str == null ? "" : str;
    }

    @Override // ir.r
    public java.lang.String e() {
        java.lang.String str = this.f293900b.field_packName;
        return str == null ? "" : str;
    }

    @Override // ir.r
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }
}
