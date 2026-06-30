package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final /* synthetic */ class z4$$d implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        ot0.q v17;
        oi3.g gVar = (oi3.g) obj;
        if (g45.c.a(gVar)) {
            return "image";
        }
        int i17 = gVar.f345617d;
        if (gVar.getInteger(i17 + 4) == 43) {
            return "video";
        }
        int i18 = i17 + 4;
        if (gVar.getInteger(i18) == 62) {
            return "shortVideo";
        }
        return ((gVar.getInteger(i18) & 65535) == 49 && gVar.getInteger(i18) != 1107296305) && (v17 = ot0.q.v(gVar.getString(i17 + 13))) != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) ? "file" : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }
}
