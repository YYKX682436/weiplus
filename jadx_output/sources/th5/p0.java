package th5;

/* loaded from: classes12.dex */
public final class p0 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f419443g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f419444h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f419445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f419443g = new java.util.LinkedHashMap();
        this.f419444h = new java.util.LinkedHashMap();
        this.f419445i = new java.util.LinkedHashMap();
    }

    public static final void b7(th5.p0 p0Var, th5.q qVar, java.lang.String str) {
        java.util.Map map = p0Var.f419444h;
        try {
            com.tencent.mm.plugin.sight.base.b Ai = ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Ai(str);
            java.lang.String c17 = qVar.e().a(sf3.m.f407404f).c();
            if (c17 == null) {
                c17 = "";
            }
            lf3.k a17 = lf3.l.f318326a.a(c17);
            map.put(p0Var.W6(qVar), new vf3.d(Ai != null ? Ai.f162401t : null, Ai != null ? Ai.f162400s : null, ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Bi(str), a17 != null ? a17.f318322a : 0, a17 != null ? a17.f318323b : 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPhotoLiveStateManager", "parserLiveInfo", e17);
            map.put(p0Var.W6(qVar), new vf3.d("", "", true, 0, 0));
        }
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f419444h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return new vf3.c("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r3 > 0) goto L16;
     */
    @Override // vf3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vf3.b T4(mf3.k r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "mediaInfo"
            kotlin.jvm.internal.o.g(r0, r1)
            boolean r1 = r0 instanceof th5.q
            r2 = 0
            if (r1 == 0) goto Lf
            th5.q r0 = (th5.q) r0
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 != 0) goto L13
            return r2
        L13:
            r1 = r17
            java.util.Map r2 = r1.f419445i
            java.lang.String r3 = r0.getId()
            r4 = r2
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L65
            java.lang.String r3 = r0.b()
            long r5 = com.tencent.mm.vfs.w6.k(r3)
            java.lang.String r3 = r0.f419453k
            long r11 = com.tencent.mm.vfs.w6.k(r3)
            java.lang.String r3 = r0.f419452j
            int r3 = r3.length()
            if (r3 <= 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L47
            java.lang.String r3 = r0.f419452j
            long r3 = com.tencent.mm.vfs.w6.k(r3)
        L45:
            r7 = r3
            goto L50
        L47:
            long r3 = r0.f419343b
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L50
            goto L45
        L50:
            java.lang.String r3 = r0.getId()
            vf3.b r15 = new vf3.b
            r13 = 0
            r16 = 0
            r4 = r15
            r9 = r11
            r1 = r15
            r15 = r16
            r4.<init>(r5, r7, r9, r11, r13, r15)
            r2.put(r3, r1)
        L65:
            java.lang.String r0 = r0.getId()
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            vf3.b r0 = (vf3.b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.p0.T4(mf3.k):vf3.b");
    }

    @Override // vf3.i
    public void V6() {
        java.util.Map map = this.f419443g;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) it.next(), null, 1, null);
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f419444h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f436374c;
        }
        return true;
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        a7(mediaInfo, listener);
        th5.q qVar = mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null;
        if (qVar == null) {
            return;
        }
        boolean z17 = qVar.f419450h == mf3.w.f326129e;
        java.lang.String k17 = z17 ? qVar.k() : qVar.j();
        java.lang.String str = qVar.f419446d;
        java.lang.String str2 = qVar.f419447e;
        if (!z17 ? !r26.n0.N(str2) : r26.n0.N(str)) {
            str = str2;
        }
        java.lang.String str3 = str;
        java.lang.String str4 = qVar.f419449g;
        boolean z18 = z17 && (r26.n0.N(str4) ^ true);
        java.lang.String i17 = z18 ? qVar.i() : qVar.l();
        if (!z18) {
            str4 = qVar.f419448f;
        }
        java.lang.String str5 = str4;
        java.util.Map map = this.f419443g;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) ((java.util.LinkedHashMap) map).get(qVar.getId());
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        map.put(qVar.getId(), v65.i.b(this.f436401f, null, new th5.o0(qVar, str5, i17, k17, z18, z17, this, str3, null), 1, null));
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.util.Map map = this.f419443g;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) ((java.util.LinkedHashMap) map).get(mediaInfo.getId());
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        map.remove(mediaInfo.getId());
    }
}
