package ou4;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou4.n f348987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ou4.n nVar, java.lang.String str) {
        super(1);
        this.f348987d = nVar;
        this.f348988e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        ou4.n nVar = this.f348987d;
        if (m528isSuccessimpl) {
            java.lang.String str = ((com.tencent.mm.plugin.websearch.m2) nVar).f181569g;
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.w(((com.tencent.mm.plugin.websearch.m2) nVar).f181569g, "callFlutter: " + this.f348988e + " failed: " + m524exceptionOrNullimpl.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
