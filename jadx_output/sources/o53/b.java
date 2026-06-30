package o53;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f343112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f343113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o53.e f343114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting, android.widget.ImageView imageView, o53.e eVar) {
        super(2);
        this.f343112d = localTabCornerSetting;
        this.f343113e = imageView;
        this.f343114f = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load tabTopSetting icon finished bitmap = ");
        sb6.append(bitmap);
        sb6.append("  url:");
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting = this.f343112d;
        java.lang.String str = C ? localTabCornerSetting.f140178f : localTabCornerSetting.f140177e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("GameLiteSettingActionBar", sb6.toString());
        android.widget.ImageView imageView = this.f343113e;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            kotlin.jvm.internal.o.f(imageView, "$imageView");
            this.f343114f.d(imageView, com.tencent.mm.R.raw.game_msg_top_tip);
        }
        return jz5.f0.f302826a;
    }
}
