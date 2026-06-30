package cy1;

/* loaded from: classes13.dex */
public final /* synthetic */ class a$$e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy1.d f224711e;

    public /* synthetic */ a$$e(java.lang.String str, gy1.d dVar) {
        this.f224710d = str;
        this.f224711e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f224711e.a(cy1.a.Ui().f224690m != null ? com.tencent.mm.sdk.platformtools.o4.M("FINDER_LATEST_ENTER_METHOD").getString(this.f224710d, "") : "");
    }
}
