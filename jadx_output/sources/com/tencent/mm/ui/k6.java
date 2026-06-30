package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.FindMoreFriendsUI f209033a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f209034b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f209035c;

    /* renamed from: d, reason: collision with root package name */
    public final e75.a f209036d;

    public k6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        kotlin.jvm.internal.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f209033a = findMoreFriendsUI;
        this.f209036d = new com.tencent.mm.ui.i6(this);
    }

    public static final r45.f03 a(com.tencent.mm.ui.k6 k6Var, boolean z17, boolean z18, zy2.fa faVar, r45.pm6 pm6Var) {
        r45.f03 I0;
        k6Var.getClass();
        r45.f03 f03Var = null;
        if (z17) {
            r45.f03 I02 = faVar.I0("NewLife.MentionEntrance");
            if (I02 != null) {
                int i17 = I02.f373888e;
                if (i17 > 0) {
                    pm6Var.f383186d += i17;
                }
                f03Var = I02;
            }
            r45.f03 I03 = faVar.I0("NewLife.OfficialMsgEntrance");
            if (I03 != null) {
                int i18 = I03.f373888e;
                if (i18 > 0) {
                    pm6Var.f383186d += i18;
                }
                f03Var = I03;
            }
        }
        if (!z18 || (I0 = faVar.I0("K1k.MentionEntrance")) == null) {
            return f03Var;
        }
        int i19 = I0.f373888e;
        if (i19 > 0) {
            pm6Var.f383186d += i19;
        }
        return I0;
    }

    public final boolean b(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, r45.qn6 qn6Var) {
        return jbVar != null && f03Var != null && ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ai() && (qn6Var == null || ((long) jbVar.N.getInteger(5)) * 1000 >= qn6Var.f384124r);
    }

    public final void c(com.tencent.mm.ui.TopStoryIconViewTipPreference preference) {
        kotlin.jvm.internal.o.g(preference, "preference");
        int i17 = ra0.y.f393481g1;
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni == null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.j6(this, preference));
            return;
        }
        Ni.m3(this.f209033a, this.f209036d);
        Ni.B3(new sa0.a());
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_topstory_reddot_check_disable, false);
        if (this.f209035c || fj6) {
            return;
        }
        this.f209035c = true;
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance") != null) {
            Ni.B3(new sa0.i(null, false, null, "FindMoreTopStoryRedLogic init", 7, null));
        }
    }

    public final void d(com.tencent.mm.ui.TopStoryIconViewTipPreference preference) {
        kotlin.jvm.internal.o.g(preference, "preference");
        e(preference, false, false, null, null, null, null, null, null, "", new r45.pm6(), "", this.f209033a.f196653t.f420461g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f7, code lost:
    
        if (r14 <= 4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.ui.TopStoryIconViewTipPreference r40, boolean r41, boolean r42, com.tencent.mm.plugin.finder.extension.reddot.jb r43, com.tencent.mm.plugin.finder.extension.reddot.jb r44, com.tencent.mm.plugin.finder.extension.reddot.jb r45, com.tencent.mm.plugin.finder.extension.reddot.jb r46, r45.f03 r47, r45.f03 r48, java.lang.String r49, r45.pm6 r50, java.lang.String r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.k6.e(com.tencent.mm.ui.TopStoryIconViewTipPreference, boolean, boolean, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, r45.f03, java.lang.String, r45.pm6, java.lang.String, boolean):void");
    }
}
