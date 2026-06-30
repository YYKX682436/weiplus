package du0;

/* loaded from: classes5.dex */
public final class t0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f243440d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f243441e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f243442f;

    /* renamed from: g, reason: collision with root package name */
    public volatile pp0.r0 f243443g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243440d = new com.tencent.maas.material.MJMaterialInfo(0, "publisher_title_6", 61132L, "", "http://wxapp.tc.qq.com/269/20304/stodownload?m=&filekey=30240201010410300e0202010d040253480400020215d8040d00000004627466730000000132&hy=SH&storeid=264db2f0e00081f93be38d92e0000010d00004f5053481748bbc1e654f0d95&bizid=1023", "", new java.util.HashMap());
        this.f243441e = new com.tencent.maas.material.MJMaterialInfo(1, "publisher_text_9", 64539L, "", "http://wxapp.tc.qq.com/269/20304/stodownload?m=&filekey=30240201010410300e0202010d0402534804000202195c040d00000004627466730000000132&hy=SH&storeid=2652e4d87000b0c3abe38d92e0000010d00004f50534813b36031509d2b43d&bizid=1023", "http://wxapp.tc.qq.com/269/20303/stodownload?m=&filekey=30240201010410300e0202010d040253480400020202e8040d00000004627466730000000132&hy=SH&storeid=2652e4d8b0004c158be38d92e0000010d00004f4f534822181bc1e6ecb50ce&bizid=1023", kz5.c1.i(new jz5.l("support_multi_subtitles", "1")));
        this.f243442f = new com.tencent.maas.material.MJMaterialInfo(1, "publisher_text_white", 69063L, "", "http://wxapp.tc.qq.com/269/20304/stodownload?m=&filekey=30240201010410300e0202010d04025348040002021a0b040d00000004627466730000000132&hy=SH&storeid=265659d1f000be851be38d92e0000010d00004f50534825f34b00b702d7f89&bizid=1023", "http://wxapp.tc.qq.com/269/20303/stodownload?m=&filekey=30240201010410300e0202010d040253480400020202ec040d00000004627466730000000132&hy=SH&storeid=265659d210000b5b4be38d92e0000010d00004f4f534806361b01e6e967006&bizid=1023", new java.util.HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:3:0x000d, B:5:0x0019, B:7:0x0021, B:8:0x0029, B:10:0x0033, B:13:0x003a, B:15:0x0056, B:16:0x0059, B:18:0x005f, B:19:0x0062, B:25:0x00a6, B:27:0x00ba, B:28:0x00ce, B:47:0x00df, B:48:0x00e2, B:21:0x0090, B:24:0x00a3, B:40:0x00d8, B:41:0x00db, B:44:0x00dd), top: B:2:0x000d, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:3:0x000d, B:5:0x0019, B:7:0x0021, B:8:0x0029, B:10:0x0033, B:13:0x003a, B:15:0x0056, B:16:0x0059, B:18:0x005f, B:19:0x0062, B:25:0x00a6, B:27:0x00ba, B:28:0x00ce, B:47:0x00df, B:48:0x00e2, B:21:0x0090, B:24:0x00a3, B:40:0x00d8, B:41:0x00db, B:44:0x00dd), top: B:2:0x000d, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(du0.t0 r10, com.tencent.maas.material.MJMaterialInfo r11, com.tencent.mm.vfs.r6 r12) {
        /*
            r10.getClass()
            java.lang.String r0 = ".zip"
            java.lang.String r1 = "MaterialResourceLoadUIC"
            java.lang.String r2 = "tryRegisterLocalMaterial "
            java.lang.String r3 = "materials/"
            java.lang.String r4 = "tryRegisterLocalMaterial: absolutePath "
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Le3
            java.lang.String r5 = r11.f48224b     // Catch: java.lang.Throwable -> Le3
            kotlin.jvm.internal.o.d(r5)     // Catch: java.lang.Throwable -> Le3
            pp0.r0 r6 = r10.f243443g     // Catch: java.lang.Throwable -> Le3
            r7 = 0
            if (r6 == 0) goto L30
            az0.k5 r6 = (az0.k5) r6     // Catch: java.lang.Throwable -> Le3
            boolean r8 = r6.b()     // Catch: java.lang.Throwable -> Le3
            if (r8 == 0) goto L29
            java.lang.String r6 = "MaasMaterialManager"
            java.lang.String r8 = "loadMaterialPack when call is release"
            com.tencent.mars.xlog.Log.w(r6, r8)     // Catch: java.lang.Throwable -> Le3
            goto L30
        L29:
            com.tencent.maas.material.MJMaterialManager r6 = r6.f15627a     // Catch: java.lang.Throwable -> Le3
            boolean r6 = r6.d(r5)     // Catch: java.lang.Throwable -> Le3
            goto L31
        L30:
            r6 = r7
        L31:
            if (r6 == 0) goto L3a
            java.lang.String r10 = "tryRegisterLocalMaterial: already load success"
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Throwable -> Le3
            goto Lfb
        L3a:
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r8.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r9 = r11.f48224b     // Catch: java.lang.Throwable -> Le3
            r8.append(r9)     // Catch: java.lang.Throwable -> Le3
            r8.append(r0)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Le3
            r6.<init>(r12, r8)     // Catch: java.lang.Throwable -> Le3
            boolean r12 = r6.m()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto L59
            r6.l()     // Catch: java.lang.Throwable -> Le3
        L59:
            boolean r12 = r6.m()     // Catch: java.lang.Throwable -> Le3
            if (r12 != 0) goto L62
            r6.k()     // Catch: java.lang.Throwable -> Le3
        L62:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r12.<init>(r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r4 = r6.o()     // Catch: java.lang.Throwable -> Le3
            r12.append(r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Le3
            com.tencent.mars.xlog.Log.i(r1, r12)     // Catch: java.lang.Throwable -> Le3
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()     // Catch: java.lang.Throwable -> Le3
            android.content.res.AssetManager r12 = r12.getAssets()     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Le3
            r4.append(r5)     // Catch: java.lang.Throwable -> Le3
            r4.append(r0)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le3
            java.io.InputStream r12 = r12.open(r0)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = r6.o()     // Catch: java.lang.Throwable -> Ldc
            java.io.OutputStream r0 = com.tencent.mm.vfs.w6.K(r0, r7)     // Catch: java.lang.Throwable -> Ldc
            kotlin.jvm.internal.o.d(r12)     // Catch: java.lang.Throwable -> Ld5
            kotlin.jvm.internal.o.d(r0)     // Catch: java.lang.Throwable -> Ld5
            r3 = 2
            r4 = 0
            vz5.a.b(r12, r0, r7, r3, r4)     // Catch: java.lang.Throwable -> Ld5
            vz5.b.a(r0, r4)     // Catch: java.lang.Throwable -> Ldc
            vz5.b.a(r12, r4)     // Catch: java.lang.Throwable -> Le3
            long r11 = r11.f48225c     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = r6.o()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r3 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r0, r3)     // Catch: java.lang.Throwable -> Le3
            boolean r10 = r10.T6(r5, r11, r0)     // Catch: java.lang.Throwable -> Le3
            if (r10 == 0) goto Lce
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r10.<init>(r2)     // Catch: java.lang.Throwable -> Le3
            r10.append(r5)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r11 = ": success"
            r10.append(r11)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Le3
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Throwable -> Le3
        Lce:
            jz5.f0 r10 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> Le3
            goto Lee
        Ld5:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r11 = move-exception
            vz5.b.a(r0, r10)     // Catch: java.lang.Throwable -> Ldc
            throw r11     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Lde
        Lde:
            r11 = move-exception
            vz5.b.a(r12, r10)     // Catch: java.lang.Throwable -> Le3
            throw r11     // Catch: java.lang.Throwable -> Le3
        Le3:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        Lee:
            java.lang.Throwable r10 = kotlin.Result.m524exceptionOrNullimpl(r10)
            if (r10 == 0) goto Lfb
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.tencent.mars.xlog.Log.e(r1, r2, r10)
        Lfb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: du0.t0.O6(du0.t0, com.tencent.maas.material.MJMaterialInfo, com.tencent.mm.vfs.r6):void");
    }

    public final java.util.List P6(java.lang.String materialID) {
        java.util.List c17;
        kotlin.jvm.internal.o.g(materialID, "materialID");
        pp0.r0 r0Var = this.f243443g;
        if (r0Var != null) {
            az0.k5 k5Var = (az0.k5) r0Var;
            if (k5Var.b()) {
                com.tencent.mars.xlog.Log.w("MaasMaterialManager", "cancelAll when call is release");
                c17 = null;
            } else {
                c17 = k5Var.f15627a.c(materialID);
            }
            if (c17 != null) {
                return c17;
            }
        }
        return kz5.p0.f313996d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q6(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "materialID"
            kotlin.jvm.internal.o.g(r5, r0)
            pp0.r0 r0 = r4.f243443g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            az0.k5 r0 = (az0.k5) r0
            com.tencent.maas.material.MJMaterialManager r0 = r0.f15627a
            boolean r0 = r0.e(r5)
            if (r0 != r1) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 != 0) goto L3e
            pp0.r0 r0 = r4.f243443g
            if (r0 == 0) goto L39
            az0.k5 r0 = (az0.k5) r0
            boolean r3 = r0.b()
            if (r3 == 0) goto L2f
            java.lang.String r5 = "MaasMaterialManager"
            java.lang.String r0 = "loadMaterialPack when call is release"
            com.tencent.mars.xlog.Log.w(r5, r0)
            r5 = r2
            goto L35
        L2f:
            com.tencent.maas.material.MJMaterialManager r0 = r0.f15627a
            boolean r5 = r0.d(r5)
        L35:
            if (r5 != r1) goto L39
            r5 = r1
            goto L3a
        L39:
            r5 = r2
        L3a:
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: du0.t0.Q6(java.lang.String):boolean");
    }

    public final java.lang.Object R6(int i17, kotlin.coroutines.Continuation continuation) {
        com.tencent.maas.material.g a17 = com.tencent.maas.material.g.a(i17);
        if (a17 == com.tencent.maas.material.g.None) {
            return null;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        du0.m0 m0Var = new du0.m0(nVar);
        pp0.r0 r0Var = this.f243443g;
        if (r0Var != null) {
            du0.l0 l0Var = new du0.l0(a17, m0Var);
            az0.k5 k5Var = (az0.k5) r0Var;
            if (k5Var.b()) {
                com.tencent.mars.xlog.Log.w("MaasMaterialManager", "loadMaterialPack when call is release");
            } else {
                k5Var.f15627a.g(a17, l0Var);
            }
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }

    public final java.lang.Object S6(java.lang.String materialID, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MaterialResourceLoadUIC", "loadMaterialWithResult: materialID " + materialID);
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        du0.n0 n0Var = du0.n0.f243388d;
        du0.o0 o0Var = new du0.o0(nVar);
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.mars.xlog.Log.i("MaterialResourceLoadUIC", "loadMaterial: materialID ".concat(materialID));
        pp0.r0 r0Var = this.f243443g;
        if (r0Var != null) {
            du0.j0 j0Var = new du0.j0(n0Var);
            du0.k0 k0Var = new du0.k0(materialID, o0Var);
            az0.k5 k5Var = (az0.k5) r0Var;
            if (k5Var.b()) {
                com.tencent.mars.xlog.Log.w("MaasMaterialManager", "loadMaterial when call is release");
            } else {
                k5Var.f15627a.f(materialID, j0Var, k0Var);
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final boolean T6(java.lang.String materialID, long j17, java.lang.String zipFilepath) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(zipFilepath, "zipFilepath");
        pp0.r0 r0Var = this.f243443g;
        if (r0Var == null) {
            return false;
        }
        az0.k5 k5Var = (az0.k5) r0Var;
        if (k5Var.b()) {
            com.tencent.mars.xlog.Log.w("MaasMaterialManager", "loadMaterialPack when call is release");
            return false;
        }
        com.tencent.maas.instamovie.base.MJError h17 = k5Var.f15627a.h(materialID, j17, zipFilepath);
        if (h17 == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MaasMaterialManager", "registerLocalStickerMaterial errorCode  " + h17.f48175ec.getErrorCode() + " message " + h17.message);
        return false;
    }

    public final void U6(pp0.r0 r0Var) {
        this.f243443g = r0Var;
        if (r0Var != null) {
            this.f243444h = kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.s0(this, null), 3, null);
        }
    }

    public final java.lang.Object V6(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var;
        java.lang.Object C;
        kotlinx.coroutines.r2 r2Var2 = this.f243444h;
        boolean z17 = false;
        if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
            z17 = true;
        }
        return (z17 && (r2Var = this.f243444h) != null && (C = ((kotlinx.coroutines.c3) r2Var).C(continuation)) == pz5.a.f359186d) ? C : jz5.f0.f302826a;
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        pp0.r0 r0Var = this.f243443g;
        if (r0Var != null) {
            ((az0.k5) r0Var).a();
        }
        pp0.r0 r0Var2 = this.f243443g;
        if (r0Var2 != null) {
            ((az0.k5) r0Var2).c();
        }
        super.onCleared();
    }
}
