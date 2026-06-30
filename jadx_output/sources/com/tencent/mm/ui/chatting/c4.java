package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class c4 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198514a;

    public c4(yb5.d dVar) {
        this.f198514a = dVar;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        sb5.d0 d0Var = (sb5.d0) this.f198514a.f460708c.a(sb5.d0.class);
        if (-1 == i18 && d0Var != null && ((com.tencent.mm.ui.chatting.component.b5) d0Var).f198696g) {
            ((com.tencent.mm.ui.chatting.component.b5) d0Var).o0();
        }
    }
}
