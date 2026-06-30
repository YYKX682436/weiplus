package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class e1 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f160972a;

    public e1(kotlin.jvm.internal.h0 h0Var) {
        this.f160972a = h0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream os6) {
        kotlin.jvm.internal.o.g(os6, "os");
        try {
            os6.write((byte[]) this.f160972a.f310123d);
            vz5.b.a(os6, null);
        } finally {
        }
    }
}
