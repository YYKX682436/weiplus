package dl4;

/* loaded from: classes11.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl4.j f235405d;

    public h(dl4.j jVar) {
        this.f235405d = jVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        int ordinal = n1Var.f71103a.ordinal();
        dl4.j jVar = this.f235405d;
        if (ordinal == 3) {
            dl4.g gVar = jVar.f235418a;
            if (gVar != null) {
                ((rk4.j3) gVar).a(n1Var.f71105c, "upload fail, ret:" + n1Var.f71105c + ", sceneResult:" + n1Var.f71108f);
            }
        } else if (ordinal != 4) {
            rk4.k5.c("upload action:" + n1Var.f71103a + ", ret:" + n1Var.f71105c, jVar.f235419b);
        } else {
            dn.h hVar = n1Var.f71108f;
            java.lang.String str = hVar != null ? hVar.field_fileUrl : null;
            if (str != null) {
                rk4.k5.e("upload success, ret:" + n1Var.f71105c + " url:" + str, jVar.f235419b);
                dl4.g gVar2 = jVar.f235418a;
                if (gVar2 != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((rk4.j3) gVar2).f396749a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.UploadLocalPhotoResult(0L, null, str, 2, null))));
                }
            } else {
                dl4.g gVar3 = jVar.f235418a;
                if (gVar3 != null) {
                    ((rk4.j3) gVar3).a(-1, "fileUrl is null");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
