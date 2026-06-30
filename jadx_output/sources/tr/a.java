package tr;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.search.data.SimilarEmojiQueryModel f421275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f421276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f421277g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel, android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421275e = similarEmojiQueryModel;
        this.f421276f = bundle;
        this.f421277g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr.a(this.f421275e, this.f421276f, this.f421277g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.os.Bundle bundle = this.f421276f;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421274d;
        com.tencent.mm.ipcinvoker.r rVar = this.f421277g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = this.f421275e;
                this.f421274d = 1;
                r45.gl5 gl5Var = new r45.gl5();
                gl5Var.f375333d = similarEmojiQueryModel.f193149d;
                gl5Var.f375334e = similarEmojiQueryModel.f193151f;
                gl5Var.f375335f = java.lang.String.valueOf(similarEmojiQueryModel.f193152g);
                gl5Var.f375336g = similarEmojiQueryModel.f193155m;
                gl5Var.f375338i = similarEmojiQueryModel.f193153h;
                obj = rm0.h.a(new gr.c(gl5Var), 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            bundle.putByteArray("resp", ((r45.hl5) obj).toByteArray());
            if (rVar != null) {
                rVar.a(bundle);
            }
        } catch (rm0.j unused) {
            if (rVar != null) {
                rVar.a(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
