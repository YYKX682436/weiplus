package df2;

/* loaded from: classes3.dex */
public final class jv implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lv f230501d;

    public jv(df2.lv lvVar) {
        this.f230501d = lvVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object Z6 = df2.lv.Z6(this.f230501d, "liveGameDataBannerNotify", ((java.lang.Boolean) obj).booleanValue(), continuation);
        return Z6 == pz5.a.f359186d ? Z6 : jz5.f0.f302826a;
    }
}
