package mz0;

/* loaded from: classes4.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.l2 f332951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(mz0.l2 l2Var) {
        super(0);
        this.f332951d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams) this.f332951d.getIntent().getParcelableExtra("request_params");
        if (maasAlbumTemplateRequestParams != null) {
            return maasAlbumTemplateRequestParams.f69774e;
        }
        return null;
    }
}
