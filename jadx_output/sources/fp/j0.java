package fp;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static int a(android.content.Context context, int i17) {
        try {
            android.content.res.Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
            return identifier != 0 ? resources.getDimensionPixelSize(identifier) : i17;
        } catch (android.content.res.Resources.NotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResourceCompat", e17, "get res of status_bar_height fail", new java.lang.Object[0]);
            return i17;
        }
    }
}
