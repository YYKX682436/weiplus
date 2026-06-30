package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134810d;

    public j40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134810d = f50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f134810d.f134341g;
        if (view != null) {
            view.performClick();
        } else {
            kotlin.jvm.internal.o.o("finderPosBtn");
            throw null;
        }
    }
}
