package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.s1 f132991a = new com.tencent.mm.plugin.finder.view.s1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f132992b = jz5.h.b(com.tencent.mm.plugin.finder.view.o1.f132758d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f132993c = jz5.h.b(com.tencent.mm.plugin.finder.view.p1.f132807d);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r18, android.widget.TextView r19, android.view.ViewGroup r20, r45.qg0 r21, int r22, os5.u r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.s1.a(android.content.Context, android.widget.TextView, android.view.ViewGroup, r45.qg0, int, os5.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Integer b(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(d(str)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcShowBoxUtil", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final int c() {
        return ((java.lang.Number) ((jz5.n) f132992b).getValue()).intValue();
    }

    public final java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 9) {
            return str;
        }
        char charAt = str.charAt(0);
        java.lang.String substring = str.substring(1, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = str.substring(3, 5);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        java.lang.String substring3 = str.substring(5, 7);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = str.substring(7, 9);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0521 -> B:14:0x052a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x026c -> B:10:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02a4 -> B:11:0x02b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r26, java.util.List r27, android.view.ViewGroup r28, int r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.s1.e(android.content.Context, java.util.List, android.view.ViewGroup, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
