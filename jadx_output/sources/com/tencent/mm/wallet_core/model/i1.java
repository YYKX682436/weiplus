package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f213914a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f213915b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f213916c = "";

    public static void a() {
        f213914a = false;
        f213915b = -1;
        f213916c = "";
    }

    public static void b(int i17) {
        if (f213914a) {
            return;
        }
        f213914a = true;
        f213915b = i17;
        f213916c = java.util.UUID.randomUUID().toString();
    }
}
