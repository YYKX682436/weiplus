package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f204790a;

    /* renamed from: b, reason: collision with root package name */
    public final float f204791b;

    /* renamed from: c, reason: collision with root package name */
    public final float f204792c;

    /* renamed from: d, reason: collision with root package name */
    public final float f204793d;

    /* renamed from: e, reason: collision with root package name */
    public final float f204794e;

    /* renamed from: f, reason: collision with root package name */
    public final float f204795f;

    /* renamed from: g, reason: collision with root package name */
    public final float f204796g;

    /* renamed from: h, reason: collision with root package name */
    public final float f204797h;

    public h(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f204790a = f17;
        this.f204791b = f18;
        this.f204792c = f19;
        this.f204793d = f27;
        this.f204794e = f28;
        this.f204795f = f29;
        this.f204796g = f37;
        this.f204797h = f38;
    }

    public static com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h a(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h hVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, int i17, java.lang.Object obj) {
        float f39 = (i17 & 1) != 0 ? hVar.f204790a : f17;
        float f47 = (i17 & 2) != 0 ? hVar.f204791b : f18;
        float f48 = (i17 & 4) != 0 ? hVar.f204792c : f19;
        float f49 = (i17 & 8) != 0 ? hVar.f204793d : f27;
        float f57 = (i17 & 16) != 0 ? hVar.f204794e : f28;
        float f58 = (i17 & 32) != 0 ? hVar.f204795f : f29;
        float f59 = (i17 & 64) != 0 ? hVar.f204796g : f37;
        float f66 = (i17 & 128) != 0 ? hVar.f204797h : f38;
        hVar.getClass();
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h(f39, f47, f48, f49, f57, f58, f59, f66);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h hVar = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h) obj;
        return java.lang.Float.compare(this.f204790a, hVar.f204790a) == 0 && java.lang.Float.compare(this.f204791b, hVar.f204791b) == 0 && java.lang.Float.compare(this.f204792c, hVar.f204792c) == 0 && java.lang.Float.compare(this.f204793d, hVar.f204793d) == 0 && java.lang.Float.compare(this.f204794e, hVar.f204794e) == 0 && java.lang.Float.compare(this.f204795f, hVar.f204795f) == 0 && java.lang.Float.compare(this.f204796g, hVar.f204796g) == 0 && java.lang.Float.compare(this.f204797h, hVar.f204797h) == 0;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Float.hashCode(this.f204790a) * 31) + java.lang.Float.hashCode(this.f204791b)) * 31) + java.lang.Float.hashCode(this.f204792c)) * 31) + java.lang.Float.hashCode(this.f204793d)) * 31) + java.lang.Float.hashCode(this.f204794e)) * 31) + java.lang.Float.hashCode(this.f204795f)) * 31) + java.lang.Float.hashCode(this.f204796g)) * 31) + java.lang.Float.hashCode(this.f204797h);
    }

    public java.lang.String toString() {
        return "ItemParams(alpha = " + this.f204790a + ", scale = " + this.f204791b + ", rotation = " + this.f204792c + ", rotationY = " + this.f204793d + ", translationX = " + this.f204794e + ", translationY = " + this.f204795f + ", translationZ = " + this.f204796g + ", maskAlpha = " + this.f204797h + ')';
    }
}
