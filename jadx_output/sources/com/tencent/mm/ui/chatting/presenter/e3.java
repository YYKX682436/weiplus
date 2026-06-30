package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class e3 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202200c;

    public e3(com.tencent.mm.ui.chatting.presenter.n3 n3Var) {
        this.f202200c = n3Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        return ((com.tencent.mm.ui.chatting.adapter.w) this.f202200c.f202357e.get(i17)).f198448c == Integer.MAX_VALUE ? 4 : 1;
    }
}
