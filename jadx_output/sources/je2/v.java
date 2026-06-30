package je2;

/* loaded from: classes3.dex */
public final class v extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ je2.w f299278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(je2.w wVar, java.lang.Class cls) {
        super(cls);
        this.f299278b = wVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.vc2 result = (r45.vc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        je2.w wVar = this.f299278b;
        com.tencent.mars.xlog.Log.i(wVar.f299279f, "recevie oneclick msg = " + pm0.b0.g(result) + ", curSeq = " + wVar.f299280g);
        wVar.f299282i = result.getByteString(3);
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.uc2 uc2Var = new r45.uc2();
        uc2Var.set(0, wVar.f299282i);
        tbVar.h(17, uc2Var);
        java.lang.Long l17 = wVar.f299280g;
        if (l17 == null || l17.longValue() - result.getLong(0) > 0) {
            r45.kv1 kv1Var = (r45.kv1) result.getCustom(1);
            java.lang.String string = result.getString(2);
            if (kv1Var == null || string == null) {
                return;
            }
            wVar.f299281h.postValue(result);
        }
    }
}
