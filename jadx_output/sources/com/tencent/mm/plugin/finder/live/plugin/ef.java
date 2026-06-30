package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ef implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112405d;

    public ef(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112405d = mgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112405d;
        cn2.y0 y0Var = (cn2.y0) ((jz5.n) mgVar.F).getValue();
        r45.ai1 info = (r45.ai1) lVar.f302833d;
        java.lang.String hotWordClientMsgId = (java.lang.String) lVar.f302834e;
        y0Var.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(hotWordClientMsgId, "hotWordClientMsgId");
        if (info.getInteger(3) < info.getInteger(4) || info.getInteger(3) <= 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveHotCommentWidget", "hotCommentWidget Show content:" + info.getString(1) + ", from " + info.getInteger(3) + " to " + info.getInteger(4));
            java.lang.String string = info.getString(1);
            if (string == null) {
                string = "";
            }
            if (string.length() > 10) {
                java.lang.String substring = string.substring(0, 10);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                string = substring.concat("...");
            }
            jz5.g gVar = y0Var.f43643c;
            if (!kotlin.jvm.internal.o.b(string, ((android.widget.TextView) ((jz5.n) gVar).getValue()).getText())) {
                y0Var.d();
            }
            y0Var.f43651k = hotWordClientMsgId;
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(string);
            int integer = info.getInteger(3);
            if (kz5.z.G(cn2.y0.f43640n, java.lang.Integer.valueOf(integer)) && integer - 1 < 1) {
                integer = 1;
            }
            java.util.List list = y0Var.f43649i;
            if (list.isEmpty()) {
                y0Var.c().setText("x" + integer);
                y0Var.b(java.lang.Math.min(info.getInteger(3) + 1, info.getInteger(4)), info.getInteger(4));
                y0Var.c().post(new cn2.x0(y0Var));
            } else {
                java.lang.Integer num = (java.lang.Integer) kz5.n0.i0(list);
                int integer2 = info.getInteger(4);
                kotlin.jvm.internal.o.d(num);
                if (integer2 >= num.intValue()) {
                    int integer3 = info.getInteger(3);
                    int intValue = num.intValue() + 1;
                    if (integer3 < intValue) {
                        integer3 = intValue;
                    }
                    y0Var.b(integer3, info.getInteger(4));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveHotCommentWidget", "[show] return. info = " + pm0.b0.g(info));
        }
        ((cn2.y0) ((jz5.n) mgVar.F).getValue()).f43652l = new com.tencent.mm.plugin.finder.live.plugin.df(mgVar);
    }
}
