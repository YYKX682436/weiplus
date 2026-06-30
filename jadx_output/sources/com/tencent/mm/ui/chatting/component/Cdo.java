package com.tencent.mm.ui.chatting.component;

/* renamed from: com.tencent.mm.ui.chatting.component.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f198950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(0);
        this.f198950d = hoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View rootView = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198950d.f198580d.f460708c.a(sb5.s0.class))).f199263e.getRootView();
        kotlin.jvm.internal.o.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        return ((android.view.ViewGroup) rootView).findViewById(com.tencent.mm.R.id.bkk);
    }
}
