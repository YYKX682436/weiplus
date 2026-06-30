package com.tencent.mm.plugin.voip.model;

/* loaded from: classes12.dex */
public class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.model.h1 f176555c = new com.tencent.mm.plugin.voip.model.h1();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.g1 f176556a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f176557b = new java.util.concurrent.locks.ReentrantLock();

    public static com.tencent.mm.plugin.voip.model.g1 a() {
        com.tencent.mm.plugin.voip.model.h1 h1Var = f176555c;
        if (h1Var.f176556a == null) {
            h1Var.f176557b.lock();
            try {
                if (h1Var.f176556a == null) {
                    h1Var.f176556a = new com.tencent.mm.plugin.voip.model.g1();
                }
            } finally {
                h1Var.f176557b.unlock();
            }
        }
        return h1Var.f176556a;
    }
}
