package g40;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public h40.b f268675a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.v2 f268676b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f268677c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f268678d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f268679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f268680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f268681g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f268682h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f268683i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f268684j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f268685k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.q0 f268686l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f268687m;

    public g(h40.b downloadFromScene) {
        kotlin.jvm.internal.o.g(downloadFromScene, "downloadFromScene");
        this.f268675a = downloadFromScene;
        this.f268680f = "";
        this.f268681g = "";
        this.f268685k = new java.util.ArrayList();
        this.f268676b = new g40.c(this);
    }

    public final void a(i40.a aVar) {
        if (aVar != null) {
            java.util.ArrayList arrayList = this.f268685k;
            boolean z17 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (kotlin.jvm.internal.o.b(((java.lang.ref.WeakReference) it.next()).get(), aVar)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "callback: isExist");
            } else {
                arrayList.add(new java.lang.ref.WeakReference(aVar));
            }
        }
    }

    public final void b(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "callbackSceneEnd: errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        if (this.f268678d == null) {
            return;
        }
        boolean z17 = true;
        if (!(i17 == 0 && i18 == 0)) {
            com.tencent.mm.storage.f9 f9Var = this.f268679e;
            if (f9Var != null) {
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, java.lang.String.valueOf(f9Var.getMsgId()), f9Var.I0(), false, false, f9Var.Q0());
            }
            g(i17, i18, str, null);
            return;
        }
        com.tencent.mm.storage.f9 f9Var2 = this.f268679e;
        if (f9Var2 != null) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, java.lang.String.valueOf(f9Var2.getMsgId()), f9Var2.I0(), true, false, f9Var2.Q0());
        }
        d();
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f268678d;
        if (dVar != null && (str2 = dVar.field_fileFullPath) != null) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, com.tencent.mm.vfs.w6.k(str2) >= ez.v0.f257777a.h() ? 130 : 6, null, null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDownloadSucceed, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f268685k;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.c();
            }
        }
        com.tencent.mm.storage.f9 f9Var3 = this.f268679e;
        if (f9Var3 != null) {
            com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f268678d;
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(dVar2 != null ? dVar2.field_fileFullPath : null);
            if (n17 != null && n17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "reportDownloadSucceed " + f9Var3.getMsgId() + ", " + f9Var3.Q0() + ", " + f9Var3.I0() + ", ext is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "reportDownloadSucceed " + f9Var3.getMsgId() + ", " + f9Var3.Q0() + ", " + f9Var3.I0() + ", downloadFromScene: " + this.f268675a.f278725d);
                ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
                kotlin.jvm.internal.o.d(n17);
                ((com.tencent.mm.pluginsdk.model.app.d3) w2Var).Ai(f9Var3, n17, this.f268675a.f278725d, "");
            }
        }
        kz5.h0.B(arrayList, g40.f.f268674d);
    }

    public final void c(i40.b bVar) {
        if (bVar != null) {
            this.f268687m = new java.lang.ref.WeakReference(bVar);
        }
        this.f268686l = new g40.a(this);
        sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
        java.lang.String str = this.f268677c;
        if (str == null) {
            str = "";
        }
        ((rx.f) b0Var).wi(str, new java.lang.ref.WeakReference(this.f268686l));
        d();
    }

    public final void d() {
        com.tencent.mm.storage.f9 f9Var = this.f268679e;
        if (f9Var != null) {
            ((com.tencent.mm.pluginsdk.model.app.a3) ((ct.v2) i95.n0.c(ct.v2.class))).getClass();
            d35.h.f226344a.a(f9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.tencent.mm.storage.f9 r27, java.lang.String r28, i40.a r29, boolean r30, boolean r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g40.g.e(com.tencent.mm.storage.f9, java.lang.String, i40.a, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(com.tencent.mm.pluginsdk.model.app.d dVar) {
        dVar.field_status = 198L;
        ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0]);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(n17, dVar, 4, false);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.getMsgId(), n17, true);
        b(3, -5103087, "filename too long");
    }

    public final void g(int i17, int i18, java.lang.String str, h40.d dVar) {
        jz5.f0 f0Var;
        com.tencent.mm.modelcdntran.n1 n1Var;
        dn.h hVar;
        com.tencent.mm.modelcdntran.n1 n1Var2;
        dn.h hVar2;
        com.tencent.mm.modelcdntran.n1 n1Var3;
        dn.h hVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDownloadFailed, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f268685k;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        boolean z17 = true;
        if (!((dVar == null || (n1Var3 = dVar.f278735b) == null || (hVar3 = n1Var3.f71108f) == null || hVar3.field_retCode != -5103059) ? false : true)) {
            if (!((dVar == null || (n1Var2 = dVar.f278735b) == null || (hVar2 = n1Var2.f71108f) == null || hVar2.field_retCode != -5103017) ? false : true)) {
                z17 = false;
            }
        }
        if (dVar != null && (n1Var = dVar.f278735b) != null && (hVar = n1Var.f71108f) != null) {
            i18 = hVar.field_retCode;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.d(i17, i18, str, z17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                arrayList2.add(f0Var);
            }
        }
        kz5.h0.B(arrayList, g40.f.f268674d);
    }

    public final void h(long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProcessUpdate, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f268685k;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(j17, j18);
            }
        }
        kz5.h0.B(arrayList, g40.f.f268674d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.tencent.mm.storage.f9 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g40.d
            if (r0 == 0) goto L13
            r0 = r6
            g40.d r0 = (g40.d) r0
            int r1 = r0.f268672f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268672f = r1
            goto L18
        L13:
            g40.d r0 = new g40.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f268670d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268672f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r4.f268682h
            if (r6 == 0) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L39:
            java.lang.Class<pt.j0> r6 = pt.j0.class
            i95.m r6 = i95.n0.c(r6)
            pt.j0 r6 = (pt.j0) r6
            r0.f268672f = r3
            ez.e r6 = (ez.e) r6
            java.lang.Object r6 = r6.oj(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            cu.a r6 = (cu.a) r6
            boolean r5 = r6.f222305a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g40.g.i(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String j(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        if (com.tencent.mm.vfs.w6.j(str)) {
            pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
            java.lang.String q17 = com.tencent.mm.vfs.w6.q(str);
            kotlin.jvm.internal.o.f(q17, "getNameWithoutExt(...)");
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
            kotlin.jvm.internal.o.f(n17, "getFileExt(...)");
            str = ((ez.e) j0Var).cj(f9Var, q17, n17, true);
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f268678d;
            if (dVar != null) {
                dVar.field_fileFullPath = str;
            }
        }
        return str;
    }

    public final void k(com.tencent.mm.pluginsdk.model.app.d dVar, long j17) {
        dVar.field_status = 199L;
        dVar.field_offset = j17;
        dVar.field_totalLen = j17;
        ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0]);
    }

    public final void l(com.tencent.mm.pluginsdk.model.app.d dVar) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
        if (n17.P0() == 5) {
            n17.r1(3);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.getMsgId(), n17, true);
        } else {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(n17.Q0(), "update", n17, 0));
        }
        b(0, 0, "");
    }
}
