package hr3;

/* loaded from: classes11.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283882d;

    public pa(hr3.va vaVar) {
        this.f283882d = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.va vaVar = this.f283882d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "sendButton onClick %s", vaVar.f284109e.L.d1());
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
        if (normalUserFooterPreference.W) {
            java.lang.String d17 = normalUserFooterPreference.L.d1();
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            boolean z17 = normalUserFooterPreference.M;
            android.content.Context context = normalUserFooterPreference.f197770d;
            if (z17) {
                intent.putExtra("Chat_User", d17);
                intent.putExtra("Chat_Mode", 1);
                ((android.app.Activity) context).setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", d17);
                intent.putExtra("Chat_Mode", 1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
            }
        } else {
            vaVar.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference2 = vaVar.f284109e;
            boolean z18 = normalUserFooterPreference2.M;
            android.content.Context context2 = normalUserFooterPreference2.f197770d;
            if (z18) {
                intent2.putExtra("Chat_User", normalUserFooterPreference2.L.d1());
                intent2.putExtra("Chat_Mode", 1);
                ((android.app.Activity) context2).setResult(-1, intent2);
            } else {
                intent2.putExtra("Chat_User", normalUserFooterPreference2.L.d1());
                intent2.putExtra("Chat_Mode", 1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, context2);
            }
        }
        com.tencent.mm.plugin.profile.p2.Bi(vaVar.f284109e.K1.getIntent(), 4, 1, vaVar.f284109e.L.d1());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
