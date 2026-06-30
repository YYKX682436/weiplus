package hc1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f280286a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public int f280287b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f280288c = -1;

    public final int[] a() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int[] iArr = this.f280286a;
        iArr[0] = width;
        iArr[1] = defaultDisplay.getHeight();
        return iArr;
    }
}
