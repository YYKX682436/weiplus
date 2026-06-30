package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class eo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f198992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn4.b f198993e;

    public eo(com.tencent.mm.ui.chatting.component.ho hoVar, nn4.b bVar) {
        this.f198992d = hoVar;
        this.f198993e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f198993e.f338697b;
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f198992d;
        com.tencent.mm.ui.chatting.component.kn knVar = hoVar.f199188r;
        com.tencent.mm.ui.chatting.component.kn knVar2 = com.tencent.mm.ui.chatting.component.kn.f199376d;
        if (knVar == knVar2) {
            return;
        }
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
        if (loadableTextView == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView.setLoading(false);
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView2 = hoVar.f199183m;
        if (loadableTextView2 == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView2.expectWidth = ((android.view.View) ((jz5.n) hoVar.C).getValue()).getWidth();
        loadableTextView2.requestLayout();
        if (!kotlin.jvm.internal.o.b(str, hoVar.f199191u)) {
            if (!(str.length() == 0)) {
                com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView3 = hoVar.f199183m;
                if (loadableTextView3 == null) {
                    kotlin.jvm.internal.o.o("resultTv");
                    throw null;
                }
                loadableTextView3.setOriginText(str);
                hoVar.u0(com.tencent.mm.ui.chatting.component.kn.f199378f);
                return;
            }
        }
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView4 = hoVar.f199183m;
        if (loadableTextView4 == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView4.setText("");
        hoVar.u0(knVar2);
    }
}
