package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f160968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f160970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f160971d;

    public e0(kotlin.jvm.internal.h0 h0Var, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, yz5.a aVar) {
        this.f160968a = h0Var;
        this.f160969b = str;
        this.f160970c = i0Var;
        this.f160971d = aVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        if (outputStream != null) {
            kotlin.jvm.internal.h0 h0Var = this.f160968a;
            java.lang.String str = this.f160969b;
            com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f160970c;
            yz5.a aVar = this.f160971d;
            try {
                outputStream.write((byte[]) h0Var.f310123d);
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.d0(aVar));
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.app.Activity context = i0Var.getContext();
                ((ub0.r) oVar).getClass();
                q75.c.f(str, context);
                vz5.b.a(outputStream, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(outputStream, th6);
                    throw th7;
                }
            }
        }
    }
}
