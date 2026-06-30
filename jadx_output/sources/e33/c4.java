package e33;

/* loaded from: classes10.dex */
public class c4 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f247189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247191c;

    public c4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, android.content.Intent intent, java.lang.String str) {
        this.f247191c = imagePreviewUI;
        this.f247189a = intent;
        this.f247190b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return j33.d0.d(this.f247190b, null, -1);
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        new com.tencent.mm.sdk.platformtools.n3(this.f247191c.getMainLooper()).post(new e33.b4(this, str));
        t23.p0.h().h(this);
    }

    public java.lang.String toString() {
        return "fileKey:" + this.f247190b + " this: " + super.toString();
    }
}
