package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class w1 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f200146a;

    public w1(com.tencent.mm.ui.chatting.component.q2 q2Var) {
        this.f200146a = q2Var;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f200146a;
        if (com.tencent.mm.sdk.platformtools.t8.U0(q2Var.f198580d.g()) && !q2Var.v0(q2Var.f198580d.g(), i17, i18, str)) {
            db5.e1.s(q2Var.f198580d.g(), q2Var.f198580d.s().getString(com.tencent.mm.R.string.f492327g24), q2Var.f198580d.s().getString(com.tencent.mm.R.string.f490573yv));
        }
    }
}
