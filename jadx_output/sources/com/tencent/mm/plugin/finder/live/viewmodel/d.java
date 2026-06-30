package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f117015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.g f117016b;

    public d(boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.g gVar) {
        this.f117015a = z17;
        this.f117016b = gVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.bu5 bu5Var;
        java.lang.String string;
        java.lang.String str;
        java.lang.String string2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.viewmodel.g gVar = this.f117016b;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.pr1 pr1Var = (r45.pr1) fVar.f70618d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(pr1Var != null ? pr1Var.getString(1) : null)) {
                java.lang.String str2 = "";
                if (!this.f117015a) {
                    if (!gVar.f117102h) {
                        if (gVar.f117103i != null) {
                            lt.r0 r0Var = (lt.r0) i95.n0.c(lt.r0.class);
                            r45.n46 n46Var = gVar.f117103i;
                            java.lang.String str3 = (n46Var == null || (bu5Var = (r45.bu5) n46Var.getCustom(1)) == null || (string = bu5Var.getString(0)) == null) ? "" : string;
                            java.lang.String str4 = gVar.f117100f;
                            ((kt.s0) r0Var).Ai(str3, "", str4 == null ? "" : str4, -1, "");
                        } else {
                            r45.xl6 xl6Var = gVar.f117104m;
                            java.lang.String string3 = xl6Var != null ? xl6Var.getString(0) : null;
                            if (string3 != null) {
                                pm0.z.b(xy2.b.f458155b, "AUTH_ERROR_2", false, null, null, false, false, null, 124, null);
                                com.tencent.mm.plugin.finder.assist.w7.f102656a.e(-2, string3);
                            }
                        }
                    }
                    gVar.getActivity().finish();
                    return f0Var;
                }
                r45.pr1 pr1Var2 = (r45.pr1) fVar.f70618d;
                java.lang.String string4 = pr1Var2 != null ? pr1Var2.getString(1) : null;
                if (string4 == null) {
                    string4 = "";
                }
                gVar.getClass();
                gVar.f117100f = string4;
                r45.pr1 pr1Var3 = (r45.pr1) fVar.f70618d;
                if (pr1Var3 == null || (str = pr1Var3.getString(4)) == null) {
                    str = "";
                }
                r45.xl6 xl6Var2 = gVar.f117104m;
                if (xl6Var2 != null) {
                    xl6Var2.set(4, str);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thirdAppInfo authCode:");
                r45.xl6 xl6Var3 = gVar.f117104m;
                sb6.append(xl6Var3 != null ? xl6Var3.getString(4) : null);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str5 = gVar.f117098d;
                com.tencent.mars.xlog.Log.i(str5, sb7);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("thirdAppInfo platformId:");
                r45.xl6 xl6Var4 = gVar.f117104m;
                sb8.append(xl6Var4 != null ? java.lang.Integer.valueOf(xl6Var4.getInteger(2)) : null);
                sb8.append(", gameUserId:");
                r45.xl6 xl6Var5 = gVar.f117104m;
                sb8.append(xl6Var5 != null ? xl6Var5.getString(3) : null);
                com.tencent.mars.xlog.Log.i(str5, sb8.toString());
                boolean z17 = gVar.f117102h;
                ke2.y yVar = new ke2.y(gVar.f117100f, z17 ? 1 : 0, false, null, false, null, 60, null);
                r45.gv1 gv1Var = yVar.f307001u;
                gv1Var.set(6, str);
                r45.xl6 xl6Var6 = gVar.f117104m;
                gv1Var.set(8, java.lang.Integer.valueOf(xl6Var6 != null ? xl6Var6.getInteger(2) : 0));
                r45.xl6 xl6Var7 = gVar.f117104m;
                if (xl6Var7 != null && (string2 = xl6Var7.getString(3)) != null) {
                    str2 = string2;
                }
                gv1Var.set(9, str2);
                if (gVar.f117104m != null) {
                    gv1Var.set(7, 1);
                }
                yVar.t(gVar.getActivity(), gVar.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
                pq5.g l17 = yVar.l();
                androidx.appcompat.app.AppCompatActivity activity = gVar.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI");
                l17.f((com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI) activity);
                l17.K(new com.tencent.mm.plugin.finder.live.viewmodel.c(gVar, z17 ? 1 : 0, str));
                return l17;
            }
        }
        int i18 = fVar.f70616b;
        java.lang.String str6 = fVar.f70617c;
        r45.pr1 pr1Var4 = (r45.pr1) fVar.f70618d;
        gVar.getClass();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("dealError ");
        sb9.append(i18);
        sb9.append(", appid:");
        sb9.append(pr1Var4 != null ? pr1Var4.getString(1) : null);
        com.tencent.mars.xlog.Log.i(gVar.f117098d, sb9.toString());
        android.app.Activity context = gVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.live.viewmodel.b bVar = (com.tencent.mm.plugin.finder.live.viewmodel.b) a17;
        switch (i18) {
            case -200118:
                java.lang.String string5 = gVar.getResources().getString(com.tencent.mm.R.string.l4r);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                if (str6 == null) {
                    str6 = gVar.getResources().getString(com.tencent.mm.R.string.l4q);
                    kotlin.jvm.internal.o.f(str6, "getString(...)");
                }
                bVar.P6(false, string5, str6);
                break;
            case -200096:
                java.lang.String string6 = gVar.getResources().getString(com.tencent.mm.R.string.l4p);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                java.lang.String string7 = gVar.getResources().getString(com.tencent.mm.R.string.l4o);
                kotlin.jvm.internal.o.f(string7, "getString(...)");
                bVar.P6(false, string6, string7);
                break;
            case -200095:
                java.lang.String string8 = gVar.getResources().getString(com.tencent.mm.R.string.l4n);
                kotlin.jvm.internal.o.f(string8, "getString(...)");
                java.lang.String string9 = gVar.getResources().getString(com.tencent.mm.R.string.l4m);
                kotlin.jvm.internal.o.f(string9, "getString(...)");
                bVar.P6(false, string8, string9);
                break;
            case -200093:
                java.lang.String string10 = gVar.getResources().getString(com.tencent.mm.R.string.gcu);
                kotlin.jvm.internal.o.f(string10, "getString(...)");
                java.lang.String spannableString = com.tencent.mm.plugin.finder.assist.b3.f102022a.h(gVar.getContext(), com.tencent.mm.R.string.l4w, false).toString();
                kotlin.jvm.internal.o.f(spannableString, "toString(...)");
                bVar.P6(false, string10, spannableString);
                break;
            case -200091:
                java.lang.String string11 = gVar.getResources().getString(com.tencent.mm.R.string.l4k);
                kotlin.jvm.internal.o.f(string11, "getString(...)");
                java.lang.String string12 = gVar.getResources().getString(com.tencent.mm.R.string.l4q);
                kotlin.jvm.internal.o.f(string12, "getString(...)");
                bVar.P6(false, string11, string12);
                break;
            case -200035:
                java.lang.String string13 = gVar.getResources().getString(com.tencent.mm.R.string.l4l);
                kotlin.jvm.internal.o.f(string13, "getString(...)");
                java.lang.String string14 = gVar.getResources().getString(com.tencent.mm.R.string.l4q);
                kotlin.jvm.internal.o.f(string14, "getString(...)");
                bVar.P6(false, string13, string14);
                break;
            default:
                java.lang.String string15 = gVar.getResources().getString(com.tencent.mm.R.string.l4r);
                kotlin.jvm.internal.o.f(string15, "getString(...)");
                java.lang.String string16 = gVar.getResources().getString(com.tencent.mm.R.string.l4q);
                kotlin.jvm.internal.o.f(string16, "getString(...)");
                bVar.P6(false, string15, string16);
                break;
        }
        gVar.P6();
        bVar.Q6();
        if (i18 != -200093) {
            return f0Var;
        }
        android.view.View findViewById = bVar.h().findViewById(com.tencent.mm.R.id.g6a);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.tencent.mm.plugin.finder.assist.b3.f102022a.h(gVar.getContext(), com.tencent.mm.R.string.l4w, false));
        return f0Var;
    }
}
