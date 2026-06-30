package sj2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj2.f f408377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.graphics.Bitmap bitmap, sj2.f fVar) {
        super(0);
        this.f408376d = bitmap;
        this.f408377e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f408376d;
        if (bitmap != null) {
            sj2.f fVar = this.f408377e;
            fVar.N.f262184g.setImageDrawable(new android.graphics.drawable.BitmapDrawable(fVar.getContext().getResources(), bitmap));
            fVar.getPluginAbility().a0().D(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
