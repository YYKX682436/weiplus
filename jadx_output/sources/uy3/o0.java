package uy3;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.opensdk.modelmsg.WXMediaMessage f431986a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431987b;

    public o0(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        this.f431986a = wXMediaMessage;
        this.f431987b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy3.o0)) {
            return false;
        }
        uy3.o0 o0Var = (uy3.o0) obj;
        return kotlin.jvm.internal.o.b(this.f431986a, o0Var.f431986a) && kotlin.jvm.internal.o.b(this.f431987b, o0Var.f431987b);
    }

    public int hashCode() {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f431986a;
        int hashCode = (wXMediaMessage == null ? 0 : wXMediaMessage.hashCode()) * 31;
        java.lang.String str = this.f431987b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ScanBoxShareInfo(appMsg=" + this.f431986a + ", imageUrl=" + this.f431987b + ')';
    }
}
