package oj2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj2.l f345770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, oj2.l lVar) {
        super(0);
        this.f345769d = bitmap;
        this.f345770e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f345769d;
        if (bitmap != null) {
            oj2.l lVar = this.f345770e;
            android.widget.ImageView anchorAudioCoverView = lVar.getAnchorAudioCoverView();
            if (anchorAudioCoverView != null) {
                anchorAudioCoverView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(lVar.getContext().getResources(), bitmap));
            }
            lVar.getPluginAbility().a0().D(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
