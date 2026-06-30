package ue2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f426853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2.x f426854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f426855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.graphics.Bitmap bitmap, ue2.x xVar, mm2.c1 c1Var) {
        super(0);
        this.f426853d = bitmap;
        this.f426854e = xVar;
        this.f426855f = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f426853d;
        if (bitmap != null) {
            ue2.x xVar = this.f426854e;
            xVar.f426867q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xVar.f365323d.getContext().getResources(), bitmap));
            this.f426855f.I4 = bitmap;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
