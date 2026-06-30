package fz0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Intent intent) {
        super(0);
        this.f267285d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams) this.f267285d.getParcelableExtra("request_params");
    }
}
