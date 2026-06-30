package pk1;

/* loaded from: classes7.dex */
public final class c implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f355422a;

    public c(android.os.Handler handler) {
        this.f355422a = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, LuggageExoMediaPlayer");
        return new af1.i0(this.f355422a, com.tencent.mm.plugin.appbrand.utils.p.c(), com.tencent.mm.plugin.appbrand.utils.p.b(), com.tencent.mm.plugin.appbrand.utils.p.a());
    }
}
