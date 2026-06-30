package n11;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static n11.a f334047d;

    /* renamed from: a, reason: collision with root package name */
    public n11.b f334048a;

    /* renamed from: b, reason: collision with root package name */
    public o11.d f334049b;

    /* renamed from: c, reason: collision with root package name */
    public final p11.k f334050c = new com.tencent.mm.modelimage.loader.impr.i();

    public a(android.content.Context context) {
        int i17 = o11.d.f342062o;
        f(new o11.c(context).a());
    }

    public static synchronized n11.a b() {
        n11.a aVar;
        synchronized (n11.a.class) {
            if (f334047d == null) {
                f334047d = new n11.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            aVar = f334047d;
        }
        return aVar;
    }

    public void a(java.lang.String str, android.widget.ImageView imageView) {
        this.f334048a.b(new n11.c(imageView, str));
    }

    public void c() {
        o11.d dVar;
        n11.b bVar = this.f334048a;
        if (bVar == null || (dVar = bVar.f334051a) == null) {
            return;
        }
        dVar.f342068f.clear();
        ((com.tencent.mm.modelimage.loader.impr.a) dVar.f342069g).getClass();
        t11.b.a();
    }

    public void d(java.lang.String str, o11.g gVar, p11.d dVar) {
        this.f334048a.f334052b.execute(new s11.a(str, gVar, this.f334048a, dVar));
    }

    public android.graphics.Bitmap e(java.lang.String str) {
        o11.d dVar;
        n11.b bVar = this.f334048a;
        if (bVar == null || (dVar = bVar.f334051a) == null) {
            return null;
        }
        return dVar.f342068f.get(str);
    }

    public final synchronized void f(o11.d dVar) {
        if (dVar == null) {
            throw new java.lang.IllegalArgumentException("[cpan] image loader configuration is null.");
        }
        if (this.f334049b == null) {
            this.f334048a = new n11.b(dVar);
            this.f334049b = dVar;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
        }
    }

    public void g(java.lang.String str, android.widget.ImageView imageView) {
        l(str, imageView, null, null, null, null, null, null, null);
    }

    public void h(java.lang.String str, android.widget.ImageView imageView, o11.g gVar) {
        l(str, imageView, gVar, null, null, null, null, null, null);
    }

    public void i(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.h hVar) {
        l(str, imageView, gVar, null, null, hVar, null, null, null);
    }

    public void j(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.k kVar) {
        l(str, imageView, gVar, kVar, null, null, null, null, null);
    }

    public void k(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.k kVar, p11.h hVar) {
        l(str, imageView, gVar, kVar, null, hVar, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r20, android.widget.ImageView r21, o11.g r22, p11.k r23, p11.l r24, p11.h r25, p11.f r26, p11.e r27, p11.n r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n11.a.l(java.lang.String, android.widget.ImageView, o11.g, p11.k, p11.l, p11.h, p11.f, p11.e, p11.n):void");
    }

    public void m(java.lang.String str, android.widget.ImageView imageView, p11.h hVar) {
        l(str, imageView, null, null, null, hVar, null, null, null);
    }

    public void n(int i17) {
        if (i17 == 0 || i17 == 1) {
            this.f334048a.f334052b.resume();
        } else {
            this.f334048a.f334052b.pause();
        }
    }

    public void o(java.lang.String str, android.graphics.Bitmap bitmap) {
        o11.d dVar;
        n11.b bVar = this.f334048a;
        if (bVar == null || (dVar = bVar.f334051a) == null) {
            return;
        }
        dVar.f342068f.a(str, bitmap);
    }

    public void p(java.lang.String str) {
        o11.d dVar;
        n11.b bVar = this.f334048a;
        if (bVar == null || (dVar = bVar.f334051a) == null) {
            return;
        }
        dVar.f342068f.remove(str);
    }

    public final void q(android.widget.ImageView imageView, o11.g gVar) {
        if (imageView == null || gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
            return;
        }
        android.graphics.drawable.Drawable drawable = gVar.f342119q;
        int i17 = gVar.f342118p;
        if (!(i17 > 0 || drawable != null)) {
            if (gVar.f342123u) {
                imageView.setImageDrawable(null);
            }
        } else {
            if (i17 != 0) {
                imageView.setImageResource(i17);
                return;
            }
            android.content.res.Resources resources = this.f334049b.f342064b;
            if (i17 != 0) {
                drawable = resources.getDrawable(i17);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public a(o11.d dVar) {
        f(dVar);
    }
}
