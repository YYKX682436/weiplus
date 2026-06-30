package y14;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f458909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f458911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.widget.dialog.f4 f4Var, java.lang.String str, android.app.Activity activity) {
        super(0);
        this.f458909d = f4Var;
        this.f458910e = str;
        this.f458911f = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f458909d.dismiss();
        java.lang.String str = this.f458910e;
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "download image success: %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        intent.putExtra("CropImage_Filter", true);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        intent.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().j(c01.z1.r() + ".crop", true));
        intent.putExtra("CropImage_from_scene", 3);
        intent.putExtra("CropImage_source", 2);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setData(a17.h());
        ((com.tencent.mm.app.y7) f14.g.b()).q(this.f458911f, intent2, intent, g83.a.a(), 4, null);
        return jz5.f0.f302826a;
    }
}
