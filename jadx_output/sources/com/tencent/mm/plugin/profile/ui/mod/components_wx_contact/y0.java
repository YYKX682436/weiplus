package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f154156d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f154157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154158f;

    /* renamed from: g, reason: collision with root package name */
    public int f154159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f154158f = j1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f154157e = obj;
        this.f154159g |= Integer.MIN_VALUE;
        return this.f154158f.R6(this);
    }
}
