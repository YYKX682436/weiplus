package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118036d;

    /* renamed from: e, reason: collision with root package name */
    public int f118037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h1 f118038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.finder.live.widget.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118038f = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.d1(this.f118038f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118037e;
        com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f118038f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = h1Var.getContext();
            android.content.Context context2 = h1Var.getContext();
            com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(context, context2 != null ? context2.getString(com.tencent.mm.R.string.f9y) : null, false, 0, null);
            c17.show();
            gk2.e buContext = h1Var.getBuContext();
            byte[] bArr = buContext != null ? ((mm2.e1) buContext.a(mm2.e1.class)).f328985o : null;
            gk2.e buContext2 = h1Var.getBuContext();
            long j17 = (buContext2 == null || (nw1Var = ((mm2.e1) buContext2.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
            gk2.e buContext3 = h1Var.getBuContext();
            long j18 = buContext3 != null ? ((mm2.e1) buContext3.a(mm2.e1.class)).f328983m : 0L;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.widget.c1 c1Var = new com.tencent.mm.plugin.finder.live.widget.c1(this.f118038f, bArr, j17, j18, null);
            this.f118036d = c17;
            this.f118037e = 1;
            g17 = kotlinx.coroutines.l.g(p0Var, c1Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            u3Var = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f118036d;
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) g17).booleanValue();
        u3Var.hide();
        u3Var.dismiss();
        if (booleanValue) {
            h1Var.d();
            db5.t7.i(h1Var.getContext(), h1Var.getContext().getString(com.tencent.mm.R.string.ddx), com.tencent.mm.R.raw.icons_outlined_done);
            yz5.l directJoinListener = h1Var.getDirectJoinListener();
            if (directJoinListener != null) {
                directJoinListener.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            db5.t7.g(h1Var.getContext(), h1Var.getContext().getString(com.tencent.mm.R.string.ddu));
            yz5.l directJoinListener2 = h1Var.getDirectJoinListener();
            if (directJoinListener2 != null) {
                directJoinListener2.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
