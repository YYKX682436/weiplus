package ya2;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context) {
        super(1);
        this.f460431d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.au2 resp = (r45.au2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "type " + resp.getInteger(1) + " qrcode_generator_version " + resp.getInteger(2));
        int integer = resp.getInteger(1);
        android.content.Context context = this.f460431d;
        if (integer == 1) {
            android.content.Intent intent = new android.content.Intent();
            r45.ry0 ry0Var = (r45.ry0) resp.getCustom(3);
            intent.putExtra("feed_object_id", ry0Var != null ? java.lang.Long.valueOf(ry0Var.getLong(0)) : null);
            r45.ry0 ry0Var2 = (r45.ry0) resp.getCustom(3);
            intent.putExtra("key_share_open_image_source_ref_comment_id", ry0Var2 != null ? java.lang.Long.valueOf(ry0Var2.getLong(1)) : null);
            intent.putExtra("key_need_related_list", false);
            intent.putExtra("business_type", 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(55, 45, 25, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.A(context, intent, false);
        } else {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.giz);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
