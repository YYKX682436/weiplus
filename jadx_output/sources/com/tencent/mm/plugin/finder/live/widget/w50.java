package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w50 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f120146a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f120147b;

    public w50(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f120146a = context;
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 1);
        q12Var.set(1, 1);
        jz5.l lVar = new jz5.l("portrait", q12Var);
        r45.q12 q12Var2 = new r45.q12();
        q12Var2.set(0, 1);
        q12Var2.set(1, 2);
        jz5.l lVar2 = new jz5.l("landscape", q12Var2);
        r45.q12 q12Var3 = new r45.q12();
        q12Var3.set(0, 2);
        q12Var3.set(1, 1);
        jz5.l lVar3 = new jz5.l("single_room", q12Var3);
        r45.q12 q12Var4 = new r45.q12();
        q12Var4.set(0, 2);
        q12Var4.set(1, 2);
        jz5.l lVar4 = new jz5.l("multi_room", q12Var4);
        r45.q12 q12Var5 = new r45.q12();
        q12Var5.set(0, 2);
        q12Var5.set(1, 16);
        jz5.l lVar5 = new jz5.l("chat_room", q12Var5);
        r45.q12 q12Var6 = new r45.q12();
        q12Var6.set(0, 2);
        q12Var6.set(1, 8);
        jz5.l lVar6 = new jz5.l("ktv_option", q12Var6);
        r45.q12 q12Var7 = new r45.q12();
        q12Var7.set(0, 5);
        q12Var7.set(1, 1);
        this.f120147b = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, new jz5.l("co_live_normal", q12Var7));
    }

    public final java.util.List a() {
        android.content.Context context = this.f120146a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491680m05);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var = new com.tencent.mm.plugin.finder.live.widget.x50("single_room", string, null, null, null, 28, null);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491679m03);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var2 = new com.tencent.mm.plugin.finder.live.widget.x50("multi_room", string2, null, null, null, 28, null);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.olu);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return kz5.c0.i(x50Var, x50Var2, new com.tencent.mm.plugin.finder.live.widget.x50("chat_room", string3, null, null, null, 28, null));
    }

    public final java.util.List b() {
        java.lang.String string = this.f120146a.getString(com.tencent.mm.R.string.epw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return kz5.b0.c(new com.tencent.mm.plugin.finder.live.widget.x50("ktv_option", string, null, null, null, 28, null));
    }

    public final java.util.List c(yf2.m1 m1Var) {
        android.content.Context context = this.f120146a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.oze);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.raw.mobile_regular);
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var = new com.tencent.mm.plugin.finder.live.widget.x50("portrait", string, valueOf, null, null, 24, null);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.ozd);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return kz5.c0.i(x50Var, new com.tencent.mm.plugin.finder.live.widget.x50("landscape", string2, valueOf, com.tencent.mm.plugin.finder.live.widget.u50.f119948d, new com.tencent.mm.plugin.finder.live.widget.v50(m1Var)));
    }

    public final r45.q12 d(java.lang.String targetOptionId) {
        kotlin.jvm.internal.o.g(targetOptionId, "targetOptionId");
        return (r45.q12) this.f120147b.get(targetOptionId);
    }

    public final jz5.l e(r45.q12 q12Var) {
        if (q12Var == null) {
            return new jz5.l("", "");
        }
        int integer = q12Var.getInteger(0);
        java.lang.String str = null;
        if (integer == 1) {
            int integer2 = q12Var.getInteger(1);
            if (integer2 == 1) {
                str = "portrait";
            } else if (integer2 == 2) {
                str = "landscape";
            }
            return new jz5.l("video", str);
        }
        if (integer != 2) {
            if (integer != 3 && integer == 5) {
                return new jz5.l("co_live", "co_live_normal");
            }
            return new jz5.l("game", null);
        }
        if (q12Var.getInteger(1) == 8) {
            return new jz5.l("karaoke", "ktv_option");
        }
        int integer3 = q12Var.getInteger(1);
        if (integer3 == 1) {
            str = "single_room";
        } else if (integer3 == 2) {
            str = "multi_room";
        } else if (integer3 == 16) {
            str = "chat_room";
        }
        return new jz5.l("chat_room", str);
    }
}
