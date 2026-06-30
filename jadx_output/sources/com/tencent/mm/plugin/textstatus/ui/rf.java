package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class rf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f174252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.tencent.mm.plugin.textstatus.ui.tf tfVar) {
        super(0);
        this.f174252d = tfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f174252d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.j.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) ((hi4.j) a17).f281552e).getValue()).intValue());
    }
}
