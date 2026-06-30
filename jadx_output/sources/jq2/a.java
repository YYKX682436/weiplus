package jq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f301095a;

    /* renamed from: b, reason: collision with root package name */
    public final int f301096b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.dd2 f301097c;

    /* renamed from: d, reason: collision with root package name */
    public final int f301098d;

    /* renamed from: e, reason: collision with root package name */
    public final int f301099e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.u80 f301100f;

    /* renamed from: g, reason: collision with root package name */
    public final fq2.a f301101g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.ed2 f301102h;

    /* renamed from: i, reason: collision with root package name */
    public final hq2.c f301103i;

    public a(int i17, int i18, r45.dd2 tabInfo, int i19, int i27, r45.u80 containerContext, fq2.a outSideHook, r45.ed2 ed2Var, hq2.c cVar) {
        kotlin.jvm.internal.o.g(tabInfo, "tabInfo");
        kotlin.jvm.internal.o.g(containerContext, "containerContext");
        kotlin.jvm.internal.o.g(outSideHook, "outSideHook");
        this.f301095a = i17;
        this.f301096b = i18;
        this.f301097c = tabInfo;
        this.f301098d = i19;
        this.f301099e = i27;
        this.f301100f = containerContext;
        this.f301101g = outSideHook;
        this.f301102h = ed2Var;
        this.f301103i = cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2.a)) {
            return false;
        }
        jq2.a aVar = (jq2.a) obj;
        return this.f301095a == aVar.f301095a && this.f301096b == aVar.f301096b && kotlin.jvm.internal.o.b(this.f301097c, aVar.f301097c) && this.f301098d == aVar.f301098d && this.f301099e == aVar.f301099e && kotlin.jvm.internal.o.b(this.f301100f, aVar.f301100f) && kotlin.jvm.internal.o.b(this.f301101g, aVar.f301101g) && kotlin.jvm.internal.o.b(this.f301102h, aVar.f301102h) && kotlin.jvm.internal.o.b(this.f301103i, aVar.f301103i);
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f301095a) * 31) + java.lang.Integer.hashCode(this.f301096b)) * 31) + this.f301097c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f301098d)) * 31) + java.lang.Integer.hashCode(this.f301099e)) * 31) + this.f301100f.hashCode()) * 31) + this.f301101g.hashCode()) * 31;
        r45.ed2 ed2Var = this.f301102h;
        int hashCode2 = (hashCode + (ed2Var == null ? 0 : ed2Var.hashCode())) * 31;
        hq2.c cVar = this.f301103i;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LiveStreamTabParams(pos=" + this.f301095a + ", tabId=" + this.f301096b + ", tabInfo=" + this.f301097c + ", containerType=" + this.f301098d + ", containerId=" + this.f301099e + ", containerContext=" + this.f301100f + ", outSideHook=" + this.f301101g + ", tabContainerInfo=" + this.f301102h + ", tabPageConvertData=" + this.f301103i + ')';
    }
}
