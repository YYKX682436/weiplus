package ma5;

/* loaded from: classes15.dex */
public class e extends ma5.b implements o.f0, o.p {

    /* renamed from: h, reason: collision with root package name */
    public o.r f325236h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f325237i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f325238m;

    /* renamed from: n, reason: collision with root package name */
    public final ma5.d f325239n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f325240o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f325241p;

    public e(android.app.Activity activity, ma5.d dVar) {
        super(activity);
        this.f325241p = new ma5.c(this);
        this.f325239n = dVar;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        ma5.d dVar = this.f325239n;
        if (dVar != null) {
            dVar.a(rVar, z17);
        }
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        ma5.d dVar = this.f325239n;
        if (dVar != null) {
            return dVar.b(rVar, menuItem);
        }
        return false;
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if ((r2 != null && r2.m()) != false) goto L26;
     */
    @Override // o.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o.r r6) {
        /*
            r5 = this;
            androidx.appcompat.app.b r0 = r5.f325232e
            r1 = 1
            if (r0 == 0) goto L52
            ma5.k r0 = (ma5.k) r0
            androidx.appcompat.widget.x0 r0 = r0.f325257e
            if (r0 == 0) goto L52
            androidx.appcompat.widget.z2 r0 = (androidx.appcompat.widget.z2) r0
            androidx.appcompat.widget.Toolbar r2 = r0.f9747a
            int r3 = r2.getVisibility()
            r4 = 0
            if (r3 != 0) goto L20
            androidx.appcompat.widget.ActionMenuView r2 = r2.f9478d
            if (r2 == 0) goto L20
            boolean r2 = r2.f9339y
            if (r2 == 0) goto L20
            r2 = r1
            goto L21
        L20:
            r2 = r4
        L21:
            if (r2 == 0) goto L52
            androidx.appcompat.widget.Toolbar r6 = r0.f9747a
            androidx.appcompat.widget.ActionMenuView r2 = r6.f9478d
            if (r2 == 0) goto L39
            androidx.appcompat.widget.q r2 = r2.f9340z
            if (r2 == 0) goto L35
            boolean r2 = r2.m()
            if (r2 == 0) goto L35
            r2 = r1
            goto L36
        L35:
            r2 = r4
        L36:
            if (r2 == 0) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L40
            r0.b()
            goto L55
        L40:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L55
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9478d
            if (r6 == 0) goto L55
            androidx.appcompat.widget.q r6 = r6.f9340z
            if (r6 == 0) goto L55
            r6.o()
            goto L55
        L52:
            r6.c(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma5.e.d(o.r):void");
    }

    @Override // ma5.b
    public androidx.appcompat.app.b e() {
        if (!this.f325238m) {
            this.f325238m = true;
            if (!this.f325240o) {
                this.f325240o = true;
                ((ma5.c) this.f325241p).run();
            }
        }
        if (this.f325232e == null) {
            this.f325232e = new ma5.k(this.f325231d, this.f325237i, null);
        }
        return this.f325232e;
    }
}
