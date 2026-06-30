package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.u.class)
/* loaded from: classes9.dex */
public final class v3 extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.u {

    /* renamed from: e, reason: collision with root package name */
    public hc5.b f200112e;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        hc5.b bVar = this.f200112e;
        if (bVar != null) {
            java.util.Iterator it = bVar.f280370a.iterator();
            while (it.hasNext()) {
                ((hc5.a) it.next()).f();
            }
        }
        this.f200112e = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        yb5.d mChattingContext = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
        this.f200112e = new hc5.b(mChattingContext);
    }
}
