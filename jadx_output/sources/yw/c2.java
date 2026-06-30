package yw;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f466286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        super(1);
        this.f466286d = weakReference;
        this.f466287e = bizShareInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f466286d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f466434a;
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) weakReference.get();
                kotlin.jvm.internal.o.d(str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_width", 640);
                intent.putExtra("Ksnsupload_height", 640);
                com.tencent.pigeon.biz.BizShareInfo bizShareInfo = this.f466287e;
                c01.l2 c17 = c01.n2.d().c(c01.n2.a(bizShareInfo.getMsgId()), true);
                java.lang.Long itemShowType = bizShareInfo.getItemShowType();
                c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", itemShowType != null ? java.lang.Integer.valueOf((int) itemShowType.longValue()) : null);
                c17.i("_tmpl_webview_transfer_scene", 10);
                com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
                kotlin.jvm.internal.o.d(mMActivity);
                androidx.appcompat.app.AppCompatActivity context = mMActivity.getContext();
                y7Var.getClass();
                intent.putExtra("Ksnsupload_type", 0);
                intent.putExtra("sns_kemdia_path", str);
                j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
