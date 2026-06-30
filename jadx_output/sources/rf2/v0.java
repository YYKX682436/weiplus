package rf2;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f394914a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.un f394915b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f394916c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.q f394917d;

    public v0(android.view.View root, df2.un controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394914a = root;
        this.f394915b = controller;
        this.f394916c = "Finder.MileStoneLotteryWidget";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rf2.v0 r11, r45.f02 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.a(rf2.v0, r45.f02, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(rf2.v0 r31, r45.pl4 r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.b(rf2.v0, r45.pl4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void c(rf2.v0 v0Var, r45.pl4 pl4Var) {
        java.lang.String str;
        v0Var.getClass();
        jz5.f0 f0Var = null;
        if (pl4Var != null) {
            int i17 = pl4Var.f383162m;
            android.view.View view = v0Var.f394914a;
            if (i17 == 1) {
                java.lang.String str2 = pl4Var.f383158f;
                str = str2 != null ? str2 : "";
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", str);
                intent.putExtra("key_enter_profile_type", 11);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                e1Var.w(context, intent);
            } else if (i17 == 2) {
                java.lang.String str3 = pl4Var.f383158f;
                str = str3 != null ? str3 : "";
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Contact_User", str);
                intent2.putExtra("force_get_contact", true);
                intent2.putExtra("key_use_new_contact_profile", true);
                j45.l.j(view.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(v0Var.f394916c, "jumpAccountProfile failed, account is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(rf2.v0 r12, r45.fm4 r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.d(rf2.v0, r45.fm4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(rf2.v0 r5, android.view.View r6, r45.f02 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof rf2.l0
            if (r0 == 0) goto L16
            r0 = r8
            rf2.l0 r0 = (rf2.l0) r0
            int r1 = r0.f394802h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f394802h = r1
            goto L1b
        L16:
            rf2.l0 r0 = new rf2.l0
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f394800f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f394802h
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f394799e
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r6 = r0.f394798d
            r45.pl4 r6 = (r45.pl4) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L77
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.throwOnFailure(r8)
            int r8 = r7.f373881g
            boolean r8 = pm0.v.z(r8, r3)
            r45.sl4 r7 = r7.f373882h
            r2 = 0
            if (r7 == 0) goto L4b
            r45.pl4 r7 = r7.f385836i
            goto L4c
        L4b:
            r7 = r2
        L4c:
            if (r6 == 0) goto L58
            r2 = 2131296413(0x7f09009d, float:1.8210742E38)
            android.view.View r6 = r6.findViewById(r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L59
        L58:
            r6 = r2
        L59:
            if (r6 != 0) goto L5c
            goto L94
        L5c:
            if (r8 == 0) goto L68
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r7 = 2131764850(0x7f102672, float:1.9160845E38)
            java.lang.String r5 = r5.getString(r7)
            goto L91
        L68:
            r0.f394798d = r7
            r0.f394799e = r6
            r0.f394802h = r3
            java.lang.Object r8 = r5.f(r7, r0)
            if (r8 != r1) goto L75
            goto L96
        L75:
            r5 = r6
            r6 = r7
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L86
            if (r6 == 0) goto L8c
            java.lang.String r6 = r6.f383163n
            if (r6 != 0) goto L8e
            goto L8c
        L86:
            if (r6 == 0) goto L8c
            java.lang.String r6 = r6.f383159g
            if (r6 != 0) goto L8e
        L8c:
            java.lang.String r6 = ""
        L8e:
            r4 = r6
            r6 = r5
            r5 = r4
        L91:
            r6.setText(r5)
        L94:
            jz5.f0 r1 = jz5.f0.f302826a
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.e(rf2.v0, android.view.View, r45.f02, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object f(r45.pl4 pl4Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        if (pl4Var == null) {
            com.tencent.mars.xlog.Log.e(this.f394916c, "check hasFollowedAccount failed, account is null");
            nVar.a(java.lang.Boolean.FALSE);
        } else {
            int i17 = pl4Var.f383162m;
            if (i17 == 1) {
                ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ri(pl4Var.f383158f, new rf2.a0(nVar, pl4Var));
            } else if (i17 != 2) {
                nVar.a(java.lang.Boolean.FALSE);
            } else {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(pl4Var.f383158f, true);
                nVar.a(java.lang.Boolean.valueOf(n17 != null && n17.r2()));
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r32, android.widget.TextView r33, android.view.View r34, r45.f02 r35) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.g(android.view.View, android.widget.TextView, android.view.View, r45.f02):void");
    }

    public final void h(r45.f02 f02Var, mm2.r4 r4Var, android.view.View view, android.widget.TextView textView) {
        boolean z17 = true;
        boolean z18 = pm0.v.z(f02Var.f373881g, 1);
        int i17 = r4Var.f329377b;
        if (!(1 <= i17 && i17 < 60) && !z18) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i(this.f394916c, "refreshCountDownText isAttend:" + z18 + ", showCountDown:" + z17 + ", data.localRemainTime:" + r4Var.f329377b);
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cji) : null;
        if (r4Var.f329377b <= 0 && z18) {
            if (textView != null) {
                textView.setText("");
            }
            if (textView2 == null) {
                return;
            }
            textView2.setText(this.f394914a.getContext().getString(com.tencent.mm.R.string.dpn));
            return;
        }
        if (!z17) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String a17 = no0.l.a(no0.m.f338730a, r4Var.f329377b, ":", false, false, false, 24, null);
        if (textView == null) {
            return;
        }
        textView.setText(a17);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a2  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r30, boolean r31, boolean r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.v0.i(java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void j(android.view.View view, r45.f02 f02Var) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.is9);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.isb);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kpk);
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        g(findViewById, textView2, view, f02Var);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.cjh);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cjk);
        mm2.r4 P6 = ((mm2.v4) this.f394915b.business(mm2.v4.class)).P6();
        if (P6 != null) {
            h(f02Var, P6, findViewById2, textView3);
        } else if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshParticipateStatus", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshParticipateStatus", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f394917d = new rf2.u0(this, f02Var, findViewById2, textView3, findViewById, textView2, view);
    }

    public final void k(android.view.View view, r45.f02 f02Var) {
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.isd) : null;
        android.content.Context context = this.f394914a.getContext();
        long j17 = f02Var.f373880f != null ? r4.f374447f : 0L;
        r45.tl4 tl4Var = f02Var.f373879e;
        boolean z17 = (tl4Var != null ? tl4Var.f386551m : 0) > 0;
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491627dq1, zl2.r4.S(r4Var, j17, 0, 2, null));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!z17) {
            if (textView == null) {
                return;
            }
            textView.setText(string);
        } else {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491629dq3, zl2.r4.S(r4Var, f02Var.f373879e != null ? r1.f386550i : 0L, 0, 2, null));
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (textView == null) {
                return;
            }
            textView.setText(context.getString(com.tencent.mm.R.string.dpz, string, string2));
        }
    }
}
