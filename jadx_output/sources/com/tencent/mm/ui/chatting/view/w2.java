package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f203140a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix f203141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f203142c;

    /* renamed from: d, reason: collision with root package name */
    public final int f203143d;

    /* renamed from: e, reason: collision with root package name */
    public final float f203144e;

    /* renamed from: f, reason: collision with root package name */
    public final float f203145f;

    public w2(android.graphics.Bitmap bitmap, android.graphics.Matrix startMatrix, int i17, int i18, float f17, float f18) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(startMatrix, "startMatrix");
        this.f203140a = bitmap;
        this.f203141b = startMatrix;
        this.f203142c = i17;
        this.f203143d = i18;
        this.f203144e = f17;
        this.f203145f = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.w2)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.w2 w2Var = (com.tencent.mm.ui.chatting.view.w2) obj;
        return kotlin.jvm.internal.o.b(this.f203140a, w2Var.f203140a) && kotlin.jvm.internal.o.b(this.f203141b, w2Var.f203141b) && this.f203142c == w2Var.f203142c && this.f203143d == w2Var.f203143d && java.lang.Float.compare(this.f203144e, w2Var.f203144e) == 0 && java.lang.Float.compare(this.f203145f, w2Var.f203145f) == 0;
    }

    public int hashCode() {
        return (((((((((this.f203140a.hashCode() * 31) + this.f203141b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f203142c)) * 31) + java.lang.Integer.hashCode(this.f203143d)) * 31) + java.lang.Float.hashCode(this.f203144e)) * 31) + java.lang.Float.hashCode(this.f203145f);
    }

    public java.lang.String toString() {
        return "Snapshot(bitmap=" + this.f203140a + ", startMatrix=" + this.f203141b + ", width=" + this.f203142c + ", height=" + this.f203143d + ", z=" + this.f203144e + ", cornerRadiusPx=" + this.f203145f + ')';
    }
}
