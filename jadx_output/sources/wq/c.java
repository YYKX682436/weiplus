package wq;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f448472a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f448473b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448474c;

    /* renamed from: d, reason: collision with root package name */
    public int f448475d;

    public c(int i17) {
        this.f448472a = i17;
        this.f448473b = new int[i17];
    }

    public final int a(int i17) {
        if (this.f448472a <= 0) {
            return -1;
        }
        boolean z17 = this.f448474c;
        if (!z17 && i17 > this.f448475d) {
            return -1;
        }
        if (z17) {
            i17 %= this.f448475d;
        }
        int[] iArr = this.f448473b;
        int i18 = 0;
        int i19 = iArr[0];
        while (i19 < i17) {
            i18++;
            i19 += iArr[i18];
        }
        return i18;
    }

    public final void b(int i17, int i18) {
        boolean z17 = true;
        if (!(i17 >= 0 && i17 < this.f448472a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FramePicker", "setFrameTime: invalid index " + i17);
        }
        int i19 = this.f448475d;
        int[] iArr = this.f448473b;
        int i27 = i19 - iArr[i17];
        iArr[i17] = i18;
        this.f448475d = i27 + i18;
        int length = iArr.length;
        int i28 = 0;
        while (true) {
            if (i28 >= length) {
                break;
            }
            if (!(iArr[i28] > 0)) {
                z17 = false;
                break;
            }
            i28++;
        }
        this.f448474c = z17;
    }
}
