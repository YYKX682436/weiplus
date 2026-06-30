package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f175656a;

    /* renamed from: b, reason: collision with root package name */
    public int f175657b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f175658c;

    /* renamed from: d, reason: collision with root package name */
    public int f175659d;

    /* renamed from: e, reason: collision with root package name */
    public int f175660e;

    /* renamed from: f, reason: collision with root package name */
    public int f175661f;

    /* renamed from: g, reason: collision with root package name */
    public int f175662g;

    /* renamed from: h, reason: collision with root package name */
    public int f175663h;

    /* renamed from: i, reason: collision with root package name */
    public int f175664i;

    /* renamed from: j, reason: collision with root package name */
    public int f175665j;

    /* renamed from: k, reason: collision with root package name */
    public int f175666k;

    public l1(int i17, int i18, java.lang.String outputPath, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, kotlin.jvm.internal.i iVar) {
        i17 = (i48 & 1) != 0 ? 0 : i17;
        i18 = (i48 & 2) != 0 ? 0 : i18;
        outputPath = (i48 & 4) != 0 ? "" : outputPath;
        i19 = (i48 & 8) != 0 ? 0 : i19;
        i27 = (i48 & 16) != 0 ? 0 : i27;
        i28 = (i48 & 32) != 0 ? 0 : i28;
        i29 = (i48 & 64) != 0 ? 0 : i29;
        i37 = (i48 & 128) != 0 ? 0 : i37;
        i38 = (i48 & 256) != 0 ? 0 : i38;
        i39 = (i48 & 512) != 0 ? 0 : i39;
        i47 = (i48 & 1024) != 0 ? 1 : i47;
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f175656a = i17;
        this.f175657b = i18;
        this.f175658c = outputPath;
        this.f175659d = i19;
        this.f175660e = i27;
        this.f175661f = i28;
        this.f175662g = i29;
        this.f175663h = i37;
        this.f175664i = i38;
        this.f175665j = i39;
        this.f175666k = i47;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.l1)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.l1 l1Var = (com.tencent.mm.plugin.vlog.model.l1) obj;
        return this.f175656a == l1Var.f175656a && this.f175657b == l1Var.f175657b && kotlin.jvm.internal.o.b(this.f175658c, l1Var.f175658c) && this.f175659d == l1Var.f175659d && this.f175660e == l1Var.f175660e && this.f175661f == l1Var.f175661f && this.f175662g == l1Var.f175662g && this.f175663h == l1Var.f175663h && this.f175664i == l1Var.f175664i && this.f175665j == l1Var.f175665j && this.f175666k == l1Var.f175666k;
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f175656a) * 31) + java.lang.Integer.hashCode(this.f175657b)) * 31) + this.f175658c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f175659d)) * 31) + java.lang.Integer.hashCode(this.f175660e)) * 31) + java.lang.Integer.hashCode(this.f175661f)) * 31) + java.lang.Integer.hashCode(this.f175662g)) * 31) + java.lang.Integer.hashCode(this.f175663h)) * 31) + java.lang.Integer.hashCode(this.f175664i)) * 31) + java.lang.Integer.hashCode(this.f175665j)) * 31) + java.lang.Integer.hashCode(this.f175666k);
    }

    public java.lang.String toString() {
        return "VLogGenerateModel(outputDurationMs=" + this.f175656a + ", outputAudioType=" + this.f175657b + ", outputPath=" + this.f175658c + ", targetWidth=" + this.f175659d + ", targetHeight=" + this.f175660e + ", videoBitrate=" + this.f175661f + ", audioBitrate=" + this.f175662g + ", frameRate=" + this.f175663h + ", videoRotate=" + this.f175664i + ", audioSampleRate=" + this.f175665j + ", audioChannelCount=" + this.f175666k + ')';
    }
}
