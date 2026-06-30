package rn2;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f397848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rn2.c1 c1Var, java.lang.String str, int i17, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397846e = c1Var;
        this.f397847f = str;
        this.f397848g = i17;
        this.f397849h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.t0(this.f397846e, this.f397847f, this.f397848g, this.f397849h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object s17;
        java.lang.Object obj2;
        int i17 = this.f397848g;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f397845d;
        rn2.c1 c1Var = this.f397846e;
        int i19 = 1;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f397845d = 1;
            s17 = c1Var.s(this);
            if (s17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            s17 = obj;
        }
        java.util.List list = (java.util.List) s17;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f397849h;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w(c1Var.f397665e, "[AI Prefill] applyGiftPrefill: gift pool empty");
            pm0.v.X(new rn2.q0(str));
            return f0Var;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(this.f397847f);
            int length = jSONArray.length();
            int i27 = 0;
            while (i27 < length) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                if (jSONObject != null) {
                    java.lang.String optString = jSONObject.optString("product_id", "");
                    int optInt = jSONObject.optInt("count", i19);
                    kotlin.jvm.internal.o.d(optString);
                    if ((optString.length() == 0 ? i19 : 0) == 0) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (kotlin.jvm.internal.o.b(((rn2.y2) obj2).f397929d.getString(0), optString)) {
                                break;
                            }
                        }
                        rn2.y2 y2Var = (rn2.y2) obj2;
                        if (y2Var != null) {
                            y2Var.f397926a = true;
                            y2Var.f397928c.set(1, java.lang.Integer.valueOf(optInt));
                            com.tencent.mars.xlog.Log.i(c1Var.f397665e, "[AI Prefill] applyGiftPrefill: matched product_id=" + optString + ", count=" + optInt);
                        } else {
                            com.tencent.mars.xlog.Log.w(c1Var.f397665e, "[AI Prefill] applyGiftPrefill: product_id=" + optString + " NOT found in pool");
                            c0Var.f310112d = true;
                        }
                    }
                }
                i27++;
                i19 = 1;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (((rn2.y2) obj3).f397926a) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                c1Var.C(new java.lang.Integer(i17), arrayList);
                com.tencent.mars.xlog.Log.i(c1Var.f397665e, "[AI Prefill] applyGiftPrefill: applied " + arrayList.size() + " gifts, distributeType=" + i17);
            }
            pm0.v.X(new rn2.s0(c1Var, c0Var, str));
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(c1Var.f397665e, "[AI Prefill] applyGiftPrefill: parse error: " + e17.getMessage());
            pm0.v.X(new rn2.r0(str, e17));
            return f0Var;
        }
    }
}
