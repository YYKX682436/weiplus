package vi1;

/* loaded from: classes7.dex */
public final class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI f437288d;

    public c2(com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI phoneNumberManagerUI) {
        this.f437288d = phoneNumberManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        boolean z17;
        kotlin.jvm.internal.o.g(it, "it");
        vi1.h0 h0Var = this.f437288d.B;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            if (b2Var.f437282f.size() >= 0) {
                java.util.Iterator it6 = b2Var.f437282f.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it6.next();
                    vi1.l2 l2Var = vi1.l2.f437401a;
                    vi1.j2 a17 = l2Var.a(b2Var.f437278b);
                    if (a17 != null) {
                        vi1.j2 a18 = l2Var.a(b2Var.f437278b);
                        java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437372u) : null;
                        kotlin.jvm.internal.o.d(valueOf);
                        a17.f437372u = valueOf.longValue() + 1;
                    }
                    java.lang.String appId = b2Var.f437278b;
                    java.lang.String mobile = phoneItem.f87399d;
                    kotlin.jvm.internal.o.g(appId, "appId");
                    kotlin.jvm.internal.o.g(mobile, "mobile");
                    vi1.a2 a2Var = new vi1.a2(b2Var);
                    r45.ys6 ys6Var = new r45.ys6();
                    ys6Var.f391338d = appId;
                    ys6Var.f391339e = mobile;
                    ys6Var.f391340f = 1;
                    ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", appId, ys6Var, r45.zs6.class).n(new vi1.r(a2Var))).s(new vi1.s(a2Var));
                }
            }
            vi1.o0 o0Var = vi1.o0.f437416a;
            java.util.ArrayList arrayList = b2Var.f437282f;
            kotlin.jvm.internal.o.d(arrayList);
            synchronized (o0Var) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) o0Var.b();
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    arrayList2.remove((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it7.next());
                }
                java.util.Iterator it8 = arrayList2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it8.next()).f87407o) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17 && arrayList2.size() >= 1) {
                    ((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) arrayList2.get(0)).f87407o = true;
                }
                o0Var.d(arrayList2);
            }
        }
        this.f437288d.U6(false);
        this.f437288d.V6();
        return true;
    }
}
