package zx;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f476969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f476970b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f476971c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.l f476972d;

    public u(boolean z17, java.lang.String prefixText, boolean z18, com.tencent.wechat.aff.chatbot.l data, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(prefixText, "prefixText");
        kotlin.jvm.internal.o.g(data, "data");
        this.f476969a = z17;
        this.f476970b = prefixText;
        this.f476971c = z18;
        this.f476972d = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx.u)) {
            return false;
        }
        zx.u uVar = (zx.u) obj;
        return this.f476969a == uVar.f476969a && kotlin.jvm.internal.o.b(this.f476970b, uVar.f476970b) && this.f476971c == uVar.f476971c && kotlin.jvm.internal.o.b(this.f476972d, uVar.f476972d);
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f476969a) * 31) + this.f476970b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f476971c)) * 31) + this.f476972d.hashCode();
    }

    public java.lang.String toString() {
        return "QueryItem(isPrefix=" + this.f476969a + ", prefixText=" + this.f476970b + ", isReportVisibilityState=" + this.f476971c + ", data=" + this.f476972d + ')';
    }
}
