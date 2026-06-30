package sj3;

/* loaded from: classes12.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408601e;

    public j3(android.graphics.Bitmap bitmap, android.content.Context context) {
        this.f408600d = bitmap;
        this.f408601e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = q75.c.a("jpg");
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(this.f408600d, 100, android.graphics.Bitmap.CompressFormat.JPEG, a17, true);
        android.content.Context context = this.f408601e;
        if (!D0) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
            return;
        }
        if (D0) {
            q75.c.g(a17, context);
            com.tencent.mm.plugin.multitalk.model.z zVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().C;
            if (zVar != null) {
                zVar.D2(a17);
            }
        }
    }
}
