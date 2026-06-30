package dz4;

/* loaded from: classes12.dex */
public final class j0 implements com.tencent.wechat.aff.wenote.j {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245309a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.aff.wenote.i f245310b;

    /* renamed from: c, reason: collision with root package name */
    public final dz4.g0 f245311c = new dz4.g0(this);

    /* renamed from: d, reason: collision with root package name */
    public final dz4.o f245312d = new dz4.o(this);

    public j0(ih0.p pVar) {
        this.f245309a = pVar;
    }

    public static final void a(dz4.j0 j0Var, long j17, java.lang.String str, float f17, float f18) {
        com.tencent.wechat.aff.wenote.i iVar = j0Var.f245310b;
        if (iVar != null) {
            com.tencent.wechat.aff.favorites.o oVar = new com.tencent.wechat.aff.favorites.o();
            oVar.f216844d = str;
            boolean[] zArr = oVar.f216847g;
            zArr[1] = true;
            oVar.f216845e = f17;
            zArr[2] = true;
            oVar.f216846f = f18;
            zArr[3] = true;
            iVar.A1(j17, oVar);
        }
    }

    public final com.tencent.wechat.aff.favorites.c b(android.net.Uri uri, java.lang.String str) {
        try {
            java.lang.String uri2 = uri.toString();
            kotlin.jvm.internal.o.f(uri2, "toString(...)");
            java.lang.String h17 = o35.a.h(uri);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(uri2));
            if (!r6Var.m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildFileInfoResp: file not exist, path=".concat(uri2));
                return null;
            }
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            if (r6Var.C() >= ip.c.g()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildFileInfoResp: file too large, size=" + r6Var.C());
                return null;
            }
            kotlin.jvm.internal.o.d(h17);
            java.lang.String p07 = r26.n0.B(h17, ".", false) ? r26.n0.p0(h17, ".", h17) : str != null ? r26.n0.p0(str, "/", str) : com.tencent.mm.vfs.w6.n(h17);
            iz4.d dVar = new iz4.d();
            dVar.f296156t = h17;
            dVar.f296157u = hz4.l.d((float) r6Var.C());
            dVar.f296133q = 5;
            dVar.f296134r = true;
            dVar.f296158v = p07;
            dVar.f296103a = hz4.l.b(dVar.toString(), 18);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(dVar.f296103a);
            gp0Var.i0(dVar.f296158v);
            java.lang.String c17 = hz4.l.c(gp0Var);
            com.tencent.mm.vfs.w6.c(uri2, c17);
            com.tencent.wechat.aff.favorites.c cVar = new com.tencent.wechat.aff.favorites.c();
            boolean[] zArr = cVar.f216747h;
            cVar.f216743d = c17;
            zArr[1] = true;
            cVar.f216744e = h17;
            zArr[2] = true;
            cVar.f216745f = (int) com.tencent.mm.vfs.w6.k(c17);
            zArr[3] = true;
            cVar.f216746g = p07;
            zArr[4] = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildFileInfoResp: path=");
            sb6.append(zArr[1] ? cVar.f216743d : "");
            sb6.append(", name=");
            sb6.append(zArr[2] ? cVar.f216744e : "");
            sb6.append(", size=");
            sb6.append(cVar.f216745f);
            sb6.append(", fmt=");
            sb6.append(zArr[4] ? cVar.f216746g : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", sb6.toString());
            return cVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildFileInfoResp: error " + e17);
            return null;
        }
    }

    public final com.tencent.wechat.aff.favorites.j c(java.lang.String str) {
        long j17;
        try {
            com.tencent.wechat.aff.favorites.j jVar = new com.tencent.wechat.aff.favorites.j();
            java.lang.String b17 = hz4.l.b("ImageDataItem-" + str, 18);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(b17);
            java.lang.String c17 = hz4.l.c(gp0Var);
            try {
                j17 = com.tencent.mm.vfs.w6.d(str, c17, false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildImageMediaInfoResp: copy file error " + e17);
                j17 = -1;
            }
            if (j17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildImageMediaInfoResp: copy file failed, imgPath=" + str);
                return null;
            }
            jz5.l f17 = f(c17);
            int intValue = ((java.lang.Number) f17.f302833d).intValue();
            int intValue2 = ((java.lang.Number) f17.f302834e).intValue();
            jVar.k(c17);
            jVar.l((int) com.tencent.mm.vfs.w6.k(c17));
            jVar.n(intValue);
            jVar.j(intValue2);
            jVar.g(c17);
            jVar.d(0);
            jVar.i((int) com.tencent.mm.vfs.w6.k(c17));
            jVar.e(true);
            jVar.c(com.tencent.mm.vfs.w6.n(str));
            jVar.f(false);
            jVar.f216809q = b17;
            boolean[] zArr = jVar.f216811s;
            zArr[11] = true;
            jVar.f216810r = true;
            zArr[12] = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildImageMediaInfoResp: dataId=" + b17 + ", thumbPath=" + jVar.getThumbPath() + ", mediaPath=" + jVar.getMediaPath() + ", needCompress=true");
            return jVar;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildImageMediaInfoResp: error " + e18);
            return null;
        }
    }

    public final com.tencent.wechat.aff.favorites.j d(java.lang.String str) {
        gp.a aVar;
        long j17;
        try {
            ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp mediaInfo is null, importPath=" + str);
                return null;
            }
            int a17 = d17.a();
            android.content.Intent intent = new android.content.Intent();
            intent.setData(android.net.Uri.parse("file://" + str));
            try {
                aVar = gp.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: getVideoMetadata error " + e17);
                aVar = null;
            }
            if (aVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: meta is null, importPath=" + str);
                return null;
            }
            if (a17 < 0) {
                a17 = com.tencent.mm.sdk.platformtools.t8.V1(aVar.f274161c);
            }
            iz4.k kVar = new iz4.k();
            kVar.f296134r = true;
            kVar.f296118u = a17;
            kVar.f296133q = 6;
            kVar.f296119v = com.tencent.mm.vfs.w6.n(str);
            kVar.f296132p = (int) com.tencent.mm.vfs.w6.k(str);
            kVar.f296103a = hz4.l.b(kVar.toString(), 18);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(kVar.f296103a);
            gp0Var.i0(kVar.f296119v);
            java.lang.String e18 = hz4.l.e(gp0Var);
            java.lang.String c17 = hz4.l.c(gp0Var);
            android.graphics.Bitmap bitmap = aVar.f274160b;
            kotlin.jvm.internal.o.d(e18);
            e(bitmap, e18);
            kVar.f296117t = e18;
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            if (com.tencent.mm.vfs.w6.k(str) >= ip.c.g()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: file too large, importPath=" + str);
                return null;
            }
            try {
                j17 = com.tencent.mm.vfs.w6.d(str, c17, false);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: copy file error " + e19);
                j17 = -1;
            }
            if (j17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: copy file failed");
                return null;
            }
            kVar.f296135s = c17;
            com.tencent.wechat.aff.favorites.j jVar = new com.tencent.wechat.aff.favorites.j();
            jVar.k(kVar.f296117t);
            jVar.l((int) com.tencent.mm.vfs.w6.k(kVar.f296117t));
            jz5.l f17 = f(kVar.f296117t);
            int intValue = ((java.lang.Number) f17.f302833d).intValue();
            int intValue2 = ((java.lang.Number) f17.f302834e).intValue();
            jVar.n(intValue);
            jVar.j(intValue2);
            jVar.g(kVar.f296135s);
            jVar.d(kVar.f296118u);
            jVar.i(kVar.f296132p);
            jVar.e(false);
            jVar.c(kVar.f296119v);
            jVar.f(false);
            jVar.f216809q = kVar.f296103a;
            boolean[] zArr = jVar.f216811s;
            zArr[11] = true;
            jVar.f216810r = true;
            zArr[12] = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: dataId=" + kVar.f296103a + ", thumbPath=" + jVar.getThumbPath() + ", mediaPath=" + jVar.getMediaPath() + ", needCompress=true");
            return jVar;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "buildVideoMediaInfoResp: error " + e27);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.FlutterWeNoteNativeHelperImpl"
            r1 = 1
            r2 = 100
            if (r6 == 0) goto L20
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> Le
            com.tencent.mm.sdk.platformtools.x.D0(r6, r2, r3, r7, r1)     // Catch: java.lang.Exception -> Le
            r6 = r1
            goto L21
        Le:
            r6 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "createThumbnail: saveBitmapToImage error "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.tencent.mars.xlog.Log.e(r0, r6)
        L20:
            r6 = 0
        L21:
            if (r6 != 0) goto L45
            r6 = 320(0x140, float:4.48E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Bitmap r6 = com.tencent.mm.sdk.platformtools.x.q(r4, r6, r3)     // Catch: java.lang.Exception -> L33
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L33
            com.tencent.mm.sdk.platformtools.x.D0(r6, r2, r3, r7, r1)     // Catch: java.lang.Exception -> L33
            goto L45
        L33:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "createThumbnail: black thumbnail error "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.e(r0, r6)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.j0.e(android.graphics.Bitmap, java.lang.String):void");
    }

    public final jz5.l f(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.tencent.mm.vfs.w6.j(str)) {
            return new jz5.l(0, 0);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.graphics.e.d(str, options);
            int i17 = options.outWidth;
            if (i17 <= 0) {
                i17 = 0;
            }
            int i18 = options.outHeight;
            return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 > 0 ? i18 : 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "getImageDimensions: error " + e17);
            return new jz5.l(0, 0);
        }
    }
}
