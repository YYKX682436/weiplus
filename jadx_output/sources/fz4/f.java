package fz4;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f267303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f267304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f267306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267307h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.Object obj, kotlin.jvm.internal.f0 f0Var, java.util.ArrayList arrayList, int i17, yz5.l lVar) {
        super(1);
        this.f267303d = obj;
        this.f267304e = f0Var;
        this.f267305f = arrayList;
        this.f267306g = i17;
        this.f267307h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.Object obj2 = this.f267303d;
        kotlin.jvm.internal.f0 f0Var = this.f267304e;
        java.util.ArrayList arrayList = this.f267305f;
        int i17 = this.f267306g;
        yz5.l lVar = this.f267307h;
        synchronized (obj2) {
            f0Var.f310116d++;
            if (list != null) {
                arrayList.addAll(list);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync task complete, completedTasks: " + f0Var.f310116d + ", pendingTasks: " + i17);
            if (f0Var.f310116d >= i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync all tasks complete, total results: " + arrayList.size());
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                lVar.invoke(arrayList);
            }
        }
        return jz5.f0.f302826a;
    }
}
