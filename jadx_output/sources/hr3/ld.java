package hr3;

/* loaded from: classes11.dex */
public final class ld extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f283766d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f283767e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f283768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final boolean O6(java.lang.String phone) {
        kotlin.jvm.internal.o.g(phone, "phone");
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f283766d;
        if (profileEditPhoneNumberView == null) {
            kotlin.jvm.internal.o.o("editPhoneNumberView");
            throw null;
        }
        if (!profileEditPhoneNumberView.f()) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView2 = this.f283766d;
        if (profileEditPhoneNumberView2 != null) {
            profileEditPhoneNumberView2.c(phone, false, false);
            return true;
        }
        kotlin.jvm.internal.o.o("editPhoneNumberView");
        throw null;
    }

    public final void P6(com.tencent.mm.storage.z3 z3Var) {
        java.util.ArrayList Q6 = Q6();
        if (z3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1()) || Q6.size() == 0) {
            return;
        }
        java.lang.String d17 = z3Var.d1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Q6.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiAddPhoneUIC", "no phone after check");
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
        if (n17 == null || ((int) n17.E2) <= 0 || !n17.r2()) {
            return;
        }
        java.lang.String a17 = com.tencent.mm.contact.a.a(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiAddPhoneUIC", "[dealModPhoneNumberList] username:%s %s", d17, a17);
        z3Var.a3(a17);
        com.tencent.mm.contact.a.d(z3Var);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
    }

    public final java.util.ArrayList Q6() {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f283766d;
        if (profileEditPhoneNumberView != null) {
            java.util.ArrayList<java.lang.String> phoneNumberList = profileEditPhoneNumberView.getPhoneNumberList();
            return phoneNumberList == null ? new java.util.ArrayList() : phoneNumberList;
        }
        kotlin.jvm.internal.o.o("editPhoneNumberView");
        throw null;
    }

    public final r45.c85 R6() {
        r45.c85 c85Var = new r45.c85();
        java.util.Iterator it = Q6().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                r45.b85 b85Var = new r45.b85();
                b85Var.f370631d = str;
                c85Var.f371374e.add(b85Var);
            }
        }
        c85Var.f371373d = c85Var.f371374e.size();
        return c85Var;
    }

    public final void S6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485961jp2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f283766d = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.upz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f283767e = (com.tencent.mm.ui.base.FlowLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.jcz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f283768f = (android.widget.TextView) findViewById3;
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f283766d;
        if (profileEditPhoneNumberView != null) {
            profileEditPhoneNumberView.f189809m = new hr3.kd(this);
        } else {
            kotlin.jvm.internal.o.o("editPhoneNumberView");
            throw null;
        }
    }

    public final void T6(java.lang.String str, java.lang.String str2) {
        jz5.f0 f0Var;
        int i17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485962uh2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiAddPhoneUIC", "showAddPhoneWidget", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiAddPhoneUIC", "showAddPhoneWidget", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = 1;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f283766d;
            if (profileEditPhoneNumberView == null) {
                kotlin.jvm.internal.o.o("editPhoneNumberView");
                throw null;
            }
            profileEditPhoneNumberView.f189812d = n17;
            java.lang.String str3 = n17.E1;
            profileEditPhoneNumberView.f189804e = str2;
            profileEditPhoneNumberView.f189805f = str3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i17 = 0;
            } else {
                profileEditPhoneNumberView.b(profileEditPhoneNumberView.f189804e, true, false);
                i17 = 1;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(profileEditPhoneNumberView.f189805f)) {
                java.lang.String[] c17 = com.tencent.mm.contact.a.c(profileEditPhoneNumberView.f189812d, profileEditPhoneNumberView.f189805f);
                profileEditPhoneNumberView.f189806g = c17;
                if (c17 != null) {
                    int i19 = i17;
                    while (true) {
                        java.lang.String[] strArr = profileEditPhoneNumberView.f189806g;
                        if (i19 >= strArr.length + i17) {
                            break;
                        }
                        profileEditPhoneNumberView.b(strArr[i19 - i17].trim(), false, false);
                        i19++;
                    }
                    i17 = i19;
                }
            }
            if (i17 < 5) {
                profileEditPhoneNumberView.g();
            } else {
                profileEditPhoneNumberView.d();
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView2 = this.f283766d;
            if (profileEditPhoneNumberView2 == null) {
                kotlin.jvm.internal.o.o("editPhoneNumberView");
                throw null;
            }
            profileEditPhoneNumberView2.f189804e = str2;
            profileEditPhoneNumberView2.f189805f = "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i18 = 0;
            } else {
                profileEditPhoneNumberView2.b(profileEditPhoneNumberView2.f189804e, true, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(profileEditPhoneNumberView2.f189805f)) {
                java.lang.String[] c18 = com.tencent.mm.contact.a.c(profileEditPhoneNumberView2.f189812d, profileEditPhoneNumberView2.f189805f);
                profileEditPhoneNumberView2.f189806g = c18;
                if (c18 != null) {
                    int i27 = i18;
                    while (true) {
                        java.lang.String[] strArr2 = profileEditPhoneNumberView2.f189806g;
                        if (i27 >= strArr2.length + i18) {
                            break;
                        }
                        profileEditPhoneNumberView2.b(strArr2[i27 - i18].trim(), false, false);
                        i27++;
                    }
                    i18 = i27;
                }
            }
            if (i18 < 5) {
                profileEditPhoneNumberView2.g();
            } else {
                profileEditPhoneNumberView2.d();
            }
        }
    }
}
