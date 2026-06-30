package pc3;

/* loaded from: classes7.dex */
public final class b extends com.tencent.magicbrush.ui.MagicBrushView {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f353369t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, pc3.c cVar, com.tencent.magicbrush.MagicBrush magicBrush) {
        super(context, cVar);
        this.f353369t = magicBrush;
    }

    @Override // com.tencent.magicbrush.ui.MagicBrushView
    public void c(final yz5.a action) {
        kotlin.jvm.internal.o.g(action, "action");
        ch.g gVar = this.f353369t.f48583g;
        java.lang.Runnable runnable = new java.lang.Runnable(action) { // from class: pc3.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f353368d;

            {
                kotlin.jvm.internal.o.g(action, "function");
                this.f353368d = action;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f353368d.invoke();
            }
        };
        ch.a aVar = gVar.f41184d;
        if (aVar.g()) {
            runnable.run();
        } else {
            aVar.k(runnable, false);
        }
    }
}
