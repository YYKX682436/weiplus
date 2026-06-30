package dk5;

/* loaded from: classes9.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f234624a = true;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f234625b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f234626c = null;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo f234627d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f234628e = 0;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk5.f6)) {
            return false;
        }
        dk5.f6 f6Var = (dk5.f6) obj;
        return this.f234624a == f6Var.f234624a && kotlin.jvm.internal.o.b(this.f234625b, f6Var.f234625b) && kotlin.jvm.internal.o.b(this.f234626c, f6Var.f234626c) && kotlin.jvm.internal.o.b(this.f234627d, f6Var.f234627d) && this.f234628e == f6Var.f234628e;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f234624a) * 31;
        java.lang.String str = this.f234625b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f234626c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = this.f234627d;
        return ((hashCode3 + (liteAppBizDataInfo != null ? liteAppBizDataInfo.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f234628e);
    }

    public java.lang.String toString() {
        return "SendWXMediaMessageExtInfo(ifSetTodo=" + this.f234624a + ", platformSignature=" + this.f234625b + ", gameShareMsgId=" + this.f234626c + ", liteAppBizDataInfo=" + this.f234627d + ", isModified=" + this.f234628e + ')';
    }
}
