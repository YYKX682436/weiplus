package f7;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f260023a = true;

    public static android.graphics.drawable.Drawable a(android.content.Context context, android.content.Context context2, int i17, android.content.res.Resources.Theme theme) {
        try {
            if (f260023a) {
                return k.a.a(theme != null ? new n.d(context2, theme) : context2, i17);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
        } catch (java.lang.IllegalStateException e17) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e17;
            }
            return b3.l.getDrawable(context2, i17);
        } catch (java.lang.NoClassDefFoundError unused2) {
            f260023a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        android.content.res.Resources resources = context2.getResources();
        java.lang.ThreadLocal threadLocal = d3.q.f226108a;
        return d3.l.a(resources, i17, theme);
    }
}
