package sj3;

/* loaded from: classes4.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408549e;

    public h3(android.graphics.Bitmap bitmap, android.content.Context context) {
        this.f408548d = bitmap;
        this.f408549e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = q75.c.a("jpg");
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(this.f408548d, 100, android.graphics.Bitmap.CompressFormat.JPEG, a17, true);
        android.content.Context context = this.f408549e;
        if (!D0) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
        } else if (D0) {
            q75.c.g(a17, context);
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i8b, q75.c.d()), 1).show();
        }
    }
}
