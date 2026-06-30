package j65;

/* loaded from: classes.dex */
public abstract class q {
    public static android.content.res.Resources a(android.content.Context context) {
        android.content.res.Resources resources = context != null ? context.getResources() : null;
        return resources instanceof j65.j ? resources : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    public static java.lang.String b(android.content.Context context, int i17) {
        return a(context).getString(i17);
    }
}
