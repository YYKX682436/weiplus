package jz0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.k f302577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f302578e;

    public g(jz0.k kVar, boolean z17) {
        this.f302577d = kVar;
        this.f302578e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz0.k kVar = this.f302577d;
        if (kVar.f302592p) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_update_preview_video_del", this.f302578e);
            kVar.getActivity().setResult(-1, intent);
        }
        kVar.getActivity().finish();
        kVar.getActivity().overridePendingTransition(0, 0);
    }
}
