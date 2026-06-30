package gu0;

/* loaded from: classes.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275802d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.r1(this.f275802d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = this.f275802d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            java.lang.String optString = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(str)).optString("templateId", "");
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() > 0) {
                return optString;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "resolveTemplateId: failed to read templateId from " + str + ", error=" + e17.getMessage());
            return null;
        }
    }
}
