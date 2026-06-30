package ws2;

/* loaded from: classes3.dex */
public final class c1 implements ws2.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449019a;

    public c1(ws2.k1 k1Var) {
        this.f449019a = k1Var;
    }

    @Override // ws2.m2
    public void a(boolean z17) {
        ws2.k1 k1Var = this.f449019a;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            if (jVar.f222272p == z17) {
                com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "set isDocCast:" + jVar.f222272p + '!');
            }
            jVar.f222272p = z17;
        }
        java.util.Iterator it = k1Var.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).a(z17);
        }
    }

    @Override // ws2.m2
    public void b(boolean z17) {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).b(z17);
        }
    }

    @Override // ws2.m2
    public void c(java.lang.String userId, boolean z17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).c(userId, z17);
        }
    }

    @Override // ws2.m2
    public void d() {
        ws2.k1 k1Var = this.f449019a;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            jVar.f7(kn0.k.f309567e);
        }
        java.util.Iterator it = k1Var.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).d();
        }
    }

    @Override // ws2.m2
    public void e() {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).e();
        }
    }

    @Override // ws2.m2
    public void f(java.lang.String str) {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).f(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if ((r3.f243158a.getScaleType() == 0) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r3.f243158a.getScaleType() == 1) == true) goto L13;
     */
    @Override // ws2.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r5, boolean r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            ws2.k1 r2 = r4.f449019a
            if (r6 == 0) goto L23
            dt2.a0 r3 = r2.f449083o
            if (r3 == 0) goto L18
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = r3.f243158a
            int r3 = r3.getScaleType()
            if (r3 != r0) goto L14
            r3 = r0
            goto L15
        L14:
            r3 = r1
        L15:
            if (r3 != r0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L3f
            dt2.a0 r0 = r2.f449083o
            if (r0 == 0) goto L3f
            r0.h()
            goto L3f
        L23:
            dt2.a0 r3 = r2.f449083o
            if (r3 == 0) goto L35
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = r3.f243158a
            int r3 = r3.getScaleType()
            if (r3 != 0) goto L31
            r3 = r0
            goto L32
        L31:
            r3 = r1
        L32:
            if (r3 != r0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L3f
            dt2.a0 r0 = r2.f449083o
            if (r0 == 0) goto L3f
            r0.g()
        L3f:
            r2.f449081m = r5
            r2.f449082n = r6
            java.util.HashSet r0 = r2.f449080l
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            ws2.m2 r1 = (ws2.m2) r1
            r1.g(r5, r6)
            goto L49
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.c1.g(boolean, boolean):void");
    }

    @Override // ws2.m2
    public boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).h(jSONObject, jSONObject2, jSONObject3, z17, lVar);
        }
        return true;
    }

    @Override // ws2.m2
    public void i(org.json.JSONArray jSONArray) {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).i(jSONArray);
        }
    }

    @Override // ws2.m2
    public void j(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).j(jSONObject, jSONObject2);
        }
    }

    @Override // ws2.m2
    public void k() {
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).k();
        }
    }

    @Override // ws2.m2
    public void l() {
        ws2.k1 k1Var = this.f449019a;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            jVar.f7(kn0.k.f309566d);
        }
        java.util.Iterator it = k1Var.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).l();
        }
    }

    @Override // ws2.m2
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        java.util.Iterator it = this.f449019a.f449080l.iterator();
        while (it.hasNext()) {
            ((ws2.m2) it.next()).statusChange(status, bundle);
        }
    }
}
