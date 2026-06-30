package o12;

/* loaded from: classes10.dex */
public final class w extends o12.y {

    /* renamed from: a, reason: collision with root package name */
    public static final o12.w f342193a = new o12.w();

    public w() {
        super(null);
    }

    @Override // o12.y
    public void a(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText editText, int i17) {
        kotlin.jvm.internal.o.g(editText, "editText");
        editText.setTextBackground(0);
        editText.setTextColor(i17);
        editText.f97477i = 0.0f;
        editText.f97478m = 0;
    }

    @Override // o12.y
    public int b() {
        return com.tencent.mm.R.raw.icons_filled_text_style_fill;
    }
}
