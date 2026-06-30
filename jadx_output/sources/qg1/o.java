package qg1;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f362785a;

    /* renamed from: b, reason: collision with root package name */
    public int f362786b;

    /* renamed from: c, reason: collision with root package name */
    public int f362787c;

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof qg1.o)) {
            return false;
        }
        qg1.o oVar = (qg1.o) obj;
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f362785a) && !com.tencent.mm.sdk.platformtools.t8.K0(oVar.f362785a) && this.f362785a.equals(oVar.f362785a) && this.f362786b == oVar.f362786b && this.f362787c == oVar.f362787c;
    }

    public int hashCode() {
        return this.f362785a.hashCode() + this.f362786b + this.f362787c;
    }
}
