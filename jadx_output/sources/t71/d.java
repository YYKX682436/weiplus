package t71;

/* loaded from: classes15.dex */
public abstract class d {
    public static void a(com.tencent.mm.ui.widget.MMEditText mMEditText, int i17, java.nio.charset.Charset charset, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            charset = r26.c.f368865a;
        }
        kotlin.jvm.internal.o.g(mMEditText, "<this>");
        kotlin.jvm.internal.o.g(charset, "charset");
        android.text.InputFilter[] filters = mMEditText.getFilters();
        kotlin.jvm.internal.o.f(filters, "getFilters(...)");
        t71.c cVar = new t71.c(i17, charset);
        int length = filters.length;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(filters, length + 1);
        copyOf[length] = cVar;
        mMEditText.setFilters((android.text.InputFilter[]) copyOf);
    }
}
