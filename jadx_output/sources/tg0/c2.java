package tg0;

/* loaded from: classes8.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f419046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f419047b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f419048c;

    /* renamed from: d, reason: collision with root package name */
    public final tg0.g2 f419049d;

    /* renamed from: e, reason: collision with root package name */
    public final tg0.d1 f419050e;

    /* renamed from: f, reason: collision with root package name */
    public final tg0.s2 f419051f;

    /* renamed from: g, reason: collision with root package name */
    public final tg0.y1 f419052g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.h2 f419053h;

    /* renamed from: i, reason: collision with root package name */
    public final tg0.b f419054i;

    /* renamed from: j, reason: collision with root package name */
    public tg0.c1 f419055j;

    /* renamed from: k, reason: collision with root package name */
    public final int f419056k;

    public c2(boolean z17, boolean z18, boolean z19, tg0.g2 mode, tg0.d1 d1Var, tg0.s2 s2Var, tg0.y1 y1Var, tg0.h2 h2Var, tg0.b bVar, tg0.c1 c1Var, int i17) {
        kotlin.jvm.internal.o.g(mode, "mode");
        this.f419046a = z17;
        this.f419047b = z18;
        this.f419048c = z19;
        this.f419049d = mode;
        this.f419050e = d1Var;
        this.f419051f = s2Var;
        this.f419052g = y1Var;
        this.f419053h = h2Var;
        this.f419054i = bVar;
        this.f419055j = c1Var;
        this.f419056k = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.c2)) {
            return false;
        }
        tg0.c2 c2Var = (tg0.c2) obj;
        return this.f419046a == c2Var.f419046a && this.f419047b == c2Var.f419047b && this.f419048c == c2Var.f419048c && this.f419049d == c2Var.f419049d && kotlin.jvm.internal.o.b(this.f419050e, c2Var.f419050e) && kotlin.jvm.internal.o.b(this.f419051f, c2Var.f419051f) && kotlin.jvm.internal.o.b(this.f419052g, c2Var.f419052g) && kotlin.jvm.internal.o.b(this.f419053h, c2Var.f419053h) && kotlin.jvm.internal.o.b(this.f419054i, c2Var.f419054i) && kotlin.jvm.internal.o.b(this.f419055j, c2Var.f419055j) && this.f419056k == c2Var.f419056k;
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f419046a) * 31) + java.lang.Boolean.hashCode(this.f419047b)) * 31) + java.lang.Boolean.hashCode(this.f419048c)) * 31) + this.f419049d.hashCode()) * 31;
        tg0.d1 d1Var = this.f419050e;
        int hashCode2 = (hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        tg0.s2 s2Var = this.f419051f;
        int hashCode3 = (hashCode2 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        tg0.y1 y1Var = this.f419052g;
        int hashCode4 = (hashCode3 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        tg0.h2 h2Var = this.f419053h;
        int hashCode5 = (hashCode4 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        tg0.b bVar = this.f419054i;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        tg0.c1 c1Var = this.f419055j;
        return ((hashCode6 + (c1Var != null ? c1Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f419056k);
    }

    public java.lang.String toString() {
        return "PlatformSearchWebViewData(isJsReady=" + this.f419046a + ", needCallUiInit=" + this.f419047b + ", needNotifyH5Result=" + this.f419048c + ", mode=" + this.f419049d + ", bean=" + this.f419050e + ", webView=" + this.f419051f + ", jsApi=" + this.f419052g + ", webSearchJsApi=" + this.f419053h + ", editFocusChangedListener=" + this.f419054i + ", result=" + this.f419055j + ", hashCode=" + this.f419056k + ')';
    }
}
