package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f209317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.g f209318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.mvvm.uic.conversation.recent.g gVar) {
        super(0);
        this.f209317d = appCompatActivity;
        this.f209318e = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        qi5.q qVar = new qi5.q(this.f209317d);
        j75.f Q6 = this.f209318e.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            java.util.HashSet hashSet = n0Var.f446320p;
            kotlin.jvm.internal.o.g(hashSet, "<set-?>");
            qVar.f363839g = hashSet;
        }
        return qVar;
    }
}
