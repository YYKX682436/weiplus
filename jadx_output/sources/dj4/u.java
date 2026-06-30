package dj4;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final dj4.u f233049a = new dj4.u();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f233050b = new java.util.LinkedHashMap();

    public static /* synthetic */ void c(dj4.u uVar, android.content.Context context, android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, java.lang.String str2, java.lang.String str3, dj4.a aVar, int i17, boolean z17, int i18, java.lang.Object obj) {
        uVar.b(context, imageView, str, hVar, str2, str3, (i18 & 64) != 0 ? null : aVar, i17, (i18 & 256) != 0 ? true : z17);
    }

    public static void i(dj4.u uVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, boolean z17, android.content.Context context, float f17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            f17 = 1.5f;
        }
        float f18 = f17;
        if ((i17 & 32) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        uVar.getClass();
        imageView.hashCode();
        java.util.Objects.toString(bitmap);
        java.util.Objects.toString(context);
        if (bitmap == null) {
            return;
        }
        imageView.post(new dj4.r(str2, imageView, z17, bitmap, f18));
    }

    public final java.lang.String a(android.widget.ImageView iv6, mj4.h info) {
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.Object tag = iv6.getTag(com.tencent.mm.R.id.rrh);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        java.lang.String f17 = f(info);
        if ((str == null || r26.n0.N(str)) || !kotlin.jvm.internal.o.b(str, f17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "setHeaderView: img old oldIvBindInfo=" + str + ", newIvBindInfo=" + f17 + ", iv = " + iv6.hashCode());
            iv6.setImageBitmap(null);
        }
        f233050b.put(java.lang.String.valueOf(iv6.hashCode()), f17);
        return f17;
    }

    public final void b(android.content.Context context, android.widget.ImageView iv6, java.lang.String username, mj4.h info, java.lang.String str, java.lang.String filePath, dj4.a aVar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadImgAndSet called with: context = ");
        sb6.append(context);
        sb6.append(", iv = ");
        sb6.append(iv6.hashCode());
        sb6.append(", statusId = ");
        mj4.k kVar = (mj4.k) info;
        sb6.append(kVar.l());
        sb6.append(", username = ");
        sb6.append(username);
        sb6.append(", imgUrl = ");
        sb6.append(str);
        sb6.append(", filePath = ");
        sb6.append(filePath);
        sb6.append(", listener = ");
        sb6.append(aVar);
        sb6.append(", infoHash = ");
        sb6.append(i17);
        sb6.append(", needSetDefWhenDownload = ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        java.lang.String f17 = f(info);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.p())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "downloadImgAndSet: no imgUrl, had default back");
                g(iv6, info);
            } else if (com.tencent.mm.vfs.w6.j(filePath)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "downloadImgAndSet: no imgUrl, exist file=".concat(filePath));
                dj4.w.a(new dj4.f(filePath, iv6, info, weakReference, f17));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.StatusImgHandler", "downloadImgAndSet: hardcode default back, no imgUrl, no backgroundId, not exist file=".concat(filePath));
                iv6.setImageResource(bk4.e1.f21460a.b("text_state_default_image_11"));
            }
            if (aVar != null) {
                ((dj4.h) aVar).a();
                return;
            }
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadImgAndSet: memory cache exists=");
        sb7.append(Bi != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb7.toString());
        if (Bi != null) {
            i(this, iv6, Bi, kVar.v(), (android.content.Context) weakReference.get(), 0.0f, f17, 16, null);
            if (aVar != null) {
                ((dj4.h) aVar).a();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "downloadImgAndSet: img==null fileExists:" + com.tencent.mm.vfs.w6.j(filePath));
        if (com.tencent.mm.vfs.w6.j(filePath)) {
            dj4.w.a(new dj4.b(filePath, str, iv6, info, weakReference, f17, aVar));
            return;
        }
        if (z17) {
            g(iv6, info);
        }
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new dj4.e(java.lang.System.currentTimeMillis(), kVar.l(), filePath, info, str, iv6, i17, weakReference, f17, aVar));
    }

    public final void d(android.content.Context context, android.widget.ImageView iv6, java.lang.String username, mj4.h info, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "handleImgOnlyByUrl called with: context = " + context + ", iv = " + iv6 + ", username = " + username + ", useThumb = " + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleImgOnlyByUrl info = ");
        sb6.append(info);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        int hashCode = info.hashCode();
        iv6.setTag(com.tencent.mm.R.id.f484121d41, java.lang.Integer.valueOf(hashCode));
        java.lang.String a17 = a(iv6, info);
        mj4.k kVar = (mj4.k) info;
        java.lang.String i17 = z17 ? kVar.i() : kVar.j();
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "handleImgOnlyByUrl: no imgUrl, try default back");
            g(iv6, info);
        } else {
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(i17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleImgOnlyByUrl: cache bitmap exist=");
            sb7.append(Bi != null);
            sb7.append(", had imgUrl ");
            sb7.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb7.toString());
            if (Bi == null) {
                java.lang.String b17 = bk4.n.f21513a.b(i17);
                if (com.tencent.mm.vfs.w6.j(b17)) {
                    dj4.w.a(new dj4.i(b17, i17, iv6, info, context, a17));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.StatusImgHandler", "handleImgOnlyByUrl: try default back, load imgUrl, no bitmap, no file " + b17 + ", ");
                    g(iv6, info);
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(i17, new dj4.l(iv6, b17, info, i17, hashCode, context, a17));
                }
            } else {
                i(this, iv6, Bi, ((mj4.k) info).v(), context, 0.0f, a17, 16, null);
            }
        }
        iv6.setTag(com.tencent.mm.R.id.rrh, a17);
    }

    public final void e(android.content.Context context, android.widget.ImageView iv6, java.lang.String imgUrl, java.lang.String tag, boolean z17, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(imgUrl, "imgUrl");
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "loadByUrl() called with: context = " + context + ", iv = " + iv6 + ", imgUrl = " + imgUrl + ", tag = " + tag + ", isBlur = " + z17 + ", blurRadius = " + f17);
        iv6.setTag(com.tencent.mm.R.id.f484121d41, tag);
        if (com.tencent.mm.sdk.platformtools.t8.K0(imgUrl)) {
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(imgUrl);
        if (Bi != null) {
            i(this, iv6, Bi, z17, context, f17, null, 32, null);
            return;
        }
        java.lang.String b17 = bk4.n.f21513a.b(imgUrl);
        if (!com.tencent.mm.vfs.w6.j(b17)) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(imgUrl, new dj4.p(b17, imgUrl, iv6, tag, z17, context, f17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "loadByUrl: filePath:" + b17);
            dj4.w.a(new dj4.m(b17, imgUrl, iv6, z17, context, f17));
        }
    }

    public final java.lang.String f(mj4.h info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mj4.k kVar = (mj4.k) info;
        sb6.append(kVar.o());
        sb6.append('_');
        sb6.append(kVar.f327067b.field_CreateTime);
        return sb6.toString();
    }

    public final void g(android.widget.ImageView imageView, mj4.h hVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDefaultBackGround: hash=");
        sb6.append(imageView.hashCode());
        sb6.append(", statusId=");
        mj4.k kVar = (mj4.k) hVar;
        sb6.append(kVar.l());
        sb6.append(", backgroundId:");
        sb6.append(kVar.p());
        sb6.append(", old drawable: ");
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        sb6.append(drawable != null ? java.lang.Integer.valueOf(drawable.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.p())) {
            imageView.setImageResource(bk4.e1.f21460a.b(kVar.p()));
        } else if (imageView.getDrawable() == null) {
            imageView.setImageResource(bk4.e1.f21460a.b(kVar.p()));
        }
        imageView.hashCode();
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        if (drawable2 != null) {
            drawable2.hashCode();
        }
        kVar.l();
    }

    public final void h(android.content.Context context, java.lang.String username, android.widget.ImageView iv6, mj4.h hVar, boolean z17) {
        mj4.k kVar;
        bk4.n nVar;
        java.lang.String str;
        dj4.h hVar2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(iv6, "iv");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TextStatus.StatusImgHandler", "setHeaderView() called with: context = " + context + ", username = " + username + ", iv = " + iv6 + ", onlyUseThumb = " + z17, new java.lang.Object[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setHeaderView statusItem = ");
        sb6.append(hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        if (hVar == null) {
            return;
        }
        int hashCode = hVar.hashCode();
        iv6.setTag(com.tencent.mm.R.id.f484121d41, java.lang.Integer.valueOf(hashCode));
        java.lang.String a17 = a(iv6, hVar);
        bk4.n nVar2 = bk4.n.f21513a;
        if (z17) {
            mj4.k kVar2 = (mj4.k) hVar;
            java.lang.String i17 = kVar2.i();
            java.lang.String g17 = nVar2.g("thumb", kVar2.l(), i17);
            c(this, context, iv6, username, hVar, i17, g17 == null ? "" : g17, null, hashCode, false, 256, null);
        } else {
            java.lang.String f17 = f(hVar);
            mj4.k kVar3 = (mj4.k) hVar;
            java.lang.String j17 = kVar3.f327067b.field_MediaType == 2 ? "" : kVar3.j();
            java.lang.String g18 = nVar2.g("image", kVar3.l(), j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "downloadPicsAndSet>> called with: context = " + context + ", iv = " + iv6.hashCode() + ", statusId = " + kVar3.l() + ", username = " + username + ", infoHash = " + hashCode + ", picUrl = " + j17 + ", picFilePath = " + g18);
            if (!android.text.TextUtils.isEmpty(j17) && !android.text.TextUtils.isEmpty(g18)) {
                android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(j17);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadPicsAndSet>> memory cache exist=");
                sb7.append(Bi != null);
                sb7.append(", url:");
                sb7.append(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb7.toString());
                if (Bi != null) {
                    i(this, iv6, Bi, kVar3.v(), context, 0.0f, f17, 16, null);
                } else {
                    boolean j18 = com.tencent.mm.vfs.w6.j(g18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "downloadPicsAndSet>> imgFileExist exist=" + j18 + ", path=" + g18);
                    if (j18) {
                        dj4.w.a(new dj4.g(g18, j17, iv6, hVar, context, f17));
                    }
                }
            }
            java.lang.String str2 = j17;
            if (android.text.TextUtils.isEmpty(str2)) {
                kVar = kVar3;
                str = "thumb";
                nVar = nVar2;
                hVar2 = null;
            } else {
                kVar = kVar3;
                nVar = nVar2;
                str = "thumb";
                hVar2 = new dj4.h(context, iv6, username, hVar, str2, g18, hashCode);
            }
            java.lang.String i18 = kVar.i();
            java.lang.String g19 = nVar.g(str, kVar.l(), i18);
            java.lang.String str3 = g19 == null ? "" : g19;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "begin download thumb:".concat(str3));
            c(this, context, iv6, username, hVar, i18, str3, hVar2, hashCode, false, 256, null);
        }
        iv6.setTag(com.tencent.mm.R.id.rrh, a17);
    }

    public final void j(java.lang.String username, mj4.h info) {
        java.lang.String j17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb() called with: username = " + username + ", info = " + info);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_status_pic_preload_strategy_and, 1);
        if (Ni == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "do not triggerDownloadThumb");
            return;
        }
        boolean z17 = (Ni == 0 && ((mj4.k) info).f327067b.field_MediaType == 1) ? false : true;
        if (z17) {
            j17 = ((mj4.k) info).i();
        } else {
            if (z17) {
                throw new jz5.j();
            }
            j17 = ((mj4.k) info).j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb preloadStrategy=" + Ni + ", useThumb=" + z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17) || ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(j17) != null) {
            return;
        }
        mj4.k kVar = (mj4.k) info;
        java.lang.String g17 = bk4.n.f21513a.g(z17 ? "thumb" : "image", kVar.l(), j17);
        boolean j18 = com.tencent.mm.vfs.w6.j(g17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb: no memory cache, fileExists=" + j18 + ", filePath=" + g17 + ", statusId=" + kVar.l());
        if (j18 || g17 == null) {
            return;
        }
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(j17, new dj4.t(kVar.l(), g17, info, j17));
    }
}
