package v12;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f432504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v12.i f432505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, v12.i iVar) {
        super(1);
        this.f432504d = i17;
        this.f432505e = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.FrameLayout holder = (android.widget.FrameLayout) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("view holder ready: for scene count ");
        int i17 = this.f432504d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", sb6.toString());
        v12.i iVar = this.f432505e;
        if (i17 == iVar.f432512i) {
            iVar.f432511h = holder;
            iVar.wi();
        }
        return jz5.f0.f302826a;
    }
}
