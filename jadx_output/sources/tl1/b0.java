package tl1;

/* loaded from: classes15.dex */
public abstract class b0 {
    public static void a(android.widget.NumberPicker numberPicker) {
        if (numberPicker == null) {
            return;
        }
        try {
            android.widget.EditText editText = (android.widget.EditText) new yo.b(numberPicker, "mInputText", null).a();
            if (editText != null) {
                editText.setEditableFactory(new tl1.a0());
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
