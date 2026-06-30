package gi5;

/* loaded from: classes12.dex */
public final class g extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public mf3.k f272308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
    }

    public final co.a V6(mf3.k kVar) {
        ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar == null) {
            return null;
        }
        int ordinal = kVar.getType().ordinal();
        if (ordinal == 1) {
            jd5.a aVar = new jd5.a();
            aVar.p(cVar.g());
            return aVar;
        }
        if (ordinal != 2) {
            return null;
        }
        jd5.c cVar2 = new jd5.c();
        java.lang.String h17 = cVar.h();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        cVar2.o(h17);
        cVar2.r(cVar.g());
        gg3.c a17 = cVar.a();
        cVar2.q((a17 != null ? (int) a17.f271730e : 0) / 1000);
        return cVar2;
    }

    public final void W6(java.lang.String str, java.lang.String str2, mf3.k kVar) {
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.RecordForwardComponent", "onUserConfirmed return, data null");
            return;
        }
        int ordinal = kVar.getType().ordinal();
        java.util.Collection collection = kz5.p0.f313996d;
        if (ordinal == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
            r45.gp0 gp0Var = cVar != null ? cVar.f5207a : null;
            if (cVar == null || gp0Var == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.RecordForwardComponent", "parser recordMsgInfo null");
                return;
            }
            kotlin.jvm.internal.o.d(str);
            java.util.List g17 = new r26.t(",").g(str, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            kotlin.jvm.internal.o.f(P1, "stringsToList(...)");
            if (com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
                com.tencent.mars.xlog.Log.w("MediaGallery.RecordForwardComponent", "want to send record msg, but toUser is null");
                return;
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
            ((ku5.t0) ku5.t0.f312615d).g(new gi5.d(P1, gp0Var, cVar, this, kVar, str2, new gi5.e(Q)));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
        kotlin.jvm.internal.o.f(Q2, "showProgressDlg(...)");
        gi5.f fVar = new gi5.f(Q2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        kotlin.jvm.internal.o.d(str);
        java.util.List g18 = new r26.t(",").g(str, 0);
        if (!g18.isEmpty()) {
            java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        java.util.ArrayList P12 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
        kotlin.jvm.internal.o.f(P12, "stringsToList(...)");
        ai5.c cVar2 = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar2 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.RecordForwardComponent", "parser recordMediaInfo null");
            return;
        }
        java.lang.String g19 = cVar2.g();
        java.lang.String h17 = cVar2.h();
        java.util.Iterator it = P12.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            r45.gp0 gp0Var2 = cVar2.f5207a;
            com.tencent.mm.plugin.fav.ui.x5.j(activity, str3, g19, h17, gp0Var2.f375448y, "", fVar, gp0Var2.f375431q2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
            }
        }
        com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, getActivity(), null, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        java.lang.String str2 = "";
        if (intent == null || (str = intent.getStringExtra("Select_Conv_User")) == null) {
            str = "";
        }
        if (intent != null && (stringExtra = intent.getStringExtra("custom_send_text")) != null) {
            str2 = stringExtra;
        }
        if (intent != null) {
            if (!(str.length() == 0)) {
                if (1 == i17 && -1 == i18) {
                    W6(str, str2, this.f272308d);
                    return;
                } else {
                    if (1001 == i17 && -1 == i18) {
                        W6(str, str2, this.f272308d);
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.RecordForwardComponent", "onActivityResult return, data invalid. toUsers: ".concat(str));
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f272308d = mediaInfo;
        if (!(userName.length() == 0)) {
            gi5.b bVar = new gi5.b(this, userName, mediaInfo);
            co.a V6 = V6(mediaInfo);
            if (V6 == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.RecordForwardComponent", "openConfirmDialog return, model invalid");
                return;
            }
            n13.t tVar = new n13.t();
            tVar.f334133a = bVar;
            tVar.f334138f.f334139a = 9;
            dk5.y yVar = (dk5.y) i95.n0.c(dk5.y.class);
            if (yVar != null) {
                yVar.wi(getActivity(), V6, userName, tVar);
                return;
            }
            return;
        }
        int ordinal = mediaInfo.getType().ordinal();
        if (ordinal == 1) {
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            co.a V62 = V6(mediaInfo);
            n13.r rVar = new n13.r();
            rVar.f334118b = 1001;
            ((dk5.b0) b0Var).Bi(activity, V62, rVar);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        n13.b0 b0Var2 = (n13.b0) i95.n0.c(n13.b0.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        co.a V63 = V6(mediaInfo);
        n13.r rVar2 = new n13.r();
        rVar2.f334118b = 1;
        rVar2.f334120d.f334139a = 9;
        ((dk5.b0) b0Var2).Bi(activity2, V63, rVar2);
    }
}
