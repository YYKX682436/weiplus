package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class x0 extends kr3.j {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f154004s = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f154005r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f154005r = kz5.p0.f313996d;
    }

    @Override // kr3.j
    public void O6() {
        if (Q6()) {
            com.tencent.mm.plugin.profile.ui.mod.components.v0 v0Var = new com.tencent.mm.plugin.profile.ui.mod.components.v0(this);
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f311393h;
            if (profileEditPhoneNumberView == null) {
                v0Var.invoke();
                return;
            }
            com.tencent.mm.ui.base.FlowLayout flowLayout = this.f311390e;
            if (flowLayout == null) {
                v0Var.invoke();
                return;
            }
            java.lang.String username = getUsername();
            if (username == null) {
                v0Var.invoke();
                return;
            }
            flowLayout.setVisibility(0);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(gc0.p2.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((gc0.p2) a17).U6(new gc0.b0(username, null), new com.tencent.mm.plugin.profile.ui.mod.components.s0(profileEditPhoneNumberView), new com.tencent.mm.plugin.profile.ui.mod.components.t0(profileEditPhoneNumberView), flowLayout, new com.tencent.mm.plugin.profile.ui.mod.components.u0(profileEditPhoneNumberView, this));
        }
    }

    @Override // kr3.j
    public void P6(xg3.q0 op6, com.tencent.mm.modelbase.f cgiBack) {
        java.util.List list;
        r45.c85 c85Var;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.tencent.mm.protobuf.f fVar = op6.f454431j;
        r45.qo4 qo4Var = fVar instanceof r45.qo4 ? (r45.qo4) fVar : null;
        if (qo4Var == null || (c85Var = qo4Var.f384149e) == null || (linkedList = c85Var.f371374e) == null) {
            list = kz5.p0.f313996d;
        } else {
            list = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                list.add(((r45.b85) it.next()).f370631d);
            }
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, m7(list, this.f154005r), cgiBack.f70616b, kz5.b0.c(getUsername())));
    }

    @Override // kr3.j
    public java.lang.Object R6(kotlin.coroutines.Continuation continuation) {
        return java.lang.Boolean.TRUE;
    }

    @Override // kr3.j
    public java.lang.Object S6(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.profile.ui.mod.components.p0(this, null), continuation);
    }

    @Override // kr3.j
    public void T6(yz5.l onResult) {
        kotlin.jvm.internal.o.g(onResult, "onResult");
        java.lang.String stringExtra = getIntent().getStringExtra("contact_add_phone_from_recommend");
        if (stringExtra == null) {
            onResult.invoke(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "recommend phone: ".concat(stringExtra));
        if (!r26.n0.N(stringExtra)) {
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f311393h;
            java.util.List phoneNumberList = profileEditPhoneNumberView != null ? profileEditPhoneNumberView.getPhoneNumberList() : null;
            if (phoneNumberList == null) {
                phoneNumberList = kz5.p0.f313996d;
            }
            if (!phoneNumberList.contains(stringExtra)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "current phone does not contains recommend phone, len: " + phoneNumberList.size());
                if (phoneNumberList.size() >= 5) {
                    onResult.invoke(-2);
                    return;
                }
                com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView2 = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f311393h;
                if (profileEditPhoneNumberView2 != null) {
                    profileEditPhoneNumberView2.c(stringExtra, false, false);
                }
                onResult.invoke(1);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "current phone contains recommend phone, len: " + phoneNumberList.size());
        }
        onResult.invoke(0);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModPhoneUIC";
    }

    @Override // kr3.j
    public xg3.q0 X6() {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f311393h;
        java.util.ArrayList<java.lang.String> phoneNumberList = profileEditPhoneNumberView != null ? profileEditPhoneNumberView.getPhoneNumberList() : null;
        if (phoneNumberList == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.n0.V(phoneNumberList));
        if (arrayList.size() > 5) {
            return null;
        }
        com.tencent.mm.storage.z3 W6 = W6();
        boolean z17 = false;
        if (W6 != null && W6.r2()) {
            z17 = true;
        }
        if (!z17) {
            return null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, m7(arrayList, this.f154005r), 0, kz5.b0.c(W6.d1()), 8, null));
        java.lang.String d17 = W6.d1();
        r45.qo4 qo4Var = new r45.qo4();
        qo4Var.f384148d = d17;
        r45.c85 c85Var = new r45.c85();
        c85Var.f371374e = new java.util.LinkedList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aq1.e.d(str)) {
                r45.b85 b85Var = new r45.b85();
                b85Var.f370631d = str;
                java.util.LinkedList linkedList = c85Var.f371374e;
                if (linkedList != null) {
                    linkedList.add(b85Var);
                }
                arrayList2.add(str);
            }
        }
        c85Var.f371373d = arrayList2.size();
        qo4Var.f384149e = c85Var;
        return new xg3.p0(60, qo4Var);
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components.r0(this);
    }

    @Override // kr3.j
    public boolean a7() {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f311393h;
        if (profileEditPhoneNumberView != null) {
            return profileEditPhoneNumberView.e();
        }
        return false;
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.tencent.mm.storage.z3 contact) {
        int i17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        this.f154005r = n2Var.k(contact, getIntent());
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = new com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView(getActivity());
        profileEditPhoneNumberView.setBackgroundResource(com.tencent.mm.R.drawable.aih);
        profileEditPhoneNumberView.f189812d = contact;
        java.lang.String stringExtra = getIntent().getStringExtra("contact_phone_number_by_md5");
        if (stringExtra == null) {
            stringExtra = n2Var.m(contact, getIntent());
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("contact_phone_number_list");
        if (stringExtra2 == null) {
            stringExtra2 = contact.E1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "is null phone, mContactPhoneNumberList: %s, mContactPhoneNumberByMD5: %s, ", stringExtra2, stringExtra);
        }
        profileEditPhoneNumberView.f189804e = stringExtra;
        profileEditPhoneNumberView.f189805f = stringExtra2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            i17 = 0;
        } else {
            i17 = 1;
            profileEditPhoneNumberView.b(profileEditPhoneNumberView.f189804e, true, false);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(profileEditPhoneNumberView.f189805f)) {
            java.lang.String[] c17 = com.tencent.mm.contact.a.c(profileEditPhoneNumberView.f189812d, profileEditPhoneNumberView.f189805f);
            profileEditPhoneNumberView.f189806g = c17;
            if (c17 != null) {
                int i18 = i17;
                while (true) {
                    java.lang.String[] strArr = profileEditPhoneNumberView.f189806g;
                    if (i18 >= strArr.length + i17) {
                        break;
                    }
                    profileEditPhoneNumberView.b(strArr[i18 - i17].trim(), false, false);
                    i18++;
                }
                i17 = i18;
            }
        }
        if (i17 < 5) {
            profileEditPhoneNumberView.g();
        } else {
            profileEditPhoneNumberView.d();
        }
        profileEditPhoneNumberView.f189809m = new com.tencent.mm.plugin.profile.ui.mod.components.w0(this, contact, profileEditPhoneNumberView);
        android.widget.TextView textView = this.f311391f;
        if (textView != null) {
            textView.setText(i65.a.r(getActivity(), com.tencent.mm.R.string.f492554gy4));
        }
        android.widget.TextView textView2 = this.f311391f;
        if (textView2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.f(getActivity(), com.tencent.mm.R.dimen.f479688cn);
            }
            textView2.setLayoutParams(marginLayoutParams);
        }
        return profileEditPhoneNumberView;
    }

    @Override // kr3.j
    public boolean i7() {
        return !((java.lang.Boolean) ((jz5.n) this.f311398p).getValue()).booleanValue();
    }

    @Override // kr3.j
    public int k7() {
        return 40;
    }

    @Override // kr3.j
    public int l7() {
        return com.tencent.mm.R.string.gxv;
    }

    public final vg3.c m7(java.util.List list, java.util.List list2) {
        java.util.List list3;
        java.util.List list4 = kz5.p0.f313996d;
        if (list != null) {
            java.util.List V = kz5.n0.V(list);
            list3 = new java.util.ArrayList();
            for (java.lang.Object obj : V) {
                if (!r26.n0.N((java.lang.String) obj)) {
                    list3.add(obj);
                }
            }
        } else {
            list3 = list4;
        }
        if (list2 != null) {
            java.util.List V2 = kz5.n0.V(list2);
            list4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : V2) {
                if (!r26.n0.N((java.lang.String) obj2)) {
                    list4.add(obj2);
                }
            }
        }
        return ((list3.isEmpty() ^ true) && list4.isEmpty()) ? vg3.c.A : (list3.isEmpty() && (list4.isEmpty() ^ true)) ? vg3.c.C : ((list3.isEmpty() ^ true) && (list4.isEmpty() ^ true) && !kotlin.jvm.internal.o.b(list3, list4)) ? vg3.c.B : vg3.c.A;
    }
}
