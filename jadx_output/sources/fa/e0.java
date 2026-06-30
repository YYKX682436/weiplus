package fa;

/* loaded from: classes13.dex */
public abstract class e0 {
    public static android.graphics.PorterDuff.Mode a(int i17, android.graphics.PorterDuff.Mode mode) {
        if (i17 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i17 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i17 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i17) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
