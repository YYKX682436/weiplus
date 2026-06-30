package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class a0 extends com.tencent.mm.ui.chatting.component.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c0 f198582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.component.c0 c0Var, int i17, java.lang.String str) {
        super(i17, str);
        this.f198581e = f9Var;
        this.f198582f = c0Var;
    }

    @Override // com.tencent.mm.ui.chatting.component.u
    public ot0.q a() {
        return this.f198582f.r0(this.f198581e);
    }

    @Override // com.tencent.mm.ui.chatting.component.u
    public com.tencent.mm.storage.f9 c() {
        return this.f198581e;
    }
}
