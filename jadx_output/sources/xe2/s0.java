package xe2;

/* loaded from: classes10.dex */
public final class s0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453903c = "LiveKtvInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.lang.String str;
        r45.ay1 ay1Var;
        java.lang.String str2;
        r45.ay1 ay1Var2;
        java.lang.String str3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
            java.lang.String str4 = "";
            if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            if (r4Var.k2(str)) {
                return;
            }
            int integer = ch1Var.getInteger(1);
            gk2.e eVar = this.f445267a;
            if (integer != 20110) {
                if (integer != 20115) {
                    return;
                }
                r45.ui1 ui1Var = new r45.ui1();
                if (!(ch1Var.getByteString(4) != null)) {
                    ch1Var = null;
                }
                if (ch1Var != null) {
                    com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                    byte[] g17 = byteString != null ? byteString.g() : null;
                    if (g17 != null) {
                        try {
                            ui1Var.parseFrom(g17);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                    }
                }
                if (ui1Var.f387398e > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.yx1 yx1Var = ui1Var.f387397d;
                    if (yx1Var != null) {
                        linkedList.add(yx1Var);
                        java.lang.String str5 = com.tencent.mm.plugin.finder.live.util.d2.f115476a;
                        r45.by1 by1Var = yx1Var.f391466o;
                        if (by1Var != null) {
                            java.lang.String unique_id = yx1Var.f391459e;
                            kotlin.jvm.internal.o.f(unique_id, "unique_id");
                            java.lang.String song_mid = yx1Var.f391458d;
                            kotlin.jvm.internal.o.f(song_mid, "song_mid");
                            com.tencent.mm.plugin.finder.live.util.d2.e(by1Var, unique_id, song_mid, true);
                        }
                    }
                    r45.yx1 yx1Var2 = ui1Var.f387399f;
                    if (yx1Var2 != null) {
                        linkedList.add(yx1Var2);
                    }
                    ((om2.g) eVar.a(om2.g.class)).V6("curPlayMsg", linkedList, ui1Var.f387398e);
                    return;
                }
                return;
            }
            r45.vi1 vi1Var = new r45.vi1();
            r45.ch1 ch1Var2 = ch1Var.getByteString(4) != null ? ch1Var : null;
            if (ch1Var2 != null) {
                com.tencent.mm.protobuf.g byteString2 = ch1Var2.getByteString(4);
                byte[] g18 = byteString2 != null ? byteString2.g() : null;
                if (g18 != null) {
                    try {
                        vi1Var.parseFrom(g18);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    }
                }
            }
            ((om2.g) eVar.a(om2.g.class)).X6("listChangeMsg", vi1Var.f388281g);
            int i17 = vi1Var.f388280f;
            java.util.LinkedList<r45.yx1> song_info_list = vi1Var.f388279e;
            if (i17 > 0) {
                r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(13);
                r45.yx1 yx1Var3 = vi1Var.f388283i;
                if (xn1Var2 != null && yx1Var3 != null) {
                    int i18 = vi1Var.f388278d;
                    if (i18 == 2) {
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(finderContact2 != null ? finderContact2.getUsername() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o) && ((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                            r45.by1 by1Var2 = yx1Var3.f391466o;
                            if (by1Var2 != null && (ay1Var = by1Var2.f371143d) != null && (str2 = ay1Var.f370351e) != null) {
                                java.lang.String str6 = "《" + str2 + (char) 12299;
                                if (str6 != null) {
                                    str4 = str6;
                                }
                            }
                            h(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.miy) + str4);
                        }
                    } else if (i18 == 3) {
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(finderContact3 != null ? finderContact3.getUsername() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o) && ((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                            r45.by1 by1Var3 = yx1Var3.f391466o;
                            if (by1Var3 != null && (ay1Var2 = by1Var3.f371143d) != null && (str3 = ay1Var2.f370351e) != null) {
                                java.lang.String str7 = "《" + str3 + (char) 12299;
                                if (str7 != null) {
                                    str4 = str7;
                                }
                            }
                            h(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491579mj2) + str4);
                        }
                    } else if (i18 == 4) {
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(finderContact4 != null ? finderContact4.getUsername() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o)) {
                            if (((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                                ((om2.g) eVar.a(om2.g.class)).O6(new om2.a(false));
                            }
                            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491577mj0);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            h(string);
                        }
                    } else if (i18 == 5) {
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(finderContact5 != null ? finderContact5.getUsername() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o)) {
                            if (((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                                ((om2.g) eVar.a(om2.g.class)).O6(new om2.a(true));
                            }
                            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.miz);
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            h(string2);
                        }
                    } else if (i18 == 6) {
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                        if (kotlin.jvm.internal.o.b(finderContact6 != null ? finderContact6.getUsername() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o)) {
                            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491578mj1);
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            h(string3);
                        } else {
                            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mjy);
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            h(string4);
                        }
                    }
                }
                om2.g gVar = (om2.g) eVar.a(om2.g.class);
                kotlin.jvm.internal.o.f(song_info_list, "song_info_list");
                gVar.V6("listChangeMsg", song_info_list, vi1Var.f388280f);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KTV appmsg: mod_type ");
            sb6.append(vi1Var.f388278d);
            sb6.append(", song list ");
            kotlin.jvm.internal.o.f(song_info_list, "song_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(song_info_list, 10));
            for (r45.yx1 yx1Var4 : song_info_list) {
                arrayList.add(yx1Var4.f391458d + ": " + yx1Var4.f391466o.f371143d.f370351e);
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i(this.f453903c, sb6.toString());
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20110, 20115};
    }

    public final void h(java.lang.String str) {
        pm0.v.X(new xe2.r0(str));
    }
}
