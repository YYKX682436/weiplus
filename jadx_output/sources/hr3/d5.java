package hr3;

/* loaded from: classes8.dex */
public final class d5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283471d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o it = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283471d;
        contactMoreInfoUIWxContact.getClass();
        java.lang.Object l17 = gm0.j1.u().c().l(9, null);
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1(l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null);
        contactMoreInfoUIWxContact.f153707s = contactMoreInfoUIWxContact.getIntent().getLongExtra("Contact_Uin", 0L);
        java.lang.String stringExtra = contactMoreInfoUIWxContact.getIntent().getStringExtra("Contact_QQNick");
        contactMoreInfoUIWxContact.f153708t = stringExtra;
        if (contactMoreInfoUIWxContact.f153707s != 0 && q17 != 0) {
            if (stringExtra != null) {
                if (stringExtra.length() == 0) {
                    long j17 = contactMoreInfoUIWxContact.f153707s;
                    r61.x1 Ri = m61.k.Ri();
                    r61.w1 g17 = Ri != null ? Ri.g(j17) : null;
                    r61.w1 w1Var = g17 != null ? g17 : null;
                    if (w1Var != null) {
                        contactMoreInfoUIWxContact.f153708t = w1Var.c();
                    }
                }
            }
            java.lang.String str = contactMoreInfoUIWxContact.f153708t;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str + ' ' + new kk.v(contactMoreInfoUIWxContact.f153707s).longValue();
            item.f357963q = pr3.f.f357972e;
            item.f357956g = str2;
            item.f357966t = hr3.m5.f283791d;
        }
        item.f357963q = pr3.f.f357973f;
        return jz5.f0.f302826a;
    }
}
