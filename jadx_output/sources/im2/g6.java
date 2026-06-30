package im2;

/* loaded from: classes3.dex */
public final class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fl1 f292348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f292349f;

    public g6(im2.h6 h6Var, r45.fl1 fl1Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f292347d = h6Var;
        this.f292348e = fl1Var;
        this.f292349f = finderContact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.h6 h6Var = this.f292347d;
        com.tencent.mm.sdk.event.IListener iListener = h6Var.M;
        if (iListener != null) {
            iListener.alive();
        }
        h6Var.H = true;
        boolean z17 = h6Var.Y().f410654i;
        r45.fl1 fl1Var = this.f292348e;
        if (!z17) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f292349f;
            h6Var.I = finderContact.getUsername();
            h6Var.f292360J = fl1Var.getBoolean(2);
            int i18 = (fl1Var.getInteger(0) == 1 || fl1Var.getInteger(0) == 3) ? 1 : 0;
            if (i18 != 0) {
                boolean z18 = fl1Var.getBoolean(2);
                if (h6Var.N == null) {
                    android.view.View view2 = h6Var.f113668d;
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view2.getContext(), 1, true);
                    k0Var.q(view2.getContext().getResources().getString(com.tencent.mm.R.string.f491289cn3), 17);
                    k0Var.f211872n = new im2.c5(h6Var);
                    k0Var.f211881s = new im2.d5(h6Var, finderContact, z18);
                    k0Var.f211854d = new im2.e5(h6Var);
                    k0Var.f211860g = new im2.f5(h6Var);
                    h6Var.N = k0Var;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = h6Var.N;
                if (k0Var2 != null && !k0Var2.i()) {
                    k0Var2.v();
                }
            } else {
                im2.h6.f(h6Var, true, finderContact, fl1Var.getBoolean(2));
            }
            i17 = i18 ^ 1;
        } else {
            if (fl1Var.getInteger(1) == 1) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            h6Var.I = h6Var.Y().f410655j;
            h6Var.f292360J = false;
            android.content.Context context = h6Var.f113668d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = h6Var.Y().f410655j;
            h6Var.getClass();
            java.lang.Long l17 = null;
            if ((str.length() > 0) == false) {
                str = null;
            }
            if (str != null) {
                o25.a aVar = new o25.a();
                aVar.f342464b = com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET;
                aVar.f342468f = 0;
                aVar.f342469g = false;
                r45.l71 l71Var = h6Var.E;
                if (l71Var != null && (nw1Var = (r45.nw1) l71Var.getCustom(1)) != null) {
                    l17 = java.lang.Long.valueOf(nw1Var.getLong(0));
                }
                aVar.f342465c = java.lang.String.valueOf(l17);
                aVar.f342470h = true;
                ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).Ai(context, str, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, true, new im2.h5(h6Var, str), aVar)).f();
            }
            i17 = 1;
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        h6Var.Y().f410659n.getLong(0);
        long j17 = h6Var.Y().f410648c;
        int i19 = !h6Var.Y().f410654i ? 1 : 0;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_focus", java.lang.String.valueOf(i17));
        hashMap.put("is_finder", java.lang.String.valueOf(i19));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.K1, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_focus = " + ((java.lang.String) hashMap.get("is_focus")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
