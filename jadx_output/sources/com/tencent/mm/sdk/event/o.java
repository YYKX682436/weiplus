package com.tencent.mm.sdk.event;

/* loaded from: classes4.dex */
public final class o implements androidx.lifecycle.f1 {
    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class eventClass) {
        kotlin.jvm.internal.o.g(eventClass, "eventClass");
        java.lang.Object newInstance = eventClass.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return (androidx.lifecycle.c1) newInstance;
    }
}
