package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f201962a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f201963b;

    public c(yb5.d dVar) {
        this.f201963b = dVar;
    }

    public yn.e a(java.lang.Class cls) {
        if (cls.isInterface()) {
            java.util.HashMap hashMap = this.f201962a;
            if (hashMap.containsKey(cls)) {
                return (yn.e) hashMap.get(cls);
            }
            return null;
        }
        throw new java.lang.RuntimeException("[get] " + cls + " is not a interface!");
    }
}
