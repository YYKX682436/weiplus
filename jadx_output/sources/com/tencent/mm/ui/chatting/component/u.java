package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f200030a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f200031b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.q f200032c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.p f200033d;

    public u(int i17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f200030a = i17;
        this.f200031b = talker;
    }

    public abstract ot0.q a();

    public final com.tencent.mm.storage.f9 b() {
        com.tencent.mm.ui.chatting.component.q qVar = this.f200032c;
        if (qVar != null) {
            return qVar.f199731a;
        }
        com.tencent.mm.storage.f9 c17 = c();
        this.f200032c = new com.tencent.mm.ui.chatting.component.q(c17);
        return c17;
    }

    public abstract com.tencent.mm.storage.f9 c();
}
