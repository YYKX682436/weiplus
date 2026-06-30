package cx5;

/* loaded from: classes8.dex */
public final class a extends com.tencent.wemagic.jsapi.base.MBBaseJsAdaptor {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f224655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.wemagic.jsapi.base.MBBizContext context, java.util.Set jsApiList) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsApiList, "jsApiList");
        int d17 = kz5.b1.d(kz5.d0.q(jsApiList, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        java.util.Iterator it = jsApiList.iterator();
        if (!it.hasNext()) {
            this.f224655c = linkedHashMap;
            return;
        }
        java.lang.Object newInstance = ((java.lang.Class) it.next()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.jsapi.base.MBJsApiAsyncBase<out T of com.tencent.wemagic.jsapi.base.MBJsAdaptor.jsApiNameToClass$lambda$0>");
        android.support.v4.media.f.a(newInstance);
        throw null;
    }

    @Override // com.tencent.wemagic.jsapi.base.MBBaseJsAdaptor
    public java.util.Set b() {
        return ((java.util.LinkedHashMap) this.f224655c).keySet();
    }

    @Override // com.tencent.wemagic.jsapi.base.MBBaseJsAdaptor
    public void c(java.lang.String apiName, java.lang.String apiData, long j17) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(apiData, "apiData");
        try {
            java.lang.Object obj = ((java.util.LinkedHashMap) this.f224655c).get(apiName);
            kotlin.jvm.internal.o.d(obj);
            java.lang.Object newInstance = ((java.lang.Class) obj).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.jsapi.base.MBJsApiAsyncBase<T of com.tencent.wemagic.jsapi.base.MBJsAdaptor>");
            android.support.v4.media.f.a(newInstance);
            throw null;
        } catch (java.lang.Exception e17) {
            java.lang.String otherMsg = apiName + e17;
            kotlin.jvm.internal.o.g(otherMsg, "otherMsg");
            this.f220098a.b(j17, 4, "fail:internal error ".concat(otherMsg), "");
        }
    }
}
