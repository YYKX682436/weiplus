package pm1;

/* loaded from: classes14.dex */
public final class q extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.s f356837d;

    public q(pm1.s sVar) {
        this.f356837d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.s sVar = this.f356837d;
        sVar.f356839a = java.lang.Integer.valueOf(sVar.f356840b.getMode());
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("AudioMiscCache", "async update mode=" + sVar.f356839a);
    }
}
