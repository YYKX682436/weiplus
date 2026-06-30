package or1;

/* loaded from: classes9.dex */
public class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.i1 f347502d;

    public h1(or1.i1 i1Var) {
        this.f347502d = i1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        or1.i1 i1Var = this.f347502d;
        if (itemId != 2) {
            if (itemId != 3) {
                if (itemId != 4) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", i1Var.f347506d.f347511b);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, i1Var.f347506d.f347510a);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(i1Var.f347506d.f347510a, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.class);
            or1.j1 j1Var = i1Var.f347506d;
            intent2.putExtra("enterprise_biz_name", j1Var.f347511b);
            intent2.putExtra("enterprise_scene", 2);
            android.app.Activity activity = j1Var.f347510a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        qk.o6 o6Var = (qk.o6) i95.n0.c(qk.o6.class);
        java.lang.String str2 = i1Var.f347506d.f347511b;
        ((c01.j0) o6Var).getClass();
        try {
            r01.m y07 = r01.q3.bj().y0(str2);
            r45.ik ikVar = new r45.ik();
            ikVar.parseFrom(y07.field_raw_attrs);
            str = ikVar.f377105g;
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        or1.j1 j1Var2 = i1Var.f347506d;
        if (z17) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str);
            com.tencent.mars.xlog.Log.i("EnterpriseBizEntranceListHelper", "KRawUrl :%s", str);
            intent3.putExtra("useJs", true);
            intent3.addFlags(67108864);
            j45.l.n(j1Var2.f347510a, "webview", ".ui.tools.WebViewUI", intent3, 0);
            return;
        }
        qk.o6 o6Var2 = (qk.o6) i95.n0.c(qk.o6.class);
        java.lang.String str3 = j1Var2.f347511b;
        android.util.LruCache lruCache = ((c01.j0) o6Var2).f37267d;
        w01.c cVar = (w01.c) lruCache.get(str3);
        if (cVar == null) {
            cVar = new w01.c();
            lruCache.put(str3, cVar);
        }
        cVar.a(str3);
        qk.o6 o6Var3 = (qk.o6) i95.n0.c(qk.o6.class);
        android.app.Activity activity2 = j1Var2.f347510a;
        android.util.LruCache lruCache2 = ((c01.j0) o6Var3).f37267d;
        java.lang.String str4 = j1Var2.f347511b;
        w01.c cVar2 = (w01.c) lruCache2.get(str4);
        if (cVar2 == null) {
            cVar2 = new w01.c();
            lruCache2.put(str4, cVar2);
        }
        cVar2.b(activity2);
    }
}
