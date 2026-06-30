package qy0;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qy0.d0 d0Var) {
        super(0);
        this.f367643d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams = (com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams) this.f367643d.getIntent().getParcelableExtra("request_params");
        return maasAlbumMultiTemplateRequestParams == null ? new com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams(kz5.p0.f313996d, false, false, false, null, 30, null) : maasAlbumMultiTemplateRequestParams;
    }
}
