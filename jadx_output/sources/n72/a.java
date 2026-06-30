package n72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.b f335250d;

    public a(n72.b bVar) {
        this.f335250d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.MMTextureView mMTextureView = this.f335250d.f335252e.f335272d;
        if (mMTextureView != null) {
            mMTextureView.setAlpha(1.0f);
        }
    }
}
