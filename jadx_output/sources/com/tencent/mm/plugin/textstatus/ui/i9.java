package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        super(0);
        this.f173981d = textStatusEditActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.ProgressDialog progressDialog = this.f173981d.W1;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
