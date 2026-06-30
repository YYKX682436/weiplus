package ol1;

/* loaded from: classes15.dex */
public class q implements ol1.p {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f346136d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public int f346137e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f346138f = -1;

    public final int[] a() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int[] iArr = this.f346136d;
        iArr[0] = width;
        iArr[1] = defaultDisplay.getHeight();
        return iArr;
    }

    @Override // ol1.p
    public void setForceHeight(int i17) {
        this.f346137e = i17;
    }
}
