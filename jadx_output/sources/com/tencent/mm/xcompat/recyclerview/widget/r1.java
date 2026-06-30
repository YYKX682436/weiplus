package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public int f214624a;

    /* renamed from: b, reason: collision with root package name */
    public int f214625b;

    /* renamed from: d, reason: collision with root package name */
    public int f214627d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214629f = false;

    /* renamed from: c, reason: collision with root package name */
    public int f214626c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Interpolator f214628e = null;

    public r1(int i17, int i18) {
        this.f214624a = i17;
        this.f214625b = i18;
    }

    public void a(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        int i17 = this.f214627d;
        if (i17 >= 0) {
            this.f214627d = -1;
            recyclerView.M(i17);
            this.f214629f = false;
        } else if (this.f214629f) {
            android.view.animation.Interpolator interpolator = this.f214628e;
            if (interpolator != null && this.f214626c < 1) {
                throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i18 = this.f214626c;
            if (i18 < 1) {
                throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.C1.c(this.f214624a, this.f214625b, i18, interpolator);
            this.f214629f = false;
        }
    }
}
