package e33;

/* loaded from: classes10.dex */
public class a4 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f247119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247121c;

    public a4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, java.util.ArrayList arrayList, java.lang.String str) {
        this.f247121c = imagePreviewUI;
        this.f247119a = arrayList;
        this.f247120b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return j33.d0.d(this.f247120b, null, -1);
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).B(new e33.z3(this, str));
        t23.p0.h().h(this);
    }

    public java.lang.String toString() {
        return "fileKey:" + this.f247120b + " this: " + super.toString();
    }
}
