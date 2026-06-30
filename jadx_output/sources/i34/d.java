package i34;

/* loaded from: classes11.dex */
public class d extends android.graphics.drawable.BitmapDrawable implements x51.r0 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.graphics.Paint f288311m;

    /* renamed from: n, reason: collision with root package name */
    public static android.graphics.Bitmap f288312n;

    /* renamed from: d, reason: collision with root package name */
    public int f288313d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f288314e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f288315f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f288316g;

    /* renamed from: h, reason: collision with root package name */
    public x51.o0 f288317h;

    /* renamed from: i, reason: collision with root package name */
    public final int f288318i;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f288311m = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public d(android.widget.ImageView imageView, java.lang.String str, int i17) {
        super(imageView.getResources(), a(imageView, i17));
        this.f288318i = -1;
        this.f288316g = imageView;
        this.f288315f = str;
        this.f288318i = i17;
        invalidateSelf();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    public static android.graphics.Bitmap a(android.view.View view, int i17) {
        if (view == null) {
            return f288312n;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        android.graphics.Bitmap bitmap = f288312n;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            try {
                if (i17 > 0) {
                    f288312n = com.tencent.mm.sdk.platformtools.x.K0(view.getResources().getDrawable(i17));
                } else {
                    f288312n = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
                }
                if (f288312n.getWidth() != measuredWidth && measuredWidth > 0 && measuredHeight > 0) {
                    f288312n = android.graphics.Bitmap.createScaledBitmap(f288312n, measuredWidth, measuredHeight, true);
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", e17, "", new java.lang.Object[0]);
            }
        }
        return f288312n;
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
            return null;
        }
        java.lang.String c17 = h34.v.c();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return java.lang.String.format("%s/%s", c17, kk.k.g(str.getBytes()));
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
        return null;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", java.lang.Integer.valueOf(this.f288313d), str, this.f288314e);
        x51.o0 o0Var = this.f288317h;
        if (o0Var == null || !str.equals(o0Var.c())) {
            return;
        }
        int i17 = this.f288313d;
        if (4 == i17 || (h34.z.d(i17) && 6 != this.f288313d)) {
            this.f288316g.post(new i34.b(this, bitmap));
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", this.f288315f, this.f288314e, java.lang.Integer.valueOf(this.f288313d), toString());
        int i17 = this.f288313d;
        if (4 == i17 || (h34.z.d(i17) && 6 != this.f288313d)) {
            int i18 = this.f288313d;
            if (4 == i18) {
                this.f288317h = new i34.c(this.f288314e);
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                x51.o0 o0Var = this.f288317h;
                ((x60.e) fVar).getClass();
                bitmap = x51.w0.d(o0Var);
            } else if (!h34.z.d(i18) || 6 == this.f288313d) {
                bitmap = null;
            } else {
                this.f288317h = new j34.h(this.f288314e);
                y60.f fVar2 = (y60.f) i95.n0.c(y60.f.class);
                x51.o0 o0Var2 = this.f288317h;
                ((x60.e) fVar2).getClass();
                bitmap = x51.w0.d(o0Var2);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", this.f288314e);
                bitmap = a(this.f288316g, this.f288318i);
            }
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (android.graphics.Rect) null, getBounds(), f288311m);
            }
        }
    }
}
