package ph4;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph4.b f354477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f354478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph4.j f354479g;

    public g(android.graphics.Bitmap bitmap, ph4.b bVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, ph4.j jVar) {
        this.f354476d = bitmap;
        this.f354477e = bVar;
        this.f354478f = multiTaskInfo;
        this.f354479g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph4.b bVar = this.f354477e;
        android.graphics.Bitmap bitmap = this.f354476d;
        if (bitmap != null) {
            bVar.f354462e.setImageBitmap(bitmap);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[bitmap is null] " + this.f354478f.field_id);
        this.f354479g.c(bVar);
    }
}
