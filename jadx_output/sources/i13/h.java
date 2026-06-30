package i13;

/* loaded from: classes10.dex */
public final class h extends i13.c implements i50.m {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287285h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287286i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f287287m;

    /* renamed from: n, reason: collision with root package name */
    public final int f287288n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f287289o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f287290p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f287291q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f287292r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f287293s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String id6, java.lang.String title, java.lang.String desc, java.util.Map extraParams, int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, yz5.l lVar) {
        super(id6, 0L, 2, null);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(extraParams, "extraParams");
        this.f287285h = title;
        this.f287286i = desc;
        this.f287287m = extraParams;
        this.f287288n = i17;
        this.f287289o = str;
        this.f287290p = drawable;
        this.f287291q = z17;
        this.f287292r = z18;
        this.f287293s = lVar;
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        android.graphics.drawable.Drawable drawable = this.f287290p;
        return drawable == null ? super.b() : drawable;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String str = this.f287289o;
        return str == null ? super.c() : str;
    }

    @Override // i13.c
    public boolean e() {
        return this.f287291q;
    }

    @Override // i13.c
    public boolean f() {
        return this.f287292r;
    }

    @Override // i13.c
    public void g() {
        super.g();
        int i17 = 1;
        if (this.f287288n == 1) {
            i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
            i95.m c17 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
                i95.m c18 = i95.n0.c(h13.l0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                if (!h13.l0.Vi((h13.l0) c18, null, 1, null)) {
                    i17 = 4;
                }
            } else {
                i95.m c19 = i95.n0.c(h13.l0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
            }
            ((h13.c0) qVar).Di("", i17, 5, this.f287275d, false, null);
        }
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 3;
    }

    @Override // i13.c
    public void i() {
        java.lang.String str = (java.lang.String) this.f287287m.get("weAppUsername");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int size = k13.l1.I.a().f303239q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, this.f287288n == 1 ? 5 : 3, str2, size, this.f287275d);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        yz5.l lVar = this.f287293s;
        if (lVar != null) {
            lVar.invoke(view);
        }
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            java.lang.String str = (java.lang.String) this.f287287m.get("weAppUsername");
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            int size = k13.l1.I.a().f303239q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, this.f287288n == 1 ? 5 : 3, str2, size, this.f287275d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        yz5.l lVar = this.f287293s;
        if (lVar != null) {
            lVar.invoke(view);
        }
    }

    @Override // i13.c
    public void o() {
        super.o();
        i13.n a17 = i13.n.f287297c.a();
        a17.getClass();
        java.lang.String forcePushId = this.f287275d;
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        a17.f287300b.remove(forcePushId);
        j13.a.f297177d.d(forcePushId);
    }
}
