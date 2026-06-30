package fn5;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264644d;

    /* renamed from: e, reason: collision with root package name */
    public int f264645e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264647g = str;
        this.f264648h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fn5.c cVar = new fn5.c(this.f264647g, this.f264648h, continuation);
        cVar.f264646f = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.c) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.k] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.flow.k, java.lang.Object] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        ?? r27 = this.f264645e;
        java.lang.String str2 = this.f264648h;
        java.lang.String str3 = this.f264647g;
        java.lang.String str4 = "MicroMsg.ImageQueryGalleryViewModel";
        int i17 = 2;
        int i18 = 1;
        try {
        } catch (cl0.f unused) {
            str = "MicroMsg.ImageQueryGalleryViewModel";
        }
        if (r27 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f264646f;
            aq.r0 r0Var = aq.r0.f12940a;
            this.f264646f = kVar;
            this.f264645e = 1;
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new aq.v(str3, str2, null), this);
            r27 = kVar;
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (r27 != 1) {
                if (r27 != 2) {
                    if (r27 == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return jz5.f0.f302826a;
                    }
                    if (r27 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlinx.coroutines.flow.k kVar2 = (kotlinx.coroutines.flow.k) this.f264646f;
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            r27 = kVar2;
        }
        java.lang.String str5 = (java.lang.String) g17;
        int i19 = 0;
        if (str5 == null || str5.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewModel", "getImageKeywordPoint >> imagePath: " + str3 + ", keyword: " + str2 + ", result is null");
            jz5.l lVar = new jz5.l(str3, new java.util.ArrayList());
            this.f264646f = null;
            this.f264645e = 2;
            if (r27.emit(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewModel", "getImageKeywordPoint >> imagePath: " + str3 + ", keyword: " + str2 + ", result: " + str5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cl0.e jSONArray = new cl0.g(str5).getJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            int length = jSONArray.length();
            int i27 = 0;
            while (i27 < length) {
                cl0.e a17 = jSONArray.a(i27);
                cl0.e a18 = a17.a(i19);
                cl0.e a19 = a17.a(i17);
                str = str4;
                try {
                    i18 = 1;
                    arrayList.add(new android.graphics.RectF((float) a18.getDouble(i19), (float) a18.getDouble(i18), (float) a19.getDouble(0), (float) a19.getDouble(1)));
                    i27++;
                    length = length;
                    str4 = str;
                    i17 = 2;
                    i19 = 0;
                } catch (cl0.f unused2) {
                    com.tencent.mars.xlog.Log.i(str, "parse json error");
                    jz5.l lVar2 = new jz5.l(str3, new java.util.ArrayList());
                    this.f264646f = null;
                    this.f264644d = null;
                    this.f264645e = 4;
                    if (r27.emit(lVar2, this) == aVar) {
                        return aVar;
                    }
                    return jz5.f0.f302826a;
                }
            }
            str = str4;
            jz5.l lVar3 = new jz5.l(str3, arrayList);
            this.f264646f = r27;
            this.f264644d = str3;
            this.f264645e = 3;
            if (r27.emit(lVar3, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
