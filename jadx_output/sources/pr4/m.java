package pr4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f358036a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f358037b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f358038c;

    public m(android.app.Activity context, byte[] buff, yz5.l completion) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buff, "buff");
        kotlin.jvm.internal.o.g(completion, "completion");
        this.f358036a = context;
        this.f358037b = buff;
        this.f358038c = completion;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr4.m)) {
            return false;
        }
        pr4.m mVar = (pr4.m) obj;
        return kotlin.jvm.internal.o.b(this.f358036a, mVar.f358036a) && kotlin.jvm.internal.o.b(this.f358037b, mVar.f358037b) && kotlin.jvm.internal.o.b(this.f358038c, mVar.f358038c);
    }

    public int hashCode() {
        return (((this.f358036a.hashCode() * 31) + java.util.Arrays.hashCode(this.f358037b)) * 31) + this.f358038c.hashCode();
    }

    public java.lang.String toString() {
        return "WeCoinSubscribeParameter(context=" + this.f358036a + ", buff=" + java.util.Arrays.toString(this.f358037b) + ", completion=" + this.f358038c + ')';
    }
}
