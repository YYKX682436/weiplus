package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class fh implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123720e;

    public fh(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        this.f123719d = wxRecyclerAdapter;
        this.f123720e = finderProfileTingAudioUIC;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        ms2.c cVar = obj instanceof ms2.c ? (ms2.c) obj : null;
        if (cVar == null) {
            return;
        }
        int a07 = i17 - this.f123719d.a0();
        if (a07 < 0) {
            a07 = 0;
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f123720e;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = finderProfileTingAudioUIC.f123483o;
        if (finderProfileTingAudioListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        java.util.ArrayList dataList = finderProfileTingAudioListLoader.getDataList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof ms2.c) {
                arrayList.add(next);
            }
        }
        r45.ig4 ig4Var = cVar.f330969d;
        r45.gg4 gg4Var = ig4Var.B;
        int i18 = gg4Var != null ? gg4Var.f375232r : 0;
        if (i18 == 0) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity context = finderProfileTingAudioUIC.getContext();
            bw5.lp0 a17 = ms2.d.a(ig4Var);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderProfileAudio;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(ms2.d.a(((ms2.c) it6.next()).f330969d));
            }
            r45.dg4 dg4Var = cVar.f330970e;
            bw5.o50 a18 = dg4Var != null ? ms2.a.a(dg4Var) : null;
            kotlin.jvm.internal.o.g(context, "context");
            boolean z17 = !arrayList2.isEmpty();
            bw5.ar0 b17 = com.tencent.mm.plugin.finder.storage.cd0.f126580a.b(context, ar0Var);
            boolean h17 = il4.l.f292142a.h(context);
            android.content.Intent intent = context.getIntent();
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("finder_username") : null;
            il4.e eVar = new il4.e(null, z17 ? a07 : 0, b17.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554417, null);
            il4.f fVar = eVar.f292122s;
            fVar.f292131c = h17;
            if (stringExtra != null) {
                fVar.f292132d.put("finderusername", stringExtra);
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).A(context, true, a17, z17 ? arrayList2 : null, eVar, a18, null, b17, null);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(a17, b17);
            com.tencent.mm.plugin.finder.report.k0.f125092a.a(context, "Ting");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickTingAudio audio_status ");
        r45.gg4 gg4Var2 = ig4Var.B;
        kotlin.jvm.internal.o.d(gg4Var2);
        sb6.append(gg4Var2.f375232r);
        sb6.append(" can not play");
        com.tencent.mars.xlog.Log.i("Finder.FinderTingProfileFragmentUIC", sb6.toString());
        if (i18 == 2) {
            androidx.fragment.app.Fragment fragment = finderProfileTingAudioUIC.getFragment();
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment finderProfileTingAudioFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment ? (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment : null;
            db2.e6 e6Var = finderProfileTingAudioFragment != null ? finderProfileTingAudioFragment.f123478t : null;
            if (e6Var == null || !e6Var.K() || !finderProfileTingAudioUIC.isSelf() || !finderProfileTingAudioUIC.isSelfFlag()) {
                com.tencent.mars.xlog.Log.w("Finder.FinderTingProfileFragmentUIC", "handleClickTingAudio can not post isSelf " + finderProfileTingAudioUIC.isSelf() + ", isSelfFlag " + finderProfileTingAudioUIC.isSelfFlag());
                return;
            }
            r45.sd1 O = e6Var.O();
            if (O != null) {
                r45.gg4 gg4Var3 = ig4Var.B;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gg4Var3 != null ? gg4Var3.f375221d : null)) {
                    r45.gg4 gg4Var4 = ig4Var.B;
                    finderProfileTingAudioUIC.P6(O, gg4Var4 != null ? gg4Var4.f375221d : null);
                    return;
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleClickTingAudio liteApp null(");
            sb7.append(O);
            sb7.append(" !=  null) or tid null (");
            r45.gg4 gg4Var5 = ig4Var.B;
            sb7.append(gg4Var5 != null ? gg4Var5.f375221d : null);
            sb7.append(')');
            com.tencent.mars.xlog.Log.i("Finder.FinderTingProfileFragmentUIC", sb7.toString());
        }
    }
}
