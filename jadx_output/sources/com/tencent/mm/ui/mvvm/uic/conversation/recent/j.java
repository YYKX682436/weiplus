package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f209337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.k f209338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.mvvm.uic.conversation.recent.k kVar) {
        super(0);
        this.f209337d = appCompatActivity;
        this.f209338e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        qi5.w wVar = new qi5.w(this.f209337d);
        j75.f Q6 = this.f209338e.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            java.util.HashSet hashSet = n0Var.f446320p;
            kotlin.jvm.internal.o.g(hashSet, "<set-?>");
            wVar.f363850g = hashSet;
        }
        return wVar;
    }
}
