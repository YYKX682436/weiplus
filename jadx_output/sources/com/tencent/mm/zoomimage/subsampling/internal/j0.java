package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f214970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, androidx.lifecycle.y yVar, boolean z17) {
        super(0);
        this.f214969d = m0Var;
        this.f214970e = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214969d;
        sb6.append(m0Var.f214992a);
        sb6.append(". lifecycle. ");
        sb6.append(this.f214970e.mo133getLifecycle().b());
        sb6.append(". disabledAutoStopWithLifecycle=false. '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
