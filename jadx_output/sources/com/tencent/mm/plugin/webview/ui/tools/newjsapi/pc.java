package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class pc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc f186438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(com.tencent.mm.plugin.webview.ui.tools.newjsapi.rc rcVar) {
        super(1);
        this.f186438d = rcVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String optString = it.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        int optInt = it.optInt(dm.i4.COL_ID);
        java.lang.String optString2 = it.optString("iconData");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc qcVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc(optString, optInt, optString2, null, 8, null);
        byte[] decode = android.util.Base64.decode(it.optString("iconData"), 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShareCustomContent$CustomData$1", "invoke", "(Lorg/json/JSONObject;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShareCustomContent$CustomData$1", "invoke", "(Lorg/json/JSONObject;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        qcVar.f186464d = decodeByteArray;
        this.f186438d.f186500c.add(qcVar);
        return jz5.f0.f302826a;
    }
}
