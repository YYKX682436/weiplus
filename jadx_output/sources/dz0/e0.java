package dz0;

/* loaded from: classes5.dex */
public final class e0 implements dz0.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f244818a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f244819b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f244820c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f244821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f244822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f244823f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f244824g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f244825h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f244826i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.coroutines.Continuation f244827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244828k;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance()) == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r5) {
        /*
            r4 = this;
            r4.f244828k = r5
            r4.<init>()
            bm5.o1 r5 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r0 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r0.<init>()
            int r5 = r5.h(r0)
            java.lang.Class<e42.e0> r0 = e42.e0.class
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r2) goto L2f
            r2 = 3
            if (r5 == r2) goto L2e
            i95.m r5 = i95.n0.c(r0)
            e42.e0 r5 = (e42.e0) r5
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r2 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r2.<init>()
            h62.d r5 = (h62.d) r5
            int r5 = r5.nj(r2)
            if (r5 != r3) goto L2e
            goto L2f
        L2e:
            r3 = r1
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "enableShowMoreTemplateEntrance: "
            r5.<init>(r2)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "SnsMaasConfigImpl"
            com.tencent.mars.xlog.Log.i(r2, r5)
            r4.f244818a = r3
            i95.m r5 = i95.n0.c(r0)
            e42.e0 r5 = (e42.e0) r5
            e42.c0 r0 = e42.c0.clicfg_sns_maas_ai_template_force_skip
            h62.d r5 = (h62.d) r5
            boolean r5 = r5.fj(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "forceSkipAITemplateRecommend: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            r4.f244819b = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f244820c = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f244821d = r5
            dz0.z r5 = dz0.z.f245076d
            jz5.g r5 = jz5.h.b(r5)
            r4.f244824g = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r4.f244825h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.<init>(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC):void");
    }

    public final void b(com.tencent.maas.model.MJTemplateRecommendResult recommendResult) {
        java.util.List list;
        kotlin.jvm.internal.o.g(recommendResult, "recommendResult");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "pushData: ");
        java.util.List<com.tencent.maas.model.MJTemplateCategory> categories = recommendResult.getCategories();
        if (categories != null) {
            list = new java.util.ArrayList();
            java.util.Iterator<T> it = categories.iterator();
            while (it.hasNext()) {
                java.util.List<com.tencent.maas.model.MJTemplateInfo> templateInfos = ((com.tencent.maas.model.MJTemplateCategory) it.next()).getTemplateInfos();
                kotlin.jvm.internal.o.f(templateInfos, "getTemplateInfos(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : templateInfos) {
                    java.lang.String aIModelType = ((com.tencent.maas.model.MJTemplateInfo) obj).getAIModelType();
                    if ((((aIModelType == null || aIModelType.length() == 0) ^ true) && this.f244819b) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                kz5.h0.u(list, arrayList);
            }
        } else {
            list = kz5.p0.f313996d;
        }
        java.util.List list2 = this.f244820c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.maas.model.MJTemplateInfo) it6.next()).getTemplateID());
        }
        java.util.List list3 = this.f244821d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list3, 10));
        java.util.Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((com.tencent.maas.model.MJTemplateInfo) it7.next()).getTemplateID());
        }
        java.util.List t07 = kz5.n0.t0(arrayList2, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!((java.util.ArrayList) t07).contains(((com.tencent.maas.model.MJTemplateInfo) obj2).getTemplateID())) {
                arrayList4.add(obj2);
            }
        }
        this.f244823f = recommendResult.isEnableSingleTemplateMusicRec();
        arrayList4.toString();
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "pushData: get " + list.size() + " data, filtered " + arrayList4.size() + ", hasNext " + recommendResult.isHasMoreTemplates() + ", isEnableSingleTemplateMusicRec " + this.f244823f);
        int nj6 = this.f244818a ? kotlin.jvm.internal.o.b(this.f244828k.f69784e.f244855a, "MomentsTemplateRecommendv2") ? 3 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigAlbumQuickCreationDisplayTemplateNumber()) : Integer.MAX_VALUE;
        if (((java.util.ArrayList) this.f244821d).size() < nj6) {
            ((java.util.ArrayList) this.f244821d).addAll(kz5.n0.K0(arrayList4, nj6));
            if (arrayList4.size() > nj6) {
                synchronized (this.f244828k.f69796t) {
                    ((java.util.ArrayList) this.f244820c).addAll(kz5.n0.L0(arrayList4, arrayList4.size() - nj6));
                }
            }
            kotlin.coroutines.Continuation continuation = this.f244827j;
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.valueOf(recommendResult.isHasMoreTemplates()), this.f244820c)));
            }
            this.f244827j = null;
        } else {
            synchronized (this.f244828k.f69796t) {
                ((java.util.ArrayList) this.f244820c).addAll(arrayList4);
            }
        }
        this.f244822e = recommendResult.isHasMoreTemplates() ? recommendResult.getPagingContext() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dz0.b0
            if (r0 == 0) goto L13
            r0 = r10
            dz0.b0 r0 = (dz0.b0) r0
            int r1 = r0.f244779i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244779i = r1
            goto L18
        L13:
            dz0.b0 r0 = new dz0.b0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f244777g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f244779i
            java.lang.String r3 = "MaasMultiTemplate.MaasSdkUIC"
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r8 = r0.f244776f
            int r9 = r0.f244775e
            java.lang.Object r2 = r0.f244774d
            dz0.e0 r2 = (dz0.e0) r2
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L88
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "requestData: listSize "
            r10.<init>(r2)
            java.util.List r2 = r7.f244820c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r10.append(r2)
            java.lang.String r2 = " offset "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = " pageSize "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r3, r10)
            r2 = r7
        L69:
            java.util.List r10 = r2.f244820c
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            int r5 = r8 + r9
            if (r10 >= r5) goto La7
            java.lang.String r10 = r2.f244822e
            if (r10 == 0) goto La7
            r0.f244774d = r2
            r0.f244775e = r8
            r0.f244776f = r9
            r0.f244779i = r4
            java.lang.Object r10 = r2.d(r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            boolean r10 = r10 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L69
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "requestData: cancel, "
            r10.<init>(r0)
            java.util.List r0 = r2.f244820c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r3, r10)
        La7:
            jz5.l r10 = new jz5.l
            java.lang.String r0 = r2.f244822e
            if (r0 == 0) goto Lae
            goto Laf
        Lae:
            r4 = 0
        Laf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.util.List r1 = r2.f244820c
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            int r9 = r9 + r8
            if (r2 >= r9) goto Lcd
            r9 = r1
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r8 = r1.subList(r8, r9)
            goto Ld3
        Lcd:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r8 = r1.subList(r8, r9)
        Ld3:
            r10.<init>(r0, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.c(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:26|27))(10:28|(1:30)(1:41)|31|32|(4:34|(1:36)|37|(1:39)(1:40))|25|(1:16)|17|18|(2:20|21)(1:23))|12|(5:14|(0)|17|18|(0)(0))|25|(0)|17|18|(0)(0)))|44|6|7|(0)(0)|12|(0)|25|(0)|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0079, B:14:0x007d, B:16:0x0085, B:17:0x008a, B:32:0x005f, B:34:0x0065, B:37:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0079, B:14:0x007d, B:16:0x0085, B:17:0x008a, B:32:0x005f, B:34:0x0065, B:37:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof dz0.d0
            if (r0 == 0) goto L13
            r0 = r9
            dz0.d0 r0 = (dz0.d0) r0
            int r1 = r0.f244805g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244805g = r1
            goto L18
        L13:
            dz0.d0 r0 = new dz0.d0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f244803e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f244805g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MaasMultiTemplate.MaasSdkUIC"
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.f244802d
            dz0.e0 r0 = (dz0.e0) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L30
            goto L79
        L30:
            r9 = move-exception
            goto L8f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "dataHolder triggerRecommend: "
            r9.<init>(r2)
            java.lang.String r2 = r8.f244822e
            if (r2 == 0) goto L52
            int r2 = r2.length()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            goto L53
        L52:
            r7 = r5
        L53:
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r6, r9)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r9 = r8.f244828k
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L30
            az0.n7 r2 = r9.f69783d     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L82
            java.lang.String r7 = r8.f244822e     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L6b
            java.lang.String r7 = ""
        L6b:
            java.lang.String r9 = r9.f69790n     // Catch: java.lang.Throwable -> L30
            r0.f244802d = r8     // Catch: java.lang.Throwable -> L30
            r0.f244805g = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r2.j(r7, r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L78
            return r1
        L78:
            r0 = r8
        L79:
            com.tencent.maas.model.MJTemplateRecommendResult r9 = (com.tencent.maas.model.MJTemplateRecommendResult) r9     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L82
            r0.b(r9)     // Catch: java.lang.Throwable -> L30
            r9 = r3
            goto L83
        L82:
            r9 = r5
        L83:
            if (r9 != 0) goto L8a
            java.lang.String r9 = "dataHolder triggerRecommend: recommend error"
            com.tencent.mars.xlog.Log.e(r6, r9)     // Catch: java.lang.Throwable -> L30
        L8a:
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r3)     // Catch: java.lang.Throwable -> L30
            goto L99
        L8f:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r9)
        L99:
            java.lang.Throwable r9 = kotlin.Result.m524exceptionOrNullimpl(r9)
            if (r9 == 0) goto La8
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "triggerRecommend: onFailure"
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r9, r1, r0)
            return r9
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
