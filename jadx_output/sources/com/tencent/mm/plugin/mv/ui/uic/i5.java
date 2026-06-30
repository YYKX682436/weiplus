package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f151204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.j5 f151205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var, long j17, com.tencent.mm.plugin.mv.ui.uic.j5 j5Var) {
        super(0);
        this.f151203d = z5Var;
        this.f151204e = j17;
        this.f151205f = j5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm3.q qVar;
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151203d;
        if (z5Var.Q6().getChildCount() > 0) {
            android.view.View childAt = z5Var.Q6().getChildAt(0);
            float f17 = (-childAt.getLeft()) / z5Var.f151583v;
            float width = (z5Var.Q6().getWidth() - childAt.getLeft()) / z5Var.f151583v;
            long j17 = this.f151204e;
            z5Var.S6().setCursorPos(((((float) j17) - f17) * 1.0f) / (width - f17));
            fm3.q qVar2 = z5Var.f151584w;
            if (qVar2 != null) {
                ((android.widget.TextView) ((jz5.n) z5Var.f151578q).getValue()).setText(qVar2.c(((int) j17) + qVar2.f264107e + 33));
            }
            com.tencent.mm.plugin.mv.ui.uic.j5 j5Var = this.f151205f;
            if (j5Var.f151221a > j17 && (qVar = z5Var.f151584w) != null) {
                kl3.t.g().a().c(qVar.f264107e);
            }
            j5Var.f151221a = j17;
        }
        return jz5.f0.f302826a;
    }
}
