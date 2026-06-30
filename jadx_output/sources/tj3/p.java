package tj3;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f419782a;

    /* renamed from: b, reason: collision with root package name */
    public final tj3.i0 f419783b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout f419784c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout f419785d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f419786e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f419787f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.t f419788g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f419789h;

    /* renamed from: i, reason: collision with root package name */
    public int f419790i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f419791j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f419792k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f419793l;

    public p(android.content.Context context, com.tencent.mm.plugin.multitalk.ui.t defaultMemberInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(defaultMemberInfo, "defaultMemberInfo");
        this.f419782a = context;
        this.f419783b = new tj3.i0(context);
        this.f419784c = new com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout(context, null, 2, null);
        this.f419785d = new com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout(context, null, 2, null);
        this.f419786e = jz5.h.b(new tj3.j(this));
        this.f419787f = jz5.h.b(new tj3.n(this));
        this.f419788g = defaultMemberInfo;
        this.f419789h = jz5.h.b(new tj3.o(this));
        this.f419790i = -1;
        this.f419793l = c01.z1.r();
        e(defaultMemberInfo, true);
    }

    public final int a() {
        return d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9) + (this.f419792k ? d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr) : 0) + d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9) + (d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) * 2);
    }

    public final tj3.h b() {
        return (tj3.h) ((jz5.n) this.f419786e).getValue();
    }

    public final android.widget.RelativeLayout c() {
        return (android.widget.RelativeLayout) ((jz5.n) this.f419787f).getValue();
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) this.f419789h.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (kotlin.jvm.internal.o.b(r4.f419788g.f150297b, r1) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.plugin.multitalk.ui.t r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "memberInfo"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.plugin.multitalk.ui.t r0 = r4.f419788g
            boolean r0 = kotlin.jvm.internal.o.b(r5, r0)
            if (r0 == 0) goto L10
            if (r6 != 0) goto L10
            return
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "update member info "
            r0.<init>(r1)
            java.lang.String r1 = r5.f150297b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.MT.MultiTalkAvatarHolder"
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r0 = r4.f419784c
            r0.b(r5)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r0 = r4.f419785d
            r0.a(r5)
            tj3.i0 r0 = r4.f419783b
            if (r6 != 0) goto L50
            com.tencent.mm.plugin.multitalk.ui.t r6 = r4.f419788g
            boolean r2 = r6.f150299d
            boolean r3 = r5.f150299d
            if (r2 != r3) goto L50
            boolean r6 = r6.a()
            boolean r2 = r5.a()
            if (r6 != r2) goto L50
            com.tencent.mm.plugin.multitalk.ui.t r6 = r4.f419788g
            java.lang.String r6 = r6.f150297b
            boolean r6 = kotlin.jvm.internal.o.b(r6, r1)
            if (r6 != 0) goto L81
        L50:
            r0.d(r5)
            android.widget.TextView r6 = r4.d()
            java.lang.Class<vg3.x3> r2 = vg3.x3.class
            lm0.a r2 = gm0.j1.s(r2)
            vg3.x3 r2 = (vg3.x3) r2
            com.tencent.mm.plugin.messenger.foundation.h2 r2 = (com.tencent.mm.plugin.messenger.foundation.h2) r2
            com.tencent.mm.storage.k4 r2 = r2.Bi()
            if (r2 == 0) goto L75
            r3 = 1
            com.tencent.mm.storage.z3 r2 = r2.n(r1, r3)
            if (r2 == 0) goto L75
            java.lang.String r2 = r2.f2()
            if (r2 == 0) goto L75
            goto L76
        L75:
            r2 = r1
        L76:
            r6.setText(r2)
            java.lang.String r6 = r4.f419793l
            boolean r6 = kotlin.jvm.internal.o.b(r1, r6)
            r4.f419792k = r6
        L81:
            r0.e(r5)
            r4.f419788g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tj3.p.e(com.tencent.mm.plugin.multitalk.ui.t, boolean):void");
    }
}
