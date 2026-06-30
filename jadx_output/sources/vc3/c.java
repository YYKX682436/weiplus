package vc3;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f435258a;

    public c(yz5.q qVar) {
        this.f435258a = qVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.d(str);
        if (str2 == null) {
            str2 = "";
        }
        this.f435258a.invoke(str, str2, "JSEngine");
    }
}
