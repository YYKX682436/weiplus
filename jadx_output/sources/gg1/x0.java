package gg1;

/* loaded from: classes7.dex */
public final class x0 implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.x f271657e;

    public x0(gg1.c1 c1Var, gg1.x xVar) {
        this.f271656d = c1Var;
        this.f271657e = xVar;
    }

    @Override // r56.a
    public final void call() {
        java.lang.String str;
        int i17;
        int i18;
        boolean z17;
        gg1.c1 c1Var = this.f271656d;
        c1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleBroadcast: ");
        gg1.x xVar = this.f271657e;
        sb6.append(xVar.f271654a.name());
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        int ordinal = xVar.f271654a.ordinal();
        x91.j jVar = x91.j.Stopped;
        com.tencent.mm.sdk.platformtools.b4 b4Var = c1Var.f271548n;
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = c1Var.f271545k;
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = c1Var.f271550p;
        fg1.u uVar = c1Var.f271537c;
        gg1.g gVar = c1Var.f271541g;
        dg.a aVar = c1Var.f271536b;
        gg1.k1 k1Var = c1Var.f271539e;
        switch (ordinal) {
            case 5:
                x91.h b17 = k1Var.b();
                x91.j jVar2 = x91.j.Playing;
                b17.f452651e.f452663a = jVar2;
                if (b4Var3.e()) {
                    c1Var.f271549o = false;
                    b4Var3.c(5000L, 5000L);
                }
                k1Var.b().f452651e.f452663a = jVar2;
                b4Var2.d();
                c1Var.f271544j = true;
                fg1.g gVar2 = (fg1.g) aVar;
                gVar2.getClass();
                try {
                    gVar2.f261865a = 0;
                    org.json.JSONObject b18 = gVar2.b();
                    b18.put("timeStamp", java.lang.System.currentTimeMillis());
                    b18.put("type", "DLNA");
                    gVar2.a(new fg1.c(), b18);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoPlay fail", e17);
                }
                b4Var.c(1000L, 1000L);
                uVar.c(true);
                gVar2.e(true);
                java.util.Iterator it = k1Var.f271591d.iterator();
                while (it.hasNext()) {
                    gg1.i iVar = (gg1.i) it.next();
                    x91.c cVar = iVar.f271568a.f452647a;
                    java.lang.String str2 = cVar != null ? cVar.f452641i : null;
                    x91.c cVar2 = k1Var.b().f452647a;
                    if (kotlin.jvm.internal.o.b(str2, cVar2 != null ? cVar2.f452641i : null)) {
                        iVar.f271571d = false;
                        iVar.f271570c = true;
                        iVar.f271569b = true;
                    }
                }
                java.util.Iterator it6 = k1Var.f271592e.iterator();
                while (it6.hasNext()) {
                    gg1.i iVar2 = (gg1.i) it6.next();
                    x91.c cVar3 = iVar2.f271568a.f452647a;
                    java.lang.String str3 = cVar3 != null ? cVar3.f452641i : null;
                    x91.c cVar4 = k1Var.b().f452647a;
                    if (kotlin.jvm.internal.o.b(str3, cVar4 != null ? cVar4.f452641i : null)) {
                        iVar2.f271571d = false;
                        iVar2.f271570c = true;
                        iVar2.f271569b = true;
                    }
                }
                yz5.a aVar2 = k1Var.f271593f;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                yz5.a aVar3 = c1Var.f271546l;
                if (aVar3 != null) {
                    ((gg1.k0) aVar3).invoke();
                    str = null;
                    c1Var.f271546l = null;
                } else {
                    str = null;
                }
                int i19 = c1Var.f271538d;
                if (i19 == 3) {
                    if (gVar != null) {
                        x91.c cVar5 = k1Var.b().f452647a;
                        x91.c cVar6 = k1Var.b().f452647a;
                        java.lang.String str4 = cVar6 != null ? cVar6.f452640h : str;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ((com.tencent.mm.plugin.appbrand.report.j1) gVar).Bi(true, "", str4, c1Var.f271538d);
                    }
                } else if (i19 == 5 || i19 == 8) {
                    if (gVar != null) {
                        gg1.g.n5(gVar, true, null, null, i19, 6, null);
                    }
                } else if (i19 == 8 && gVar != null) {
                    gg1.g.n5(gVar, true, null, null, i19, 6, null);
                }
                c1Var.f271538d = -1;
                return;
            case 6:
                x91.h b19 = k1Var.b();
                x91.j jVar3 = x91.j.Paused;
                b19.f452651e.f452663a = jVar3;
                k1Var.b().f452651e.f452663a = jVar3;
                fg1.g gVar3 = (fg1.g) aVar;
                gVar3.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoPause: ");
                try {
                    org.json.JSONObject b27 = gVar3.b();
                    b27.put("type", "DLNA");
                    gVar3.a(new fg1.b(), b27);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoPause fail", e18);
                }
                uVar.c(true);
                return;
            case 7:
                k1Var.b().f452651e.f452663a = jVar;
                k1Var.b().f452651e.f452663a = jVar;
                fg1.g gVar4 = (fg1.g) aVar;
                gVar4.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoEnded: ");
                try {
                    org.json.JSONObject b28 = gVar4.b();
                    b28.put("type", "DLNA");
                    gVar4.a(new fg1.a(), b28);
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoEnded fail", e19);
                }
                uVar.c(false);
                return;
            case 8:
                java.lang.Object obj = xVar.f271655b;
                if (obj == null || !(obj instanceof java.lang.Integer)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "Receive Action : Volume = " + ((java.lang.Integer) obj).intValue());
                return;
            case 9:
                java.lang.Object obj2 = xVar.f271655b;
                if (obj2 == null || !(obj2 instanceof java.lang.Boolean)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "Receive Action : Mute = " + ((java.lang.Boolean) obj2).booleanValue());
                return;
            case 10:
            default:
                return;
            case 11:
                if (k1Var.b().f452651e.f452663a == jVar) {
                    return;
                }
                ((fg1.g) aVar).e(false);
                k1Var.b().f452651e.f452663a = jVar;
                java.util.Iterator it7 = k1Var.f271591d.iterator();
                while (it7.hasNext()) {
                    gg1.i iVar3 = (gg1.i) it7.next();
                    x91.c cVar7 = iVar3.f271568a.f452647a;
                    java.lang.String str5 = cVar7 != null ? cVar7.f452641i : null;
                    x91.c cVar8 = k1Var.b().f452647a;
                    if (kotlin.jvm.internal.o.b(str5, cVar8 != null ? cVar8.f452641i : null)) {
                        iVar3.f271571d = false;
                        iVar3.f271570c = false;
                        iVar3.f271569b = true;
                    }
                }
                java.util.Iterator it8 = k1Var.f271592e.iterator();
                while (it8.hasNext()) {
                    gg1.i iVar4 = (gg1.i) it8.next();
                    x91.c cVar9 = iVar4.f271568a.f452647a;
                    java.lang.String str6 = cVar9 != null ? cVar9.f452641i : null;
                    x91.c cVar10 = k1Var.b().f452647a;
                    if (kotlin.jvm.internal.o.b(str6, cVar10 != null ? cVar10.f452641i : null)) {
                        iVar4.f271571d = false;
                        iVar4.f271570c = false;
                        iVar4.f271569b = true;
                    }
                }
                yz5.a aVar4 = k1Var.f271593f;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
                java.lang.Object obj3 = xVar.f271655b;
                if (obj3 == null || !(obj3 instanceof java.lang.Integer)) {
                    i17 = 3;
                    i18 = -1;
                } else {
                    i18 = ((java.lang.Integer) obj3).intValue();
                    i17 = 3;
                }
                if (i18 != i17) {
                    if ((i18 == 5 || i18 == 8) && gVar != null) {
                        gg1.g.n5(gVar, false, null, null, i18, 6, null);
                    }
                } else if (gVar != null) {
                    x91.c cVar11 = k1Var.b().f452647a;
                    x91.c cVar12 = k1Var.b().f452647a;
                    java.lang.String str7 = cVar12 != null ? cVar12.f452640h : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    z17 = false;
                    ((com.tencent.mm.plugin.appbrand.report.j1) gVar).Bi(false, "", str7, i18);
                    k1Var.b().h();
                    k1Var.b().i();
                    k1Var.b().f452654h = null;
                    uVar.c(z17);
                    b4Var.d();
                    b4Var3.d();
                    b4Var2.d();
                    return;
                }
                z17 = false;
                k1Var.b().h();
                k1Var.b().i();
                k1Var.b().f452654h = null;
                uVar.c(z17);
                b4Var.d();
                b4Var3.d();
                b4Var2.d();
                return;
        }
    }
}
