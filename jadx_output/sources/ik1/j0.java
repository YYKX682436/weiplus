package ik1;

/* loaded from: classes9.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.DisplayMetrics f291832a = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();

    public static int a(int i17) {
        android.util.DisplayMetrics displayMetrics = f291832a;
        return displayMetrics == null ? i17 : (int) (displayMetrics.density * i17);
    }
}
