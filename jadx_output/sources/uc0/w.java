package uc0;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f426293a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f426294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f426295c;

    public w(boolean z17, java.lang.String str, boolean z18) {
        this.f426293a = z17;
        this.f426294b = str;
        this.f426295c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.w)) {
            return false;
        }
        uc0.w wVar = (uc0.w) obj;
        return this.f426293a == wVar.f426293a && kotlin.jvm.internal.o.b(this.f426294b, wVar.f426294b) && this.f426295c == wVar.f426295c;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f426293a) * 31;
        java.lang.String str = this.f426294b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f426295c);
    }

    public java.lang.String toString() {
        return "VerifyMsg(isSend=" + this.f426293a + ", content=" + this.f426294b + ", hasImg=" + this.f426295c + ')';
    }
}
