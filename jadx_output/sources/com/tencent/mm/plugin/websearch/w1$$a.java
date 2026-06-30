package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final /* synthetic */ class w1$$a implements uv4.a0 {
    public final void a(android.content.Context context, java.lang.String str) {
        su4.a1 a1Var = (su4.a1) i95.n0.c(su4.a1.class);
        if (a1Var == null) {
            throw new java.lang.IllegalStateException("搜一搜服务不可用");
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context;
        j2Var.f412939b = 3;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        j2Var.f412942e = su4.r2.f(3);
        if (!android.text.TextUtils.isEmpty(str)) {
            j2Var.f412941d = str;
            j2Var.f412945h = true;
        }
        j2Var.f412943f = true;
        ((com.tencent.mm.plugin.websearch.h2) a1Var).Vi(j2Var);
    }
}
