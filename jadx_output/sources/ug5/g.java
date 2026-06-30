package ug5;

/* loaded from: classes3.dex */
public final class g {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final ug5.b f427587a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Window f427588b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Window f427589c;

    /* renamed from: d, reason: collision with root package name */
    public ug5.i f427590d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f427591e;

    /* renamed from: f, reason: collision with root package name */
    public ug5.h f427592f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f427593g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f427594h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f427595i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f427596j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f427597k;

    /* renamed from: l, reason: collision with root package name */
    public final float f427598l;

    /* renamed from: m, reason: collision with root package name */
    public final float f427599m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f427600n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f427601o;

    /* renamed from: p, reason: collision with root package name */
    public long f427602p;

    /* renamed from: q, reason: collision with root package name */
    public long f427603q;

    /* renamed from: r, reason: collision with root package name */
    public long f427604r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.TimeInterpolator f427605s;

    /* renamed from: t, reason: collision with root package name */
    public int f427606t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Class f427607u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f427608v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f427609w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f427610x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f427611y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f427612z;

    public g(ug5.b action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f427587a = action;
        this.f427595i = new java.util.HashMap();
        this.f427596j = new android.graphics.Rect();
        this.f427597k = new android.graphics.Rect();
        this.f427598l = 1.0f;
        this.f427599m = 1.0f;
        int i17 = s26.a.f402368f;
        s26.d dVar = s26.d.f402371f;
        this.f427602p = s26.a.g(s26.c.e(200, dVar), dVar);
        this.f427605s = new android.view.animation.DecelerateInterpolator(2.0f);
        this.f427606t = -16777216;
        this.f427609w = action == ug5.b.f427582e;
        this.f427611y = true;
        this.f427612z = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug5.g) && this.f427587a == ((ug5.g) obj).f427587a;
    }

    public int hashCode() {
        return this.f427587a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fromRect=");
        sb6.append(this.f427596j);
        sb6.append(", toRect=");
        sb6.append(this.f427597k);
        sb6.append(", supportClipCanvas=");
        sb6.append(this.f427611y);
        sb6.append(" useTransparentActivity=");
        java.lang.Class cls = this.f427607u;
        sb6.append(cls != null ? cls.getSimpleName() : null);
        sb6.append(" durationMs=");
        sb6.append(this.f427602p);
        sb6.append(" delayStartMs=");
        sb6.append(this.f427603q);
        sb6.append(" delayCompletedMs=0, isAutoCompleteAfterAnim=");
        sb6.append(this.f427610x);
        sb6.append(", isFinishActivityAfterCompleted=");
        sb6.append(this.f427609w);
        sb6.append(" timeoutCompleted: ");
        sb6.append(this.f427604r);
        sb6.append(" isFinishTransparentActivityAfterCompleted=");
        sb6.append(this.f427608v);
        sb6.append(" extras: ");
        sb6.append(this.f427595i);
        return sb6.toString();
    }
}
