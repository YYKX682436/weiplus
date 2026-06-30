package r10;

/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f368576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368577e;

    public h(java.lang.Class cls, yz5.l lVar) {
        this.f368576d = cls;
        this.f368577e = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = (android.os.Parcelable) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "invokeAsync callback, task: ".concat(this.f368576d.getSimpleName()));
        if (parcelable != null) {
            this.f368577e.invoke(parcelable);
        }
    }
}
