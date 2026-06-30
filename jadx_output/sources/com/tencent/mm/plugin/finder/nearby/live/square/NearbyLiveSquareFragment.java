package com.tencent.mm.plugin.finder.nearby.live.square;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class NearbyLiveSquareFragment extends com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment {
    public NearbyLiveSquareFragment() {
        super(com.tencent.mm.R.string.h7d, 1001);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void A0() {
        boolean z17;
        boolean z18;
        yl2.g gVar = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).f121496g;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("livePostHelper");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "prepare()");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = gVar.f463003f;
        zy2.zb.qd(zbVar, 2, g1Var.f463009b, g1Var.f463010c, null, 8, null);
        android.app.Activity activity = gVar.f463001d;
        java.lang.String e17 = xy2.c.e(activity);
        boolean z19 = false;
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(activity)) {
            z17 = true;
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(activity.getResources().getString(com.tencent.mm.R.string.dls));
            u1Var.n(activity.getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(yl2.a.f462967a);
            u1Var.q(false);
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostForNearby", "checkNetworkAvailable() network problem");
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "checkAccountValid()");
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "checkAccountValid() need create finder contact.");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                ml2.m3 m3Var = ml2.m3.f327714f;
                y4Var.getClass();
                y4Var.f328289b0 = m3Var;
                i95.m c18 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE.showCreateFinderUserDialog(activity, 3, null);
                z18 = false;
            } else {
                z18 = true;
            }
            if (z18) {
                m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                if (I1 != null && I1.v0()) {
                    z19 = true;
                }
                if (z19) {
                    zl2.q4.f473933a.Q();
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var2 = ml2.j0.f327583i;
                    ml2.m3 m3Var2 = ml2.m3.f327713e;
                    y4Var2.getClass();
                    y4Var2.f328289b0 = m3Var2;
                    if (c92.g.f39738a.b()) {
                        i95.m c19 = i95.n0.c(c61.yb.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        c61.yb.l3((c61.yb) c19, gVar.f463001d, e17, new yl2.c(gVar), yl2.d.f462983d, null, false, 48, null);
                    } else {
                        i95.m c27 = i95.n0.c(c61.yb.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        c61.yb.l3((c61.yb) c27, gVar.f463001d, e17, new yl2.e(gVar), yl2.f.f462996d, null, false, 48, null);
                    }
                    i95.m c28 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c28, "getService(...)");
                    zy2.zb.qd((zy2.zb) c28, 3, g1Var.f463009b, g1Var.f463010c, null, 8, null);
                }
            } else {
                com.tencent.mars.xlog.Log.e("Finder.FinderLivePostForNearby", "prepare() checkAccountValid failed");
            }
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostForNearby", "prepare() checkNetworkAvailable failed");
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Kj(ml2.l3.f327694e);
    }

    public final void B0(android.app.Activity activity) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Class cls;
        boolean z17;
        android.os.Bundle bundle;
        boolean z18;
        long j17;
        int i17;
        int i18;
        java.lang.String str7;
        java.lang.Integer num;
        java.lang.String str8;
        int i19;
        int i27;
        long j18;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String str9;
        java.lang.Class cls2;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        android.os.Bundle bundle2;
        long j19;
        int i28;
        int i29;
        boolean z19;
        java.lang.String str15;
        int i37;
        int i38;
        int i39;
        int i47;
        java.lang.String str16;
        long j27;
        int i48;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        kotlin.jvm.internal.o.g(activity, "activity");
        long j28 = 0;
        if (!c92.g.f39738a.b()) {
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            android.os.Bundle bundle3 = new android.os.Bundle();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("NearbyEntrance");
            if (L0 == null || L0.I0("NearbyEntrance") == null || L0.getType() != 16) {
                str = " activity:";
                str2 = "NearbyLiveSquareFragment";
                str3 = "nearby_live_target_square_page_params_key";
                str4 = " targetObjectId:";
                str5 = " commentScene=";
                str6 = " enterLiveAction:";
                cls = zy2.rb.class;
                z17 = true;
                bundle = bundle3;
                z18 = true;
                j17 = 0;
                i17 = 0;
                i18 = 0;
            } else {
                nk6.a0(L0);
                r45.xs2 Q = nk6.Q("NearbyLiveTab");
                int integer = Q != null ? Q.getInteger(12) : 0;
                r45.xs2 Q2 = nk6.Q("NearbyLiveTab");
                int integer2 = Q2 != null ? Q2.getInteger(13) : 0;
                r45.xs2 Q3 = nk6.Q("NearbyLiveTab");
                long j29 = Q3 != null ? Q3.getLong(3) : 0L;
                r45.xs2 Q4 = nk6.Q("NearbyLiveTab");
                java.lang.String str17 = (Q4 == null || (string3 = Q4.getString(8)) == null) ? "" : string3;
                r45.xs2 Q5 = nk6.Q("NearbyLiveTab");
                java.lang.String str18 = (Q5 == null || (string2 = Q5.getString(14)) == null) ? "" : string2;
                r45.xs2 Q6 = nk6.Q("NearbyLiveTab");
                java.lang.String str19 = (Q6 == null || (string = Q6.getString(15)) == null) ? "" : string;
                r45.xs2 Q7 = nk6.Q("NearbyLiveTab");
                if (Q7 == null || (str8 = Q7.getString(16)) == null) {
                    str8 = "";
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(integer2);
                valueOf.intValue();
                if (!(integer2 == 1)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    valueOf.intValue();
                    if (j29 != 0) {
                        bundle3.putLong("nearby_live_target_object_id_params_key", j29);
                        bundle3.putInt("nearby_live_target_tab_id_params_key", integer);
                        bundle3.putString("nearby_live_target_nonce_id_params_key", str17);
                        bundle3.putString("nearby_live_target_user_name_params_key", str18);
                        bundle3.putString("nearby_live_target_nick_name_params_key", str19);
                        bundle3.putString("nearby_live_target_cover_url_params_key", str8);
                        dp2.e eVar = dp2.e.f242192a;
                        eVar.c(activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null, j29, str17, false, getF121515s(), null);
                        str = " activity:";
                        z17 = true;
                        str2 = "NearbyLiveSquareFragment";
                        j18 = j29;
                        i19 = integer2;
                        i27 = integer;
                        str3 = "nearby_live_target_square_page_params_key";
                        str4 = " targetObjectId:";
                        str5 = " commentScene=";
                        str6 = " enterLiveAction:";
                        cls = zy2.rb.class;
                        bundle = bundle3;
                        dp2.e.d(eVar, activity, integer, j29, str17, str18, str19, 0L, null, 192, null);
                        z18 = false;
                        i17 = i19;
                        j17 = j18;
                        i18 = i27;
                    }
                }
                i19 = integer2;
                i27 = integer;
                str4 = " targetObjectId:";
                str5 = " commentScene=";
                str6 = " enterLiveAction:";
                str = " activity:";
                str2 = "NearbyLiveSquareFragment";
                cls = zy2.rb.class;
                str3 = "nearby_live_target_square_page_params_key";
                z17 = true;
                j18 = j29;
                bundle = bundle3;
                z18 = true;
                i17 = i19;
                j17 = j18;
                i18 = i27;
            }
            if (z18) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.viewmodel.component.h80) ((zy2.rb) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(cls))).O6();
            }
            if (i18 == 0 && ((java.lang.Number) ae2.in.U3.r()).intValue() == 0) {
                i18 = wo2.n0.f448105a.c(getF121515s());
                str7 = str2;
                com.tencent.mars.xlog.Log.i(str7, "prepareNearbyLive use last cache targetTabId=" + i18 + str5 + getF121515s());
            } else {
                str7 = str2;
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            valueOf2.intValue();
            num = i18 != 0 ? z17 : false ? valueOf2 : null;
            if (num != null) {
                num.intValue();
                r45.dd2 dd2Var = new r45.dd2();
                dd2Var.set(0, java.lang.Integer.valueOf(i18));
                bundle.putByteArray(str3, dd2Var.toByteArray());
            }
            if (getArguments() == null) {
                setArguments(bundle);
            } else {
                android.os.Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putAll(bundle);
                }
            }
            com.tencent.mars.xlog.Log.i(str7, "prepareNearbyLive targetTabId=" + i18 + str6 + i17 + str4 + j17 + str + activity);
            return;
        }
        if (((java.lang.Number) ae2.in.U3.r()).intValue() == 1) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            android.content.Intent intent = activity.getIntent();
            int intExtra = intent != null ? intent.getIntExtra("key_request_scene", 0) : 0;
            bundle4.putInt("key_request_scene", intExtra);
            if (getArguments() == null) {
                setArguments(bundle4);
            } else {
                android.os.Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    arguments2.putAll(bundle4);
                }
            }
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareFragment", "prepareNearbySquare newSquareEnable:true scene:" + intExtra);
            return;
        }
        zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.os.Bundle bundle5 = new android.os.Bundle();
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk7.L0("FinderLiveEntrance");
        if (L02 != null) {
            if (L02.I0("FinderLiveEntrance") == null || L02.getType() != 16) {
                str9 = " commentScene=";
                cls2 = zy2.rb.class;
                str10 = " targetObjectId:";
                str11 = " enterLiveAction:";
                str12 = "nearby_live_target_square_page_params_key";
                str13 = "NearbyLiveSquareFragment";
                str14 = " activity:";
                bundle2 = bundle5;
                i37 = 0;
                i38 = 0;
            } else {
                nk7.a0(L02);
                r45.xs2 Q8 = nk7.Q("NearbyLiveTab");
                int integer3 = Q8 != null ? Q8.getInteger(12) : 0;
                r45.xs2 Q9 = nk7.Q("NearbyLiveTab");
                int integer4 = Q9 != null ? Q9.getInteger(13) : 0;
                r45.xs2 Q10 = nk7.Q("NearbyLiveTab");
                long j37 = Q10 != null ? Q10.getLong(3) : 0L;
                r45.xs2 Q11 = nk7.Q("NearbyLiveTab");
                java.lang.String str20 = (Q11 == null || (string6 = Q11.getString(8)) == null) ? "" : string6;
                r45.xs2 Q12 = nk7.Q("NearbyLiveTab");
                java.lang.String str21 = (Q12 == null || (string5 = Q12.getString(14)) == null) ? "" : string5;
                r45.xs2 Q13 = nk7.Q("NearbyLiveTab");
                java.lang.String str22 = (Q13 == null || (string4 = Q13.getString(15)) == null) ? "" : string4;
                r45.xs2 Q14 = nk7.Q("NearbyLiveTab");
                if (Q14 == null || (str16 = Q14.getString(16)) == null) {
                    str16 = "";
                }
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(integer4);
                valueOf3.intValue();
                if (!(integer4 == 1)) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    valueOf3.intValue();
                    if (j37 != 0) {
                        bundle5.putLong("nearby_live_target_object_id_params_key", j37);
                        bundle5.putInt("nearby_live_target_tab_id_params_key", integer3);
                        bundle5.putString("nearby_live_target_nonce_id_params_key", str20);
                        bundle5.putString("nearby_live_target_user_name_params_key", str21);
                        bundle5.putString("nearby_live_target_nick_name_params_key", str22);
                        bundle5.putString("nearby_live_target_cover_url_params_key", str16);
                        dp2.e eVar2 = dp2.e.f242192a;
                        j27 = j37;
                        eVar2.c(activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null, j27, str20, false, getF121515s(), null);
                        str9 = " commentScene=";
                        cls2 = zy2.rb.class;
                        i48 = integer4;
                        str12 = "nearby_live_target_square_page_params_key";
                        i39 = integer3;
                        str11 = " enterLiveAction:";
                        str14 = " activity:";
                        str10 = " targetObjectId:";
                        str13 = "NearbyLiveSquareFragment";
                        bundle2 = bundle5;
                        dp2.e.d(eVar2, activity, integer3, j37, str20, str21, str22, 0L, null, 192, null);
                        z19 = false;
                    } else {
                        j27 = j37;
                        str9 = " commentScene=";
                        cls2 = zy2.rb.class;
                        i48 = integer4;
                        i39 = integer3;
                        str10 = " targetObjectId:";
                        str11 = " enterLiveAction:";
                        str12 = "nearby_live_target_square_page_params_key";
                        str13 = "NearbyLiveSquareFragment";
                        str14 = " activity:";
                        bundle2 = bundle5;
                        z19 = true;
                    }
                    i47 = i48;
                    j28 = j27;
                    i28 = i47;
                    i29 = i39;
                    j19 = j28;
                } else {
                    str9 = " commentScene=";
                    cls2 = zy2.rb.class;
                    i38 = integer4;
                    str10 = " targetObjectId:";
                    str11 = " enterLiveAction:";
                    str12 = "nearby_live_target_square_page_params_key";
                    str13 = "NearbyLiveSquareFragment";
                    str14 = " activity:";
                    bundle2 = bundle5;
                    i37 = integer3;
                    j28 = j37;
                }
            }
            i39 = i37;
            i47 = i38;
            z19 = true;
            i28 = i47;
            i29 = i39;
            j19 = j28;
        } else {
            str9 = " commentScene=";
            cls2 = zy2.rb.class;
            str10 = " targetObjectId:";
            str11 = " enterLiveAction:";
            str12 = "nearby_live_target_square_page_params_key";
            str13 = "NearbyLiveSquareFragment";
            str14 = " activity:";
            bundle2 = bundle5;
            j19 = 0;
            i28 = 0;
            i29 = 0;
            z19 = true;
        }
        if (z19) {
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.h80) ((zy2.rb) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity).c(cls2))).O6();
        }
        if (i29 == 0) {
            i29 = wo2.n0.f448105a.c(getF121515s());
            com.tencent.mars.xlog.Log.i(str13, "prepareNewSquare use last cache targetTabId=" + i29 + str9 + getF121515s());
        }
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i29);
        valueOf4.intValue();
        num = i29 != 0 ? valueOf4 : null;
        if (num != null) {
            num.intValue();
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(i29));
            bundle2.putByteArray(str12, dd2Var2.toByteArray());
        }
        if (getArguments() == null) {
            str15 = str13;
            setArguments(bundle2);
        } else {
            str15 = str13;
            android.os.Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.putAll(bundle2);
            }
        }
        com.tencent.mars.xlog.Log.i(str15, "prepareNearbySquare newSquareEnable:false, targetTabId=" + i29 + str11 + i28 + str10 + j19 + str14 + activity);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, op2.a.class, qp2.y.class, com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6;
        super.o0();
        if (getActivity() == null || (P6 = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6()) == null) {
            return;
        }
        P6.o0();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ig2.m.f291393a.g();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareFragment", "onPause()");
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)).O6() instanceof com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) {
                rq2.x.f398914a.d(((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6());
            }
        }
        ip2.a.f293620i = true;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareFragment", "onResume()");
        rq2.x xVar = rq2.x.f398914a;
        rq2.x.f398917d = c01.id.c();
        ip2.a.f293620i = false;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6();
        if (P6 != null) {
            P6.p0();
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return 94;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return "1001";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String w0() {
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void z0() {
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6();
        if (P6 != null) {
            P6.z0();
        }
    }
}
