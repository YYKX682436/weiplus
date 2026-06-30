package fh4;

/* loaded from: classes15.dex */
public class d0 extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public int f262672d;

    /* renamed from: e, reason: collision with root package name */
    public float f262673e;

    /* renamed from: f, reason: collision with root package name */
    public float f262674f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.SurfaceHolder f262675g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f262676h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f262677i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f262678m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f262679n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f262680o;

    /* renamed from: p, reason: collision with root package name */
    public int f262681p;

    /* renamed from: q, reason: collision with root package name */
    public int f262682q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f262683r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f262684s;

    /* renamed from: t, reason: collision with root package name */
    public float f262685t;

    /* renamed from: u, reason: collision with root package name */
    public float f262686u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.PaintFlagsDrawFilter f262687v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f262688w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f262689x;

    /* renamed from: y, reason: collision with root package name */
    public float[] f262690y;

    public d0(com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter talkRoomVolumeMeter, android.content.Context context) {
        super(context);
        this.f262672d = 100;
        this.f262673e = 0.0f;
        this.f262674f = 0.0f;
        this.f262684s = false;
        this.f262685t = 0.0f;
        this.f262686u = 0.0f;
        this.f262688w = false;
        this.f262689x = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f262675g = holder;
        holder.addCallback(this);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f262679n = paint;
        paint.setAntiAlias(true);
        this.f262687v = new android.graphics.PaintFlagsDrawFilter(0, 3);
        this.f262683r = new com.tencent.mm.sdk.platformtools.b4(new fh4.c0(this), true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.f262674f = 0.0f;
        this.f262673e = i19 - (this.f262676h == null ? 190 : r2.getHeight());
        float f17 = this.f262674f;
        this.f262685t = f17;
        this.f262686u = f17;
        this.f262682q = i18;
        android.graphics.Bitmap bitmap = this.f262676h;
        this.f262681p = bitmap != null ? bitmap.getHeight() : 190;
        int i27 = (int) this.f262685t;
        this.f262680o = new android.graphics.Rect(0, i27, this.f262682q, this.f262681p + i27);
        this.f262684s = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482156bo3));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f262676h = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482155bo2));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f262678m = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482157bo4));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f262677i = decodeResource3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f262684s = false;
        this.f262683r.d();
        android.graphics.Bitmap bitmap = this.f262676h;
        if (bitmap != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap.toString());
            this.f262676h.recycle();
            this.f262676h = null;
        }
        android.graphics.Bitmap bitmap2 = this.f262678m;
        if (bitmap2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap2.toString());
            this.f262678m.recycle();
            this.f262678m = null;
        }
        android.graphics.Bitmap bitmap3 = this.f262677i;
        if (bitmap3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap3.toString());
            this.f262677i.recycle();
            this.f262677i = null;
        }
    }
}
