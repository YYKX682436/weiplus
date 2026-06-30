package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.i f115540a = new com.tencent.mm.plugin.finder.live.util.i();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f115541b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f115542c;

    static {
        com.tencent.mars.xlog.Log.i("BlurAvatarUtil", "initMemoryTrim");
        ki.i.f308101c.c(new com.tencent.mm.plugin.finder.live.util.b());
        f115541b = new com.tencent.mm.sdk.platformtools.r2(5);
        f115542c = jz5.h.b(com.tencent.mm.plugin.finder.live.util.c.f115452d);
    }

    public static final void a(com.tencent.mm.plugin.finder.live.util.i iVar, java.lang.String str) {
        iVar.getClass();
        try {
            com.tencent.mm.sdk.platformtools.r2 r2Var = f115541b;
            int size = r2Var.size();
            zl2.r4.f473950a.M2("BlurAvatarUtil", str + " cache Size:" + size);
            if (size > 0) {
                r2Var.d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "BlurAvatarUtil-memoryTrim");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final boolean b(java.lang.String str, java.lang.String liveCoverUrl, android.view.View view, yz5.l lVar) {
        java.lang.String str2;
        java.lang.Object obj;
        jz5.l lVar2;
        kotlin.jvm.internal.o.g(liveCoverUrl, "liveCoverUrl");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        boolean z17 = false;
        jz5.f0 f0Var = null;
        android.graphics.Bitmap bitmap = null;
        if ((liveCoverUrl.length() == 0) == true) {
            ya2.g gVar = ya2.h.f460484a;
            ya2.b2 b17 = gVar.b(str);
            str2 = b17 != null ? b17.field_liveCoverImg : null;
            if ((str2 == null || str2.length() == 0) != false) {
                ya2.b2 b18 = gVar.b(str);
                str2 = b18 != null ? b18.field_avatarUrl : null;
            }
        } else {
            str2 = liveCoverUrl;
        }
        h0Var.f310123d = str2;
        if ((str2 == null || str2.length() == 0) == true) {
            com.tencent.mars.xlog.Log.i("BlurAvatarUtil", "loadAvatarBlurBg anchorUsername:" + str + ",liveCoverUrl:" + liveCoverUrl + " and coverUrl is empty!");
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            return false;
        }
        com.tencent.mm.sdk.platformtools.r2 r2Var = f115541b;
        synchronized (r2Var) {
            obj = r2Var.get(h0Var.f310123d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadAvatarBlurBg coverUrl:");
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(",cache bm is null:");
        sb6.append(obj == null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("BlurAvatarUtil", sb6.toString());
        jz5.l lVar3 = (jz5.l) obj;
        if (lVar3 != null) {
            if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), (android.graphics.Bitmap) lVar3.f302834e));
            } else {
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) lVar3.f302834e;
                android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
                float f17 = h17.y / h17.x;
                float height = bitmap2.getHeight() / bitmap2.getWidth();
                if ((f17 == height) == true) {
                    lVar2 = new jz5.l(java.lang.Boolean.FALSE, new android.util.Size(bitmap2.getWidth(), bitmap2.getHeight()));
                } else {
                    android.util.Size size = f17 > height ? new android.util.Size((int) (bitmap2.getHeight() / f17), bitmap2.getHeight()) : new android.util.Size(bitmap2.getWidth(), (int) (bitmap2.getWidth() * f17));
                    if (size.getWidth() != 0 && size.getHeight() != 0) {
                        int abs = java.lang.Math.abs(size.getWidth() - bitmap2.getWidth());
                        jz5.g gVar2 = f115542c;
                        if (abs >= ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() || java.lang.Math.abs(size.getHeight() - bitmap2.getHeight()) >= ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue()) {
                            lVar2 = new jz5.l(java.lang.Boolean.TRUE, size);
                        }
                    }
                    lVar2 = new jz5.l(java.lang.Boolean.FALSE, new android.util.Size(bitmap2.getWidth(), bitmap2.getHeight()));
                }
                if (((java.lang.Boolean) lVar2.f302833d).booleanValue()) {
                    android.graphics.Bitmap k07 = com.tencent.mm.sdk.platformtools.x.k0((android.graphics.Bitmap) lVar3.f302834e, ((android.util.Size) lVar2.f302834e).getWidth(), ((android.util.Size) lVar2.f302834e).getHeight(), false);
                    if (k07 != null) {
                        r2Var.put(h0Var.f310123d, new jz5.l(lVar3.f302833d, k07));
                        com.tencent.mars.xlog.Log.i("BlurAvatarUtil", "getCenterCropBitmap old:" + ((android.graphics.Bitmap) lVar3.f302834e).getWidth() + '*' + ((android.graphics.Bitmap) lVar3.f302834e).getHeight() + ",new:" + k07.getWidth() + '*' + k07.getHeight());
                        bitmap = k07;
                    }
                } else {
                    bitmap = (android.graphics.Bitmap) lVar3.f302834e;
                }
                android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                if (bitmap == null) {
                    bitmap = (android.graphics.Bitmap) lVar3.f302834e;
                }
                view.setBackground(new android.graphics.drawable.BitmapDrawable(resources, bitmap));
            }
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            f0Var = jz5.f0.f302826a;
            z17 = true;
        }
        if (f0Var != null) {
            return z17;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3((java.lang.String) h0Var.f310123d, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        a17.f447873d = new com.tencent.mm.plugin.finder.live.util.e(view, lVar, h0Var);
        a17.f();
        return true;
    }
}
