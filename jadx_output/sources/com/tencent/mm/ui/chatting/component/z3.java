package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class z3 implements com.tencent.mm.ui.chatting.component.c4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.x3 f200355b;

    public z3(com.tencent.mm.ui.chatting.component.x3 x3Var, java.lang.String str) {
        this.f200355b = x3Var;
        this.f200354a = str;
    }

    public void a(final com.tencent.mm.ui.chatting.component.b4 b4Var) {
        com.tencent.mm.sdk.platformtools.n3 q17 = this.f200355b.f198580d.q();
        final java.lang.String str = this.f200354a;
        q17.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.z3$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.tencent.mm.ui.chatting.component.z3 z3Var = com.tencent.mm.ui.chatting.component.z3.this;
                com.tencent.mm.ui.chatting.component.x3 x3Var = z3Var.f200355b;
                x3Var.q0(str, b4Var);
                x3Var.f198580d.q().post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.z3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.chatting.component.z3.this.f200355b.f198580d.K();
                    }
                });
            }
        });
    }
}
