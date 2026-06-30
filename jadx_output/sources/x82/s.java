package x82;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.pp0 f452529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452530b;

    public s(r45.pp0 pp0Var, android.content.Context context) {
        this.f452529a = pp0Var;
        this.f452530b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("map_indoor_support", 1);
        r45.pp0 pp0Var = this.f452529a;
        if (pp0Var != null) {
            intent.putExtra("kwebmap_slat", pp0Var.f383268f);
            intent.putExtra("kwebmap_lng", pp0Var.f383266d);
            intent.putExtra("Kwebmap_locaion", pp0Var.f383272m);
        }
        intent.putExtra("kShowshare", false);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        j45.l.j(this.f452530b, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }
}
