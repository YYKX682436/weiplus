package e80;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f250002d;

    /* renamed from: e, reason: collision with root package name */
    public int f250003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r70.g f250004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o70.l f250005g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f250006h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r70.g gVar, o70.l lVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250004f = gVar;
        this.f250005g = lVar;
        this.f250006h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e80.c(this.f250004f, this.f250005g, this.f250006h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long elapsedRealtime;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f250003e;
        r70.g gVar = this.f250004f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "sendRawImgAsyncWithPreBuild[" + gVar.f393104f + "] imgPath:" + gVar.f393099a + " compressType:" + gVar.f393100b);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ((java.util.HashMap) gVar.f393107i).put("send_id", gVar.f393104f);
            if (!kotlin.jvm.internal.o.b(gVar.f393104f, gVar.f393105g)) {
                ((java.util.HashMap) gVar.f393107i).put("send_group_id", gVar.f393105g);
            }
            ((java.util.HashMap) gVar.f393107i).put("send_img_path", gVar.f393099a);
            ((java.util.HashMap) gVar.f393107i).put("send_img_length", new java.lang.Long(com.tencent.mm.vfs.w6.k(gVar.f393099a)));
            ((java.util.HashMap) gVar.f393107i).put("send_inner_version", new java.lang.Integer(50));
            ((java.util.HashMap) gVar.f393107i).put("send_compress_type", new java.lang.Integer(gVar.f393100b));
            java.util.Map map = gVar.f393107i;
            java.lang.String username = gVar.f393101c;
            kotlin.jvm.internal.o.g(username, "username");
            if (r26.n0.B(username, "@", false)) {
                str = (java.lang.String) kz5.n0.a0(r26.n0.f0(username, new java.lang.String[]{"@"}, false, 0, 6, null), 1);
                if (str == null) {
                    str = "other.at";
                }
            } else {
                str = r26.i0.y(username, "gh_", false) ? "biz" : "normal";
            }
            ((java.util.HashMap) map).put("send_from_user_type", str);
            ((java.util.HashMap) gVar.f393107i).put("send_source", new java.lang.Integer(gVar.f393103e.f304642a));
            ((java.util.HashMap) gVar.f393107i).put("send_rotate", new java.lang.Integer(gVar.f393106h));
            o70.l lVar = this.f250005g;
            p70.b bVar = new p70.b(com.tencent.mm.vfs.w6.j(lVar.f343270f) ? p70.c.f352466d : p70.c.f352471i);
            bVar.f352465b = lVar;
            e80.r a17 = e80.r.f250075f.a();
            this.f250002d = elapsedRealtime;
            this.f250003e = 1;
            obj = a17.b7(gVar, bVar, this);
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
            elapsedRealtime = this.f250002d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r70.h hVar = (r70.h) obj;
        ((java.util.HashMap) gVar.f393107i).put("send_result_type", hVar.f393109a.toString());
        ((java.util.HashMap) gVar.f393107i).put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (hVar.f393109a != r70.i.f393114e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(gVar.f393108j, gVar.f393107i, 32785);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "report: " + gVar.f393108j + ' ' + gVar.f393107i);
        }
        this.f250003e = 2;
        if (this.f250006h.emit(hVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
