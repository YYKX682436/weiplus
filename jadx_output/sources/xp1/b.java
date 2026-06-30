package xp1;

/* loaded from: classes5.dex */
public class b implements com.tencent.mm.ui.widget.dialog.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f455871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f455872b;

    public b(com.tencent.mm.ui.widget.dialog.u1 u1Var, android.app.Activity activity) {
        this.f455871a = u1Var;
        this.f455872b = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        this.f455871a.f211998c.dismiss();
        if (z18) {
            this.f455872b.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).apply();
        }
    }
}
