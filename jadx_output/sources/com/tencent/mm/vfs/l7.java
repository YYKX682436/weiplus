package com.tencent.mm.vfs;

/* loaded from: classes8.dex */
public class l7 implements mm.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f213069a;

    public l7(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f213069a = atomicBoolean;
    }

    @Override // mm.b0
    public java.lang.String a() {
        return "VFS";
    }

    @Override // mm.b0
    public boolean b() {
        return this.f213069a.get();
    }
}
