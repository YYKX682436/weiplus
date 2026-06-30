package df2;

/* loaded from: classes3.dex */
public final class og implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230966d;

    public og(df2.ug ugVar) {
        this.f230966d = ugVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.ug ugVar = this.f230966d;
        com.tencent.mars.xlog.Log.i(ugVar.f231522m, "updateMsgDisplayInfo: floatMsgRowConfigChanged collect value=" + obj);
        ugVar.e7("floatMsgRowConfigChanged", false);
        return jz5.f0.f302826a;
    }
}
