package k50;

/* loaded from: classes9.dex */
public final class d1 extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f304202s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f304202s = "";
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.c();
    }

    @Override // m50.x
    public int b7() {
        return 43;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        if (!com.tencent.mm.vfs.w6.j(((jd5.c) c7()).k())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardVideoUIC", "file not exist");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            u1Var.g(getActivity().getString(com.tencent.mm.R.string.nch));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            return false;
        }
        rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        java.lang.String filePath = ((jd5.c) c7()).k();
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.tencent.wework.api.IWWAPI.WWAppType d17 = com.tencent.mm.ui.chatting.hd.d(action.f454741b);
        ((com.tencent.mm.ui.chatting.fd) k1Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.ui.chatting.hd.s(context, filePath, d17);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x015b, code lost:
    
        if (com.tencent.mm.vfs.w6.j(tg3.u0.e8((tg3.u0) r3, r0, bm5.f0.f22571s, r12.d(), false, 8, null)) == false) goto L31;
     */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o7(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.d1.o7(java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        gp.d dVar;
        super.onCreateAfter(bundle);
        com.tencent.mm.storage.f9 e76 = e7();
        int i17 = 0;
        if (e76 != null) {
            jd5.c cVar = (jd5.c) c7();
            java.lang.String Q0 = e76.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            cVar.set(cVar.f43702d + 1, Q0);
            jd5.c cVar2 = (jd5.c) c7();
            cVar2.set(cVar2.f43702d + 0, java.lang.Long.valueOf(e76.getMsgId()));
            jd5.c cVar3 = (jd5.c) c7();
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String L4 = tg3.u0.L4((tg3.u0) c17, e76, e76.z0(), false, 4, null);
            if (L4 == null) {
                L4 = "";
            }
            cVar3.o(L4);
            jd5.c cVar4 = (jd5.c) c7();
            i95.m c18 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c18, e76, bm5.f0.f22571s, ((jd5.c) c7()).k(), false, 8, null);
            cVar4.r(e86 != null ? e86 : "");
        } else {
            if (d61.c.a(((jd5.c) c7()).getThumbPath())) {
                ((jd5.c) c7()).o("");
            }
            if (!com.tencent.mm.vfs.w6.j(((jd5.c) c7()).k())) {
                jd5.c cVar5 = (jd5.c) c7();
                i95.m c19 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                java.lang.String e87 = tg3.u0.e8((tg3.u0) c19, null, bm5.f0.f22571s, ((jd5.c) c7()).k(), false, 8, null);
                if (e87 == null) {
                    e87 = "";
                }
                cVar5.r(e87);
                if (!com.tencent.mm.vfs.w6.j(((jd5.c) c7()).k())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ForwardVideoUIC", "file not exist, ");
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(((jd5.c) c7()).getThumbPath())) {
                r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                java.lang.String k17 = ((jd5.c) c7()).k();
                ((q90.i) lVar).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(k17);
                if (p17 != null) {
                    java.lang.String o17 = new com.tencent.mm.vfs.r6(getContext().getCacheDir(), "tempthumb_" + java.lang.System.currentTimeMillis()).o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    this.f304202s = o17;
                    try {
                        com.tencent.mm.sdk.platformtools.x.D0(p17, 60, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                        ((jd5.c) c7()).o(this.f304202s);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardVideoUIC", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            if (((jd5.c) c7()).getVideoDuration() <= 0) {
                jd5.c cVar6 = (jd5.c) c7();
                java.lang.String k18 = ((jd5.c) c7()).k();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(k18)) {
                    gp.d dVar2 = null;
                    try {
                        try {
                            try {
                                dVar = new gp.d();
                            } catch (java.lang.Exception e18) {
                                e = e18;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            dVar = dVar2;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        dVar.setDataSource(k18);
                        i17 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0) / 1000;
                        dVar.release();
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        dVar2 = dVar;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardVideoUIC", e, "", new java.lang.Object[0]);
                        if (dVar2 != null) {
                            dVar2.release();
                        }
                        cVar6.q(i17);
                        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
                        com.tencent.mm.sdk.platformtools.x.r0(((jd5.c) c7()).getThumbPath(), pInt, pInt2);
                        ((jd5.c) c7()).p(pInt.value);
                        ((jd5.c) c7()).n(pInt2.value);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        if (dVar != null) {
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                cVar6.q(i17);
            }
        }
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt22 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.sdk.platformtools.x.r0(((jd5.c) c7()).getThumbPath(), pInt3, pInt22);
        ((jd5.c) c7()).p(pInt3.value);
        ((jd5.c) c7()).n(pInt22.value);
    }

    @Override // m50.x, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.vfs.w6.h(this.f304202s);
    }

    @Override // m50.x
    public java.lang.String p7() {
        com.tencent.mm.storage.f9 e76 = e7();
        if (e76 != null) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, e76, bm5.f0.f22571s, e76.z0(), false, 8, null);
            if (!(e86 == null || r26.n0.N(e86)) && com.tencent.mm.vfs.w6.j(e86)) {
                return e86;
            }
        }
        java.lang.String k17 = ((jd5.c) c7()).k();
        if ((k17 == null || r26.n0.N(k17)) || !com.tencent.mm.vfs.w6.j(k17)) {
            return null;
        }
        return k17;
    }
}
