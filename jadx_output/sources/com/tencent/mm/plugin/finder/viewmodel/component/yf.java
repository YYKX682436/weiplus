package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class yf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gg f136576d;

    public yf(com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar) {
        this.f136576d = ggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f136576d;
        ep1.m.e(ggVar.getActivity());
        ggVar.getActivity().finish();
    }
}
