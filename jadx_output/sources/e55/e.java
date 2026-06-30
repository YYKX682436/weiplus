package e55;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e55.e f249667a = new e55.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f249668b = kz5.z.D0(new java.lang.String[]{"MainUI", "MvvmAddressUIFragment", "FindMoreFriendsUI", "MoreTabUI"});

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f249669c = kz5.z.D0(new java.lang.String[]{"AppBrandLauncherUI", "AppBrandLaunchProxyUI"});

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f249670d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Integer f249671e;

    /* renamed from: f, reason: collision with root package name */
    public static java.util.Map f249672f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f249673g;

    public final java.lang.String a(java.lang.String redDotKey) {
        kotlin.jvm.internal.o.g(redDotKey, "redDotKey");
        return (java.lang.String) kz5.n0.a0(r26.n0.e0(redDotKey, new char[]{'@'}, false, 0, 6, null), 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r3.equals("find_live_friends_by_near") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NearbyEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r3.equals("find_friends_by_ting") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Listen.Entrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r3.equals("find_friends_by_finder_live") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r3.equals("find_friends_by_finder_live_above_look") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (r3.equals("find_friends_by_ting_play_state") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
    
        if (r3.equals("find_friends_by_near_v3") == false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.extension.reddot.jb b(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e55.e.b(java.lang.String):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r3.equals("find_friends_by_ting") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Listen.MentionEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r3.equals("find_friends_by_ting_play_state") == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.extension.reddot.jb c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "entryKey"
            kotlin.jvm.internal.o.g(r3, r0)
            int r0 = r3.hashCode()
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            switch(r0) {
                case -1066667500: goto Lb7;
                case -1054053633: goto L9b;
                case 886691415: goto L56;
                case 886923942: goto L4c;
                case 1529575902: goto L2e;
                case 1897686880: goto L10;
                default: goto Le;
            }
        Le:
            goto Ld4
        L10:
            java.lang.String r0 = "find_friends_by_search"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1a
            goto Ld4
        L1a:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Search.MentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            goto Ld5
        L2e:
            java.lang.String r0 = "find_friends_by_finder"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto Ld4
        L38:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "FinderMentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            goto Ld5
        L4c:
            java.lang.String r0 = "find_friends_by_ting"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La4
            goto Ld4
        L56:
            java.lang.String r0 = "find_friends_by_look"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto Ld4
        L60:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "NewLife.MentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            if (r3 != 0) goto Ld5
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "NewLife.OfficialMsgEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            if (r3 != 0) goto Ld5
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "K1k.MentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            goto Ld5
        L9b:
            java.lang.String r0 = "find_friends_by_ting_play_state"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La4
            goto Ld4
        La4:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Listen.MentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            goto Ld5
        Lb7:
            java.lang.String r0 = "settings_mm_cardpackage_new"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc1
            goto Ld4
        Lc1:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Card.Entrance.Left"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r0)
            goto Ld5
        Ld4:
            r3 = 0
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e55.e.c(java.lang.String):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r3.equals("find_friends_by_ting") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("Listen.MentionEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r3.equals("find_friends_by_ting_play_state") == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.f03 d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "entryKey"
            kotlin.jvm.internal.o.g(r3, r0)
            int r0 = r3.hashCode()
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            switch(r0) {
                case -1066667500: goto Lb7;
                case -1054053633: goto L9b;
                case 886691415: goto L56;
                case 886923942: goto L4c;
                case 1529575902: goto L2e;
                case 1897686880: goto L10;
                default: goto Le;
            }
        Le:
            goto Ld4
        L10:
            java.lang.String r0 = "find_friends_by_search"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1a
            goto Ld4
        L1a:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Search.MentionEntrance"
            r45.f03 r3 = r3.I0(r0)
            goto Ld5
        L2e:
            java.lang.String r0 = "find_friends_by_finder"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto Ld4
        L38:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "FinderMentionEntrance"
            r45.f03 r3 = r3.I0(r0)
            goto Ld5
        L4c:
            java.lang.String r0 = "find_friends_by_ting"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La4
            goto Ld4
        L56:
            java.lang.String r0 = "find_friends_by_look"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto Ld4
        L60:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "NewLife.MentionEntrance"
            r45.f03 r3 = r3.I0(r0)
            if (r3 != 0) goto Ld5
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "NewLife.OfficialMsgEntrance"
            r45.f03 r3 = r3.I0(r0)
            if (r3 != 0) goto Ld5
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "K1k.MentionEntrance"
            r45.f03 r3 = r3.I0(r0)
            goto Ld5
        L9b:
            java.lang.String r0 = "find_friends_by_ting_play_state"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La4
            goto Ld4
        La4:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Listen.MentionEntrance"
            r45.f03 r3 = r3.I0(r0)
            goto Ld5
        Lb7:
            java.lang.String r0 = "settings_mm_cardpackage_new"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc1
            goto Ld4
        Lc1:
            i95.m r3 = i95.n0.c(r1)
            zy2.b6 r3 = (zy2.b6) r3
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r0 = "Card.Entrance.Left"
            r45.f03 r3 = r3.I0(r0)
            goto Ld5
        Ld4:
            r3 = 0
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e55.e.d(java.lang.String):r45.f03");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r3.equals("find_live_friends_by_near") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("NearbyEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r3.equals("find_friends_by_ting") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("Listen.Entrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r3.equals("find_friends_by_finder_live") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r3.equals("find_friends_by_finder_live_above_look") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (r3.equals("find_friends_by_ting_play_state") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
    
        if (r3.equals("find_friends_by_near_v3") == false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.f03 e(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e55.e.e(java.lang.String):r45.f03");
    }

    public final java.util.Map f(java.lang.String entryKey, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        if (jbVar == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("tipsid", jbVar.field_tipsId);
            linkedHashMap.put("tips_uuid", jbVar.field_tips_uuid);
            l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
            linkedHashMap.put("ctrlinfo_business_type", java.lang.Integer.valueOf(jbVar.Q0(false)));
            linkedHashMap.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
            if (f249671e == null) {
                f249671e = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_red_dot_report_filter_ext_report_info_conifg, 0));
                com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReportUtils", "cur extReportInfoFieldConfig is " + f249671e);
            }
            int indexOf = ((java.util.ArrayList) f249670d).indexOf(entryKey);
            int i17 = indexOf != -1 ? 1 << indexOf : 0;
            java.lang.Integer num = f249671e;
            kotlin.jvm.internal.o.d(num);
            if ((i17 & num.intValue()) != 0) {
                r45.vs2 vs2Var = jbVar.field_ctrInfo;
                linkedHashMap.put("ext_reportinfo", vs2Var != null ? vs2Var.f388499t : null);
            }
            linkedHashMap.put("tab_tips_revoke_id", jbVar.field_revokeId);
            linkedHashMap.put("object_id", b52.b.q(jbVar.W0().getLong(0)));
        }
        if (f03Var == null) {
            linkedHashMap2 = null;
        } else {
            linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("show_path", f03Var.f373892i);
            linkedHashMap2.put("show_parent_path", f03Var.f373893m);
            linkedHashMap2.put("show_type", java.lang.Integer.valueOf(f03Var.f373887d));
            linkedHashMap2.put("message_num", java.lang.Integer.valueOf(f03Var.f373888e));
            linkedHashMap2.put("limit_expose_count", java.lang.Integer.valueOf(f03Var.f373900t));
            linkedHashMap2.put("limit_expose_strategy", java.lang.Integer.valueOf(f03Var.f373901u));
        }
        if (linkedHashMap == null && linkedHashMap2 == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        if (linkedHashMap != null) {
            linkedHashMap3.putAll(linkedHashMap);
        }
        if (linkedHashMap2 != null) {
            linkedHashMap3.putAll(linkedHashMap2);
        }
        return linkedHashMap3;
    }

    public final java.lang.String g(java.lang.String entryKey) {
        r45.f03 d17;
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        if (kotlin.jvm.internal.o.b(entryKey, "album_dyna_photo_ui_title")) {
            if (((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).f() > 0) {
                return java.lang.String.valueOf(((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).f());
            }
            return null;
        }
        if (!kotlin.jvm.internal.o.b(entryKey, "find_friends_by_finder") || (d17 = d(entryKey)) == null) {
            return null;
        }
        return java.lang.String.valueOf(d17.f373888e);
    }

    public final java.lang.String h(java.lang.String entryKey) {
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        if (!kotlin.jvm.internal.o.b(entryKey, "album_dyna_photo_ui_title")) {
            return null;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(68418, "");
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) l17;
    }

    public final java.util.Map i(java.lang.String entryKey) {
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        if (!kotlin.jvm.internal.o.b(entryKey, "album_dyna_photo_ui_title")) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sns_feed_id", gm0.j1.u().c().l(68418, ""));
        linkedHashMap.put("sns_object_username", gm0.j1.u().c().l(68377, ""));
        return linkedHashMap;
    }

    public final java.util.Map j() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193109e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("revision", str);
        linkedHashMap.put("entry_switch", java.lang.Integer.valueOf(z71.f.Bi().f470519d));
        linkedHashMap.put("entry_red_dot_switch", java.lang.Long.valueOf(z71.f.Bi().Ai()));
        linkedHashMap.put("device_support_magic_window", java.lang.Integer.valueOf(com.tencent.mm.ui.bk.v0() ? 1 : 0));
        return linkedHashMap;
    }

    public final java.lang.String k(int i17, java.lang.String redDotKey, java.lang.String entryKey) {
        kotlin.jvm.internal.o.g(redDotKey, "redDotKey");
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        return i17 + '@' + redDotKey + '@' + entryKey;
    }

    public final int l(java.lang.Object obj) {
        java.lang.Boolean bool;
        android.content.Intent intent;
        if (!(obj instanceof androidx.fragment.app.Fragment)) {
            return -1;
        }
        java.lang.String simpleName = obj.getClass().getSimpleName();
        java.util.Set set = f249668b;
        if (!set.contains(simpleName)) {
            return -1;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        java.lang.String simpleName2 = fragment.getClass().getSimpleName();
        if (kotlin.jvm.internal.o.b("com.tencent.mm.ui.conversation.MainUI", simpleName2) || kotlin.jvm.internal.o.b("MainUI", simpleName2)) {
            androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
            bool = (activity == null || (intent = activity.getIntent()) == null) ? null : java.lang.Boolean.valueOf(intent.getBooleanExtra("is_real_main_tab", true));
        } else {
            bool = java.lang.Boolean.TRUE;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            return -1;
        }
        return kz5.n0.b0(set, simpleName);
    }

    public final boolean m(java.lang.String str) {
        return kotlin.jvm.internal.o.b("com.tencent.mm.ui.LauncherUI", str) || kotlin.jvm.internal.o.b("LauncherUI", str);
    }

    public final boolean n() {
        if (f249673g == null) {
            f249673g = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_launcher_reddot_report_open_config, true));
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReportUtils", "cur isOpenRedDotReporter = " + f249673g);
        }
        java.lang.Boolean bool = f249673g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
