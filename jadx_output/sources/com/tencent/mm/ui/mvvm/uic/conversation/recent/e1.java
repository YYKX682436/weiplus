package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class e1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.z f209315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209316f;

    public e1(com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, wi5.z zVar, java.util.HashMap hashMap) {
        this.f209314d = h1Var;
        this.f209315e = zVar;
        this.f209316f = hashMap;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list = (java.util.List) obj;
        j75.f Q6 = this.f209314d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f209315e, this.f209316f, list));
        }
        return jz5.f0.f302826a;
    }
}
