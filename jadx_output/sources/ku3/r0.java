package ku3;

/* loaded from: classes10.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f312374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(jz5.l lVar, com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312374d = lVar;
        this.f312375e = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.r0(this.f312374d, this.f312375e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.r0 r0Var = (ku3.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f312374d.f302834e;
        com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312375e;
        if (bundle != null) {
            float f17 = bundle.getFloat("camera_float_1");
            float f18 = bundle.getFloat("camera_float_2");
            float f19 = bundle.getFloat("camera_float_3");
            ku3.s sVar = professionalCameraKitPluginLayout.I;
            android.util.Range range = new android.util.Range(new java.lang.Float(f17), new java.lang.Float(f18));
            sVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorData >> " + range + ", " + f19);
            sVar.f312403z = ((float) a06.d.b(f19 * 10.0f)) / 10.0f;
            sVar.A = range;
            java.lang.Object lower = range.getLower();
            kotlin.jvm.internal.o.f(lower, "getLower(...)");
            float floatValue = ((java.lang.Number) lower).floatValue();
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            java.util.HashMap hashMap = sVar.f312401x;
            if (0.0f < floatValue) {
                java.lang.Object lower2 = range.getLower();
                kotlin.jvm.internal.o.f(lower2, "getLower(...)");
                if (((java.lang.Number) lower2).floatValue() < 1.0f) {
                    kotlin.jvm.internal.o.f(range.getLower(), "getLower(...)");
                    hashMap.put(1, java.lang.Float.valueOf(a06.d.b(((java.lang.Number) r1).floatValue() * 10.0f) / 10.0f));
                }
            }
            java.lang.Float f27 = (java.lang.Float) range.getUpper();
            float f28 = 2;
            float f29 = 1;
            float floatValue2 = (((f27.floatValue() / f28) % f29) > 0.0f ? 1 : (((f27.floatValue() / f28) % f29) == 0.0f ? 0 : -1)) == 0 ? f27.floatValue() / f28 : (f27.floatValue() / f28) + f29;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorData >> " + floatValue2);
            if (floatValue2 > 2.0f) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
                hashMap.put(4, java.lang.Float.valueOf(floatValue2));
                hashMap.put(5, f27);
            } else if (1.0f < floatValue2 && floatValue2 <= 2.0f) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
                hashMap.put(5, f27);
            } else if (kotlin.jvm.internal.o.a(f27, 2.0f)) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
            } else if (kotlin.jvm.internal.o.a(f27, 1.0f) && (!hashMap.isEmpty())) {
                hashMap.put(2, valueOf);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraKitIndicatorPlugin", "get indicator data is no support to show bar");
                android.view.View b17 = sVar.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorData", "(Landroid/util/Range;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorData", "(Landroid/util/Range;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.E = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorBar >> " + sVar.f312403z + ", " + sVar.A);
            android.view.View b18 = sVar.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sVar.E = true;
            sVar.m();
            if (hashMap.containsKey(1)) {
                android.view.View j17 = sVar.j();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(j17, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.j().setOnClickListener(sVar);
                java.lang.Object value = ((jz5.n) sVar.f312391n).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((android.widget.TextView) value).setText(java.lang.String.valueOf(hashMap.get(1)));
            }
            if (hashMap.containsKey(2)) {
                android.view.View g17 = sVar.g();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(g17, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.g().setOnClickListener(sVar);
                java.lang.Object value2 = ((jz5.n) sVar.f312393p).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                android.widget.TextView textView = (android.widget.TextView) value2;
                java.lang.Float f37 = (java.lang.Float) hashMap.get(2);
                textView.setText(java.lang.String.valueOf(f37 != null ? java.lang.Integer.valueOf((int) f37.floatValue()) : null));
            }
            if (hashMap.containsKey(3)) {
                android.view.View h17 = sVar.h();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(h17, arrayList5.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                h17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(h17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.h().setOnClickListener(sVar);
                java.lang.Object value3 = ((jz5.n) sVar.f312395r).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                android.widget.TextView textView2 = (android.widget.TextView) value3;
                java.lang.Float f38 = (java.lang.Float) hashMap.get(3);
                textView2.setText(java.lang.String.valueOf(f38 != null ? java.lang.Integer.valueOf((int) f38.floatValue()) : null));
            }
            if (hashMap.containsKey(4)) {
                android.view.View i17 = sVar.i();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(i17, arrayList6.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(i17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.i().setOnClickListener(sVar);
                java.lang.Object value4 = ((jz5.n) sVar.f312397t).getValue();
                kotlin.jvm.internal.o.f(value4, "getValue(...)");
                android.widget.TextView textView3 = (android.widget.TextView) value4;
                java.lang.Float f39 = (java.lang.Float) hashMap.get(4);
                textView3.setText(java.lang.String.valueOf(f39 != null ? java.lang.Integer.valueOf((int) f39.floatValue()) : null));
            }
            if (hashMap.containsKey(5)) {
                android.view.View f47 = sVar.f();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(f47, arrayList7.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f47.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(f47, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.f().setOnClickListener(sVar);
                java.lang.Object value5 = ((jz5.n) sVar.f312399v).getValue();
                kotlin.jvm.internal.o.f(value5, "getValue(...)");
                android.widget.TextView textView4 = (android.widget.TextView) value5;
                java.lang.Float f48 = (java.lang.Float) hashMap.get(5);
                textView4.setText(java.lang.String.valueOf(f48 != null ? java.lang.Integer.valueOf((int) f48.floatValue()) : null));
            }
        }
        ku3.l5 l5Var = professionalCameraKitPluginLayout.E;
        if (l5Var.f312309f == 1 && l5Var.f312308e) {
            l5Var.f312307d.f475577e.setLightTorch(true);
        }
        return jz5.f0.f302826a;
    }
}
