package i53;

/* loaded from: classes8.dex */
public class c4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f288536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut3.c f288537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f288538f;

    public c4(i53.d4 d4Var, android.os.Bundle bundle, ut3.c cVar) {
        this.f288538f = d4Var;
        this.f288536d = bundle;
        this.f288537e = cVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: user selected: %d", java.lang.Integer.valueOf(menuItem.getItemId()));
        com.tencent.mm.plugin.game.api.GameShareOption gameShareOption = (com.tencent.mm.plugin.game.api.GameShareOption) this.f288538f.f288561d.f140089m.get(menuItem.getItemId());
        if (gameShareOption == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: non option!!");
            return;
        }
        this.f288536d.putInt("key_selected_item", gameShareOption.f138694d);
        this.f288537e.a();
    }
}
