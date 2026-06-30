package tm3;

/* loaded from: classes8.dex */
public abstract class a {
    public static final com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        if (context instanceof android.content.MutableContextWrapper) {
            context = ((android.content.MutableContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.o.f(context, "getBaseContext(...)");
        }
        if (context instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
            return (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) context;
        }
        return null;
    }
}
