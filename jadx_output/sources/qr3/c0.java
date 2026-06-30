package qr3;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qr3.c0 f366082a = new qr3.c0();

    public static final r45.wl a(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        r45.wl wlVar = new r45.wl();
        try {
            byte[] N = com.tencent.mm.vfs.w6.N(f366082a.d(userName), 0, -1);
            if (N != null) {
                wlVar.parseFrom(N);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileV2", "readFromFile ex=" + e17.getMessage());
        }
        return wlVar;
    }

    public static final java.util.List b(r45.lm menuInfo, boolean z17) {
        kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean wi6 = ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi();
        java.util.LinkedList<r45.mm> button_list = menuInfo.f379589g;
        kotlin.jvm.internal.o.f(button_list, "button_list");
        for (r45.mm mmVar : button_list) {
            int i17 = mmVar.f380636e;
            if (i17 == 0) {
                java.util.LinkedList sub_button_list = mmVar.f380640i;
                kotlin.jvm.internal.o.f(sub_button_list, "sub_button_list");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : sub_button_list) {
                    int i18 = ((r45.mm) obj).f380636e;
                    boolean z18 = false;
                    if (i18 == 1 ? z17 || wi6 : i18 == 2 || i18 == 5 || i18 == 6 || i18 == 7 || i18 == 9) {
                        z18 = true;
                    }
                    if (z18) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    r45.mm mmVar2 = new r45.mm();
                    mmVar2.parseFrom(mmVar.toByteArray());
                    java.util.LinkedList linkedList = mmVar2.f380640i;
                    linkedList.clear();
                    linkedList.addAll(arrayList2);
                    arrayList.add(mmVar2);
                }
            } else if (i17 != 1) {
                if (i17 == 2 || i17 == 5 || i17 == 6 || i17 == 7 || i17 == 9) {
                    arrayList.add(mmVar);
                }
            } else if (z17) {
                arrayList.add(mmVar);
            }
        }
        return arrayList;
    }

    public static final void c(r45.wl resp) {
        java.util.LinkedList<r45.s5> linkedList;
        r45.p5 p5Var;
        java.util.LinkedList<r45.o5> linkedList2;
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            qr3.c0 c0Var = f366082a;
            java.lang.String UserName = resp.f389233d.f383065d;
            kotlin.jvm.internal.o.f(UserName, "UserName");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c0Var.d(UserName));
            if (r6Var.m()) {
                r6Var.l();
            }
            java.lang.String o17 = r6Var.o();
            r45.gl glVar = resp.f389235f;
            if (glVar != null && (linkedList = glVar.f375323d) != null) {
                for (r45.s5 s5Var : linkedList) {
                    if (s5Var != null && (p5Var = s5Var.f385514i) != null && (linkedList2 = p5Var.f382754e) != null) {
                        for (r45.o5 o5Var : linkedList2) {
                            if (o5Var.G != null) {
                                o5Var.G = null;
                            }
                        }
                    }
                }
            }
            com.tencent.mm.vfs.w6.R(o17, resp.toByteArray());
        } catch (java.lang.Exception unused) {
        }
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb7.append(gm0.j1.u().d());
        sb7.append("bizcache/");
        java.lang.String sb8 = sb7.toString();
        if (!com.tencent.mm.vfs.w6.j(sb8)) {
            com.tencent.mm.vfs.w6.u(sb8);
        }
        sb6.append(sb8);
        sb6.append("profile_resp_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public final void e(r45.gl glVar) {
        java.util.LinkedList<r45.s5> linkedList;
        r45.p5 p5Var;
        java.util.LinkedList<r45.o5> linkedList2;
        java.util.LinkedList<r45.s5> linkedList3;
        r45.p5 p5Var2;
        java.util.LinkedList<r45.o5> linkedList4;
        lr1.f fVar = lr1.f.f320657a;
        if (glVar != null && (linkedList3 = glVar.f375323d) != null) {
            for (r45.s5 s5Var : linkedList3) {
                if (s5Var != null && (p5Var2 = s5Var.f385514i) != null && (linkedList4 = p5Var2.f382754e) != null) {
                    for (r45.o5 o5Var : linkedList4) {
                        if (o5Var != null && o5Var.I == 1) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(o5Var != null ? o5Var.f381917h : null)) {
                                java.lang.String ContentUrl = o5Var.f381917h;
                                kotlin.jvm.internal.o.f(ContentUrl, "ContentUrl");
                                fVar.e(ContentUrl, o5Var.f381912J == 1);
                            }
                        }
                    }
                }
            }
        }
        if (glVar == null || (linkedList = glVar.f375327h) == null) {
            return;
        }
        for (r45.s5 s5Var2 : linkedList) {
            if (s5Var2 != null && (p5Var = s5Var2.f385514i) != null && (linkedList2 = p5Var.f382754e) != null) {
                for (r45.o5 o5Var2 : linkedList2) {
                    if (o5Var2 != null && o5Var2.I == 1) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(o5Var2 != null ? o5Var2.f381917h : null)) {
                            java.lang.String ContentUrl2 = o5Var2.f381917h;
                            kotlin.jvm.internal.o.f(ContentUrl2, "ContentUrl");
                            fVar.e(ContentUrl2, o5Var2.f381912J == 1);
                        }
                    }
                }
            }
        }
    }
}
