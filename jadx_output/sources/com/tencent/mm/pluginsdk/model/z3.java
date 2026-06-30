package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.pluginsdk.model.z3 f189510a;

    public static com.tencent.mm.pluginsdk.model.z3 a() {
        if (f189510a == null) {
            synchronized (com.tencent.mm.pluginsdk.model.z3.class) {
                if (f189510a == null) {
                    f189510a = new com.tencent.mm.pluginsdk.model.z3();
                }
            }
        }
        return f189510a;
    }

    public com.tencent.mm.pluginsdk.model.y3 b(int i17, android.os.Bundle bundle) {
        return i17 != 1 ? i17 != 2 ? new com.tencent.mm.pluginsdk.model.t3() : new com.tencent.mm.pluginsdk.model.p0(bundle) : new com.tencent.mm.pluginsdk.model.d4();
    }
}
