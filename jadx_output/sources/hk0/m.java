package hk0;

/* loaded from: classes3.dex */
public final class m extends hk0.n {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f281771b;

    /* renamed from: c, reason: collision with root package name */
    public hk0.p f281772c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f281773d;

    /* renamed from: e, reason: collision with root package name */
    public xk0.f f281774e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f281775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hk0.l editType, hk0.p handleType, com.tencent.mm.api.IEmojiInfo emojiInfo, xk0.f fVar, java.lang.String str) {
        super(editType, handleType, str, fVar);
        kotlin.jvm.internal.o.g(editType, "editType");
        kotlin.jvm.internal.o.g(handleType, "handleType");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f281771b = editType;
        this.f281772c = handleType;
        this.f281773d = emojiInfo;
        this.f281774e = fVar;
        this.f281775f = str;
    }

    @Override // hk0.n
    public xk0.f a() {
        return this.f281774e;
    }

    @Override // hk0.n
    public hk0.p b() {
        return this.f281772c;
    }

    @Override // hk0.n
    public java.lang.String c() {
        return this.f281775f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.m)) {
            return false;
        }
        hk0.m mVar = (hk0.m) obj;
        return this.f281771b == mVar.f281771b && this.f281772c == mVar.f281772c && kotlin.jvm.internal.o.b(this.f281773d, mVar.f281773d) && kotlin.jvm.internal.o.b(this.f281774e, mVar.f281774e) && kotlin.jvm.internal.o.b(this.f281775f, mVar.f281775f);
    }

    public int hashCode() {
        int hashCode = ((((this.f281771b.hashCode() * 31) + this.f281772c.hashCode()) * 31) + this.f281773d.hashCode()) * 31;
        xk0.f fVar = this.f281774e;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        java.lang.String str = this.f281775f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "EmojiEditData(editType=" + this.f281771b + ", handleType=" + this.f281772c + ", emojiInfo=" + this.f281773d + ", emojiItem=" + this.f281774e + ", lastEditId=" + this.f281775f + ')';
    }
}
