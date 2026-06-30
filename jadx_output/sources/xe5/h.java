package xe5;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454033a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f454034b;

    /* renamed from: c, reason: collision with root package name */
    public final int f454035c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454036d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454037e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f454038f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f454039g;

    public h(java.lang.String item_topic, java.lang.String item_content, int i17, java.lang.String ext_item_content, java.lang.String ext_item_reason, java.lang.String dynamic_recommend_reason, java.lang.String str) {
        kotlin.jvm.internal.o.g(item_topic, "item_topic");
        kotlin.jvm.internal.o.g(item_content, "item_content");
        kotlin.jvm.internal.o.g(ext_item_content, "ext_item_content");
        kotlin.jvm.internal.o.g(ext_item_reason, "ext_item_reason");
        kotlin.jvm.internal.o.g(dynamic_recommend_reason, "dynamic_recommend_reason");
        this.f454033a = item_topic;
        this.f454034b = item_content;
        this.f454035c = i17;
        this.f454036d = ext_item_content;
        this.f454037e = ext_item_reason;
        this.f454038f = dynamic_recommend_reason;
        this.f454039g = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe5.h)) {
            return false;
        }
        xe5.h hVar = (xe5.h) obj;
        return kotlin.jvm.internal.o.b(this.f454033a, hVar.f454033a) && kotlin.jvm.internal.o.b(this.f454034b, hVar.f454034b) && this.f454035c == hVar.f454035c && kotlin.jvm.internal.o.b(this.f454036d, hVar.f454036d) && kotlin.jvm.internal.o.b(this.f454037e, hVar.f454037e) && kotlin.jvm.internal.o.b(this.f454038f, hVar.f454038f) && kotlin.jvm.internal.o.b(this.f454039g, hVar.f454039g);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f454033a.hashCode() * 31) + this.f454034b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f454035c)) * 31) + this.f454036d.hashCode()) * 31) + this.f454037e.hashCode()) * 31) + this.f454038f.hashCode()) * 31;
        java.lang.String str = this.f454039g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "InfoItem(item_topic=" + this.f454033a + ", item_content=" + this.f454034b + ", item_maxline=" + this.f454035c + ", ext_item_content=" + this.f454036d + ", ext_item_reason=" + this.f454037e + ", dynamic_recommend_reason=" + this.f454038f + ", reason_type=" + this.f454039g + ')';
    }

    public /* synthetic */ h(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, kotlin.jvm.internal.i iVar) {
        this(str, str2, i17, str3, str4, str5, (i18 & 64) != 0 ? null : str6);
    }
}
