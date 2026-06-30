package x82;

/* loaded from: classes9.dex */
public class z implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452550b;

    public z(o72.r2 r2Var, android.content.Context context) {
        this.f452549a = r2Var;
        this.f452550b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        r45.kv2 kv2Var = this.f452549a.field_favProto.M;
        if (kv2Var != null) {
            com.tencent.mm.plugin.fav.ui.x2.f101594a.a(this.f452550b, kv2Var);
        }
    }
}
