package h10;

/* loaded from: classes15.dex */
public final class g {
    public static final h10.f L = new h10.f(null);
    public final h10.o A;
    public final float[] B;
    public final int[] C;
    public final int[] D;
    public final int[] E;
    public final float F;
    public final float G;
    public final int H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final h10.i f278003J;
    public final java.util.List K;

    /* renamed from: a, reason: collision with root package name */
    public final int f278004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f278005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f278006c;

    /* renamed from: d, reason: collision with root package name */
    public final int f278007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f278008e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278009f;

    /* renamed from: g, reason: collision with root package name */
    public final int f278010g;

    /* renamed from: h, reason: collision with root package name */
    public final int f278011h;

    /* renamed from: i, reason: collision with root package name */
    public final int f278012i;

    /* renamed from: j, reason: collision with root package name */
    public final int f278013j;

    /* renamed from: k, reason: collision with root package name */
    public final float f278014k;

    /* renamed from: l, reason: collision with root package name */
    public final float f278015l;

    /* renamed from: m, reason: collision with root package name */
    public final float f278016m;

    /* renamed from: n, reason: collision with root package name */
    public final h10.e f278017n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f278018o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f278019p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f278020q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f278021r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f278022s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f278023t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f278024u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f278025v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f278026w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f278027x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f278028y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f278029z;

    public g(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, float f17, float f18, float f19, h10.e rect, java.lang.String identifier, java.lang.String label, java.util.List labelAttributes, java.lang.String hint, java.util.List hintAttributes, java.lang.String value, java.util.List valueAttributes, java.lang.String increasedValue, java.util.List increasedValueAttributes, java.lang.String decreasedValue, java.util.List decreasedValueAttributes, java.lang.String str, h10.o oVar, float[] transform, int[] childrenInTraversalOrder, int[] childrenInHitTestOrder, int[] additionalActions, float f27, float f28, int i48, java.lang.String str2, h10.i role, java.util.List list) {
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(identifier, "identifier");
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(labelAttributes, "labelAttributes");
        kotlin.jvm.internal.o.g(hint, "hint");
        kotlin.jvm.internal.o.g(hintAttributes, "hintAttributes");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(valueAttributes, "valueAttributes");
        kotlin.jvm.internal.o.g(increasedValue, "increasedValue");
        kotlin.jvm.internal.o.g(increasedValueAttributes, "increasedValueAttributes");
        kotlin.jvm.internal.o.g(decreasedValue, "decreasedValue");
        kotlin.jvm.internal.o.g(decreasedValueAttributes, "decreasedValueAttributes");
        kotlin.jvm.internal.o.g(transform, "transform");
        kotlin.jvm.internal.o.g(childrenInTraversalOrder, "childrenInTraversalOrder");
        kotlin.jvm.internal.o.g(childrenInHitTestOrder, "childrenInHitTestOrder");
        kotlin.jvm.internal.o.g(additionalActions, "additionalActions");
        kotlin.jvm.internal.o.g(role, "role");
        this.f278004a = i17;
        this.f278005b = i18;
        this.f278006c = i19;
        this.f278007d = i27;
        this.f278008e = i28;
        this.f278009f = i29;
        this.f278010g = i37;
        this.f278011h = i38;
        this.f278012i = i39;
        this.f278013j = i47;
        this.f278014k = f17;
        this.f278015l = f18;
        this.f278016m = f19;
        this.f278017n = rect;
        this.f278018o = identifier;
        this.f278019p = label;
        this.f278020q = labelAttributes;
        this.f278021r = hint;
        this.f278022s = hintAttributes;
        this.f278023t = value;
        this.f278024u = valueAttributes;
        this.f278025v = increasedValue;
        this.f278026w = increasedValueAttributes;
        this.f278027x = decreasedValue;
        this.f278028y = decreasedValueAttributes;
        this.f278029z = str;
        this.A = oVar;
        this.B = transform;
        this.C = childrenInTraversalOrder;
        this.D = childrenInHitTestOrder;
        this.E = additionalActions;
        this.F = f27;
        this.G = f28;
        this.H = i48;
        this.I = str2;
        this.f278003J = role;
        this.K = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10.g)) {
            return false;
        }
        h10.g gVar = (h10.g) obj;
        return this.f278004a == gVar.f278004a && this.f278005b == gVar.f278005b && this.f278006c == gVar.f278006c && this.f278007d == gVar.f278007d && this.f278008e == gVar.f278008e && this.f278009f == gVar.f278009f && this.f278010g == gVar.f278010g && this.f278011h == gVar.f278011h && this.f278012i == gVar.f278012i && this.f278013j == gVar.f278013j && java.lang.Float.compare(this.f278014k, gVar.f278014k) == 0 && java.lang.Float.compare(this.f278015l, gVar.f278015l) == 0 && java.lang.Float.compare(this.f278016m, gVar.f278016m) == 0 && kotlin.jvm.internal.o.b(this.f278017n, gVar.f278017n) && kotlin.jvm.internal.o.b(this.f278018o, gVar.f278018o) && kotlin.jvm.internal.o.b(this.f278019p, gVar.f278019p) && kotlin.jvm.internal.o.b(this.f278020q, gVar.f278020q) && kotlin.jvm.internal.o.b(this.f278021r, gVar.f278021r) && kotlin.jvm.internal.o.b(this.f278022s, gVar.f278022s) && kotlin.jvm.internal.o.b(this.f278023t, gVar.f278023t) && kotlin.jvm.internal.o.b(this.f278024u, gVar.f278024u) && kotlin.jvm.internal.o.b(this.f278025v, gVar.f278025v) && kotlin.jvm.internal.o.b(this.f278026w, gVar.f278026w) && kotlin.jvm.internal.o.b(this.f278027x, gVar.f278027x) && kotlin.jvm.internal.o.b(this.f278028y, gVar.f278028y) && kotlin.jvm.internal.o.b(this.f278029z, gVar.f278029z) && this.A == gVar.A && kotlin.jvm.internal.o.b(this.B, gVar.B) && kotlin.jvm.internal.o.b(this.C, gVar.C) && kotlin.jvm.internal.o.b(this.D, gVar.D) && kotlin.jvm.internal.o.b(this.E, gVar.E) && java.lang.Float.compare(this.F, gVar.F) == 0 && java.lang.Float.compare(this.G, gVar.G) == 0 && this.H == gVar.H && kotlin.jvm.internal.o.b(this.I, gVar.I) && this.f278003J == gVar.f278003J && kotlin.jvm.internal.o.b(this.K, gVar.K);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f278004a) * 31) + java.lang.Integer.hashCode(this.f278005b)) * 31) + java.lang.Integer.hashCode(this.f278006c)) * 31) + java.lang.Integer.hashCode(this.f278007d)) * 31) + java.lang.Integer.hashCode(this.f278008e)) * 31) + java.lang.Integer.hashCode(this.f278009f)) * 31) + java.lang.Integer.hashCode(this.f278010g)) * 31) + java.lang.Integer.hashCode(this.f278011h)) * 31) + java.lang.Integer.hashCode(this.f278012i)) * 31) + java.lang.Integer.hashCode(this.f278013j)) * 31) + java.lang.Float.hashCode(this.f278014k)) * 31) + java.lang.Float.hashCode(this.f278015l)) * 31) + java.lang.Float.hashCode(this.f278016m)) * 31) + this.f278017n.hashCode()) * 31) + this.f278018o.hashCode()) * 31) + this.f278019p.hashCode()) * 31) + this.f278020q.hashCode()) * 31) + this.f278021r.hashCode()) * 31) + this.f278022s.hashCode()) * 31) + this.f278023t.hashCode()) * 31) + this.f278024u.hashCode()) * 31) + this.f278025v.hashCode()) * 31) + this.f278026w.hashCode()) * 31) + this.f278027x.hashCode()) * 31) + this.f278028y.hashCode()) * 31;
        java.lang.String str = this.f278029z;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        h10.o oVar = this.A;
        int hashCode3 = (((((((((((((((hashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31) + java.util.Arrays.hashCode(this.B)) * 31) + java.util.Arrays.hashCode(this.C)) * 31) + java.util.Arrays.hashCode(this.D)) * 31) + java.util.Arrays.hashCode(this.E)) * 31) + java.lang.Float.hashCode(this.F)) * 31) + java.lang.Float.hashCode(this.G)) * 31) + java.lang.Integer.hashCode(this.H)) * 31;
        java.lang.String str2 = this.I;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f278003J.hashCode()) * 31;
        java.util.List list = this.K;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SemanticsNodeUpdate(id=" + this.f278004a + ", flags=" + this.f278005b + ", actions=" + this.f278006c + ", maxValueLength=" + this.f278007d + ", currentValueLength=" + this.f278008e + ", textSelectionBase=" + this.f278009f + ", textSelectionExtent=" + this.f278010g + ", platformViewId=" + this.f278011h + ", scrollChildren=" + this.f278012i + ", scrollIndex=" + this.f278013j + ", scrollPosition=" + this.f278014k + ", scrollExtentMax=" + this.f278015l + ", scrollExtentMin=" + this.f278016m + ", rect=" + this.f278017n + ", identifier=" + this.f278018o + ", label=" + this.f278019p + ", labelAttributes=" + this.f278020q + ", hint=" + this.f278021r + ", hintAttributes=" + this.f278022s + ", value=" + this.f278023t + ", valueAttributes=" + this.f278024u + ", increasedValue=" + this.f278025v + ", increasedValueAttributes=" + this.f278026w + ", decreasedValue=" + this.f278027x + ", decreasedValueAttributes=" + this.f278028y + ", tooltip=" + this.f278029z + ", textDirection=" + this.A + ", transform=" + java.util.Arrays.toString(this.B) + ", childrenInTraversalOrder=" + java.util.Arrays.toString(this.C) + ", childrenInHitTestOrder=" + java.util.Arrays.toString(this.D) + ", additionalActions=" + java.util.Arrays.toString(this.E) + ", elevation=" + this.F + ", thickness=" + this.G + ", headingLevel=" + this.H + ", linkUrl=" + this.I + ", role=" + this.f278003J + ", controlsNodes=" + this.K + ')';
    }
}
