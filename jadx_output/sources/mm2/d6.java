package mm2;

/* loaded from: classes3.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.f6 f328960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(mm2.f6 f6Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328960e = f6Var;
        this.f328961f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.d6(this.f328960e, this.f328961f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.d6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protobuf.g byteString;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328959d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            mm2.f6 f6Var = this.f328960e;
            long j17 = ((mm2.e1) f6Var.business(mm2.e1.class)).f328983m;
            long j18 = ((mm2.e1) f6Var.business(mm2.e1.class)).f328988r.getLong(0);
            int i18 = this.f328961f;
            java.lang.String str = ((mm2.c1) f6Var.business(mm2.c1.class)).f328852o;
            this.f328959d = 1;
            ((b92.d1) zbVar).getClass();
            obj = st2.g3.f412326a.q(j17, j18, i18, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.nd2 nd2Var = (r45.nd2) obj;
        r45.cp1 cp1Var = new r45.cp1();
        byte[] g17 = (nd2Var == null || (byteString = nd2Var.getByteString(1)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                cp1Var.parseFrom(g17);
                return cp1Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
