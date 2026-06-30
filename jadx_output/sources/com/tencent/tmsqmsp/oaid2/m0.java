package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public class m0 {
    public static boolean a() {
        if (com.tencent.tmsqmsp.oaid2.l0.f215608a) {
            return com.tencent.tmsqmsp.oaid2.l0.f215609b;
        }
        throw new java.lang.RuntimeException("SDK Need Init First!");
    }

    public static void b(android.content.Context context) {
        com.tencent.tmsqmsp.oaid2.l0.f215609b = com.tencent.tmsqmsp.oaid2.p0.f215635f.a(com.tencent.tmsqmsp.oaid2.l0.a(context));
        com.tencent.tmsqmsp.oaid2.l0.f215608a = true;
    }

    public static java.lang.String a(android.content.Context context) {
        if (com.tencent.tmsqmsp.oaid2.l0.f215608a) {
            return com.tencent.tmsqmsp.oaid2.p0.f215635f.a(com.tencent.tmsqmsp.oaid2.l0.a(context), "OUID");
        }
        throw new java.lang.RuntimeException("SDK Need Init First!");
    }
}
