package q53;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f360187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f360188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q53.f f360189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting, android.widget.ImageView imageView, q53.f fVar) {
        super(2);
        this.f360187d = localTabCornerSetting;
        this.f360188e = imageView;
        this.f360189f = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        com.tencent.mars.xlog.Log.i("GameWebSettingActionBar", "load tabTopSetting icon finished bitmap = " + bitmap + "  url:" + this.f360187d.f140177e);
        android.widget.ImageView imageView = this.f360188e;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            kotlin.jvm.internal.o.f(imageView, "$imageView");
            this.f360189f.m(imageView, com.tencent.mm.R.raw.game_msg_top_tip);
        }
        return jz5.f0.f302826a;
    }
}
