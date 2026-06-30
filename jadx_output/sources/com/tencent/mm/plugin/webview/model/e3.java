package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f182851a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f182852b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.LinkedList f182853c;

    /* renamed from: d, reason: collision with root package name */
    public int f182854d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f182855e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.y2 f182856f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.c0 f182857g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f182858h;

    /* renamed from: i, reason: collision with root package name */
    public int f182859i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f182860j;

    public e3(com.tencent.mm.plugin.webview.model.f3 f3Var, java.lang.ref.WeakReference context, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        android.view.Window window;
        android.app.Dialog dialog;
        kotlin.jvm.internal.o.g(context, "context");
        this.f182860j = f3Var;
        this.f182851a = context;
        this.f182852b = str;
        this.f182853c = new java.util.LinkedList();
        java.lang.Object obj = context.get();
        kotlin.jvm.internal.o.d(obj);
        this.f182857g = new fl1.c0((android.content.Context) obj, null);
        this.f182858h = new java.util.ArrayList();
        if (weakReference == null || (dialog = (android.app.Dialog) weakReference.get()) == null || (window = dialog.getWindow()) == null) {
            java.lang.Object obj2 = context.get();
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.app.Activity");
            window = ((android.app.Activity) obj2).getWindow();
        }
        android.view.View decorView = window.getDecorView();
        if (decorView != null) {
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.addView(this.f182857g);
            }
        }
    }

    public final void a(int i17) {
        java.lang.String string;
        r45.ix4 ix4Var = new r45.ix4();
        android.os.Bundle bundle = this.f182855e;
        java.lang.String str = "";
        if (bundle != null && (string = bundle.getString("oauth_url", "")) != null) {
            str = string;
        }
        ix4Var.f377391d = str;
        ix4Var.f377392e = i17;
        ix4Var.f377393f.addAll(this.f182858h);
        ix4Var.f377394g = this.f182859i;
        ix4Var.f377395h = this.f182852b;
        java.util.Objects.toString(ix4Var.f377393f);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ix4Var;
        lVar.f70665b = new r45.jx4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.ld.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.model.b3(this.f182860j, this));
    }

    public final void b() {
        com.tencent.mm.plugin.webview.model.l2 l2Var;
        fl1.c0 c0Var;
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f182856f;
        if (y2Var != null) {
            if ((y2Var != null ? y2Var.f183195c : null) != null && (c0Var = this.f182857g) != null) {
                c0Var.a(y2Var != null ? y2Var.f183195c : null);
            }
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.L0(this.f182853c) || this.f182854d >= this.f182853c.size();
        java.lang.ref.WeakReference weakReference = this.f182851a;
        com.tencent.mm.plugin.webview.model.f3 f3Var = this.f182860j;
        if (z17) {
            android.os.Bundle bundle = this.f182855e;
            java.lang.String d17 = com.tencent.mm.plugin.webview.model.k2.d(bundle != null ? bundle.getString("oauth_url", "") : null);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f182858h)) {
                ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi((android.content.Context) weakReference.get(), com.tencent.mm.model.gdpr.a.OPENSDK, d17, new com.tencent.mm.plugin.webview.model.d3(d17, f3Var, this));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] allowScope empty");
            hy4.b bVar = hy4.b.INSTANCE;
            bVar.a(d17 == null ? "" : d17, com.tencent.mm.plugin.webview.model.k2.f182980a, 0, 1, 0, 1, 0);
            bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.webview.model.k2.f182981b), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.reject] reject");
            a(2);
            java.lang.ref.WeakReference weakReference2 = f3Var.f182877c;
            if (weakReference2 == null || (l2Var = (com.tencent.mm.plugin.webview.model.l2) weakReference2.get()) == null) {
                return;
            }
            ((com.tencent.mm.plugin.webview.core.o2) l2Var).d();
            return;
        }
        java.lang.Object obj = weakReference.get();
        kotlin.jvm.internal.o.d(obj);
        fl1.c0 c0Var2 = this.f182857g;
        kotlin.jvm.internal.o.d(c0Var2);
        com.tencent.mm.plugin.webview.model.y2 y2Var2 = new com.tencent.mm.plugin.webview.model.y2(f3Var, (android.content.Context) obj, c0Var2);
        y2Var2.f183196d = this;
        android.os.Bundle bundle2 = this.f182855e;
        kotlin.jvm.internal.o.d(bundle2);
        java.lang.Object obj2 = this.f182853c.get(this.f182854d);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        r45.jv5 jv5Var = (r45.jv5) obj2;
        y2Var2.f183197e = jv5Var;
        fl1.o oVar = y2Var2.f183195c;
        oVar.s(2);
        oVar.setAppBrandName(oVar.getContext().getString(com.tencent.mm.R.string.ghg, bundle2.getString("appname", "")));
        oVar.setRequestDesc(jv5Var.f378132e);
        oVar.setApplyWording("");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jv5Var.f378136i)) {
            oVar.setSimpleDetailDesc(jv5Var.f378136i);
        }
        oVar.setNegativeButtonText(oVar.getContext().getResources().getString(com.tencent.mm.R.string.gii));
        oVar.setPositiveButtonText(oVar.getContext().getResources().getString(com.tencent.mm.R.string.f492400gh3));
        oVar.setIconUrl(bundle2.getString("appicon_url", ""));
        java.io.Serializable serializable = bundle2.getSerializable("avatar_list");
        kotlin.jvm.internal.o.e(serializable, "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>");
        java.util.ArrayList<byte[]> arrayList = (java.util.ArrayList) serializable;
        y2Var2.f183204l.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            for (byte[] bArr : arrayList) {
                try {
                    r45.mx4 mx4Var = new r45.mx4();
                    mx4Var.parseFrom(bArr);
                    arrayList2.add(mx4Var);
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OauthMultiAccountMgr", "bytesListToAvatarList: exception");
                    arrayList2.clear();
                }
            }
        }
        int i17 = bundle2.getInt("default_avatar_id");
        y2Var2.f183199g = bundle2.getBoolean("is_ban_modify_avatar");
        java.lang.String string = bundle2.getString("create_avatar_title", "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        y2Var2.f183203k = string;
        y2Var2.f183200h = bundle2.getInt("avatar_limit");
        y2Var2.f183201i = 0;
        java.lang.String d18 = com.tencent.mm.plugin.webview.model.k2.d(bundle2.getString("oauth_url", ""));
        kotlin.jvm.internal.o.f(d18, "parseAppId(...)");
        y2Var2.f183202j = d18;
        boolean b17 = kotlin.jvm.internal.o.b(jv5Var.f378131d, "snsapi_userinfo");
        fl1.c0 c0Var3 = y2Var2.f183194b;
        if (b17) {
            y2Var2.f183201i = i17;
            com.tencent.mm.plugin.webview.model.e3 e3Var = y2Var2.f183196d;
            if (e3Var != null) {
                e3Var.f182859i = i17;
            }
            oVar.setItemCheckedListener(new com.tencent.mm.plugin.webview.model.q2(y2Var2));
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
                y2Var2.f183201i = i17;
                com.tencent.mm.plugin.webview.model.e3 e3Var2 = y2Var2.f183196d;
                if (e3Var2 != null) {
                    e3Var2.f182859i = i17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.showDialog] avatarList null");
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, null, com.tencent.mm.plugin.webview.model.w2.f183166d.getClass(), new com.tencent.mm.plugin.webview.model.x2(y2Var2, jv5Var));
            } else {
                java.util.ArrayList arrayList3 = y2Var2.f183198f;
                arrayList3.clear();
                java.lang.String Scope = jv5Var.f378131d;
                kotlin.jvm.internal.o.f(Scope, "Scope");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    r45.mx4 mx4Var2 = (r45.mx4) it.next();
                    java.lang.String str = mx4Var2.f380894e;
                    java.lang.String str2 = mx4Var2.f380896g;
                    boolean z18 = i17 == mx4Var2.f380893d;
                    java.lang.String avatarurl = mx4Var2.f380895f;
                    kotlin.jvm.internal.o.f(avatarurl, "avatarurl");
                    arrayList4.add(new fl1.h1(0, str, str2, Scope, z18, avatarurl, mx4Var2.f380893d));
                }
                arrayList3.addAll(arrayList4);
                y2Var2.a(jv5Var, oVar, arrayList3, y2Var2.f183199g, y2Var2.f183200h);
                oVar.setOnListItemLongClickListener(new com.tencent.mm.plugin.webview.model.v2(y2Var2, jv5Var));
                c0Var3.c(oVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.showDialog] non snsapi_userinfo");
            oVar.setAppBrandName(y2Var2.f183193a.getString(com.tencent.mm.R.string.ghe, bundle2.getString("appname", "")));
            java.lang.String Scope2 = jv5Var.f378131d;
            kotlin.jvm.internal.o.f(Scope2, "Scope");
            oVar.f263835z = Scope2;
            c0Var3.c(oVar);
        }
        this.f182856f = y2Var2;
        this.f182854d++;
    }
}
