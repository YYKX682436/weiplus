package qk1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView
    public ye1.e b() {
        pk1.f fVar = pk1.q.O;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pk1.q b17 = pk1.f.b(fVar, context, null, false, null, 14, null);
        return b17 != null ? b17 : new ye1.e0();
    }
}
