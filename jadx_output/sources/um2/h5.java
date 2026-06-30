package um2;

/* loaded from: classes3.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428822d;

    public h5(um2.x5 x5Var) {
        this.f428822d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f428822d.f429086x;
        if (etVar != null) {
            etVar.C1();
        }
    }
}
