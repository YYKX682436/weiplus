package nu0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.i f339946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nu0.i iVar) {
        super(0);
        this.f339946d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = (com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider) this.f339946d.getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        android.os.Bundle bundle = recordConfigProvider != null ? recordConfigProvider.M : null;
        return bundle != null ? zt0.a.a(bundle) : new java.util.LinkedHashMap();
    }
}
