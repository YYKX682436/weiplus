package ye;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.main.LuggageInitTask f461154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.luggage.sdk.processes.main.LuggageInitTask luggageInitTask) {
        super(1);
        this.f461154d = luggageInitTask;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.luggage.sdk.processes.h it = (com.tencent.luggage.sdk.processes.h) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String i17 = it.i();
        str = this.f461154d.f47650f;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(i17, str));
    }
}
