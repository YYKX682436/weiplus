package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class g implements mv.z {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.g f161052a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f161053b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f161054c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile mv.e0 f161055d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f161056e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.a0 f161057f;

    static {
        com.tencent.mm.plugin.setting.ui.setting.g gVar = new com.tencent.mm.plugin.setting.ui.setting.g();
        f161052a = gVar;
        f161053b = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m);
        f161056e = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        i95.m c17 = i95.n0.c(mv.a0.class);
        ((nv.v1) ((mv.a0) c17)).Ni(gVar);
        kotlin.jvm.internal.o.f(c17, "also(...)");
        f161057f = (mv.a0) c17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0027, code lost:
    
        if ((r6 != null ? r6.f331496c : null) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r6 != null ? r6.f331496c : null) != r2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r0 = true;
     */
    @Override // mv.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(mv.e0 r6) {
        /*
            r5 = this;
            mv.e0 r0 = com.tencent.mm.plugin.setting.ui.setting.g.f161055d
            r1 = 0
            if (r0 == 0) goto L8
            mv.f0 r0 = r0.f331496c
            goto L9
        L8:
            r0 = r1
        L9:
            mv.f0 r2 = mv.f0.f331504g
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L17
            if (r6 == 0) goto L14
            mv.f0 r0 = r6.f331496c
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == r2) goto L29
        L17:
            mv.e0 r0 = com.tencent.mm.plugin.setting.ui.setting.g.f161055d
            if (r0 == 0) goto L1e
            mv.f0 r0 = r0.f331496c
            goto L1f
        L1e:
            r0 = r1
        L1f:
            mv.f0 r2 = mv.f0.f331506i
            if (r0 != r2) goto L2b
            if (r6 == 0) goto L27
            mv.f0 r1 = r6.f331496c
        L27:
            if (r1 != r2) goto L2b
        L29:
            r0 = r3
            goto L2c
        L2b:
            r0 = r4
        L2c:
            if (r6 == 0) goto L40
            com.tencent.mm.plugin.setting.ui.setting.g.f161055d = r6
            mv.f0 r1 = r6.f331496c
            mv.f0 r2 = mv.f0.f331502e
            if (r1 != r2) goto L38
            com.tencent.mm.plugin.setting.ui.setting.g.f161054c = r3
        L38:
            mv.f0 r1 = r6.f331496c
            mv.f0 r2 = mv.f0.f331501d
            if (r1 != r2) goto L40
            com.tencent.mm.plugin.setting.ui.setting.g.f161054c = r4
        L40:
            com.tencent.mm.plugin.setting.ui.setting.f r1 = new com.tencent.mm.plugin.setting.ui.setting.f
            r1.<init>(r0, r6)
            nf.e.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.g.a(mv.e0):void");
    }

    public final boolean b(com.tencent.mm.plugin.setting.ui.setting.b bVar) {
        mv.e0 e0Var = f161055d;
        com.tencent.mars.xlog.Log.i("MainTabSettings", "[notifyStatusUpdate] info=" + e0Var);
        mv.f0 f0Var = e0Var != null ? e0Var.f331496c : null;
        switch (f0Var == null ? -1 : com.tencent.mm.plugin.setting.ui.setting.c.f160893a[f0Var.ordinal()]) {
            case -1:
            case 6:
                bVar.a(null);
                bVar.b(null, null);
                return false;
            case 0:
            default:
                return true;
            case 1:
            case 2:
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                jz5.l lVar = e0Var.f331496c == mv.f0.f331503f ? new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.spinner_16_outer_holo), java.lang.Integer.valueOf(context.getColor(com.tencent.mm.R.color.adg))) : new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.spinner_green_16_outer_holo), java.lang.Integer.valueOf(f161053b));
                int intValue = ((java.lang.Number) lVar.f302833d).intValue();
                int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
                android.graphics.drawable.Drawable drawable = context.getDrawable(intValue);
                bVar.a(drawable != null ? new x14.r(drawable, 0.0f, 360.0f, 0L, 8, null) : null);
                bVar.b(e0Var.f331497d, java.lang.Integer.valueOf(intValue2));
                return true;
            case 3:
                android.graphics.drawable.Drawable drawable2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getDrawable(com.tencent.mm.R.raw.spinner_green_16_outer_holo);
                bVar.a(drawable2 != null ? new x14.r(drawable2, 0.0f, 360.0f, 0L, 8, null) : null);
                boolean z17 = ((nv.v1) f161057f).f340403f;
                int i17 = f161053b;
                if (z17) {
                    bVar.b(e0Var.f331497d, java.lang.Integer.valueOf(i17));
                    return true;
                }
                bVar.b(e0Var.f331497d + ' ' + e0Var.f331498e + '%', java.lang.Integer.valueOf(i17));
                return true;
            case 4:
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.graphics.drawable.Drawable drawable3 = context2.getDrawable(com.tencent.mm.R.raw.spinner_16_outer_holo);
                r2 = drawable3 != null ? new x14.r(drawable3, 0.0f, 360.0f, 0L, 8, null) : null;
                int color = context2.getColor(com.tencent.mm.R.color.adg);
                bVar.a(r2);
                if (((nv.v1) f161057f).f340403f) {
                    bVar.b(e0Var.f331497d, java.lang.Integer.valueOf(color));
                    return true;
                }
                bVar.b(e0Var.f331497d + ' ' + e0Var.f331498e + '%', java.lang.Integer.valueOf(color));
                return true;
            case 5:
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.graphics.drawable.Drawable drawable4 = context3.getDrawable(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
                if (drawable4 != null) {
                    drawable4.mutate();
                    drawable4.setColorFilter(new android.graphics.PorterDuffColorFilter(context3.getColor(com.tencent.mm.R.color.Red_100), android.graphics.PorterDuff.Mode.SRC_ATOP));
                    r2 = drawable4;
                }
                bVar.a(r2);
                bVar.b(e0Var.f331497d, java.lang.Integer.valueOf(context3.getColor(com.tencent.mm.R.color.adg)));
                return true;
        }
    }

    public final boolean c(com.tencent.mm.plugin.setting.ui.setting.b statusProvider) {
        boolean b17;
        kotlin.jvm.internal.o.g(statusProvider, "statusProvider");
        java.util.Set statusProviders = f161056e;
        kotlin.jvm.internal.o.f(statusProviders, "statusProviders");
        synchronized (statusProviders) {
            statusProviders.add(statusProvider);
            b17 = f161052a.b(statusProvider);
        }
        return b17;
    }

    public final void d(com.tencent.mm.plugin.setting.ui.setting.b statusProvider) {
        kotlin.jvm.internal.o.g(statusProvider, "statusProvider");
        java.util.Set statusProviders = f161056e;
        kotlin.jvm.internal.o.f(statusProviders, "statusProviders");
        synchronized (statusProviders) {
            statusProviders.remove(statusProvider);
        }
    }
}
