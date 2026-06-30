package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class l7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.l1 f209069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.m7 f209070e;

    public l7(com.tencent.mm.ui.m7 m7Var, com.tencent.mm.modelsimple.l1 l1Var) {
        this.f209070e = m7Var;
        this.f209069d = l1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.ui.m7 m7Var = this.f209070e;
        e17.q(384, m7Var.f209099d.f209458i);
        m7Var.f209099d.f209458i = null;
        c01.d9.e().d(this.f209069d);
    }
}
