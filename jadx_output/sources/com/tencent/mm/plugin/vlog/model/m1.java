package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f175673a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f175674b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175675c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.i07 f175676d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f175677e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f175678f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f175679g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f175680h;

    public m1(long j17, java.util.List materials, java.lang.String netMusicPath, r45.i07 xEffectConfig, java.util.ArrayList editItems, java.util.ArrayList editData, float[] drawingRect, float[] fArr, int i17, kotlin.jvm.internal.i iVar) {
        editItems = (i17 & 16) != 0 ? new java.util.ArrayList() : editItems;
        editData = (i17 & 32) != 0 ? new java.util.ArrayList() : editData;
        drawingRect = (i17 & 64) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : drawingRect;
        fArr = (i17 & 128) != 0 ? null : fArr;
        kotlin.jvm.internal.o.g(materials, "materials");
        kotlin.jvm.internal.o.g(netMusicPath, "netMusicPath");
        kotlin.jvm.internal.o.g(xEffectConfig, "xEffectConfig");
        kotlin.jvm.internal.o.g(editItems, "editItems");
        kotlin.jvm.internal.o.g(editData, "editData");
        kotlin.jvm.internal.o.g(drawingRect, "drawingRect");
        this.f175673a = j17;
        this.f175674b = materials;
        this.f175675c = netMusicPath;
        this.f175676d = xEffectConfig;
        this.f175677e = editItems;
        this.f175678f = editData;
        this.f175679g = drawingRect;
        this.f175680h = fArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.m1)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.m1 m1Var = (com.tencent.mm.plugin.vlog.model.m1) obj;
        return this.f175673a == m1Var.f175673a && kotlin.jvm.internal.o.b(this.f175674b, m1Var.f175674b) && kotlin.jvm.internal.o.b(this.f175675c, m1Var.f175675c) && kotlin.jvm.internal.o.b(this.f175676d, m1Var.f175676d) && kotlin.jvm.internal.o.b(this.f175677e, m1Var.f175677e) && kotlin.jvm.internal.o.b(this.f175678f, m1Var.f175678f) && kotlin.jvm.internal.o.b(this.f175679g, m1Var.f175679g) && kotlin.jvm.internal.o.b(this.f175680h, m1Var.f175680h);
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f175673a) * 31) + this.f175674b.hashCode()) * 31) + this.f175675c.hashCode()) * 31) + this.f175676d.hashCode()) * 31) + this.f175677e.hashCode()) * 31) + this.f175678f.hashCode()) * 31) + java.util.Arrays.hashCode(this.f175679g)) * 31;
        float[] fArr = this.f175680h;
        return hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr));
    }

    public java.lang.String toString() {
        return "VLogScriptModel(respId=" + this.f175673a + ", materials=" + this.f175674b + ", netMusicPath='" + this.f175675c + "', xEffectConfig=" + this.f175676d + ", editItems=" + this.f175677e + ", editData=" + this.f175678f + ", drawingRect=" + java.util.Arrays.toString(this.f175679g) + ')';
    }
}
