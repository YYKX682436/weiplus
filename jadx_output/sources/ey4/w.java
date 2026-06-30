package ey4;

/* loaded from: classes8.dex */
public class w extends ey4.v {

    /* renamed from: d, reason: collision with root package name */
    public static final int f257633d = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);

    /* renamed from: e, reason: collision with root package name */
    public static final int f257634e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 43);

    public w() {
        super(0);
    }

    public int a() {
        ey4.c0 c0Var = this.f257631b;
        if (c0Var.f257614f) {
            return 7;
        }
        if (c0Var.f257613e <= 1) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
            c0Var.f257613e = new int[]{defaultDisplay.getWidth(), defaultDisplay.getHeight()}[0];
        }
        return c0Var.f257613e / f257634e;
    }

    public int b() {
        int i17 = this.f257631b.f257612d / f257633d;
        if (i17 > 3) {
            i17 = 3;
        }
        if (i17 < 1) {
            return 1;
        }
        return i17;
    }
}
