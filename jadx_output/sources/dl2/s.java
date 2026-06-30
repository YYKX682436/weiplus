package dl2;

/* loaded from: classes3.dex */
public final class s implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public static final dl2.s f235260a = new dl2.s();

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.MMEditText mmEditText = (com.tencent.mm.ui.widget.MMEditText) obj;
        android.text.TextWatcher textWatcher = (android.text.TextWatcher) obj2;
        kotlin.jvm.internal.o.g(mmEditText, "mmEditText");
        kotlin.jvm.internal.o.g(textWatcher, "textWatcher");
        mmEditText.removeTextChangedListener(textWatcher);
    }
}
