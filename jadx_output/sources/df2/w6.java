package df2;

/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final df2.x6 f231667a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.l1 f231668b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f231669c;

    public w6(df2.x6 type, com.tencent.mm.plugin.finder.live.util.l1 gift, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(gift, "gift");
        this.f231667a = type;
        this.f231668b = gift;
        this.f231669c = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.w6)) {
            return false;
        }
        df2.w6 w6Var = (df2.w6) obj;
        return this.f231667a == w6Var.f231667a && kotlin.jvm.internal.o.b(this.f231668b, w6Var.f231668b) && kotlin.jvm.internal.o.b(this.f231669c, w6Var.f231669c);
    }

    public int hashCode() {
        int hashCode = ((this.f231667a.hashCode() * 31) + this.f231668b.hashCode()) * 31;
        android.os.Bundle bundle = this.f231669c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return " type = " + this.f231667a + ", giftId = " + this.f231668b.f115600r;
    }
}
