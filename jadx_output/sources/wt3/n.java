package wt3;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f449446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f449447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f449449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f449450i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wt3.q qVar, android.graphics.Bitmap bitmap, int i17, int i18, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449446e = qVar;
        this.f449447f = bitmap;
        this.f449448g = i17;
        this.f449449h = i18;
        this.f449450i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.n(this.f449446e, this.f449447f, this.f449448g, this.f449449h, this.f449450i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError.MaasEC maasEC;
        android.graphics.Bitmap bitmap = this.f449447f;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449445d;
        wt3.q qVar = this.f449446e;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "feedVideoFrame " + java.lang.Thread.currentThread().getName());
            this.f449445d = 1;
            obj = qVar.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame but init is error");
            return f0Var;
        }
        kotlinx.coroutines.r2 r2Var = qVar.f449476e;
        if (!(r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) && qVar.f449472a != null) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame but is release");
            return f0Var;
        }
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            int length = array.length / 4;
            int i18 = length * 3;
            byte[] bArr = new byte[i18];
            kz5.x0 it = e06.p.m(0, length).iterator();
            while (((e06.j) it).f246214f) {
                int b17 = it.b();
                int i19 = b17 * 3;
                int i27 = b17 * 4;
                bArr[i19] = array[i27];
                bArr[i19 + 1] = array[i27 + 1];
                bArr[i19 + 2] = array[i27 + 2];
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
            allocateDirect.put(bArr);
            com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier = qVar.f449472a;
            java.lang.Integer num = null;
            com.tencent.maas.instamovie.base.MJError c17 = mJVideoClassifier != null ? mJVideoClassifier.c(allocateDirect, this.f449448g, this.f449449h, com.tencent.maas.model.time.MJTime.fromMilliseconds(this.f449450i)) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("feedVideoFrame >> ");
            if (c17 != null && (maasEC = c17.f48175ec) != null) {
                num = new java.lang.Integer(maasEC.getErrorCode());
            }
            sb6.append(num);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "feedVideoFrame error " + e17.getMessage());
        }
        return f0Var;
    }
}
