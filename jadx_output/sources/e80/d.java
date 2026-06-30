package e80;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f250007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r70.g f250008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p70.b f250009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f250010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f250011h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r70.g gVar, p70.b bVar, long j17, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250008e = gVar;
        this.f250009f = bVar;
        this.f250010g = j17;
        this.f250011h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e80.d(this.f250008e, this.f250009f, this.f250010g, this.f250011h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f250007d;
        r70.g gVar = this.f250008e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e80.r a17 = e80.r.f250075f.a();
            this.f250007d = 1;
            obj = a17.b7(gVar, this.f250009f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r70.h hVar = (r70.h) obj;
        ((java.util.HashMap) gVar.f393107i).put("send_result_type", hVar.f393109a.toString());
        ((java.util.HashMap) gVar.f393107i).put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f250010g));
        if (hVar.f393109a != r70.i.f393114e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(gVar.f393108j, gVar.f393107i, 32785);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "report " + gVar.f393108j + ' ' + gVar.f393107i);
        }
        this.f250007d = 2;
        if (this.f250011h.emit(hVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
