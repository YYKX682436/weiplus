package com.tencent.wemagic.jsapi.base;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0004J \u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H$J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H$R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tencent/wemagic/jsapi/base/MBBaseJsAdaptor;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/wemagic/jsapi/base/MBBizContext;", "Lcom/tencent/wemagic/common/api/IMBJsAdaptor;", "context", "<init>", "(Lcom/tencent/wemagic/jsapi/base/MBBizContext;)V", "getContext", "()Lcom/tencent/wemagic/jsapi/base/MBBizContext;", "Lcom/tencent/wemagic/jsapi/base/MBBizContext;", "nextJsAdaptor", "setNextJsAdaptor", "", "invoke", "", "apiName", "", "apiData", "callbackId", "", "getJsApiNameSet", "", "makeCallBackFromMBJsObject", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/wemagic/jsapi/base/bean/MBJSObject;", "makeCallbackFromMBErrorInfo", "errorInfo", "Lcom/tencent/wemagic/jsapi/base/bean/MBErrorInfo;", "otherMsg", "doInvoke", "doGetJsApiNameSet", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class MBBaseJsAdaptor<T extends com.tencent.wemagic.jsapi.base.MBBizContext> implements com.tencent.wemagic.common.api.IMBJsAdaptor {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wemagic.jsapi.base.MBBizContext f220098a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wemagic.common.api.IMBJsAdaptor f220099b;

    public MBBaseJsAdaptor(com.tencent.wemagic.jsapi.base.MBBizContext context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f220098a = context;
    }

    @Override // com.tencent.wemagic.common.api.IMBJsAdaptor
    public java.util.Set a() {
        com.tencent.wemagic.common.api.IMBJsAdaptor iMBJsAdaptor = this.f220099b;
        return iMBJsAdaptor != null ? kz5.n0.Y0(b(), iMBJsAdaptor.a()) : b();
    }

    public abstract java.util.Set b();

    public abstract void c(java.lang.String str, java.lang.String str2, long j17);

    @Override // com.tencent.wemagic.common.api.IMBJsAdaptor
    public boolean invoke(java.lang.String apiName, java.lang.String apiData, long callbackId) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(apiData, "apiData");
        if (b().contains(apiName)) {
            java.lang.String format = "invoke jsApi, name: " + apiName + ", callbackId: " + callbackId;
            kotlin.jvm.internal.o.g(format, "format");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf.length == 0)) {
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            }
            kotlin.jvm.internal.o.d(format);
            c(apiName, apiData, callbackId);
            return true;
        }
        com.tencent.wemagic.common.api.IMBJsAdaptor iMBJsAdaptor = this.f220099b;
        if (iMBJsAdaptor != null) {
            java.lang.String format2 = "invoke jsApi but not found，use next jsAdaptor, name: ".concat(apiName);
            kotlin.jvm.internal.o.g(format2, "format");
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf2.length == 0)) {
                format2 = java.lang.String.format(format2, java.util.Arrays.copyOf(copyOf2, copyOf2.length));
            }
            kotlin.jvm.internal.o.d(format2);
            return iMBJsAdaptor.invoke(apiName, apiData, callbackId);
        }
        java.lang.String otherMsg = apiName.concat("jsapi not contain in Android Async List");
        kotlin.jvm.internal.o.g(otherMsg, "otherMsg");
        this.f220098a.b(callbackId, 4, "fail:internal error ".concat(otherMsg), "");
        java.lang.String format3 = "invoke jsApi but not found, name: ".concat(apiName);
        kotlin.jvm.internal.o.g(format3, "format");
        java.lang.Object[] copyOf3 = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf3.length == 0)) {
            format3 = java.lang.String.format(format3, java.util.Arrays.copyOf(copyOf3, copyOf3.length));
        }
        kotlin.jvm.internal.o.d(format3);
        return false;
    }
}
