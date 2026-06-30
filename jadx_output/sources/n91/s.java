package n91;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f335896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i17, java.lang.String str) {
        super(1);
        this.f335896d = i17;
        this.f335897e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s record = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(record, "record");
        if (record.f47685b != this.f335896d) {
            return null;
        }
        return new com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUtil$NeedHistoryListMessage(this.f335897e);
    }
}
