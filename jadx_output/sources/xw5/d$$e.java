package xw5;

/* loaded from: classes8.dex */
public final /* synthetic */ class d$$e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw5.d f457763d;

    public /* synthetic */ d$$e(xw5.d dVar) {
        this.f457763d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xw5.d this$0 = this.f457763d;
        kotlin.jvm.internal.o.g(this$0, "this$0");
        if (this$0.f457755j && this$0.f457754i) {
            java.util.Iterator it = this$0.f457752g.iterator();
            while (it.hasNext()) {
                this$0.c((java.lang.String) it.next());
            }
        }
    }
}
