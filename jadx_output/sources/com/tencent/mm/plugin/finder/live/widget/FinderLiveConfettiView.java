package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView;", "Landroid/widget/FrameLayout;", "Lzy2/y7;", "", "alpha", "Ljz5/f0;", "setIconAlpha", "scale", "setScale", "", "ms", "setInterval", "getView", "Lcom/tencent/mm/sdk/platformtools/b4;", "u", "Ljz5/g;", "getTimeHandler", "()Lcom/tencent/mm/sdk/platformtools/b4;", "timeHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveConfettiView extends android.widget.FrameLayout implements zy2.y7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117587d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f117588e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f117589f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f117590g;

    /* renamed from: h, reason: collision with root package name */
    public final zl2.b f117591h;

    /* renamed from: i, reason: collision with root package name */
    public int f117592i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f117593m;

    /* renamed from: n, reason: collision with root package name */
    public long f117594n;

    /* renamed from: o, reason: collision with root package name */
    public long f117595o;

    /* renamed from: p, reason: collision with root package name */
    public int f117596p;

    /* renamed from: q, reason: collision with root package name */
    public int f117597q;

    /* renamed from: r, reason: collision with root package name */
    public float f117598r;

    /* renamed from: s, reason: collision with root package name */
    public float f117599s;

    /* renamed from: t, reason: collision with root package name */
    public long f117600t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g timeHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117587d = "FinderLiveConfettiView";
        this.f117588e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117589f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117590g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117591h = new zl2.b();
        this.f117593m = true;
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.f117595o = 500L;
        this.f117598r = 1.0f;
        this.f117599s = 1.0f;
        this.timeHandler = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.bd(this));
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView) {
        android.graphics.Bitmap bitmap;
        e51.k kVar = new e51.k(finderLiveConfettiView.f117596p, finderLiveConfettiView.f117597q);
        int i17 = 0;
        try {
            java.util.List confettiBitmaps = finderLiveConfettiView.f117588e;
            kotlin.jvm.internal.o.f(confettiBitmaps, "confettiBitmaps");
            int size = finderLiveConfettiView.f117588e.size();
            bitmap = (android.graphics.Bitmap) kz5.n0.a0(confettiBitmaps, size <= 0 ? 0 : c06.e.f37716d.e(0, size));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(finderLiveConfettiView.f117587d, "[rollNextBitmap] e: " + e17.getMessage());
            bitmap = null;
        }
        if (finderLiveConfettiView.f117589f.size() > 0 && finderLiveConfettiView.f117592i > 0) {
            java.util.List customConfettiBitmaps = finderLiveConfettiView.f117589f;
            kotlin.jvm.internal.o.f(customConfettiBitmaps, "customConfettiBitmaps");
            synchronized (customConfettiBitmaps) {
                java.util.List customConfettiRate = finderLiveConfettiView.f117590g;
                kotlin.jvm.internal.o.f(customConfettiRate, "customConfettiRate");
                java.util.Iterator it = customConfettiRate.iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it.next();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    int intValue = ((java.lang.Integer) next).intValue();
                    kotlin.jvm.internal.o.d(num);
                    next = java.lang.Integer.valueOf(intValue + num.intValue());
                }
                java.lang.Integer num2 = (java.lang.Integer) next;
                kotlin.jvm.internal.o.d(num2);
                int intValue2 = (num2.intValue() < 100 ? 100 : num2).intValue();
                int e18 = intValue2 <= 0 ? 0 : c06.e.f37716d.e(0, intValue2);
                if (e18 <= num2.intValue()) {
                    java.util.List customConfettiRate2 = finderLiveConfettiView.f117590g;
                    kotlin.jvm.internal.o.f(customConfettiRate2, "customConfettiRate");
                    java.util.Iterator it6 = customConfettiRate2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.Integer num3 = (java.lang.Integer) next2;
                        kotlin.jvm.internal.o.d(num3);
                        if (e18 <= num3.intValue()) {
                            java.util.List customConfettiBitmaps2 = finderLiveConfettiView.f117589f;
                            kotlin.jvm.internal.o.f(customConfettiBitmaps2, "customConfettiBitmaps");
                            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) kz5.n0.a0(customConfettiBitmaps2, i17);
                            if (bitmap2 != null) {
                                bitmap = bitmap2;
                            }
                        } else {
                            e18 -= num3.intValue();
                            i17 = i18;
                        }
                    }
                }
            }
        }
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.live.widget.zc zcVar = new com.tencent.mm.plugin.finder.live.widget.zc(bitmap, finderLiveConfettiView);
            zl2.b bVar = finderLiveConfettiView.f117591h;
            android.content.Context context = finderLiveConfettiView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e51.j a17 = bVar.a(context, zcVar, kVar, new g51.b(finderLiveConfettiView));
            a17.d();
            a17.g();
        }
    }

    private final com.tencent.mm.sdk.platformtools.b4 getTimeHandler() {
        return (com.tencent.mm.sdk.platformtools.b4) this.timeHandler.getValue();
    }

    public void b(java.util.ArrayList bitmaps, java.util.ArrayList rates) {
        kotlin.jvm.internal.o.g(bitmaps, "bitmaps");
        kotlin.jvm.internal.o.g(rates, "rates");
        this.f117589f.addAll(bitmaps);
        this.f117590g.addAll(rates);
        java.util.Iterator it = rates.iterator();
        while (it.hasNext()) {
            this.f117592i += ((java.lang.Number) it.next()).intValue();
        }
    }

    public void c(java.util.ArrayList bitmaps) {
        kotlin.jvm.internal.o.g(bitmaps, "bitmaps");
        java.util.List list = this.f117588e;
        list.clear();
        java.util.Iterator it = bitmaps.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            int i17 = no0.i.f338727a;
            int i18 = (int) (no0.i.f338727a * this.f117598r);
            android.content.res.Resources resources = getContext().getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView", "addDefaultBitmap", "(Ljava/util/ArrayList;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView", "addDefaultBitmap", "(Ljava/util/ArrayList;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            list.add(android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, true));
        }
    }

    public void d() {
        getTimeHandler().d();
        com.tencent.mm.sdk.platformtools.b4 timeHandler = getTimeHandler();
        long j17 = this.f117595o;
        timeHandler.c(j17, j17);
        this.f117600t = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(this.f117587d, "[start]  time = " + this.f117600t);
    }

    public void e() {
        getTimeHandler().d();
        this.f117588e.clear();
        this.f117589f.clear();
        this.f117590g.clear();
        this.f117592i = 0;
        com.tencent.mars.xlog.Log.i(this.f117587d, "[stopAndDestroy]  startTime = " + this.f117600t);
    }

    @Override // zy2.y7
    public android.widget.FrameLayout getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public void setIconAlpha(float f17) {
        this.f117599s = f17;
    }

    @Override // zy2.y7
    public void setInterval(long j17) {
        this.f117595o = j17;
    }

    @Override // zy2.y7
    public void setScale(float f17) {
        this.f117598r = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117587d = "FinderLiveConfettiView";
        this.f117588e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117589f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117590g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117591h = new zl2.b();
        this.f117593m = true;
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.f117595o = 500L;
        this.f117598r = 1.0f;
        this.f117599s = 1.0f;
        this.timeHandler = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.bd(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117587d = "FinderLiveConfettiView";
        this.f117588e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117589f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117590g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f117591h = new zl2.b();
        this.f117593m = true;
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.f117595o = 500L;
        this.f117598r = 1.0f;
        this.f117599s = 1.0f;
        this.timeHandler = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.bd(this));
    }
}
