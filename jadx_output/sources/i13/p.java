package i13;

/* loaded from: classes10.dex */
public final class p extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287313h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287314i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287315m;

    /* renamed from: n, reason: collision with root package name */
    public final long f287316n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f287317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String forcePushId, java.lang.String username, java.lang.String nickname, java.lang.String wording, long j17, java.lang.String str) {
        super(forcePushId, 0L, 2, null);
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f287313h = username;
        this.f287314i = nickname;
        this.f287315m = wording;
        this.f287316n = j17;
        this.f287317o = str;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.fes);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return true;
    }

    @Override // i13.c
    public void g() {
        int i17;
        super.g();
        java.lang.String str = this.f287313h;
        i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
        i95.m c17 = i95.n0.c(h13.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c18, null, 1, null) ? 1 : 4;
        } else {
            i95.m c19 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
        }
        ((h13.c0) qVar).Di(str, i17, 1, this.f287275d, false, null);
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    @Override // i13.c
    public void i() {
        int size = k13.l1.I.a().f303239q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, 1, this.f287313h, size, this.f287275d);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        m13.d dVar = m13.d.f322865a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context, this, i13.n.f287297c.a().f287299a.size());
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            int size = k13.l1.I.a().f303239q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, 1, this.f287313h, size, this.f287275d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        int size = k13.l1.I.a().f303239q.size();
        m13.d dVar = m13.d.f322865a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context, this, size);
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
