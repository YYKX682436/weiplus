package dz4;

/* loaded from: classes12.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245305a;

    /* renamed from: b, reason: collision with root package name */
    public dz4.n0 f245306b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f245307c;

    public i3(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245305a = holder;
        this.f245307c = jz5.h.b(new dz4.e3(this));
    }

    public final com.tencent.wechat.aff.favorites.j a(java.lang.String imgPath) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.wechat.aff.favorites.j jVar = new com.tencent.wechat.aff.favorites.j();
        java.lang.String b17 = hz4.l.b("ImageDataItem-".concat(imgPath), 18);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(b17);
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(hz4.l.c(gp0Var), true);
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(hz4.l.e(gp0Var), true);
        java.lang.String c17 = qz4.c.c(imgPath, i17);
        java.lang.String d17 = qz4.c.d(c17, i18);
        jVar.k(d17);
        jVar.l((int) com.tencent.mm.vfs.w6.k(d17));
        jz5.l c18 = c(d17);
        int intValue = ((java.lang.Number) c18.f302833d).intValue();
        int intValue2 = ((java.lang.Number) c18.f302834e).intValue();
        jVar.n(intValue);
        jVar.j(intValue2);
        jVar.g(c17);
        jVar.d(0);
        jVar.i((int) com.tencent.mm.vfs.w6.k(c17));
        jVar.e(true);
        jVar.c(com.tencent.mm.vfs.w6.n(imgPath));
        jVar.f(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createImageMediaInfoRespSync: thumbPath=");
        sb6.append(jVar.getThumbPath());
        sb6.append(", thumb_size=");
        sb6.append(jVar.f216807o);
        sb6.append(", thumbWidth=");
        sb6.append(jVar.f216805m);
        sb6.append(", thumbHeight=");
        sb6.append(jVar.f216806n);
        sb6.append(", media_path=");
        sb6.append(jVar.getMediaPath());
        sb6.append(", duration=");
        sb6.append(jVar.f216808p);
        sb6.append(", size=");
        sb6.append(jVar.f216801f);
        sb6.append(", is_image=");
        sb6.append(jVar.f216803h);
        sb6.append(", dataFmt=");
        sb6.append(jVar.f216811s[4] ? jVar.f216802g : "");
        sb6.append(", isRaw=");
        sb6.append(jVar.f216800e);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "createImageMediaInfoRespSync: thumbExist=" + com.tencent.mm.vfs.w6.j(d17) + ", mediaExist=" + com.tencent.mm.vfs.w6.j(c17));
        return jVar;
    }

    public final boolean b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_note_android_video_async_compress, false);
    }

    public final jz5.l c(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "getImageDimensions but imagePath err");
            return new jz5.l(0, 0);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
            if (d17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "recycle bitmap:%s", d17.toString());
                d17.recycle();
            }
            int i17 = options.outWidth;
            if (i17 <= 0) {
                i17 = 0;
            }
            int i18 = options.outHeight;
            return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 > 0 ? i18 : 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "Failed to get image dimensions for path: " + str + ", error: " + e17.getMessage());
            return new jz5.l(0, 0);
        }
    }

    public final void d(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaAsync start, photoCount: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(", videoCount: ");
        sb6.append(arrayList2 != null ? arrayList2.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        fz4.g gVar = (fz4.g) ((jz5.n) this.f245307c).getValue();
        dz4.h3 h3Var = new dz4.h3(this);
        gVar.getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processMediaAsync start, photoCount: ");
        sb7.append(arrayList != null ? arrayList.size() : 0);
        sb7.append(", videoCount: ");
        sb7.append(arrayList2 != null ? arrayList2.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", sb7.toString());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.lang.Object obj = new java.lang.Object();
        int i17 = ((arrayList == null || arrayList.isEmpty()) ? 1 : 0) ^ 1;
        int size = i17 + (arrayList2 != null ? arrayList2.size() : 0);
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync no media to process");
            h3Var.invoke(null);
            return;
        }
        fz4.f fVar = new fz4.f(obj, f0Var, arrayList3, size, h3Var);
        if (i17 != 0) {
            kotlin.jvm.internal.o.d(arrayList);
            fz4.d dVar = new fz4.d(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addImagesAsync start, imageCount: " + arrayList.size());
            if (arrayList.isEmpty()) {
                dVar.invoke(null);
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new fz4.a(arrayList, gVar, dVar));
            }
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            fz4.e eVar = new fz4.e(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync start, videoPath: ".concat(str));
            ((ku5.t0) ku5.t0.f312615d).g(new fz4.c(gVar, str, eVar));
        }
    }

    public final void e(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.app.Activity activity;
        android.app.Activity activity2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaSync start, photoCount: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(", videoCount: ");
        sb6.append(arrayList2 != null ? arrayList2.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        if (arrayList2 == null || arrayList2.isEmpty()) {
            if (arrayList == null || arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "handleMediaSync no media selected");
                dz4.n0 n0Var = this.f245306b;
                if (n0Var != null) {
                    n0Var.a(null);
                    return;
                }
                return;
            }
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245305a).f257944c;
            if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "addImageSync failed, Activity is null");
                return;
            }
            if (!arrayList.isEmpty()) {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490604zq), true, true, new dz4.c3(h0Var));
                ((ku5.t0) ku5.t0.f312615d).g(new dz4.d3(arrayList, this, h0Var));
                return;
            } else {
                dz4.n0 n0Var2 = this.f245306b;
                if (n0Var2 != null) {
                    n0Var2.a(null);
                    return;
                }
                return;
            }
        }
        java.lang.Object obj = arrayList2.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "addVideoSync mediaInfo is null, videoPath is %s", str);
            dz4.n0 n0Var3 = this.f245306b;
            if (n0Var3 != null) {
                n0Var3.a(null);
                return;
            }
            return;
        }
        int a17 = d17.a();
        iz4.k kVar = new iz4.k();
        kVar.f296134r = true;
        kVar.f296117t = "";
        kVar.f296135s = "";
        kVar.f296118u = a17;
        kVar.f296133q = 6;
        kVar.f296119v = com.tencent.mm.vfs.w6.n(str);
        kVar.f296103a = hz4.l.b(kVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(kVar.f296103a);
        gp0Var.i0(kVar.f296119v);
        java.lang.String e17 = hz4.l.e(gp0Var);
        kotlin.jvm.internal.o.f(e17, "getThumbPath(...)");
        java.lang.String c17 = hz4.l.c(gp0Var);
        kotlin.jvm.internal.o.f(c17, "getDataPathName(...)");
        java.lang.ref.WeakReference weakReference2 = ((ez4.u) this.f245305a).f257944c;
        if (weakReference2 == null || (activity2 = (android.app.Activity) weakReference2.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync failed, Activity is null");
            dz4.n0 n0Var4 = this.f245306b;
            if (n0Var4 != null) {
                n0Var4.a(null);
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync video is null");
            dz4.n0 n0Var5 = this.f245306b;
            if (n0Var5 != null) {
                n0Var5.a(null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync from path: %s", str);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(str);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        mz4.s sVar = new mz4.s(arrayList3, e17, c17, kVar, new dz4.g3(h0Var2, this, activity2));
        h0Var2.f310123d = db5.e1.Q(activity2, activity2.getString(com.tencent.mm.R.string.f490573yv), activity2.getString(com.tencent.mm.R.string.f490604zq), true, true, new dz4.f3(sVar, kVar));
        ((ku5.t0) ku5.t0.f312615d).h(sVar, "NoteEditor_importVideo");
    }
}
