package o12;

/* loaded from: classes10.dex */
public final class x extends o12.y {

    /* renamed from: a, reason: collision with root package name */
    public static final o12.x f342194a = new o12.x();

    public x() {
        super(null);
    }

    @Override // o12.y
    public void a(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText editText, int i17) {
        kotlin.jvm.internal.o.g(editText, "editText");
        editText.setTextBackground(0);
        editText.setTextColor(i17);
        float a17 = ym5.x.a(editText.getContext(), 4.0f);
        int i18 = -1;
        if (i17 != -16777216) {
            if (i17 != -1) {
                i18 = android.graphics.Color.argb(android.graphics.Color.alpha(i17), (int) (android.graphics.Color.red(i17) * 0.5f), (int) (android.graphics.Color.green(i17) * 0.5f), (int) (android.graphics.Color.blue(i17) * 0.5f));
            } else {
                i18 = -16777216;
            }
        }
        editText.f97477i = a17;
        editText.f97478m = i18;
    }

    @Override // o12.y
    public int b() {
        return com.tencent.mm.R.raw.icons_filled_text_style_stroke;
    }
}
