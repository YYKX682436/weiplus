package sp2;

/* loaded from: classes3.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f411196d;

    public r2(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f411196d = mMActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f411196d.runOnUiThread(sp2.q2.f411189d);
    }
}
