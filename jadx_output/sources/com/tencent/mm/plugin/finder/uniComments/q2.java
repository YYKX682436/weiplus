package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, android.content.Context context) {
        super(0);
        this.f130365d = q3Var;
        this.f130366e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Dialog dialog = this.f130365d.D;
        if (dialog != null) {
            dialog.dismiss();
        }
        db5.t7.makeText(this.f130366e, com.tencent.mm.R.string.eyf, 0).show();
        return jz5.f0.f302826a;
    }
}
