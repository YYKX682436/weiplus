package im4;

/* loaded from: classes15.dex */
public class a extends aa3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f292706a;

    public a(com.tencent.mm.plugin.ting.ui.TingPostLiteAppTransparentUI tingPostLiteAppTransparentUI, java.lang.ref.WeakReference weakReference) {
        this.f292706a = weakReference;
    }

    @Override // aa3.d
    public android.content.Context a() {
        return (android.content.Context) this.f292706a.get();
    }
}
