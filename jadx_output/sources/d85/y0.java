package d85;

/* loaded from: classes12.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f227253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.d1 f227254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(d85.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f227254e = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        d85.y0 y0Var = new d85.y0(this.f227254e, continuation);
        y0Var.f227253d = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        d85.y0 y0Var = (d85.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z17 = true;
        boolean z18 = android.os.Build.VERSION.SDK_INT > 29 && !com.tencent.mm.sdk.platformtools.x2.n();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (z18) {
            i17 = 0;
        } else {
            i17 = 0;
            for (java.util.Map.Entry entry : d85.j1.f227208a.entrySet()) {
                java.lang.Object value = entry.getValue();
                java.lang.String c17 = ((i85.p) value).c();
                if (!(((c17 == null || c17.length() == 0) ? z17 : false) ^ z17)) {
                    value = null;
                }
                i85.p pVar = (i85.p) value;
                if (pVar != null) {
                    d85.o1 o1Var = new d85.o1((java.lang.String) entry.getKey(), pVar.c(), pVar.b());
                    jz5.l a17 = o1Var.a();
                    java.lang.Boolean bool = (java.lang.Boolean) a17.f302833d;
                    if (bool.booleanValue()) {
                        i17++;
                        d85.l1 l1Var = o1Var.f227235f;
                        java.lang.Object obj2 = l1Var != null ? l1Var.f227216b : null;
                        if (obj2 != null) {
                            pVar.d(obj2);
                        }
                    } else {
                        j85.g gVar = j85.g.f298251a;
                        pm0.v.M(j85.g.f298252b, false, new j85.c(null, (java.lang.String) entry.getKey()), 2, null);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("service ");
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(" hook ");
                    sb6.append(bool.booleanValue() ? ya.b.SUCCESS : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    sb6.append(" , processName:");
                    sb6.append(bm5.f1.a());
                    sb6.append(", errMsg:");
                    sb6.append((java.lang.String) a17.f302834e);
                    com.tencent.mars.xlog.Log.i("Kenneth-methodCall", sb6.toString());
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i("Kenneth-methodCall", "service " + ((java.lang.String) entry.getKey()) + " hook failed, processName:" + bm5.f1.a());
                }
                z17 = true;
            }
            j85.g gVar2 = j85.g.f298251a;
            pm0.v.M(j85.g.f298252b, false, new j85.f(android.os.SystemClock.uptimeMillis() - uptimeMillis, i17), 2, null);
        }
        try {
            if (!(android.os.Build.VERSION.SDK_INT > 29 && !com.tencent.mm.sdk.platformtools.x2.n())) {
                d85.h.f227195a.c();
            }
        } catch (java.lang.Throwable th6) {
            j85.g gVar3 = j85.g.f298251a;
            pm0.v.M(j85.g.f298252b, false, new j85.c("HookContentProvider:", "HookContentProvider"), 2, null);
            java.util.Map map = d85.d1.f227145f;
            this.f227254e.getClass();
            com.tencent.mars.xlog.Log.i("Kenneth-methodCall", "hook provider failed:" + th6.getMessage() + ",size = 0");
        }
        if (kotlin.jvm.internal.o.b(bm5.f1.a(), "com.tencent.mm")) {
            if (fp.h.a(33)) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                com.tencent.mm.sensitive.business.BusinessStackRecorder b17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER");
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
                context.registerReceiver(b17, intentFilter);
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                com.tencent.mm.sensitive.business.BusinessStackRecorder b18 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b();
                android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                intentFilter2.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER");
                intentFilter2.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
                context2.registerReceiver(b18, intentFilter2, 4);
            }
        }
        e85.b bVar = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f;
        bVar.b().getClass();
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context3).registerActivityLifecycleCallbacks(bVar.b());
        rk5.b.f397141d.c(bVar.b());
        d85.f fVar = d85.f.f227152a;
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new d85.a());
        java.util.HashMap hashMap = d85.f.f227154c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("startActivityForResult", "(Landroid/content/Intent;I)V"));
        hashMap.put("android/app/Activity", arrayList);
        xj0.a.h().k(hashMap, d85.b.f227135a);
        java.util.HashMap hashMap2 = d85.f.f227153b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("open", "()Landroid/hardware/Camera;"));
        arrayList2.add(android.util.Pair.create("open", "(I)Landroid/hardware/Camera;"));
        arrayList2.add(android.util.Pair.create("startPreview", "()V"));
        arrayList2.add(android.util.Pair.create("release", "()V"));
        hashMap2.put("android/hardware/Camera", arrayList2);
        xj0.a.h().k(hashMap2, new d85.c());
        java.util.HashMap hashMap3 = d85.f.f227155d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V"));
        arrayList3.add(android.util.Pair.create("openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V"));
        hashMap3.put("android/hardware/camera2/CameraManager", arrayList3);
        xj0.a.h().k(hashMap3, new d85.d());
        java.util.HashMap hashMap4 = d85.r0.f227239a;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("startRecording", "()V"));
        hashMap4.put("android/media/AudioRecord", arrayList4);
        java.util.HashMap hashMap5 = d85.r0.f227240b;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(android.util.Pair.create("startLocalAudio", "()V"));
        hashMap5.put("com/tencent/trtc/TRTCCloud", arrayList5);
        xj0.a.h().k(hashMap4, d85.p0.f227236a);
        xj0.a.h().k(hashMap5, d85.q0.f227238a);
        java.util.HashMap hashMap6 = d85.o.f227227b;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(android.util.Pair.create("exportToPublicDownloadDirImpl", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;"));
        arrayList6.add(android.util.Pair.create("exportImageImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
        arrayList6.add(android.util.Pair.create("exportVideoImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
        hashMap6.put("com/tencent/mm/platformtools/ExportFileUtil", arrayList6);
        xj0.a.h().k(hashMap6, d85.l.f227213a);
        java.util.HashMap hashMap7 = d85.o.f227228c;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(android.util.Pair.create("saveBitmapToImage", "(Landroid/graphics/Bitmap;II;Ljava/lang/String;Z)Ljava/lang/String;"));
        hashMap7.put("com/tencent/mm/sdk/platformtools/BitmapUtil", arrayList7);
        xj0.a.h().k(hashMap7, d85.n.f227221a);
        com.tencent.mars.xlog.Log.i("Kenneth-methodCall", "hook duration=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ",successCount = " + i17 + ",count = " + d85.j1.f227208a.size() + ",processName:" + bm5.f1.a());
        return f0Var2;
    }
}
