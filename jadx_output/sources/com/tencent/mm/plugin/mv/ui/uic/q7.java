package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q7 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.uic.g8 f151388d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f151389e;

    /* renamed from: f, reason: collision with root package name */
    public long f151390f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f151391g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.m8 f151392h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151392h = new com.tencent.mm.plugin.mv.ui.uic.m8();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(in5.s0 r20, fm3.u r21, int r22) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.q7.O6(in5.s0, fm3.u, int):void");
    }

    public final java.lang.String P6(fm3.u uVar) {
        boolean e17 = fm3.u.A.e(uVar);
        ll3.i1 i1Var = ll3.i1.f319182a;
        if (!e17) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            java.lang.String string = ((com.tencent.mm.plugin.mv.ui.uic.n0) a17).f151310i.getString(8);
            if (string != null) {
                if (!(string.length() > 0)) {
                    string = null;
                }
                if (string != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
                    byte[] bytes = string.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    sb6.append(kk.k.g(bytes));
                    java.lang.String o17 = new com.tencent.mm.vfs.r6(i1Var.b(sb6.toString())).o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    if (com.tencent.mm.vfs.w6.j(o17)) {
                        return o17;
                    }
                }
            }
        }
        java.lang.String str = uVar.f264122b;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null && com.tencent.mm.vfs.w6.j(str)) {
                return str;
            }
        }
        java.lang.String str2 = uVar.f264125e;
        if (str2 != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("thumb_");
                byte[] bytes2 = str2.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                sb7.append(kk.k.g(bytes2));
                java.lang.String o18 = new com.tencent.mm.vfs.r6(i1Var.b(sb7.toString())).o();
                kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                if (com.tencent.mm.vfs.w6.j(o18)) {
                    return o18;
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a18;
        java.lang.String str3 = n0Var.f151315q.f389416d;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null && com.tencent.mm.vfs.w6.j(str3)) {
                return str3;
            }
        }
        java.lang.String string2 = n0Var.f151310i.getString(8);
        if (string2 != null) {
            if (!(string2.length() > 0)) {
                string2 = null;
            }
            if (string2 != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("thumb_");
                byte[] bytes3 = string2.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
                sb8.append(kk.k.g(bytes3));
                java.lang.String o19 = new com.tencent.mm.vfs.r6(i1Var.b(sb8.toString())).o();
                kotlin.jvm.internal.o.f(o19, "getAbsolutePath(...)");
                if (com.tencent.mm.vfs.w6.j(o19)) {
                    return o19;
                }
            }
        }
        return null;
    }

    public final void Q6(fm3.u uVar, boolean z17, int i17) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        r45.hf2 hf2Var = n0Var.f151310i;
        java.lang.String str = n0Var.f151314p;
        if (hf2Var == null || uVar == null || str == null) {
            return;
        }
        java.lang.String string = hf2Var.getString(8);
        if (string == null || string.length() == 0) {
            try {
                ll3.i1 i1Var = ll3.i1.f319182a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
                byte[] bytes = "DEFAULT_TEXT_STATUS_MUSIC_THUMB_PATH".getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                sb6.append(kk.k.g(bytes));
                java.lang.String o17 = new com.tencent.mm.vfs.r6(i1Var.b(sb6.toString())).o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                if (!com.tencent.mm.vfs.w6.j(o17)) {
                    android.content.res.Resources resources = getContext().getResources();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cjn));
                    arrayList.add(resources);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "setTextStatus", "(Lcom/tencent/mm/plugin/mv/model/MusicMv;ZI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "setTextStatus", "(Lcom/tencent/mm/plugin/mv/model/MusicMv;ZI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    com.tencent.mm.sdk.platformtools.x.D0(decodeResource, 100, android.graphics.Bitmap.CompressFormat.PNG, o17, true);
                    string = o17;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMvShareUIC", "save default text status thumb fail! " + e17.getLocalizedMessage());
            }
        }
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b("1016");
        c1Var.f21034a.f354938e = string;
        c1Var.f("music_player@inner");
        c1Var.g(hf2Var.getString(0));
        c1Var.e("http://wxapp.tc.qq.com/258/20304/stodownload?m=2009416463c227ad5a09b4fcf23bf985&filekey=30340201010420301e020201020402534804102009416463c227ad5a09b4fcf23bf9850202042e040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353931363030306366646534303030303030303037636638353130393030303030313032&bizid=1023");
        int i18 = 5;
        c1Var.d(hf2Var.getString(5));
        c1Var.h(str);
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "1";
        j0Var.f355141f = lm3.c0.a(hf2Var, uVar);
        c1Var.c(kz5.b0.c(j0Var));
        bi4.d1 d1Var = c1Var.f21034a;
        d1Var.f354940g = false;
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).Ni(context2, 1, d1Var);
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var2 = (com.tencent.mm.plugin.mv.ui.uic.n0) a18;
        fm3.j0 j0Var2 = fm3.j0.f264078a;
        android.app.Activity context4 = getContext();
        if (i17 != 3) {
            i18 = z17 ? 4 : 3;
        }
        fm3.j0.g(j0Var2, context4, hf2Var, uVar, 3, 0, i18, 0, n0Var2.Q6(), n0Var2.O6(), null, n0Var2.E, 576, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f151390f = java.lang.System.currentTimeMillis();
        ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).getClass();
        java.lang.String a17 = v82.b.a();
        kotlin.jvm.internal.o.f(a17, "getSearchId(...)");
        this.f151391g = a17;
    }
}
