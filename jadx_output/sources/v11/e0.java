package v11;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.i0 f432362a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.j0 f432363b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.h0 f432364c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.v f432365d;

    /* renamed from: e, reason: collision with root package name */
    public final v11.z f432366e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.c0 f432367f;

    /* renamed from: g, reason: collision with root package name */
    public final v11.b0 f432368g;

    /* renamed from: h, reason: collision with root package name */
    public final v11.w f432369h;

    /* renamed from: i, reason: collision with root package name */
    public final v11.d0 f432370i;

    /* renamed from: j, reason: collision with root package name */
    public final v11.u f432371j;

    /* renamed from: k, reason: collision with root package name */
    public final v11.g0 f432372k;

    /* renamed from: l, reason: collision with root package name */
    public final v11.y f432373l;

    /* renamed from: m, reason: collision with root package name */
    public final v11.f0 f432374m;

    public e0(v11.i0 textSize, v11.j0 rawText, v11.h0 textSegment, v11.v boldStyle, v11.z heading, v11.c0 list, v11.b0 inlineStyle, v11.w codeBlock, v11.d0 mathBlock, v11.u blockquote, v11.g0 table, v11.y divider, v11.f0 spacing) {
        kotlin.jvm.internal.o.g(textSize, "textSize");
        kotlin.jvm.internal.o.g(rawText, "rawText");
        kotlin.jvm.internal.o.g(textSegment, "textSegment");
        kotlin.jvm.internal.o.g(boldStyle, "boldStyle");
        kotlin.jvm.internal.o.g(heading, "heading");
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(inlineStyle, "inlineStyle");
        kotlin.jvm.internal.o.g(codeBlock, "codeBlock");
        kotlin.jvm.internal.o.g(mathBlock, "mathBlock");
        kotlin.jvm.internal.o.g(blockquote, "blockquote");
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(divider, "divider");
        kotlin.jvm.internal.o.g(spacing, "spacing");
        this.f432362a = textSize;
        this.f432363b = rawText;
        this.f432364c = textSegment;
        this.f432365d = boldStyle;
        this.f432366e = heading;
        this.f432367f = list;
        this.f432368g = inlineStyle;
        this.f432369h = codeBlock;
        this.f432370i = mathBlock;
        this.f432371j = blockquote;
        this.f432372k = table;
        this.f432373l = divider;
        this.f432374m = spacing;
    }

    public static v11.e0 a(v11.e0 e0Var, v11.i0 i0Var, v11.j0 j0Var, v11.h0 h0Var, v11.v vVar, v11.z zVar, v11.c0 c0Var, v11.b0 b0Var, v11.w wVar, v11.d0 d0Var, v11.u uVar, v11.g0 g0Var, v11.y yVar, v11.f0 f0Var, int i17, java.lang.Object obj) {
        v11.i0 textSize = (i17 & 1) != 0 ? e0Var.f432362a : i0Var;
        v11.j0 rawText = (i17 & 2) != 0 ? e0Var.f432363b : j0Var;
        v11.h0 textSegment = (i17 & 4) != 0 ? e0Var.f432364c : h0Var;
        v11.v boldStyle = (i17 & 8) != 0 ? e0Var.f432365d : vVar;
        v11.z heading = (i17 & 16) != 0 ? e0Var.f432366e : zVar;
        v11.c0 list = (i17 & 32) != 0 ? e0Var.f432367f : c0Var;
        v11.b0 inlineStyle = (i17 & 64) != 0 ? e0Var.f432368g : b0Var;
        v11.w codeBlock = (i17 & 128) != 0 ? e0Var.f432369h : wVar;
        v11.d0 mathBlock = (i17 & 256) != 0 ? e0Var.f432370i : d0Var;
        v11.u blockquote = (i17 & 512) != 0 ? e0Var.f432371j : uVar;
        v11.g0 table = (i17 & 1024) != 0 ? e0Var.f432372k : g0Var;
        v11.y divider = (i17 & 2048) != 0 ? e0Var.f432373l : yVar;
        v11.f0 spacing = (i17 & 4096) != 0 ? e0Var.f432374m : f0Var;
        e0Var.getClass();
        kotlin.jvm.internal.o.g(textSize, "textSize");
        kotlin.jvm.internal.o.g(rawText, "rawText");
        kotlin.jvm.internal.o.g(textSegment, "textSegment");
        kotlin.jvm.internal.o.g(boldStyle, "boldStyle");
        kotlin.jvm.internal.o.g(heading, "heading");
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(inlineStyle, "inlineStyle");
        kotlin.jvm.internal.o.g(codeBlock, "codeBlock");
        kotlin.jvm.internal.o.g(mathBlock, "mathBlock");
        kotlin.jvm.internal.o.g(blockquote, "blockquote");
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(divider, "divider");
        kotlin.jvm.internal.o.g(spacing, "spacing");
        return new v11.e0(textSize, rawText, textSegment, boldStyle, heading, list, inlineStyle, codeBlock, mathBlock, blockquote, table, divider, spacing);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.e0)) {
            return false;
        }
        v11.e0 e0Var = (v11.e0) obj;
        return kotlin.jvm.internal.o.b(this.f432362a, e0Var.f432362a) && kotlin.jvm.internal.o.b(this.f432363b, e0Var.f432363b) && kotlin.jvm.internal.o.b(this.f432364c, e0Var.f432364c) && kotlin.jvm.internal.o.b(this.f432365d, e0Var.f432365d) && kotlin.jvm.internal.o.b(this.f432366e, e0Var.f432366e) && kotlin.jvm.internal.o.b(this.f432367f, e0Var.f432367f) && kotlin.jvm.internal.o.b(this.f432368g, e0Var.f432368g) && kotlin.jvm.internal.o.b(this.f432369h, e0Var.f432369h) && kotlin.jvm.internal.o.b(this.f432370i, e0Var.f432370i) && kotlin.jvm.internal.o.b(this.f432371j, e0Var.f432371j) && kotlin.jvm.internal.o.b(this.f432372k, e0Var.f432372k) && kotlin.jvm.internal.o.b(this.f432373l, e0Var.f432373l) && kotlin.jvm.internal.o.b(this.f432374m, e0Var.f432374m);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f432362a.hashCode() * 31) + this.f432363b.hashCode()) * 31) + this.f432364c.hashCode()) * 31) + this.f432365d.hashCode()) * 31) + this.f432366e.hashCode()) * 31) + this.f432367f.hashCode()) * 31) + this.f432368g.hashCode()) * 31) + this.f432369h.hashCode()) * 31) + this.f432370i.hashCode()) * 31) + this.f432371j.hashCode()) * 31) + this.f432372k.hashCode()) * 31) + this.f432373l.hashCode()) * 31) + this.f432374m.hashCode();
    }

    public java.lang.String toString() {
        return "NativeMarkdownRenderConfig(textSize=" + this.f432362a + ", rawText=" + this.f432363b + ", textSegment=" + this.f432364c + ", boldStyle=" + this.f432365d + ", heading=" + this.f432366e + ", list=" + this.f432367f + ", inlineStyle=" + this.f432368g + ", codeBlock=" + this.f432369h + ", mathBlock=" + this.f432370i + ", blockquote=" + this.f432371j + ", table=" + this.f432372k + ", divider=" + this.f432373l + ", spacing=" + this.f432374m + ')';
    }
}
