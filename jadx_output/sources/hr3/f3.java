package hr3;

/* loaded from: classes8.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283539d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 it = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283539d;
        contactMoreInfoUI.getClass();
        java.lang.Object l17 = gm0.j1.u().c().l(9, null);
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1(l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null);
        contactMoreInfoUI.f153688t = contactMoreInfoUI.getIntent().getLongExtra("Contact_Uin", 0L);
        java.lang.String stringExtra = contactMoreInfoUI.getIntent().getStringExtra("Contact_QQNick");
        contactMoreInfoUI.f153689u = stringExtra;
        if (contactMoreInfoUI.f153688t != 0 && q17 != 0) {
            if (stringExtra != null) {
                if (stringExtra.length() == 0) {
                    long j17 = contactMoreInfoUI.f153688t;
                    r61.x1 Ri = m61.k.Ri();
                    r61.w1 g17 = Ri != null ? Ri.g(j17) : null;
                    r61.w1 w1Var = g17 != null ? g17 : null;
                    if (w1Var != null) {
                        contactMoreInfoUI.f153689u = w1Var.c();
                    }
                }
            }
            java.lang.String str = contactMoreInfoUI.f153689u;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str + ' ' + new kk.v(contactMoreInfoUI.f153688t).longValue();
            item.f357963q = pr3.f.f357972e;
            item.f357956g = str2;
            item.f357966t = hr3.o3.f283848d;
        }
        item.f357963q = pr3.f.f357973f;
        return jz5.f0.f302826a;
    }
}
