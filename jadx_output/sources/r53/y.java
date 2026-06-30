package r53;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f392717e = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH) + "image/";

    /* renamed from: f, reason: collision with root package name */
    public static r53.y f392718f;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f392720b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.j f392721c = new jt0.i(6, r53.y.class);

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f392722d = new jt0.i(15, r53.y.class);

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f392719a = new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#EFEFF4"));

    public y() {
        try {
            android.graphics.Bitmap c17 = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            this.f392720b = c17;
            if (c17 != null && !c17.isRecycled()) {
                com.tencent.mm.sdk.platformtools.x.s0(this.f392720b, false, r0.getWidth() * 0.5f);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameImageUtil", e17.getMessage());
        }
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().add(new r53.o(this));
    }

    public static r53.y a() {
        if (f392718f == null) {
            synchronized (r53.y.class) {
                if (f392718f == null) {
                    f392718f = new r53.y();
                }
            }
        }
        return f392718f;
    }

    public void b(android.widget.ImageView imageView, java.lang.String str, float f17) {
        android.graphics.Bitmap bitmap;
        if (imageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        kk.j jVar = this.f392721c;
        if (((lt0.f) jVar).k(str) && (bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(str)) != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 1, f17);
        if (Di != null && !Di.isRecycled()) {
            imageView.setImageBitmap(Di);
            ((jt0.i) jVar).put(str, Di);
        } else {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(imageView);
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            zo3.p.Ri().add(new r53.u(this, str, f17, weakReference));
        }
    }

    public android.graphics.Bitmap c(android.widget.ImageView imageView, java.lang.String str) {
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        if (a17 != null && !a17.isRecycled()) {
            if (imageView != null) {
                imageView.setImageBitmap(a17);
            }
            return a17;
        }
        android.graphics.Bitmap bitmap = this.f392720b;
        if (bitmap == null || bitmap.isRecycled()) {
            try {
                this.f392720b = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            } catch (java.lang.Exception unused) {
            }
        }
        android.graphics.Bitmap bitmap2 = this.f392720b;
        if (bitmap2 != null && !bitmap2.isRecycled() && imageView != null) {
            imageView.setImageBitmap(this.f392720b);
        }
        return this.f392720b;
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str, r53.w wVar, r53.x xVar) {
        o11.f fVar = new o11.f();
        wVar.getClass();
        fVar.f342077a = true;
        java.lang.String str2 = f392717e;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(s17.o() + java.lang.System.currentTimeMillis());
                if (r6Var2.J()) {
                    r6Var2.L(s17);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameImageUtil", "mkdir error, %s", s17.o());
                }
            }
            if (!r6Var.J() || !r6Var.y()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameImageUtil", "mkdir error. %s", str2);
            }
        }
        java.lang.String str3 = str2 + kk.k.g(str.getBytes());
        fVar.f342078b = wVar.f392711b;
        fVar.f342082f = str3;
        fVar.f342096t = wVar.f392712c;
        fVar.f342095s = false;
        if (imageView != null && wVar.f392714e) {
            int i17 = wVar.f392715f;
            if (i17 == 0) {
                imageView.setImageDrawable(this.f392719a);
            } else {
                imageView.setImageResource(i17);
            }
        }
        n11.a.b().i(str, null, fVar.a(), new r53.q(this, xVar, wVar, imageView));
    }

    public void e(android.widget.ImageView imageView, java.lang.String str, r53.w wVar, r53.x xVar) {
        android.graphics.Bitmap bitmap;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (wVar == null) {
            wVar = new r53.v().a();
        }
        boolean z17 = false;
        if (wVar.f392710a) {
            kk.j jVar = this.f392722d;
            if (((lt0.f) jVar).k(str) && (bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(str)) != null && !bitmap.isRecycled()) {
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                if (xVar != null) {
                    xVar.a(imageView, bitmap);
                }
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        d(imageView, str, wVar, xVar);
    }

    public void f(android.widget.ImageView imageView, java.lang.String str, int i17, int i18, int i19) {
        r53.s sVar = new r53.s(this, imageView, i18, i17, i19);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f392722d).i(str);
        if (bitmap == null || bitmap.isRecycled()) {
            d(null, str, new r53.v().a(), new r53.t(this, sVar, i17, i18, 0, str));
        } else {
            sVar.a(null, bitmap);
        }
    }
}
