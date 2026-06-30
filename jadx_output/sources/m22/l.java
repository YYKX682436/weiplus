package m22;

/* loaded from: classes12.dex */
public final class l extends m22.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiIPSetInfo f323055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f323056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.storage.emotion.EmojiIPSetInfo info) {
        super(1);
        kotlin.jvm.internal.o.g(info, "info");
        this.f323055a = info;
        this.f323056b = new java.util.LinkedList();
    }

    @Override // m22.i
    public java.lang.String a() {
        java.lang.String str = this.f323055a.field_panelUrl;
        return str == null ? "" : str;
    }

    @Override // m22.i
    public java.lang.String b() {
        java.lang.String str = this.f323055a.field_key;
        return str == null ? "" : str;
    }

    @Override // m22.i
    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f323055a.field_title;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('(');
        sb6.append(this.f323056b.size());
        sb6.append(')');
        return sb6.toString();
    }
}
