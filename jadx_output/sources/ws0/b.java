package ws0;

/* loaded from: classes10.dex */
public final class b {
    public static final void a(android.hardware.camera2.CaptureRequest.Builder builder, xs0.a aVar, boolean z17, java.lang.Object value) {
        android.hardware.camera2.CaptureRequest.Key key;
        kotlin.jvm.internal.o.g(builder, "builder");
        kotlin.jvm.internal.o.g(value, "value");
        if (aVar == null) {
            return;
        }
        java.lang.Object obj = aVar.f456287c;
        java.lang.Object obj2 = null;
        if (obj instanceof java.lang.Integer) {
            java.lang.String str = aVar.f456290f;
            kotlin.jvm.internal.o.d(str);
            key = xs0.c.a(str, java.lang.Integer.TYPE);
        } else if (obj instanceof java.lang.Boolean) {
            java.lang.String str2 = aVar.f456290f;
            kotlin.jvm.internal.o.d(str2);
            key = xs0.c.a(str2, java.lang.Boolean.TYPE);
        } else if (obj instanceof java.lang.String) {
            java.lang.String str3 = aVar.f456290f;
            kotlin.jvm.internal.o.d(str3);
            key = xs0.c.a(str3, java.lang.String.class);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WCCameraEffectHelper", "getVendorTagCaptureKeyByCreator: with unknow type value = " + aVar.f456287c + " key = " + aVar.f456290f);
            key = null;
        }
        java.lang.Object obj3 = aVar.f456289e;
        if (obj3 instanceof android.util.Range) {
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
            obj2 = ((android.util.Range) obj3).getLower();
        } else if (obj3 instanceof java.util.ArrayList) {
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
            java.lang.Object obj4 = arrayList.get(0);
            if (obj4 instanceof java.lang.Integer) {
                java.lang.Object obj5 = arrayList.get(0);
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                obj2 = (java.lang.Integer) obj5;
            } else if (obj4 instanceof java.lang.Boolean) {
                java.lang.Object obj6 = arrayList.get(0);
                kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                obj2 = (java.lang.Boolean) obj6;
            } else if (obj4 instanceof java.lang.String) {
                java.lang.Object obj7 = arrayList.get(0);
                kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
                obj2 = (java.lang.String) obj7;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WCCameraEffectHelper", aVar.f456288d + " has been set value is " + z17);
        if (value instanceof java.lang.Integer) {
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Int>");
            if (!z17) {
                value = obj2;
            }
            kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
            builder.set(key, (java.lang.Integer) value);
            return;
        }
        if (value instanceof java.lang.Boolean) {
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Boolean>");
            builder.set(key, java.lang.Boolean.valueOf(z17));
        } else {
            if (!(value instanceof java.lang.String)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WCCameraEffectHelper", "error set config");
                return;
            }
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.String>");
            if (!z17) {
                value = obj2;
            }
            kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
            builder.set(key, (java.lang.String) value);
        }
    }
}
