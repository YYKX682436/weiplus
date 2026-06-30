package xc1;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f453051d = str;
        this.f453052e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$NativeToWxa$OnNativePostDataMessage(this.f453051d, this.f453052e);
    }
}
