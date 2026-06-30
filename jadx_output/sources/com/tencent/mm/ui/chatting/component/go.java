package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199118d;

    public go(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f199118d = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f199118d;
        java.lang.String str = hoVar.f199191u;
        hoVar.getClass();
        if (str.length() == 0) {
            return;
        }
        if (hoVar.m0().length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("TAG", "updateOriginTextInternal() called with: text = " + str + " lastTransResult = " + hoVar.f199190t + " lastOriginText = " + hoVar.f199191u);
        hoVar.t0(str);
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
        if (loadableTextView != null) {
            loadableTextView.setLoading(true);
        } else {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
    }
}
