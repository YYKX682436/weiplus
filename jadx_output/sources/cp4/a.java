package cp4;

/* loaded from: classes8.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.b f220968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f220969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(cp4.b bVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f220968d = bVar;
        this.f220969e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cp4.a(this.f220968d, this.f220969e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cp4.a aVar = (cp4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gp.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cp4.b bVar = this.f220968d;
        if (!bVar.f220980n) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.nio.ByteBuffer byteBuffer = bVar.f220977h;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            java.nio.ByteBuffer byteBuffer2 = bVar.f220977h;
            if (byteBuffer2 != null) {
                byteBuffer2.position(0);
            }
            while (!bVar.f220987u && (cVar = bVar.f220975f) != null && cVar.c() >= 0) {
                try {
                    java.nio.ByteBuffer byteBuffer3 = bVar.f220977h;
                    if (byteBuffer3 != null) {
                        gp.c cVar2 = bVar.f220975f;
                        int f17 = cVar2 != null ? cVar2.f(byteBuffer3, bVar.f220979m + 7) : -1;
                        if (f17 > 2) {
                            int i17 = f17 + 7;
                            di3.a.a(byteBuffer3, bVar.f220979m, i17, bVar.f220984r, bVar.f220985s, bVar.f220986t);
                            bVar.f220979m += i17;
                        }
                        gp.c cVar3 = bVar.f220975f;
                        if (cVar3 != null) {
                            cVar3.a();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditCaptionDataManager", e17, "loadAudioTrackData error:" + e17.getMessage(), new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "[" + bVar.hashCode() + "]load audio track size:" + bVar.f220979m + " cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            bVar.f220980n = true;
        }
        cp4.b bVar2 = this.f220968d;
        int i18 = this.f220969e;
        bVar2.getClass();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        int i19 = 1;
        int i27 = 0;
        while (true) {
            int i28 = bVar2.f220979m;
            if (i27 >= i28) {
                break;
            }
            int i29 = 167116 + i27;
            if (i29 <= i28) {
                i28 = i29;
            }
            java.nio.ByteBuffer byteBuffer4 = bVar2.f220977h;
            if (byteBuffer4 != null) {
                byteBuffer4.position(i27);
            }
            int i37 = i28 - i27;
            byte[] bArr = new byte[i37];
            java.nio.ByteBuffer byteBuffer5 = bVar2.f220977h;
            if (byteBuffer5 != null) {
                byteBuffer5.get(bArr);
            }
            bVar2.a(i18, new com.tencent.mm.protobuf.g(bArr, 0, i37), i19, i27);
            i19++;
            i27 = i28;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "[" + bVar2.hashCode() + "]do net cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        java.nio.ByteBuffer byteBuffer6 = bVar2.f220977h;
        if (byteBuffer6 != null) {
            byteBuffer6.clear();
        }
        return jz5.f0.f302826a;
    }
}
