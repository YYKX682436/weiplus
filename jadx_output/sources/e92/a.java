package e92;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        return b(view, i17, false);
    }

    public final boolean b(android.view.View view, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(i17);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        return bool != null ? bool.booleanValue() : z17;
    }

    public final int c(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(i17);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final java.lang.CharSequence d(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(i17);
        java.lang.CharSequence charSequence = tag instanceof java.lang.CharSequence ? (java.lang.CharSequence) tag : null;
        return charSequence == null ? "" : charSequence;
    }
}
