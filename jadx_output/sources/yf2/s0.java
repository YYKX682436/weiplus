package yf2;

/* loaded from: classes10.dex */
public final class s0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public int f461781m;

    /* renamed from: n, reason: collision with root package name */
    public int f461782n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.s2 f461783o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f461784p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        ae2.in inVar = ae2.in.f3688a;
        this.f461781m = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_LICENSE_UPDATE_INT_SYNC, 0);
        this.f461782n = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_GAME_LICENSE_UPDATE_INT_SYNC, 0);
        this.f461784p = new java.util.LinkedHashMap();
    }

    public static final void Z6(yf2.s0 s0Var) {
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "updateBottomSheetLicenseText");
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s0Var.business(mm2.g1.class)).f329068f).getValue();
        boolean T1 = q12Var != null ? zl2.r4.f473950a.T1(q12Var) : false;
        r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s0Var.business(mm2.g1.class)).f329071i).getValue();
        yf2.h0 d76 = s0Var.d7(T1, n73Var != null ? (r45.z53) n73Var.getCustom(1) : null, yf2.j2.f461730d);
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = s0Var.f461783o;
        if (s2Var != null) {
            if (s2Var.f119706h != null) {
                s2Var.a(d76);
            } else {
                s2Var.f119713o = d76;
            }
        }
    }

    public final java.lang.CharSequence a7(java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        if (list.isEmpty()) {
            return c7();
        }
        android.content.Context O6 = O6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = ((r45.s6) it.next()).f385527e;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            return c7();
        }
        int size = arrayList.size();
        if (size == 1) {
            str = "《" + ((java.lang.String) arrayList.get(0)) + (char) 12299;
        } else if (size != 2) {
            java.lang.String string = O6.getString(com.tencent.mm.R.string.oza);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = O6.getString(com.tencent.mm.R.string.oz9);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            str = kz5.n0.g0(kz5.n0.S(arrayList, 1), string, "《", "》", 0, null, null, 56, null) + string2 + (char) 12298 + ((java.lang.String) kz5.n0.i0(arrayList)) + (char) 12299;
        } else {
            str = "《" + ((java.lang.String) arrayList.get(0)) + (char) 12299 + O6.getString(com.tencent.mm.R.string.oz9) + (char) 12298 + ((java.lang.String) arrayList.get(1)) + (char) 12299;
        }
        java.lang.String string3 = O6.getString(com.tencent.mm.R.string.oz_);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String str4 = string3 + str;
        android.text.SpannableString spannableString = new android.text.SpannableString(str4);
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            r45.s6 s6Var = (r45.s6) it6.next();
            java.lang.String str5 = s6Var.f385527e;
            if (str5 != null && (str2 = s6Var.f385528f) != null) {
                java.lang.String str6 = "《" + str5 + (char) 12299;
                int L = r26.n0.L(str4, str6, 0, false, 6, null);
                if (L != -1) {
                    spannableString.setSpan(new yf2.i0(str2, O6), L, str6.length() + L, 33);
                }
            }
        }
        return spannableString;
    }

    public final int b7() {
        return zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue()) ? this.f461782n : this.f461781m;
    }

    public final java.lang.CharSequence c7() {
        android.content.Context O6 = O6();
        java.lang.String string = O6.getString(com.tencent.mm.R.string.h_h);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = O6.getString(com.tencent.mm.R.string.i0d);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = O6.getString(com.tencent.mm.R.string.d3y);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{string, string2}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        int L = r26.n0.L(format, string, 0, false, 6, null);
        int length = string.length() + L;
        int L2 = r26.n0.L(format, string2, 0, false, 6, null);
        int length2 = string2.length() + L2;
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        yf2.j0 j0Var = new yf2.j0(O6);
        yf2.k0 k0Var = new yf2.k0(O6);
        spannableString.setSpan(j0Var, L, length, 33);
        spannableString.setSpan(k0Var, L2, length2, 33);
        return spannableString;
    }

    public final yf2.h0 d7(boolean z17, r45.z53 z53Var, yf2.j2 j2Var) {
        yf2.h0 h0Var;
        java.lang.CharSequence string;
        java.util.LinkedList linkedList;
        int ordinal = j2Var.ordinal();
        java.util.List list = kz5.p0.f313996d;
        if (ordinal != 0) {
            if (ordinal == 1) {
                android.content.Context O6 = O6();
                r45.ve1 ve1Var = xd2.a.f453614a;
                java.lang.String string2 = O6.getString(com.tencent.mm.R.string.orv);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                linkedList = ve1Var != null ? ve1Var.f388152f : null;
                if (linkedList != null) {
                    list = linkedList;
                }
                return new yf2.h0(string2, "", a7(list));
            }
            if (ordinal != 2) {
                throw new jz5.j();
            }
            android.content.Context O62 = O6();
            r45.ve1 ve1Var2 = xd2.a.f453614a;
            java.lang.String string3 = O62.getString(com.tencent.mm.R.string.ort);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = O62.getString(com.tencent.mm.R.string.ors);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            linkedList = ve1Var2 != null ? ve1Var2.f388152f : null;
            if (linkedList != null) {
                list = linkedList;
            }
            return new yf2.h0(string3, string4, a7(list));
        }
        r45.ve1 ve1Var3 = xd2.a.f453614a;
        if (ve1Var3 != null && ve1Var3.f388153g) {
            android.content.Context O63 = O6();
            java.lang.String str = ve1Var3.f388150d;
            if (str == null) {
                str = O63.getString(com.tencent.mm.R.string.oru);
            }
            kotlin.jvm.internal.o.d(str);
            java.lang.String str2 = ve1Var3.f388151e;
            if (str2 == null) {
                str2 = O63.getString(com.tencent.mm.R.string.oz8);
            }
            kotlin.jvm.internal.o.d(str2);
            java.util.LinkedList linkedList2 = ve1Var3.f388152f;
            if (linkedList2 != null) {
                list = linkedList2;
            }
            return new yf2.h0(str, str2, a7(list));
        }
        if (z17) {
            android.content.Context O64 = O6();
            java.lang.String string5 = O64.getString(com.tencent.mm.R.string.oru);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            java.lang.String string6 = O64.getString(com.tencent.mm.R.string.oz8);
            kotlin.jvm.internal.o.f(string6, "getString(...)");
            android.content.Context O65 = O6();
            if (z53Var != null) {
                string = com.tencent.mm.plugin.finder.assist.b3.f102022a.h(O65, com.tencent.mm.R.string.dgc, z53Var.getInteger(13) == 1);
            } else {
                string = O65.getString(com.tencent.mm.R.string.dgc);
                kotlin.jvm.internal.o.d(string);
            }
            h0Var = new yf2.h0(string5, string6, string);
        } else {
            android.content.Context O66 = O6();
            java.lang.String string7 = O66.getString(com.tencent.mm.R.string.oru);
            kotlin.jvm.internal.o.f(string7, "getString(...)");
            java.lang.String string8 = O66.getString(com.tencent.mm.R.string.oz8);
            kotlin.jvm.internal.o.f(string8, "getString(...)");
            h0Var = new yf2.h0(string7, string8, c7());
        }
        return h0Var;
    }

    public final void e7(int i17, yf2.j2 j2Var) {
        long j17;
        com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "reportLicenseEvent: type=" + i17 + ", showMode=" + j2Var);
        int ordinal = j2Var.ordinal();
        if (ordinal == 0) {
            ml2.c1 c1Var = ml2.c1.f327325e;
            j17 = 68;
        } else if (ordinal == 1) {
            ml2.c1 c1Var2 = ml2.c1.f327325e;
            j17 = 76;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            ml2.c1 c1Var3 = ml2.c1.f327325e;
            j17 = 77;
        }
        long j18 = j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, j18, jSONObject.toString(), null, 4, null);
    }

    public final void f7(int i17) {
        if (zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue())) {
            this.f461782n = i17;
            ae2.in.f3688a.B0(i17);
        } else {
            this.f461781m = i17;
            ae2.in.f3688a.C0(i17);
        }
    }

    public final void g7(yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yf2.j2 showMode) {
        kotlin.jvm.internal.o.g(showMode, "showMode");
        com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "showLicenseBottomSheet, showMode: " + showMode);
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = this.f461783o;
        if (s2Var != null && s2Var.b().e()) {
            return;
        }
        e7(1, showMode);
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue();
        boolean T1 = q12Var != null ? zl2.r4.f473950a.T1(q12Var) : false;
        r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329071i).getValue();
        yf2.h0 d76 = d7(T1, n73Var != null ? (r45.z53) n73Var.getCustom(1) : null, showMode);
        yf2.j2 j2Var = yf2.j2.f461732f;
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var2 = new com.tencent.mm.plugin.finder.live.widget.s2(O6(), new yf2.p0(this, showMode, aVar), new yf2.q0(this, showMode, aVar2), showMode == j2Var ? new yf2.r0(this, showMode, aVar3) : null, showMode != j2Var);
        if (s2Var2.f119706h != null) {
            s2Var2.a(d76);
        } else {
            s2Var2.f119713o = d76;
        }
        s2Var2.b().i();
        this.f461783o = s2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewMount(android.view.ViewGroup r17) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.s0.onViewMount(android.view.ViewGroup):void");
    }
}
