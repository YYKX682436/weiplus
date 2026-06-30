package zg0;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f472780a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f472781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f472782c;

    /* renamed from: d, reason: collision with root package name */
    public double f472783d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f472784e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f472785f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.zc f472786g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f472787h;

    public s3(android.content.Context context, android.content.Intent intent, boolean z17, double d17, boolean z18, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, com.tencent.mm.ui.zc zcVar, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f472780a = context;
        this.f472781b = intent;
        this.f472782c = z17;
        this.f472783d = d17;
        this.f472784e = z18;
        this.f472785f = aVar;
        this.f472786g = zcVar;
        this.f472787h = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg0.s3)) {
            return false;
        }
        zg0.s3 s3Var = (zg0.s3) obj;
        return kotlin.jvm.internal.o.b(this.f472780a, s3Var.f472780a) && kotlin.jvm.internal.o.b(this.f472781b, s3Var.f472781b) && this.f472782c == s3Var.f472782c && java.lang.Double.compare(this.f472783d, s3Var.f472783d) == 0 && this.f472784e == s3Var.f472784e && kotlin.jvm.internal.o.b(this.f472785f, s3Var.f472785f) && kotlin.jvm.internal.o.b(this.f472786g, s3Var.f472786g) && this.f472787h == s3Var.f472787h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f472780a.hashCode() * 31) + this.f472781b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f472782c)) * 31) + java.lang.Double.hashCode(this.f472783d)) * 31) + java.lang.Boolean.hashCode(this.f472784e)) * 31;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f472785f;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.tencent.mm.ui.zc zcVar = this.f472786g;
        return ((hashCode2 + (zcVar != null ? zcVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f472787h);
    }

    public java.lang.String toString() {
        return "StartWebSearchHalfScreenParams(context=" + this.f472780a + ", intent=" + this.f472781b + ", showHeader=" + this.f472782c + ", heightRatio=" + this.f472783d + ", enableDrag=" + this.f472784e + ", drawerListener=" + this.f472785f + ", onActivityResult=" + this.f472786g + ", hideMask=" + this.f472787h + ')';
    }

    public /* synthetic */ s3(android.content.Context context, android.content.Intent intent, boolean z17, double d17, boolean z18, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, com.tencent.mm.ui.zc zcVar, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this(context, intent, (i17 & 4) != 0 ? true : z17, (i17 & 8) != 0 ? 0.7d : d17, (i17 & 16) != 0 ? true : z18, (i17 & 32) != 0 ? null : aVar, (i17 & 64) != 0 ? null : zcVar, (i17 & 128) != 0 ? false : z19);
    }
}
