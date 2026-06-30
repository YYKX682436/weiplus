package x51;

/* loaded from: classes12.dex */
public class y implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f452112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f452113b;

    public y(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f452112a = runnable;
        this.f452113b = runnable2;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr[0] == 0) {
            com.tencent.mm.platformtools.ExportFileUtil.a(this.f452112a);
        } else {
            com.tencent.mm.platformtools.ExportFileUtil.a(this.f452113b);
        }
    }
}
