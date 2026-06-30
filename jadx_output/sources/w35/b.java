package w35;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.g2 f442723a;

    /* renamed from: b, reason: collision with root package name */
    public final w35.a f442724b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442725c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442726d;

    public b(com.tencent.mm.pluginsdk.model.g2 params, w35.a aVar) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f442723a = params;
        this.f442724b = aVar;
        this.f442725c = params.f189308a;
        this.f442726d = params.f189309b;
    }

    public abstract void a();

    public abstract void b(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w wVar);
}
