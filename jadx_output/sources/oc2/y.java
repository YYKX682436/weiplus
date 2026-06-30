package oc2;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final r45.cp5 f344311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344312b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344313c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f344314d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f344316f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f344317g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f344318h;

    /* renamed from: i, reason: collision with root package name */
    public oc2.a f344319i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f344320j;

    public y(r45.cp5 renderNode, int i17) {
        kotlin.jvm.internal.o.g(renderNode, "renderNode");
        this.f344311a = renderNode;
        this.f344312b = i17;
        this.f344314d = "";
        this.f344316f = "";
        this.f344318h = "";
        this.f344320j = jz5.h.b(oc2.x.f344295d);
    }

    public final float[] a(java.lang.CharSequence content) {
        kotlin.jvm.internal.o.g(content, "content");
        if (b().containsKey(content)) {
            return (float[]) b().get(content);
        }
        d(content, 0.0f);
        return (float[]) b().get(content);
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) ((jz5.n) this.f344320j).getValue();
    }

    public final void c(oc2.w renderNodeType) {
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            this.f344313c = false;
            this.f344314d = "";
        } else if (ordinal == 1) {
            this.f344315e = false;
            this.f344316f = "";
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f344317g = false;
            this.f344318h = "";
        }
    }

    public final void d(java.lang.CharSequence charSequence, float f17) {
        float[] fArr;
        if ((charSequence == null || charSequence.length() == 0) || b().containsKey(charSequence)) {
            return;
        }
        float floatValue = (f17 > 0.0f ? java.lang.Float.valueOf(f17) : java.lang.Integer.valueOf(oc2.v.n(oc2.v.f344282a, this.f344311a, null, 0.0f, 3, null))).floatValue();
        if (charSequence == null || charSequence.length() == 0) {
            fArr = new float[0];
        } else {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(floatValue);
            fArr = new float[charSequence.length()];
            textPaint.getTextWidths(charSequence, 0, charSequence.length(), fArr);
        }
        b().put(charSequence, fArr);
    }

    public final void e(oc2.w renderNodeType, java.lang.String clientThumbnail) {
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        kotlin.jvm.internal.o.g(clientThumbnail, "clientThumbnail");
        this.f344313c = false;
        this.f344314d = "";
        this.f344315e = false;
        this.f344316f = "";
        this.f344317g = false;
        this.f344318h = "";
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            this.f344313c = true;
            this.f344314d = clientThumbnail;
        } else if (ordinal == 1) {
            this.f344315e = true;
            this.f344316f = clientThumbnail;
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f344317g = true;
            this.f344318h = clientThumbnail;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.y)) {
            return false;
        }
        oc2.y yVar = (oc2.y) obj;
        return kotlin.jvm.internal.o.b(this.f344311a, yVar.f344311a) && this.f344312b == yVar.f344312b;
    }

    public int hashCode() {
        return (this.f344311a.hashCode() * 31) + java.lang.Integer.hashCode(this.f344312b);
    }

    public java.lang.String toString() {
        java.lang.String str;
        r45.x80 x80Var;
        r45.x80 x80Var2;
        r45.qy3 qy3Var;
        r45.x80 x80Var3;
        r45.qy3 qy3Var2;
        r45.x80 x80Var4;
        r45.qy3 qy3Var3;
        r45.x80 x80Var5;
        r45.x80 x80Var6;
        r45.x80 x80Var7;
        r45.cp5 cp5Var = this.f344311a;
        r45.ap5 ap5Var = cp5Var.f371769e;
        r45.xy3 xy3Var = null;
        java.lang.String str2 = (ap5Var == null || (x80Var7 = ap5Var.f370178f) == null) ? null : x80Var7.f389853d;
        if (str2 == null || str2.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("origin=");
            r45.ap5 ap5Var2 = cp5Var.f371769e;
            sb6.append((ap5Var2 == null || (x80Var6 = ap5Var2.f370176d) == null) ? null : x80Var6.f389853d);
            sb6.append("/thumb=");
            r45.ap5 ap5Var3 = cp5Var.f371769e;
            sb6.append((ap5Var3 == null || (x80Var5 = ap5Var3.f370177e) == null) ? null : x80Var5.f389853d);
            str = sb6.toString();
        } else {
            r45.ap5 ap5Var4 = cp5Var.f371769e;
            str = (ap5Var4 == null || (x80Var = ap5Var4.f370178f) == null) ? null : x80Var.f389853d;
        }
        r45.ap5 ap5Var5 = cp5Var.f371769e;
        if (((ap5Var5 == null || (x80Var4 = ap5Var5.f370178f) == null || (qy3Var3 = x80Var4.f389854e) == null) ? null : qy3Var3.f384352e) != null) {
            if (ap5Var5 != null && (x80Var3 = ap5Var5.f370178f) != null && (qy3Var2 = x80Var3.f389854e) != null) {
                xy3Var = qy3Var2.f384352e;
            }
        } else if (ap5Var5 != null && (x80Var2 = ap5Var5.f370176d) != null && (qy3Var = x80Var2.f389854e) != null) {
            xy3Var = qy3Var.f384352e;
        }
        return "[index=" + this.f344312b + ";renderNode=" + cp5Var.f371768d + ',' + str + ',' + xy3Var + ",capsuleMarginInfo=" + this.f344319i + ']';
    }
}
