package yi4;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi4.h f462609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.status.StatusPrivacyRequest f462610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f462611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f462612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yi4.h hVar, com.tencent.pigeon.status.StatusPrivacyRequest statusPrivacyRequest, boolean z17, yz5.l lVar) {
        super(2);
        this.f462609d = hVar;
        this.f462610e = statusPrivacyRequest;
        this.f462611f = z17;
        this.f462612g = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.ArrayList<java.lang.String> arrayList;
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.tencent.pigeon.status.StatusPrivacyType currentPrivacy = this.f462610e.getCurrentPrivacy();
        this.f462609d.getClass();
        java.util.List list = kz5.p0.f313996d;
        yz5.l lVar = this.f462612g;
        if (intValue != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult: cancelled, resultCode=");
            sb6.append(intValue);
            sb6.append(", hasData=");
            sb6.append(intent != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPlatformApiImpl", sb6.toString());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (currentPrivacy == null) {
                currentPrivacy = com.tencent.pigeon.status.StatusPrivacyType.PUBLIC;
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.status.StatusPrivacyResponse(false, currentPrivacy, list, list, false, 0L))));
        } else {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String str = stringExtra;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                list = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            }
            if (this.f462611f) {
                arrayList = intent.getStringArrayListExtra("label_id");
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
            } else {
                arrayList = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Long j17 = r26.h0.j((java.lang.String) it.next());
                if (j17 != null) {
                    arrayList3.add(j17);
                }
            }
            try {
                bk4.q0.f21538a.a(intExtra, arrayList2, list);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: checkSaveRecentRange failed, err=" + th6.getMessage());
            }
            long j18 = 0;
            try {
                java.util.Iterator<T> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    j18 += ((b93.b) c93.a.a()).j((java.lang.String) it6.next()) != null ? r2.size() : 0;
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: getTagUserCount failed, err=" + th7.getMessage());
            }
            com.tencent.pigeon.status.StatusPrivacyResponse statusPrivacyResponse = new com.tencent.pigeon.status.StatusPrivacyResponse(true, intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? com.tencent.pigeon.status.StatusPrivacyType.PUBLIC : com.tencent.pigeon.status.StatusPrivacyType.INVISIBLE_GROUP : com.tencent.pigeon.status.StatusPrivacyType.VISIBLE_GROUP : com.tencent.pigeon.status.StatusPrivacyType.PRIVATE, list, arrayList3, false, j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPlatformApiImpl", "handleResult: confirmed, privacy=" + statusPrivacyResponse.getPrivacy() + ", contacts=" + list.size() + ", tags=" + arrayList3.size());
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(statusPrivacyResponse)));
        }
        return jz5.f0.f302826a;
    }
}
