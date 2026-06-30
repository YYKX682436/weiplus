package s61;

/* loaded from: classes15.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403317d;

    public a0(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403317d = findMContactInviteUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = this.f403317d;
        if (findMContactInviteUI.f73146t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(s61.a0.class.getName());
            sb6.append(",R300_500_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_500_QQ"));
            sb6.append(",3");
            n71.a.b(10645, sb6.toString());
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(s61.a0.class.getName());
            sb7.append(",R300_500_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_500_phone"));
            sb7.append(",3");
            n71.a.b(10645, sb7.toString());
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        s61.y yVar = new s61.y(this);
        findMContactInviteUI.f73144r = yVar;
        d17.a(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, yVar);
        findMContactInviteUI.f73136g = db5.e1.Q(findMContactInviteUI.getContext(), findMContactInviteUI.getString(com.tencent.mm.R.string.f490573yv), findMContactInviteUI.getString(com.tencent.mm.R.string.cgj), true, true, new s61.z(this));
        r61.n0 n0Var = findMContactInviteUI.f73135f;
        java.lang.String str = findMContactInviteUI.f73143q;
        n0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) n0Var.f392913h;
            if (i18 >= linkedList.size()) {
                gm0.j1.d().g(new r61.q1(str, arrayList));
                return;
            } else {
                if (n0Var.f392914i[i18] == 2) {
                    arrayList.add(((java.lang.String[]) linkedList.get(i18))[0]);
                }
                i18++;
            }
        }
    }
}
