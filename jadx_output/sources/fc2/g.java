package fc2;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260944a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fc2.o oVar, android.os.Looper looper) {
        super(looper);
        this.f260944a = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        fc2.o oVar = this.f260944a;
        fc2.o.b(oVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage ");
        sb6.append(message != null ? java.lang.Integer.valueOf(message.what) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", sb6.toString());
        if (message != null) {
            int i17 = message.what;
            if (i17 != 0) {
                if (i17 == 1 && (recyclerView = oVar.f260968m) != null) {
                    oVar.g(recyclerView, 9);
                    return;
                }
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = oVar.f260968m;
            if (recyclerView2 != null) {
                oVar.g(recyclerView2, 5);
            }
        }
    }
}
