package sw0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413414a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f413415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f413416c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f413417d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f413418e;

    public b(java.lang.String text, java.lang.String materialID, java.lang.String colorID, java.lang.String fontName, java.lang.String str) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(colorID, "colorID");
        kotlin.jvm.internal.o.g(fontName, "fontName");
        this.f413414a = text;
        this.f413415b = materialID;
        this.f413416c = colorID;
        this.f413417d = fontName;
        this.f413418e = str;
    }

    public static sw0.b a(sw0.b bVar, java.lang.String text, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            text = bVar.f413414a;
        }
        if ((i17 & 2) != 0) {
            str = bVar.f413415b;
        }
        java.lang.String materialID = str;
        if ((i17 & 4) != 0) {
            str2 = bVar.f413416c;
        }
        java.lang.String colorID = str2;
        if ((i17 & 8) != 0) {
            str3 = bVar.f413417d;
        }
        java.lang.String fontName = str3;
        if ((i17 & 16) != 0) {
            str4 = bVar.f413418e;
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(colorID, "colorID");
        kotlin.jvm.internal.o.g(fontName, "fontName");
        return new sw0.b(text, materialID, colorID, fontName, str4);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.b)) {
            return false;
        }
        sw0.b bVar = (sw0.b) obj;
        return kotlin.jvm.internal.o.b(this.f413414a, bVar.f413414a) && kotlin.jvm.internal.o.b(this.f413415b, bVar.f413415b) && kotlin.jvm.internal.o.b(this.f413416c, bVar.f413416c) && kotlin.jvm.internal.o.b(this.f413417d, bVar.f413417d) && kotlin.jvm.internal.o.b(this.f413418e, bVar.f413418e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f413414a.hashCode() * 31) + this.f413415b.hashCode()) * 31) + this.f413416c.hashCode()) * 31) + this.f413417d.hashCode()) * 31;
        java.lang.String str = this.f413418e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "TextData(text=" + this.f413414a + ", materialID=" + this.f413415b + ", colorID=" + this.f413416c + ", fontName=" + this.f413417d + ", animID=" + this.f413418e + ')';
    }
}
