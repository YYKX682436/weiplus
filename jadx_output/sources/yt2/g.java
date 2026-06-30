package yt2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f465296a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465297b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f465298c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f465299d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f465300e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f465301f;

    /* renamed from: g, reason: collision with root package name */
    public int f465302g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f465303h;

    /* renamed from: i, reason: collision with root package name */
    public long f465304i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f465305j;

    public g(android.content.Context context, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f465296a = parent;
        this.f465297b = "FinderLiveShopCountdownWordView";
        this.f465298c = jz5.h.b(new yt2.c(context, this));
        this.f465299d = jz5.h.b(new yt2.b(this));
        this.f465300e = jz5.h.b(new yt2.a(this));
        this.f465301f = jz5.h.b(new yt2.d(this));
        this.f465305j = jz5.h.b(new yt2.f(this));
    }

    public final void a(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i(this.f465297b, "attachToParent " + i17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv), 0);
        if (parent.indexOfChild(e()) == -1) {
            if (i17 <= parent.getChildCount()) {
                parent.addView(e(), i17, layoutParams);
            } else {
                parent.addView(e(), 0, layoutParams);
            }
        }
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i(this.f465297b, "detach source=" + i17);
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f465305j).getValue()).d();
        this.f465303h = null;
        this.f465302g = 0;
        this.f465304i = 0L;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View e17 = e();
        kotlin.jvm.internal.o.f(e17, "<get-rootView>(...)");
        r4Var.Q2(e17);
    }

    public final java.lang.String c(int i17) {
        no0.l lVar = no0.m.f338730a;
        return i17 < 3600 ? no0.l.a(lVar, i17, ":", false, false, false, 24, null) : no0.l.a(lVar, i17, ":", false, false, false, 28, null);
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) ((jz5.n) this.f465300e).getValue();
    }

    public final android.view.View e() {
        return (android.view.View) ((jz5.n) this.f465298c).getValue();
    }

    public final int f() {
        int measuredWidth = e().getMeasuredWidth();
        if (measuredWidth > 0) {
            return measuredWidth;
        }
        jz5.g gVar = this.f465299d;
        float desiredWidth = android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar).getValue()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint());
        float desiredWidth2 = android.text.Layout.getDesiredWidth(d().getText().toString(), d().getPaint());
        jz5.g gVar2 = this.f465301f;
        return (int) (desiredWidth + desiredWidth2 + android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar2).getValue()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar2).getValue()).getPaint()) + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x00d6, TryCatch #0 {all -> 0x00d6, blocks: (B:9:0x004d, B:11:0x0051, B:16:0x005d, B:19:0x006a, B:20:0x00b2, B:21:0x0073, B:22:0x00aa, B:23:0x00cf), top: B:8:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r17, r45.j90 r18, yz5.a r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt2.g.g(java.lang.String, r45.j90, yz5.a):void");
    }
}
