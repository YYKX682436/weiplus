package fi5;

/* loaded from: classes12.dex */
public final class f extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public mf3.k f263078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
    }

    public final co.a V6(mf3.k kVar) {
        int ordinal = kVar.getType().ordinal();
        if (ordinal == 1) {
            jd5.a aVar = new jd5.a();
            java.lang.String g17 = kVar.g();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            aVar.p(g17 != null ? g17 : "");
            return aVar;
        }
        if (ordinal != 2) {
            return null;
        }
        gg3.c a17 = kVar.a();
        jd5.c cVar = new jd5.c();
        java.lang.String str = a17 != null ? a17.f271727b : null;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        cVar.o(str);
        java.lang.String g18 = kVar.g();
        cVar.r(g18 != null ? g18 : "");
        cVar.q((a17 != null ? (int) a17.f271730e : 0) / 1000);
        return cVar;
    }

    public final void W6(java.lang.String str, java.lang.String str2, mf3.k kVar) {
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.DiskForwardComponent", "onUserConfirmed return, data null");
            return;
        }
        int ordinal = kVar.getType().ordinal();
        java.util.Collection collection = kz5.p0.f313996d;
        if (ordinal == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
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
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            if (strArr.length == 0) {
                com.tencent.mars.xlog.Log.w("MediaGallery.DiskForwardComponent", "want to send record msg, but toUser is null");
                return;
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
            ((ku5.t0) ku5.t0.f312615d).g(new fi5.c(strArr, this, kVar, str2, new fi5.d(Q)));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
        kotlin.jvm.internal.o.f(Q2, "showProgressDlg(...)");
        fi5.e eVar = new fi5.e(Q2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
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
        java.lang.String[] strArr2 = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.DiskForwardComponent", "parser recordMediaInfo null");
            return;
        }
        java.lang.String g19 = cVar.g();
        java.lang.String h17 = cVar.h();
        for (java.lang.String str3 : strArr2) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            r45.gp0 gp0Var = cVar.f5207a;
            com.tencent.mm.plugin.fav.ui.x5.j(activity, str3, g19, h17, gp0Var.f375448y, "", eVar, gp0Var.f375431q2);
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
                    W6(str, str2, this.f263078d);
                    return;
                } else {
                    if (1001 == i17 && -1 == i18) {
                        W6(str, str2, this.f263078d);
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.DiskForwardComponent", "onActivityResult return, data invalid. toUsers: ".concat(str));
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f263078d = mediaInfo;
        if (!(userName.length() == 0)) {
            fi5.a aVar = new fi5.a(this, userName, mediaInfo);
            co.a V6 = V6(mediaInfo);
            if (V6 == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.DiskForwardComponent", "openConfirmDialog return, model invalid");
                return;
            }
            n13.t tVar = new n13.t();
            tVar.f334133a = aVar;
            tVar.f334138f.f334139a = 8;
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
