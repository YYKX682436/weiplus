package e80;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f250012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250013e;

    /* renamed from: f, reason: collision with root package name */
    public int f250014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r70.g f250015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e80.f f250016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f250017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r70.g gVar, e80.f fVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250015g = gVar;
        this.f250016h = fVar;
        this.f250017i = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e80.e(this.f250015g, this.f250016h, this.f250017i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        p70.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f250014f;
        r70.g gVar = this.f250015g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendRawImgAsync[");
            sb6.append(gVar.f393104f);
            sb6.append("] imgPath:");
            java.lang.String str = gVar.f393099a;
            sb6.append(str);
            sb6.append(" compressType:");
            sb6.append(gVar.f393100b);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", sb6.toString());
            e80.r.f250075f.a().V6(new r70.c(gVar, r70.d.f393083d));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.Map map = gVar.f393107i;
            java.lang.String str2 = gVar.f393104f;
            ((java.util.HashMap) map).put("send_id", str2);
            if (!kotlin.jvm.internal.o.b(str2, gVar.f393105g)) {
                ((java.util.HashMap) map).put("send_group_id", gVar.f393105g);
            }
            ((java.util.HashMap) map).put("send_img_path", str);
            ((java.util.HashMap) map).put("send_img_length", new java.lang.Long(com.tencent.mm.vfs.w6.k(str)));
            ((java.util.HashMap) map).put("send_inner_version", new java.lang.Integer(50));
            ((java.util.HashMap) map).put("send_compress_type", new java.lang.Integer(gVar.f393100b));
            com.tencent.mm.storage.b4 b4Var = com.tencent.mm.storage.c4.f193811a;
            ((java.util.HashMap) map).put("send_from_user_type", b4Var.a(gVar.f393101c));
            java.lang.String str3 = gVar.f393102d;
            ((java.util.HashMap) map).put("send_to_user_type", b4Var.a(str3));
            k70.i0 i0Var = gVar.f393103e;
            ((java.util.HashMap) map).put("send_source", new java.lang.Integer(i0Var.f304642a));
            ((java.util.HashMap) map).put("send_rotate", new java.lang.Integer(gVar.f393106h));
            p70.a aVar3 = new p70.a(str, gVar.f393100b, str3, i0Var);
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            aVar3.f352460e = str2;
            aVar3.f352462g = null;
            aVar3.f352463h = i0Var.f304661t;
            c80.e a17 = c80.e.f39653f.a();
            this.f250013e = aVar3;
            this.f250012d = elapsedRealtime;
            this.f250014f = 1;
            java.lang.Object U6 = a17.U6(aVar3, this);
            if (U6 == aVar2) {
                return aVar2;
            }
            j17 = elapsedRealtime;
            aVar = aVar3;
            obj = U6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f250012d;
            aVar = (p70.a) this.f250013e;
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = j18;
        }
        p70.b bVar = (p70.b) obj;
        ((java.util.HashMap) gVar.f393107i).putAll(aVar.f352461f);
        ((java.util.HashMap) gVar.f393107i).put("send_prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - j17));
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f250016h.f250018f).getValue(), null, new e80.d(this.f250015g, bVar, j17, this.f250017i, null), 1, null);
        return jz5.f0.f302826a;
    }
}
