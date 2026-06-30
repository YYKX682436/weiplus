package j1;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f297090a;

    /* renamed from: b, reason: collision with root package name */
    public int f297091b;

    public a(org.xmlpull.v1.XmlPullParser xmlParser, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(xmlParser, "xmlParser");
        this.f297090a = xmlParser;
        this.f297091b = i17;
    }

    public final d3.d a(android.content.res.TypedArray typedArray, android.content.res.Resources.Theme theme, java.lang.String attrName, int i17, int i18) {
        kotlin.jvm.internal.o.g(typedArray, "typedArray");
        kotlin.jvm.internal.o.g(attrName, "attrName");
        d3.d c17 = d3.r.c(typedArray, this.f297090a, theme, attrName, i17, i18);
        f(typedArray.getChangingConfigurations());
        return c17;
    }

    public final float b(android.content.res.TypedArray typedArray, java.lang.String attrName, int i17, float f17) {
        kotlin.jvm.internal.o.g(typedArray, "typedArray");
        kotlin.jvm.internal.o.g(attrName, "attrName");
        float d17 = d3.r.d(typedArray, this.f297090a, attrName, i17, f17);
        f(typedArray.getChangingConfigurations());
        return d17;
    }

    public final int c(android.content.res.TypedArray typedArray, java.lang.String attrName, int i17, int i18) {
        kotlin.jvm.internal.o.g(typedArray, "typedArray");
        kotlin.jvm.internal.o.g(attrName, "attrName");
        int e17 = d3.r.e(typedArray, this.f297090a, attrName, i17, i18);
        f(typedArray.getChangingConfigurations());
        return e17;
    }

    public final java.lang.String d(android.content.res.TypedArray typedArray, int i17) {
        kotlin.jvm.internal.o.g(typedArray, "typedArray");
        java.lang.String string = typedArray.getString(i17);
        f(typedArray.getChangingConfigurations());
        return string;
    }

    public final android.content.res.TypedArray e(android.content.res.Resources res, android.content.res.Resources.Theme theme, android.util.AttributeSet set, int[] attrs) {
        kotlin.jvm.internal.o.g(res, "res");
        kotlin.jvm.internal.o.g(set, "set");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.content.res.TypedArray j17 = d3.r.j(res, theme, set, attrs);
        kotlin.jvm.internal.o.f(j17, "obtainAttributes(\n      …          attrs\n        )");
        f(j17.getChangingConfigurations());
        return j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1.a)) {
            return false;
        }
        j1.a aVar = (j1.a) obj;
        return kotlin.jvm.internal.o.b(this.f297090a, aVar.f297090a) && this.f297091b == aVar.f297091b;
    }

    public final void f(int i17) {
        this.f297091b = i17 | this.f297091b;
    }

    public int hashCode() {
        return (this.f297090a.hashCode() * 31) + java.lang.Integer.hashCode(this.f297091b);
    }

    public java.lang.String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f297090a + ", config=" + this.f297091b + ')';
    }
}
