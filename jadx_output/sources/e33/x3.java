package e33;

/* loaded from: classes10.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f247542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f247543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f247544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247545g;

    public x3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, android.content.Intent intent, boolean z17, boolean z18) {
        this.f247545g = imagePreviewUI;
        this.f247542d = intent;
        this.f247543e = z17;
        this.f247544f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
        this.f247545g.V6(this.f247542d, this.f247543e, this.f247544f);
    }

    public java.lang.String toString() {
        return super.toString() + "|addTextOptionMenu";
    }
}
