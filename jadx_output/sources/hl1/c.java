package hl1;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hl1.d f282085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f282087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f282088h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, hl1.d dVar, android.view.View view, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        super(1);
        this.f282084d = j17;
        this.f282085e = dVar;
        this.f282086f = view;
        this.f282087g = bitmap;
        this.f282088h = bitmap2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenBackgroundEmbedRenderer", "requestEffect cost[" + (java.lang.System.currentTimeMillis() - this.f282084d) + ']');
            hl1.d dVar = this.f282085e;
            dVar.f282090f = bitmap;
            dVar.f282091g = false;
            android.view.View view = this.f282086f;
            android.view.ViewParent parent = view != null ? view.getParent() : null;
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        this.f282087g.recycle();
        this.f282088h.recycle();
        return jz5.f0.f302826a;
    }
}
