package oy4;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f350056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oy4.c f350057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.ArrayList arrayList, oy4.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350056e = arrayList;
        this.f350057f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oy4.b bVar = new oy4.b(this.f350056e, this.f350057f, continuation);
        bVar.f350055d = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oy4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageClsResult >> ");
        java.util.ArrayList<java.lang.String> arrayList3 = this.f350056e;
        sb6.append(arrayList3.size());
        sb6.append(' ');
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", sb6.toString());
        oy4.c cVar = this.f350057f;
        cVar.getClass();
        int i17 = 0;
        if (oy4.c.f350060d != null) {
            z17 = true;
        } else {
            ny4.e eVar = new ny4.e();
            oy4.c.f350060d = eVar;
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.a3 a3Var = p05.a3.f350439a;
            java.lang.String g17 = a3Var.g("MODEL_CHAT_CLS_MODEL");
            java.lang.String g18 = a3Var.g("MODEL_CHAT_CLS_MAP");
            if (!(g17 == null || g17.length() == 0)) {
                if (!(g18 == null || g18.length() == 0)) {
                    long nInit = com.tencent.mm.xeffect.WeChatCls.nInit(g17, g18, 2);
                    eVar.f341457a = nInit;
                    if (nInit == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "init weChatCls error");
                        z17 = false;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "init weChatCls success " + eVar.f341457a);
                        z17 = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "initClsEnv >> model is null");
            z17 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
        }
        if (!z17) {
            return arrayList2;
        }
        for (java.lang.String str3 : arrayList3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", "getImageClsResult >> " + str3);
            oy4.a a17 = ny4.h.f341467a.a(str3);
            java.nio.Buffer buffer = a17 != null ? a17.f350052b : null;
            android.graphics.Bitmap bitmap = a17 != null ? a17.f350051a : null;
            if (buffer == null || bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ClsApiImpl", "getImageOcrResult >> buffer get error");
                arrayList2.add(new java.util.ArrayList());
            } else {
                ny4.e eVar2 = oy4.c.f350060d;
                if (eVar2 != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    long j17 = eVar2.f341457a;
                    if (j17 == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "applyReq >> weChatClsHandle no init");
                        arrayList = new java.util.ArrayList<>();
                    } else {
                        arrayList = com.tencent.mm.xeffect.WeChatCls.nApplyWithScoreResult(j17, buffer, width, height);
                    }
                } else {
                    arrayList = null;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getImageClsResult >> result: ");
                sb7.append(arrayList != null ? new java.lang.Integer(arrayList.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", sb7.toString());
                if (arrayList == null) {
                    arrayList2.add(new java.util.ArrayList());
                } else if (!arrayList.isEmpty()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.util.List f07 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"&&"}, false, 0, 6, null);
                        java.lang.String str4 = (java.lang.String) kz5.n0.a0(f07, i17);
                        if (str4 != null && (str = (java.lang.String) kz5.n0.a0(f07, 1)) != null && (str2 = (java.lang.String) kz5.n0.k0(r26.n0.f0(str4, new java.lang.String[]{"#"}, false, 0, 6, null))) != null) {
                            try {
                                ny4.e eVar3 = oy4.c.f350060d;
                                if (eVar3 != null) {
                                    arrayList4.add(new ck0.a(eVar3.d(java.lang.Integer.parseInt(str2), "zh_CN"), java.lang.Float.parseFloat(str)));
                                }
                            } catch (java.lang.NumberFormatException unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ClsApiImpl", "getImageClsResult >> NumberFormatException");
                            }
                        }
                        i17 = 0;
                    }
                    arrayList2.add(arrayList4);
                } else {
                    arrayList2.add(new java.util.ArrayList());
                }
            }
            i17 = 0;
        }
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsApiImpl", "destroyEnv");
        ny4.e eVar4 = oy4.c.f350060d;
        if (eVar4 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "destroyClsEnv " + eVar4.f341457a);
            long j18 = eVar4.f341457a;
            if (j18 != 0) {
                com.tencent.mm.xeffect.WeChatCls.nRelease(j18);
                eVar4.f341457a = 0L;
            }
        }
        oy4.c.f350060d = null;
        return arrayList2;
    }
}
