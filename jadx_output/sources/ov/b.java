package ov;

@j95.b
/* loaded from: classes11.dex */
public final class b extends i95.w implements pv.z {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f349066d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f349067e;

    /* renamed from: f, reason: collision with root package name */
    public long f349068f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f349069g;

    public b() {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f349066d = sparseArray;
        this.f349067e = new java.util.ArrayList();
        ov.a aVar = new ov.a(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelFeatureService", "init AudioPanelFeatureService");
        this.f349069g = ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode();
        jp1.b bVar = new jp1.b();
        synchronized (sparseArray) {
            java.util.HashSet hashSet = (java.util.HashSet) sparseArray.get(1);
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                sparseArray.put(1, hashSet);
            }
            hashSet.add(bVar);
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(aVar);
    }

    public np1.a Ai() {
        np1.a aVar;
        java.lang.String listenId;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        bw5.cp0 b17;
        bw5.o50 b18;
        java.lang.String name;
        bw5.cp0 b19;
        java.lang.String str;
        java.lang.String str2;
        bw5.cp0 b27;
        bw5.cp0 b28;
        bw5.o50 b29;
        java.lang.String c17;
        bw5.cp0 b37;
        bw5.o50 b38;
        bw5.cp0 b39;
        bw5.o50 b47;
        b66.j cj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).cj();
        bw5.fr0 d17 = cj6 != null ? ((b66.k) cj6).d() : null;
        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
        if (d17 == null) {
            return null;
        }
        boolean[] zArr = d17.f27499n;
        try {
            bw5.lp0 b48 = d17.b();
            java.lang.String str3 = "";
            if (!zArr[3] || b48 == null) {
                bw5.dr0 c18 = d17.c();
                bw5.o50 b49 = (c18 == null || (b19 = c18.b()) == null) ? null : b19.b();
                if (zArr[1]) {
                    bw5.dr0 c19 = d17.c();
                    if ((c19 != null && c19.f26601m[3]) && b49 != null) {
                        aVar = new np1.a();
                        aVar.f390973d = 1;
                        aVar.f390978i = b49.d();
                        aVar.f390977h = b49.getName();
                        aVar.f390974e = com.tencent.mm.protobuf.g.b(d17.toByteArray());
                        java.lang.String c27 = b49.c();
                        if (c27 == null) {
                            c27 = "";
                        }
                        aVar.f390980n = c27;
                        aVar.f390983q = b49.f30964n;
                        bw5.dr0 c28 = d17.c();
                        if (c28 != null && (b17 = c28.b()) != null && (b18 = b17.b()) != null && (name = b18.getName()) != null) {
                            str3 = name;
                        }
                        aVar.f390984r = str3;
                        aVar.f390985s = il4.d.l(b49);
                    }
                }
                bw5.dr0 c29 = d17.c();
                bw5.lp0 lp0Var = (c29 == null || (linkedList2 = c29.f26598g) == null) ? null : (bw5.lp0) kz5.n0.Z(linkedList2);
                if (!zArr[1]) {
                    return null;
                }
                bw5.dr0 c37 = d17.c();
                if (!((c37 == null || (linkedList = c37.f26598g) == null || !(linkedList.isEmpty() ^ true)) ? false : true) || lp0Var == null) {
                    return null;
                }
                aVar = new np1.a();
                aVar.f390973d = 1;
                aVar.f390978i = rk4.j5.d(lp0Var);
                aVar.f390977h = rk4.j5.j(lp0Var);
                aVar.f390979m = rk4.j5.c(lp0Var);
                aVar.f390974e = com.tencent.mm.protobuf.g.b(d17.toByteArray());
                java.lang.String b57 = lp0Var.b();
                if (b57 == null) {
                    b57 = "";
                }
                aVar.f390980n = b57;
                bw5.v70 d18 = b48.d();
                if (d18 != null && (listenId = d18.getListenId()) != null) {
                    str3 = listenId;
                }
                aVar.f390981o = str3;
                bw5.v70 d19 = b48.d();
                aVar.f390982p = d19 != null ? d19.f34189e : 0;
            } else {
                aVar = new np1.a();
                aVar.f390973d = 1;
                aVar.f390978i = rk4.j5.d(b48);
                aVar.f390977h = rk4.j5.j(b48);
                aVar.f390979m = rk4.j5.c(b48);
                aVar.f390974e = com.tencent.mm.protobuf.g.b(d17.toByteArray());
                java.lang.String b58 = b48.b();
                if (b58 == null) {
                    b58 = "";
                }
                aVar.f390980n = b58;
                bw5.v70 d27 = b48.d();
                if (d27 == null || (str = d27.getListenId()) == null) {
                    str = "";
                }
                aVar.f390981o = str;
                bw5.v70 d28 = b48.d();
                aVar.f390982p = d28 != null ? d28.f34189e : 0;
                bw5.dr0 c38 = d17.c();
                if (c38 != null && (b39 = c38.b()) != null && (b47 = b39.b()) != null) {
                    r7 = b47.f30964n;
                }
                aVar.f390983q = r7;
                bw5.dr0 c39 = d17.c();
                if (c39 == null || (b37 = c39.b()) == null || (b38 = b37.b()) == null || (str2 = b38.getName()) == null) {
                    str2 = "";
                }
                aVar.f390984r = str2;
                bw5.dr0 c47 = d17.c();
                if (c47 != null && (b28 = c47.b()) != null && (b29 = b28.b()) != null && (c17 = b29.c()) != null) {
                    str3 = c17;
                }
                aVar.f390986t = str3;
                bw5.dr0 c48 = d17.c();
                aVar.f390985s = il4.d.l((c48 == null || (b27 = c48.b()) == null) ? null : b27.b());
            }
            return aVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Ting.kt", "toAudioPlayInfo fail:" + e17.getLocalizedMessage());
            return null;
        }
    }

    public boolean Bi() {
        java.util.List p07;
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi == null || (p07 = Bi.p0()) == null || p07.isEmpty()) {
            return false;
        }
        java.util.Iterator it = p07.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).f93046d == 64) {
                return true;
            }
        }
        return false;
    }

    public boolean Di() {
        return ((java.lang.Boolean) ((jz5.n) ip1.e.f293588e).getValue()).booleanValue();
    }

    @Override // gp1.n
    public void N9(int i17, np1.a aVar, int i18, android.os.Bundle bundle, gp1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelFeatureService", "onAudioHistoryEnterCurrentTask bizType: " + i17);
        java.util.Set set = (java.util.Set) this.f349066d.get(i17);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.n) it.next()).N9(i17, aVar, i18, bundle, mVar);
            }
        }
    }

    public void Ni() {
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 != null) {
            b66.g d17 = ((jm4.w2) a17).d(bw5.eq0.TingMusic);
            if (d17 != null) {
                urgen.ur_2BA9.UR_882D.UR_23E5(((b66.i) d17).getCppPointer());
                this.f349068f = java.lang.System.currentTimeMillis();
            }
        }
    }

    public boolean Ri() {
        if (!ip1.r.f293611d || ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).bj()) {
            return false;
        }
        return (((c01.z1.i() & 268435456) > 0L ? 1 : ((c01.z1.i() & 268435456) == 0L ? 0 : -1)) == 0) && !((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode();
    }

    @Override // gp1.n
    public void T7(np1.a playInfo, int i17, int i18) {
        kotlin.jvm.internal.o.g(playInfo, "playInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelFeatureService", "onAudioHistoryPlay bizType: " + playInfo.f390973d);
        java.util.Set set = (java.util.Set) this.f349066d.get(playInfo.f390973d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.n) it.next()).T7(playInfo, i17, i18);
            }
        }
    }

    @Override // gp1.n
    public void X1(np1.a playInfo) {
        kotlin.jvm.internal.o.g(playInfo, "playInfo");
        java.util.Set set = (java.util.Set) this.f349066d.get(playInfo.f390973d);
        java.lang.String str = "onAudioHistoryPause bizType: " + playInfo.f390973d + ", listeners: %s";
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = set != null ? java.lang.Integer.valueOf(set.size()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelFeatureService", str, objArr);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.n) it.next()).X1(playInfo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if ((((java.lang.Number) ((jz5.n) r1).getValue()).intValue() & 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0053, code lost:
    
        if ((((java.lang.Number) ((jz5.n) r1).getValue()).intValue() & 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int wi() {
        /*
            r6 = this;
            ip1.e r0 = ip1.e.f293584a
            jz5.g r1 = ip1.e.f293586c
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            r0.a()
            boolean r0 = r0.a()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L56
            java.lang.Class<qk.h9> r0 = qk.h9.class
            i95.m r0 = i95.n0.c(r0)
            qk.h9 r0 = (qk.h9) r0
            ef0.d4 r0 = (ef0.d4) r0
            r0.getClass()
            gm4.a r0 = gm4.a.f273557a
            java.lang.String r5 = "key_recommend_loaded"
            boolean r0 = r0.a(r5, r3)
            if (r0 != 0) goto L68
            java.lang.String r0 = "MicroMsg.AudioPanelTaskBarConfig"
            java.lang.String r5 = "getAudioPanelShowStyle taskbar data not loaded"
            com.tencent.mars.xlog.Log.w(r0, r5)
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r0 = r0 & r4
            if (r0 == 0) goto L66
            goto L67
        L56:
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r0 = r0 & r4
            if (r0 == 0) goto L66
            goto L67
        L66:
            r2 = r3
        L67:
            r4 = r2
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.b.wi():int");
    }
}
