package vd0;

/* loaded from: classes4.dex */
public final class r2 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435498a;

    public r2(kotlin.jvm.internal.h0 h0Var) {
        this.f435498a = h0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream os6) {
        kotlin.jvm.internal.o.g(os6, "os");
        try {
            os6.write((byte[]) this.f435498a.f310123d);
            vz5.b.a(os6, null);
        } finally {
        }
    }
}
