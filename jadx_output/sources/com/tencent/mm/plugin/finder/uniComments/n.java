package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, android.content.Context context) {
        super(0);
        this.f130311d = o0Var;
        this.f130312e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Dialog dialog = this.f130311d.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        db5.t7.makeText(this.f130312e, com.tencent.mm.R.string.eyf, 0).show();
        return jz5.f0.f302826a;
    }
}
