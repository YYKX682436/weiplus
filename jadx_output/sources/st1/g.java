package st1;

/* loaded from: classes7.dex */
public abstract class g {
    public static final void a(android.widget.TextView textView, android.text.InputFilter filter) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(filter, "filter");
        android.text.InputFilter[] filters = textView.getFilters();
        android.text.InputFilter[] filters2 = textView.getFilters();
        int length = filters2 != null ? filters2.length : 0;
        java.lang.Class<?> componentType = filters != null ? filters.getClass().getComponentType() : filter.getClass();
        if (filters != null) {
            int length2 = java.lang.reflect.Array.getLength(filters);
            if (length > length2 || length < 0) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Index: ");
                stringBuffer.append(length);
                stringBuffer.append(", Length: ");
                stringBuffer.append(length2);
                throw new java.lang.IndexOutOfBoundsException(stringBuffer.toString());
            }
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(componentType, length2 + 1);
            java.lang.System.arraycopy(filters, 0, newInstance, 0, length);
            java.lang.reflect.Array.set(newInstance, length, filter);
            if (length < length2) {
                java.lang.System.arraycopy(filters, length, newInstance, length + 1, length2 - length);
            }
            obj = newInstance;
        } else {
            if (length != 0) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Index: ");
                stringBuffer2.append(length);
                stringBuffer2.append(", Length: 0");
                throw new java.lang.IndexOutOfBoundsException(stringBuffer2.toString());
            }
            obj = java.lang.reflect.Array.newInstance(componentType, 1);
            java.lang.reflect.Array.set(obj, 0, filter);
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        kotlin.jvm.internal.o.e(objArr, "null cannot be cast to non-null type kotlin.Array<out android.text.InputFilter>");
        textView.setFilters((android.text.InputFilter[]) objArr);
    }

    public static final void b(qt1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        int i17 = fVar.f366521e;
        if (-17502 == i17) {
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490781ar3));
            return;
        }
        qt1.c cVar = fVar.f366523g;
        boolean z17 = cVar instanceof qt1.e;
        java.lang.String str = fVar.f366522f;
        int i18 = fVar.f366520d;
        if (z17) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqr));
            java.lang.String[] strArr = new java.lang.String[3];
            strArr[0] = java.lang.String.valueOf(i18);
            strArr[1] = java.lang.String.valueOf(i17);
            strArr[2] = str != null ? str : "";
            sb6.append(kz5.z.d0(strArr, " ", "\n", null, 0, null, null, 60, null));
            db5.t7.g(context, sb6.toString());
            return;
        }
        if (cVar instanceof qt1.k) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqt));
            java.lang.String[] strArr2 = new java.lang.String[3];
            strArr2[0] = java.lang.String.valueOf(i18);
            strArr2[1] = java.lang.String.valueOf(i17);
            strArr2[2] = str != null ? str : "";
            sb7.append(kz5.z.d0(strArr2, " ", "\n", null, 0, null, null, 60, null));
            db5.t7.g(context2, sb7.toString());
            return;
        }
        if (cVar instanceof qt1.d) {
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqq));
            java.lang.String[] strArr3 = new java.lang.String[3];
            strArr3[0] = java.lang.String.valueOf(i18);
            strArr3[1] = java.lang.String.valueOf(i17);
            strArr3[2] = str != null ? str : "";
            sb8.append(kz5.z.d0(strArr3, " ", "\n", null, 0, null, null, 60, null));
            db5.t7.g(context3, sb8.toString());
            return;
        }
        if (cVar instanceof qt1.i) {
            android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqs));
            java.lang.String[] strArr4 = new java.lang.String[3];
            strArr4[0] = java.lang.String.valueOf(i18);
            strArr4[1] = java.lang.String.valueOf(i17);
            strArr4[2] = str != null ? str : "";
            sb9.append(kz5.z.d0(strArr4, " ", "\n", null, 0, null, null, 60, null));
            db5.t7.g(context4, sb9.toString());
        }
    }

    public static final java.lang.Object c(android.app.Activity activity, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        int a17 = cf.b.a(activity);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ((ku5.t0) ku5.t0.f312615d).B(new st1.e(activity, intent, a17, rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static final java.lang.Object d(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ((ku5.t0) ku5.t0.f312615d).B(new st1.f(aVar, rVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }
}
