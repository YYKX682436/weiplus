package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.sg f205523a = new com.tencent.mm.ui.chatting.viewitems.sg();

    public static final boolean b(v05.b bVar) {
        if (bVar == null) {
            return false;
        }
        int i17 = bVar.f432315e;
        java.lang.String string = bVar.getString(i17 + 11);
        java.util.List list = com.tencent.mm.ui.chatting.viewitems.qg.f205362a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(bVar.getString(bVar.f368365d + 9))) {
            return false;
        }
        r05.g gVar = (r05.g) bVar.getCustom(i17 + 25);
        return (gVar != null ? gVar.o() : -1) >= 0;
    }

    public final void a(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || imageView == null || textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        if (c01.e2.G(str)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, " ");
            imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "", textSize));
        boolean z17 = false;
        imageView.setVisibility(0);
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            e17 = str;
        }
        imageView.setTag(str);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            imageView.setTag(str);
            ((c01.k7) c01.n8.a()).b(str, 5, new com.tencent.mm.ui.chatting.viewitems.rg(new java.lang.ref.WeakReference(imageView), textView, context));
            return;
        }
        if (!c01.e2.G(str)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.aj6);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize2));
            return;
        }
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        if (!z17) {
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            if (com.tencent.mm.modelavatar.g.a(str) == null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
                if (n07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
                    lr1.m.a(imageView, n17, n07.d(), true);
                }
            }
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize3));
    }
}
