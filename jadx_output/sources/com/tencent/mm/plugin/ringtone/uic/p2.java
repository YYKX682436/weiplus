package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class p2 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158457a;

    public p2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var) {
        this.f158457a = b3Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f158457a.O6(z17, false);
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158457a;
        b3Var.f158362r = true;
        androidx.appcompat.app.AppCompatActivity activity = b3Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.ringtone.uic.g2) a17).P6(false, null, false);
        return true;
    }
}
