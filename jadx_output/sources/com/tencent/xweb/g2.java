package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f220285a;

    public static synchronized boolean a() {
        boolean z17;
        synchronized (com.tencent.xweb.g2.class) {
            if (f220285a) {
                z17 = true;
            } else {
                zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
                z17 = false;
            }
        }
        return z17;
    }
}
