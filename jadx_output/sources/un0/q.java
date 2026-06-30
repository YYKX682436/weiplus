package un0;

/* loaded from: classes3.dex */
public final class q implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f429409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f429410b;

    public q(boolean z17, v65.n nVar) {
        this.f429409a = z17;
        this.f429410b = nVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#requestPermission onResult resultCode=" + i17);
        un0.h hVar = new un0.h(false, null, 0, false, null, 0L, null, 0, 0, null, null, null, null, null, 16383, null);
        boolean z17 = i17 == -1;
        hVar.f429352a = z17;
        hVar.f429355d = this.f429409a;
        if (z17 && intent != null) {
            hVar.f429353b = intent;
        }
        hVar.f429354c = i17;
        this.f429410b.a(hVar);
    }
}
