package cu3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin f222475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f222476e;

    public g(com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin, android.graphics.Bitmap bitmap) {
        this.f222475d = photoFilterPlugin;
        this.f222476e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = this.f222475d;
        for (cu3.d dVar : photoFilterPlugin.getItemViews()) {
            if (!dVar.f222471f) {
                oj0.c cVar = oj0.c.f345726a;
                android.graphics.Bitmap bitmap = this.f222476e;
                cVar.d(bitmap);
                int f17 = i65.a.f(photoFilterPlugin.getContext(), com.tencent.mm.R.dimen.f479731dn);
                int f18 = i65.a.f(photoFilterPlugin.getContext(), com.tencent.mm.R.dimen.f479731dn);
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    f17 = (int) ((bitmap.getWidth() / bitmap.getHeight()) * f18);
                } else if (bitmap.getWidth() < bitmap.getHeight()) {
                    f18 = (int) ((bitmap.getHeight() / bitmap.getWidth()) * f17);
                }
                photoFilterPlugin.post(new cu3.f(dVar, cVar.b(bitmap, dVar.f222467b, f17, f18, photoFilterPlugin.getDefaultWeight())));
            }
        }
    }
}
