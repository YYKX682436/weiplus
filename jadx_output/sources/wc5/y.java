package wc5;

/* loaded from: classes4.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f444655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wc5.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444655e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.y yVar = new wc5.y(this.f444655e, continuation);
        yVar.f444654d = obj;
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.lang.String j76;
        com.tencent.mm.storage.s8 s8Var;
        java.util.ArrayList h17;
        kz5.p0 p0Var = kz5.p0.f313996d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wc5.c0 c0Var = this.f444655e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.List list = wc5.c0.f444539h;
            j76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) c0Var.T6()).j7();
            s8Var = com.tencent.mm.storage.s8.f195314a;
            h17 = s8Var.h(j76);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (h17.isEmpty()) {
            return p0Var;
        }
        java.util.ArrayList g17 = s8Var.g(j76, 500, 0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.tencent.mm.api.QueryImageData) it.next()).f53208i;
            kotlin.jvm.internal.o.f(str, "getCropLabelId(...)");
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : f07) {
                if (((java.lang.String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            for (java.lang.String str2 : arrayList) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str2);
                linkedHashMap.put(str2, new java.lang.Integer((num != null ? num.intValue() : 0) + 1));
            }
        }
        java.util.List K0 = kz5.n0.K0(kz5.n0.F0(linkedHashMap.entrySet(), new wc5.x()), 10);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(K0, 10));
        java.util.Iterator it6 = K0.iterator();
        while (it6.hasNext()) {
            arrayList2.add((java.lang.String) ((java.util.Map.Entry) it6.next()).getKey());
        }
        int d17 = kz5.b1.d(kz5.d0.q(h17, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj3 : h17) {
            linkedHashMap2.put(((aq.a) obj3).f12826a, obj3);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            aq.a aVar2 = (aq.a) linkedHashMap2.get((java.lang.String) it7.next());
            if (aVar2 != null) {
                arrayList3.add(aVar2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "fetchPersonCropItems: allCrop=" + h17.size() + ", recImages=" + g17.size() + ", labelGroups=" + linkedHashMap.size() + ", result=" + arrayList3.size());
        m521constructorimpl = kotlin.Result.m521constructorimpl(arrayList3);
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return m521constructorimpl;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", m524exceptionOrNullimpl, "fetchPersonCropItems failed", new java.lang.Object[0]);
        return p0Var;
    }
}
