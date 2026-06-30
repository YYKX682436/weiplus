package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f203094a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f203095b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f203096c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f203097d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f203098e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f203099f;

    /* renamed from: g, reason: collision with root package name */
    public final float f203100g;

    /* renamed from: h, reason: collision with root package name */
    public final float f203101h;

    public t2(long j17, android.graphics.Bitmap bitmap, jz5.l startWH, android.graphics.Matrix startMatrix, jz5.l endWH, android.graphics.Matrix endMatrix, float f17, float f18) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(startWH, "startWH");
        kotlin.jvm.internal.o.g(startMatrix, "startMatrix");
        kotlin.jvm.internal.o.g(endWH, "endWH");
        kotlin.jvm.internal.o.g(endMatrix, "endMatrix");
        this.f203094a = j17;
        this.f203095b = bitmap;
        this.f203096c = startWH;
        this.f203097d = startMatrix;
        this.f203098e = endWH;
        this.f203099f = endMatrix;
        this.f203100g = f17;
        this.f203101h = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.t2)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.t2 t2Var = (com.tencent.mm.ui.chatting.view.t2) obj;
        return this.f203094a == t2Var.f203094a && kotlin.jvm.internal.o.b(this.f203095b, t2Var.f203095b) && kotlin.jvm.internal.o.b(this.f203096c, t2Var.f203096c) && kotlin.jvm.internal.o.b(this.f203097d, t2Var.f203097d) && kotlin.jvm.internal.o.b(this.f203098e, t2Var.f203098e) && kotlin.jvm.internal.o.b(this.f203099f, t2Var.f203099f) && java.lang.Float.compare(this.f203100g, t2Var.f203100g) == 0 && java.lang.Float.compare(this.f203101h, t2Var.f203101h) == 0;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.f203094a) * 31) + this.f203095b.hashCode()) * 31) + this.f203096c.hashCode()) * 31) + this.f203097d.hashCode()) * 31) + this.f203098e.hashCode()) * 31) + this.f203099f.hashCode()) * 31) + java.lang.Float.hashCode(this.f203100g)) * 31) + java.lang.Float.hashCode(this.f203101h);
    }

    public java.lang.String toString() {
        return "Element(order=" + this.f203094a + ", bitmap=" + this.f203095b + ", startWH=" + this.f203096c + ", startMatrix=" + this.f203097d + ", endWH=" + this.f203098e + ", endMatrix=" + this.f203099f + ", startCornerRadiusPx=" + this.f203100g + ", endCornerRadiusPx=" + this.f203101h + ')';
    }
}
