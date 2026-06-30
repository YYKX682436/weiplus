package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r3 f145562d;

    public q3(com.tencent.mm.plugin.luckymoney.model.r3 r3Var) {
        this.f145562d = r3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f145562d.f145574b;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
