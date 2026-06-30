package o53;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f343115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f343116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting, android.widget.ImageView imageView) {
        super(2);
        this.f343115d = localTabCornerSetting;
        this.f343116e = imageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load tabTopSetting icon finished bitmap = ");
        sb6.append(bitmap);
        sb6.append("  url:");
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting = this.f343115d;
        java.lang.String str = C ? localTabCornerSetting.f140178f : localTabCornerSetting.f140177e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("GameLiteSettingActionBar", sb6.toString());
        if (bitmap != null) {
            this.f343116e.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
