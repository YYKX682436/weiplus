package xp;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static xp.i f455829j;

    /* renamed from: k, reason: collision with root package name */
    public static wp.d f455830k;

    /* renamed from: l, reason: collision with root package name */
    public static final android.text.TextPaint f455831l = new android.text.TextPaint();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f455832m = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zp.g f455833a;

    /* renamed from: c, reason: collision with root package name */
    public final xp.g f455835c;

    /* renamed from: d, reason: collision with root package name */
    public final xp.f f455836d;

    /* renamed from: e, reason: collision with root package name */
    public final xp.e f455837e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f455838f;

    /* renamed from: h, reason: collision with root package name */
    public final xp.a f455840h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f455841i;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f455834b = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final yp.h f455839g = new yp.h();

    public d(xp.c cVar, xp.b bVar) {
        this.f455841i = "";
        cVar.getClass();
        xp.g gVar = cVar.f455823a;
        this.f455835c = gVar;
        this.f455836d = cVar.f455824b;
        this.f455837e = cVar.f455826d;
        this.f455840h = cVar.f455828f;
        this.f455841i = cVar.f455827e;
        this.f455833a = new zp.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f455838f = arrayList;
        arrayList.addAll(cVar.f455825c);
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("Danmaku module need an IDanmakuPlayTimeSupplier or is live setter for computing timeline");
        }
    }

    public static android.content.Context b() {
        android.content.Context context = vp.c.f438736a;
        if (context != null) {
            return context;
        }
        throw new java.lang.RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
    }

    public static xp.i f() {
        if (f455829j == null) {
            synchronized (xp.d.class) {
                xp.i iVar = f455829j;
            }
        }
        if (f455829j == null) {
            f455829j = new xp.i();
        }
        return f455829j;
    }

    public void a() {
        zp.g gVar = this.f455833a;
        synchronized (gVar) {
            gVar.f474912a.trimToSize(0);
        }
    }

    public yp.a c(wp.a aVar) {
        yp.a aVar2;
        java.util.Iterator it = ((java.util.ArrayList) this.f455838f).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (yp.a) it.next();
            if (aVar2.a(aVar)) {
                break;
            }
        }
        return aVar2 == null ? this.f455839g : aVar2;
    }

    public xp.h d(int i17) {
        xp.h hVar = (xp.h) this.f455834b.get(i17);
        if (hVar == null) {
            synchronized (xp.d.class) {
                hVar = (xp.h) this.f455834b.get(i17);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (f455830k == null) {
            synchronized (xp.d.class) {
                if (f455830k == null) {
                    f455830k = new wp.d();
                }
            }
        }
        return f455830k;
    }

    public int e() {
        float f17 = f().f455855l;
        android.text.TextPaint textPaint = f455831l;
        textPaint.setTextSize(f17);
        java.util.HashMap hashMap = (java.util.HashMap) f455832m;
        java.lang.Float f18 = (java.lang.Float) hashMap.get(java.lang.Float.valueOf(f17));
        if (f18 == null) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            f18 = java.lang.Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
            hashMap.put(java.lang.Float.valueOf(f17), f18);
        }
        return (int) java.lang.Math.ceil(f18.floatValue() + (f().f455847d * 2) + (r0.f455856m * 2.0f) + (r0.f455857n * 2.0f));
    }

    public boolean g() {
        xp.g gVar = this.f455835c;
        return (gVar == null ? -1L : gVar.a()) < 0;
    }
}
