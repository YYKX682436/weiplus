package x82;

/* loaded from: classes9.dex */
public class v implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f452536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452537c;

    public v(o72.r2 r2Var, r45.gp0 gp0Var, android.content.Context context) {
        this.f452535a = r2Var;
        this.f452536b = gp0Var;
        this.f452537c = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", this.f452535a.field_localId);
        intent.putExtra("key_detail_data_id", this.f452536b.T);
        intent.putExtra("show_share", false);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(this.f452537c, ".ui.FavImgGalleryUI", intent, null);
    }
}
