package q53;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f360190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f360191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting, android.widget.ImageView imageView) {
        super(2);
        this.f360190d = localTabCornerSetting;
        this.f360191e = imageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        com.tencent.mars.xlog.Log.i("GameWebSettingActionBar", "load tabTopSetting icon finished bitmap = " + bitmap + "  url:" + this.f360190d.f140177e);
        if (bitmap != null) {
            this.f360191e.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
