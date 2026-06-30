package ry2;

/* loaded from: classes10.dex */
public abstract class e implements ry2.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f401374d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f401375e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zi2 f401376f;

    /* renamed from: g, reason: collision with root package name */
    public int f401377g;

    /* renamed from: h, reason: collision with root package name */
    public int f401378h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f401379i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f401380m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401381n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f401382o;

    public e(android.content.Context activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401374d = activity;
        this.f401379i = jz5.h.b(new ry2.d(activity));
        this.f401380m = new java.util.ArrayList();
    }

    public static /* synthetic */ java.util.List g(ry2.e eVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLocalMediaList");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return eVar.f(z17);
    }

    public abstract boolean c();

    public void d() {
        k();
    }

    public abstract android.graphics.drawable.Drawable e();

    public java.util.List f(boolean z17) {
        return new java.util.LinkedList();
    }

    public final ry2.o h() {
        return (ry2.o) ((jz5.n) this.f401379i).getValue();
    }

    public abstract jz5.l i();

    public void j(r45.mb4 mediaObj) {
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        java.lang.Object c1Var = mediaObj.getInteger(2) == 4 ? com.tencent.mm.sdk.platformtools.t8.K0(mediaObj.getString(16)) ? new mn2.c1(mediaObj, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null) : new mn2.r3(mediaObj, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null) : new mn2.c1(mediaObj, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a17 = g1Var.e().a(c1Var);
        a17.g(g1Var.h(mn2.f1.f329953d));
        a17.f447873d = new ry2.b(this);
        a17.a();
    }

    public void k() {
        uv2.l lVar = uv2.l.f431400a;
        if (lVar.b() || lVar.a()) {
            java.util.ArrayList arrayList = this.f401380m;
            if (!arrayList.isEmpty()) {
                if (lVar.b() || lVar.a()) {
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostSpeedUpManager", "[cancelSpeedUp]");
                    uv2.e.f431376a.c(arrayList);
                    uv2.i.f431389a.e(arrayList, true);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r4 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r11 = this;
            uv2.l r0 = uv2.l.f431400a
            boolean r1 = r0.b()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            boolean r1 = r0.a()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = r2
            goto L14
        L13:
            r1 = r3
        L14:
            if (r1 == 0) goto Le4
            java.util.ArrayList r5 = r11.f401380m
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Le4
            java.util.List r1 = r11.f(r3)
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto Le4
            r5.addAll(r1)
            java.lang.String r1 = "context"
            android.content.Context r4 = r11.f401374d
            kotlin.jvm.internal.o.g(r4, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r6 = r4 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto Ld8
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            pf5.v r1 = r1.a(r4)
            java.lang.Class<sr2.w5> r4 = sr2.w5.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            sr2.w5 r1 = (sr2.w5) r1
            java.lang.String r1 = r1.f411784m
            uv2.i r4 = uv2.i.f431389a
            r45.zi2 r4 = r11.f401376f
            r10 = 0
            if (r4 == 0) goto L56
            r6 = 5
            java.lang.String r4 = r4.getString(r6)
            goto L57
        L56:
            r4 = r10
        L57:
            if (r4 == 0) goto L66
            java.lang.String r6 = "http"
            boolean r6 = r26.i0.y(r4, r6, r3)
            r6 = r6 ^ r3
            if (r6 == 0) goto L63
            goto L64
        L63:
            r4 = r10
        L64:
            if (r4 != 0) goto L68
        L66:
            java.lang.String r4 = ""
        L68:
            r9 = r4
            int r1 = r1.length()
            if (r1 <= 0) goto L71
            r7 = r3
            goto L72
        L71:
            r7 = r2
        L72:
            ry2.o r1 = r11.h()
            boolean r8 = r1.f401432p
            ry2.o r1 = r11.h()
            r45.q23 r6 = r1.P
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[startSpeedUp] isAdvancedProcess:"
            r1.<init>(r3)
            boolean r3 = r0.b()
            r1.append(r3)
            java.lang.String r3 = " isAdvancedCdnUpload:"
            r1.append(r3)
            boolean r3 = r0.a()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "LogPost.FinderPostSpeedUpManager"
            com.tencent.mars.xlog.Log.i(r3, r1)
            boolean r1 = r0.b()
            if (r1 != 0) goto Lb3
            boolean r0 = r0.a()
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "[startSpeedUp] disable"
            com.tencent.mars.xlog.Log.i(r3, r0)
            goto Le4
        Lb3:
            java.lang.Class<pp0.h0> r0 = pp0.h0.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            pp0.h0 r0 = (pp0.h0) r0
            yy0.m0 r0 = (yy0.m0) r0
            boolean r0 = r0.Zi(r2)
            if (r0 != 0) goto Lce
            java.lang.String r0 = "[startSpeedUp] old publisher not support"
            com.tencent.mars.xlog.Log.i(r3, r0)
            goto Le4
        Lce:
            uv2.k r0 = new uv2.k
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            pm0.v.K(r10, r0)
            goto Le4
        Ld8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.e.l():void");
    }

    public abstract void m();

    public void n(android.graphics.Bitmap thumb) {
        kotlin.jvm.internal.o.g(thumb, "thumb");
    }
}
