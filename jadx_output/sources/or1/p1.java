package or1;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final or1.o1 f347552a;

    public p1(or1.o1 o1Var) {
        this.f347552a = o1Var;
    }

    public void a(r45.d67 d67Var) {
        int i17 = d67Var.f372185d;
        or1.o1 o1Var = this.f347552a;
        if (i17 != 1) {
            if (i17 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("enterprise_from_scene", 1);
                intent.putExtra("enterprise_biz_name", o1Var.a());
                j45.l.j(o1Var.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", intent, null);
                return;
            }
            if (i17 != 3) {
                return;
            }
            java.lang.String str = d67Var.f372188g;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str);
            intent2.putExtra("useJs", true);
            intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            intent2.addFlags(67108864);
            j45.l.j(o1Var.getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
            return;
        }
        try {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(o1Var.getContext(), "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
            intent3.putExtra("enterprise_biz_name", o1Var.a());
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String a17 = o1Var.a();
            ((sg3.a) v0Var).getClass();
            intent3.putExtra("enterprise_biz_display_name", c01.a2.e(a17));
            android.content.Context context = o1Var.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$BizEntranceListItemBinding", "jumpToMsgListUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$BizEntranceListItemBinding", "jumpToMsgListUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "jumpToMsgListUI fail, father=%s, error msg: %s", o1Var.a(), th6.getMessage());
        }
    }
}
