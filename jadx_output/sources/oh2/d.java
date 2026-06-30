package oh2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f345343a;

    /* renamed from: b, reason: collision with root package name */
    public final float f345344b;

    /* renamed from: c, reason: collision with root package name */
    public final float f345345c;

    /* renamed from: d, reason: collision with root package name */
    public final float f345346d;

    /* renamed from: e, reason: collision with root package name */
    public final float f345347e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f345348f;

    /* renamed from: g, reason: collision with root package name */
    public my5.a f345349g;

    /* renamed from: h, reason: collision with root package name */
    public int f345350h;

    /* renamed from: i, reason: collision with root package name */
    public int f345351i;

    /* renamed from: j, reason: collision with root package name */
    public final float f345352j;

    /* renamed from: k, reason: collision with root package name */
    public int f345353k;

    /* renamed from: l, reason: collision with root package name */
    public int f345354l;

    /* renamed from: m, reason: collision with root package name */
    public int f345355m;

    /* renamed from: n, reason: collision with root package name */
    public final int f345356n;

    /* renamed from: o, reason: collision with root package name */
    public float f345357o;

    /* renamed from: p, reason: collision with root package name */
    public float f345358p;

    /* renamed from: q, reason: collision with root package name */
    public float f345359q;

    /* renamed from: r, reason: collision with root package name */
    public final float f345360r;

    /* renamed from: s, reason: collision with root package name */
    public float f345361s;

    /* renamed from: t, reason: collision with root package name */
    public float f345362t;

    /* renamed from: u, reason: collision with root package name */
    public float f345363u;

    /* renamed from: v, reason: collision with root package name */
    public float f345364v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f345365w;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        float a17 = i65.a.a(context, 22.0f);
        this.f345343a = a17;
        this.f345344b = i65.a.a(context, 17.0f);
        this.f345345c = i65.a.a(context, 31.0f);
        this.f345346d = i65.a.a(context, 24.0f);
        this.f345347e = i65.a.a(context, 4.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(a17);
        paint.setAntiAlias(true);
        this.f345348f = paint;
        this.f345350h = -1;
        this.f345351i = -1;
        this.f345352j = 0.1f;
        this.f345354l = -1;
        this.f345355m = 1;
        this.f345356n = 2;
        this.f345358p = a17;
        this.f345359q = a17;
        this.f345360r = 0.8f;
        this.f345365w = new android.graphics.Rect();
    }

    public void a(my5.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomBaseLyricsDrawer", "bind lyrics size: " + data.b());
        this.f345349g = data;
        h();
    }

    public final android.animation.AnimatorSet b(float f17, boolean z17) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f345357o, f17);
        ofFloat.addUpdateListener(new oh2.a(this));
        ofFloat.setDuration(300L);
        float f18 = this.f345344b;
        float f19 = this.f345343a;
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(f18, f19);
        ofFloat2.addUpdateListener(new oh2.b(this));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(f19, f18);
        ofFloat3.addUpdateListener(new oh2.c(this));
        float f27 = this.f345360r;
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(f27, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        if (z17) {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, android.animation.ValueAnimator.ofFloat(0.0f, f27));
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(500L);
        return animatorSet;
    }

    public abstract void c(android.graphics.Canvas canvas, int i17);

    public final int d(my5.c cVar, int i17) {
        kotlin.jvm.internal.o.g(cVar, "<this>");
        java.util.ArrayList mCharacters = cVar.f332860d;
        kotlin.jvm.internal.o.f(mCharacters, "mCharacters");
        int i18 = 0;
        for (java.lang.Object obj : mCharacters) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            long j17 = ((my5.b) obj).f332853a;
            java.util.ArrayList mCharacters2 = cVar.f332860d;
            kotlin.jvm.internal.o.f(mCharacters2, "mCharacters");
            my5.b bVar = (my5.b) kz5.n0.a0(mCharacters2, i19);
            long j18 = i17;
            if (j17 <= j18 && j18 < (bVar != null ? bVar.f332853a : com.tencent.wcdb.core.Database.DictDefaultMatchValue)) {
                return i18;
            }
            i18 = i19;
        }
        return -1;
    }

    public abstract java.lang.String e();

    public void f(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.translate(this.f345363u, 0.0f);
        android.graphics.Rect rect = this.f345365w;
        rect.left = 0;
        rect.right = ((int) this.f345361s) + ((int) this.f345364v);
        rect.top = 0;
        rect.bottom = (int) this.f345362t;
        canvas.clipRect(rect);
    }

    public void g(android.graphics.Canvas canvas, int i17, int i18, om2.a0 a0Var) {
        int i19;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        my5.c cVar;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f345349g == null) {
            return;
        }
        l(i18, canvas.getHeight());
        f(canvas);
        my5.a aVar = this.f345349g;
        if (aVar != null && (arrayList = aVar.f332852a) != null) {
            i19 = 0;
            for (java.lang.Object obj : arrayList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long j17 = ((my5.c) obj).f332858b;
                my5.a aVar2 = this.f345349g;
                long j18 = i17;
                if (j17 <= j18 && j18 < ((aVar2 == null || (arrayList2 = aVar2.f332852a) == null || (cVar = (my5.c) kz5.n0.a0(arrayList2, i27)) == null) ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : cVar.f332858b)) {
                    break;
                } else {
                    i19 = i27;
                }
            }
        }
        i19 = -1;
        if (i19 >= 0 && this.f345353k != i19) {
            this.f345353k = i19;
            this.f345354l = i19 - 1;
            this.f345355m = (i19 + this.f345356n) - 1;
            com.tencent.mars.xlog.Log.i(e(), "move to index " + this.f345353k + ", previous = " + this.f345354l + ", enter = " + this.f345355m);
            k(this.f345353k);
        }
        c(canvas, i17);
        canvas.restore();
    }

    public abstract void h();

    public final void i(int i17) {
        int i18 = this.f345354l;
        float f17 = this.f345360r;
        if ((i17 != i18 || i18 < 0) && i17 != this.f345353k && i17 != this.f345355m) {
            f17 = 0.0f;
        }
        this.f345348f.setAlpha((int) (f17 * 255));
    }

    public final void j(int i17, int i18) {
        this.f345350h = i17;
        this.f345351i = i18;
        com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomBaseLyricsDrawer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
    }

    public abstract void k(int i17);

    public void l(int i17, float f17) {
        this.f345361s = (i17 - this.f345363u) - this.f345364v;
        this.f345362t = f17;
    }
}
