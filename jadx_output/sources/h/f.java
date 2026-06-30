package h;

/* loaded from: classes10.dex */
public final class f extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        android.content.Intent input = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(input, "input");
        return input;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i17, intent);
    }
}
