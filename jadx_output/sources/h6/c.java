package h6;

/* loaded from: classes5.dex */
public abstract class c {
    public static final android.graphics.drawable.Drawable a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "<this>");
        android.graphics.drawable.Drawable a17 = k.a.a(context, i17);
        if (a17 != null) {
            return a17;
        }
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Invalid resource ID: ", java.lang.Integer.valueOf(i17)).toString());
    }
}
