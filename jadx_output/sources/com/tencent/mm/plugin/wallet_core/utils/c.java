package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f180854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at4.k f180855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l f180856f;

    public c(com.tencent.mm.plugin.wallet_core.utils.m mVar, android.view.View view, at4.k kVar, com.tencent.mm.plugin.wallet_core.utils.l lVar) {
        this.f180854d = view;
        this.f180855e = kVar;
        this.f180856f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable;
        android.view.View view = this.f180854d;
        view.invalidate();
        at4.k kVar = this.f180855e;
        java.lang.String str = kVar.f13879b;
        int i17 = (gt4.q.f275497a.equals(str) || gt4.q.f275498b.equals(str)) ? com.tencent.mm.R.drawable.chb : (gt4.q.f275505i.equals(str) || gt4.q.f275506j.equals(str)) ? com.tencent.mm.R.drawable.che : (gt4.q.f275503g.equals(str) || gt4.q.f275504h.equals(str)) ? com.tencent.mm.R.drawable.chg : (gt4.q.f275507k.equals(str) || gt4.q.f275508l.equals(str)) ? com.tencent.mm.R.drawable.chk : (gt4.q.f275499c.equals(str) || gt4.q.f275500d.equals(str)) ? com.tencent.mm.R.drawable.chl : (gt4.q.f275501e.equals(str) || gt4.q.f275502f.equals(str)) ? com.tencent.mm.R.drawable.chq : -1;
        com.tencent.mm.plugin.wallet_core.utils.l lVar = this.f180856f;
        if (i17 != -1) {
            view.setBackgroundResource(i17);
            android.content.res.Resources resources = view.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/utils/BankcardLogoHelper$4", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/wallet_core/utils/BankcardLogoHelper$4", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int pixel = decodeResource.getPixel(decodeResource.getWidth() / 2, decodeResource.getHeight() / 2);
            android.widget.TextView textView = (android.widget.TextView) lVar.f180918h.get();
            if (textView != null) {
                textView.setTextColor(pixel);
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f13879b)) {
            int i18 = kVar.f13882e;
            if (i18 > 0) {
                view.setBackgroundResource(i18);
                return;
            }
            return;
        }
        gt4.c1 c1Var = new gt4.c1(kVar.f13879b);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(lVar);
        if (d17 != null) {
            try {
                byte[] ninePatchChunk = d17.getNinePatchChunk();
                if (ninePatchChunk == null || !android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    com.tencent.mm.vfs.w6.h(c1Var.k());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (d17 != null) {
            android.content.Context context = view.getContext();
            try {
                byte[] ninePatchChunk2 = d17.getNinePatchChunk();
                if (android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk2)) {
                    drawable = new android.graphics.drawable.NinePatchDrawable(context.getResources(), d17, ninePatchChunk2, new android.graphics.Rect(), null);
                    drawable.setBounds(0, 0, d17.getWidth(), d17.getHeight());
                } else {
                    drawable = new android.graphics.drawable.BitmapDrawable(d17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.f("MicroMsg.BankcardListAdapter", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankcardListAdapter", e17, "", new java.lang.Object[0]);
                drawable = null;
            }
            view.setBackgroundDrawable(drawable);
            int pixel2 = d17.getPixel(d17.getWidth() / 2, d17.getHeight() / 2);
            android.widget.TextView textView2 = (android.widget.TextView) lVar.f180918h.get();
            if (textView2 != null) {
                textView2.setTextColor(pixel2);
            }
        }
    }
}
