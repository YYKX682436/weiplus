package zv3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f476429a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f476430b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f476431c;

    /* renamed from: d, reason: collision with root package name */
    public final int f476432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f476433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f476434f;

    /* renamed from: g, reason: collision with root package name */
    public final int f476435g;

    /* renamed from: h, reason: collision with root package name */
    public final int f476436h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f476437i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f476438j;

    public d(float[] drawingRect, float[] fArr, java.util.List editorItems, int i17, int i18, int i19, int i27, int i28, boolean z17, java.lang.String blurBgPath) {
        kotlin.jvm.internal.o.g(drawingRect, "drawingRect");
        kotlin.jvm.internal.o.g(editorItems, "editorItems");
        kotlin.jvm.internal.o.g(blurBgPath, "blurBgPath");
        this.f476429a = drawingRect;
        this.f476430b = fArr;
        this.f476431c = editorItems;
        this.f476432d = i17;
        this.f476433e = i18;
        this.f476434f = i19;
        this.f476435g = i27;
        this.f476436h = i28;
        this.f476437i = z17;
        this.f476438j = blurBgPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv3.d)) {
            return false;
        }
        zv3.d dVar = (zv3.d) obj;
        return kotlin.jvm.internal.o.b(this.f476429a, dVar.f476429a) && kotlin.jvm.internal.o.b(this.f476430b, dVar.f476430b) && kotlin.jvm.internal.o.b(this.f476431c, dVar.f476431c) && this.f476432d == dVar.f476432d && this.f476433e == dVar.f476433e && this.f476434f == dVar.f476434f && this.f476435g == dVar.f476435g && this.f476436h == dVar.f476436h && this.f476437i == dVar.f476437i && kotlin.jvm.internal.o.b(this.f476438j, dVar.f476438j);
    }

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.f476429a) * 31;
        float[] fArr = this.f476430b;
        return ((((((((((((((((hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr))) * 31) + this.f476431c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f476432d)) * 31) + java.lang.Integer.hashCode(this.f476433e)) * 31) + java.lang.Integer.hashCode(this.f476434f)) * 31) + java.lang.Integer.hashCode(this.f476435g)) * 31) + java.lang.Integer.hashCode(this.f476436h)) * 31) + java.lang.Boolean.hashCode(this.f476437i)) * 31) + this.f476438j.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RetrieverData(drawingRect=");
        java.lang.String arrays = java.util.Arrays.toString(this.f476429a);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", validRect=");
        float[] fArr = this.f476430b;
        if (fArr != null) {
            str = java.util.Arrays.toString(fArr);
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", editorItems=");
        sb6.append(this.f476431c);
        sb6.append(", width=");
        sb6.append(this.f476432d);
        sb6.append(", height=");
        sb6.append(this.f476433e);
        sb6.append(", videoWidth=");
        sb6.append(this.f476434f);
        sb6.append(", videoHeight=");
        sb6.append(this.f476435g);
        sb6.append(", rotate=");
        sb6.append(this.f476436h);
        sb6.append(", isForMix=");
        sb6.append(this.f476437i);
        sb6.append(", blurBgPath='");
        sb6.append(this.f476438j);
        sb6.append("')");
        return sb6.toString();
    }

    public /* synthetic */ d(float[] fArr, float[] fArr2, java.util.List list, int i17, int i18, int i19, int i27, int i28, boolean z17, java.lang.String str, int i29, kotlin.jvm.internal.i iVar) {
        this(fArr, (i29 & 2) != 0 ? null : fArr2, list, i17, i18, i19, i27, i28, (i29 & 256) != 0 ? false : z17, (i29 & 512) != 0 ? "" : str);
    }
}
