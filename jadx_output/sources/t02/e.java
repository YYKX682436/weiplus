package t02;

@j95.b
/* loaded from: classes12.dex */
public final class e extends jm0.o implements a00.i {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(u02.b.class);
    }

    public zz.b Zi(java.lang.String str, int i17, java.lang.String str2, byte[] bArr) {
        i95.m c17 = i95.n0.c(t02.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        u02.b bVar = (u02.b) ((jm0.g) a17);
        if (str == null) {
            str = "";
        }
        return bVar.T6(str, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT + i17, str2, bArr);
    }

    public boolean aj(java.lang.String md52, long j17, java.lang.String savePath, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(savePath, "savePath");
        i95.m c17 = i95.n0.c(t02.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        p75.l0 A0 = dm.n2.A0(md52, j17);
        w02.a aVar = w02.b.f441874m;
        zz.a aVar2 = (zz.a) A0.o(aVar.a().Q4(), zz.a.class);
        v02.m0 m0Var = v02.m0.f432270a;
        if (aVar2 == null) {
            f0Var = null;
        } else {
            if (com.tencent.mm.vfs.w6.j(aVar2.getPath()) && com.tencent.mm.vfs.w6.k(aVar2.getPath()) > 0 && com.tencent.mm.vfs.w6.k(aVar2.getPath()) == aVar2.y0()) {
                java.lang.String path = aVar2.getPath();
                kotlin.jvm.internal.o.f(path, "getPath(...)");
                java.lang.String w07 = aVar2.w0();
                kotlin.jvm.internal.o.f(w07, "getId(...)");
                long u07 = aVar2.u0();
                if (kotlin.jvm.internal.o.b(path, savePath)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + w07 + ", but same path!!!");
                    m0Var.a(5, j17, u07);
                    r10 = true;
                } else {
                    r10 = com.tencent.mm.vfs.w6.d(path, savePath, true) >= 0;
                    if (r10) {
                        m0Var.a(3, j17, u07);
                    } else {
                        m0Var.a(4, j17, u07);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar2.w0() + ", copy link to " + savePath + ", result: " + r10);
                return r10;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar2.w0() + ", but origin file deleted!!!");
            com.tencent.mars.xlog.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "remove the empty line, res:" + dm.n2.t0(aVar2, false).a(aVar.a().Q4()));
            m0Var.a(2, j17, aVar2.u0());
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            m0Var.a(1, j17, i17);
        }
        return r10;
    }

    public zz.b bj(java.lang.String str, int i17, java.lang.String str2, byte[] bArr) {
        boolean z17;
        i95.m c17 = i95.n0.c(t02.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        zz.b T6 = ((u02.b) ((jm0.g) a17)).T6(str == null ? "" : str, 0 + i17, str2, bArr);
        if (T6.f477692b) {
            return T6;
        }
        yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        if (!b1Var.Ui()) {
            return T6;
        }
        if (str != null) {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DupCheckFeatureService", "linkDuplicatedFileByWxFileIndex err: " + e17.getMessage());
                if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                    throw e17;
                }
            }
            if (str.length() != 0) {
                z17 = false;
                if (!z17 && b1Var.Zi(str, i17)) {
                    zz.b bVar = new zz.b();
                    bVar.f477691a = T6.f477691a;
                    bVar.f477692b = true;
                    bVar.f477693c = T6.f477693c;
                    bVar.f477694d = true;
                    bVar.f477695e = T6.f477695e;
                    return bVar;
                }
                return T6;
            }
        }
        z17 = true;
        if (!z17) {
            zz.b bVar2 = new zz.b();
            bVar2.f477691a = T6.f477691a;
            bVar2.f477692b = true;
            bVar2.f477693c = T6.f477693c;
            bVar2.f477694d = true;
            bVar2.f477695e = T6.f477695e;
            return bVar2;
        }
        return T6;
    }

    public void cj(java.lang.String str, int i17, java.lang.String str2, byte[] bArr, yz5.l lVar) {
        final t02.c cVar = new t02.c(this, str, i17, str2, bArr, lVar);
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            cVar.invoke();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).i(new java.util.concurrent.Callable(cVar) { // from class: t02.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f414419d;

            {
                kotlin.jvm.internal.o.g(cVar, "function");
                this.f414419d = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return this.f414419d.invoke();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zz.b fj(java.lang.String r19, int r20, java.lang.String r21, long r22, byte[] r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t02.e.fj(java.lang.String, int, java.lang.String, long, byte[]):zz.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zz.b hj(java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t02.e.hj(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String):zz.b");
    }

    public boolean ij() {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigEnableC2CIncrementalClean()) != 1) {
            return false;
        }
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a())) {
            if (!(com.tencent.mm.sdk.platformtools.x2.n() ? ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ui() : ((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), t02.b.class)).f68400d)) {
                return false;
            }
        }
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSrcBtnEntrance()) == 1;
    }

    public void mj(java.lang.Long l17, java.lang.String str) {
        if (l17 == null || str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DupCheckFeatureService", "[triggerC2CIncrementalClean] null param, msgId = " + l17 + ", talker = " + str);
            return;
        }
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigEnableC2CIncrementalClean()) == 1) || l17.longValue() <= 0) {
            return;
        }
        if (str.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DupCheckFeatureService", "[triggerC2CIncrementalClean] triggered msgId = " + l17 + ", talker = " + str);
            long longValue = l17.longValue();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).hj(longValue, str, true);
                return;
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", longValue);
            bundle.putString("talker", str);
            com.tencent.mm.ipcinvoker.extension.l.a(str2, bundle, t02.a.class, null);
        }
    }
}
