package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f154365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154366e;

    public j(yz5.l lVar, java.util.ArrayList arrayList) {
        this.f154365d = lVar;
        this.f154366e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList it = this.f154366e;
        kotlin.jvm.internal.o.f(it, "$it");
        this.f154365d.invoke(it);
    }
}
