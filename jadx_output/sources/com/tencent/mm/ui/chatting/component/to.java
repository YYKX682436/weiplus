package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class to implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ro f200024d;

    public to(com.tencent.mm.ui.chatting.component.ro roVar) {
        this.f200024d = roVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (this.f200024d.f199872o) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.so(this));
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
