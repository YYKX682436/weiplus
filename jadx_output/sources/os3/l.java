package os3;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.m f348139d;

    public l(os3.m mVar) {
        this.f348139d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.m mVar = this.f348139d;
        dp.a.makeText(mVar.f348147d, com.tencent.mm.R.string.gpi, 0).show();
        mVar.f348147d.b7();
    }
}
