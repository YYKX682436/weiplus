package o12;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f342136i = {-1, -16777216, -372399, -15616, -16268960, -15683841, -10197008};

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText f342137a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f342138b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f342139c;

    /* renamed from: d, reason: collision with root package name */
    public int f342140d = kz5.z.K(f342136i);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f342141e;

    /* renamed from: f, reason: collision with root package name */
    public o12.y f342142f;

    /* renamed from: g, reason: collision with root package name */
    public o12.u f342143g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f342144h;

    public d0() {
        o12.x xVar = o12.x.f342194a;
        this.f342141e = kz5.c0.i(xVar, o12.w.f342193a, o12.v.f342192a);
        this.f342142f = xVar;
    }

    public final void a(o12.u uVar) {
        o12.y yVar;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoEmojiTextInputViewController", "active, decoration: " + uVar);
        this.f342143g = uVar;
        if (uVar == null || (yVar = uVar.f342184b) == null) {
            yVar = o12.x.f342194a;
        }
        this.f342142f = yVar;
        this.f342140d = uVar != null ? uVar.f342185c : this.f342140d;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText = this.f342137a;
        if (emojiEditorEditableText == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        if (uVar == null || (str = uVar.f342183a) == null) {
            str = "";
        }
        emojiEditorEditableText.setText(str);
        o12.y yVar2 = this.f342142f;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText2 = this.f342137a;
        if (emojiEditorEditableText2 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        yVar2.a(emojiEditorEditableText2, this.f342140d);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText3 = this.f342137a;
        if (emojiEditorEditableText3 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        emojiEditorEditableText3.requestFocus();
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText4 = this.f342137a;
        if (emojiEditorEditableText4 == null) {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
        java.lang.Object systemService = emojiEditorEditableText4.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText emojiEditorEditableText5 = this.f342137a;
        if (emojiEditorEditableText5 != null) {
            inputMethodManager.showSoftInput(emojiEditorEditableText5, 0);
        } else {
            kotlin.jvm.internal.o.o("editableText");
            throw null;
        }
    }

    public final void b() {
        android.widget.LinearLayout linearLayout = this.f342138b;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("colorSelector");
            throw null;
        }
        e06.k m17 = e06.p.m(0, linearLayout.getChildCount());
        android.widget.LinearLayout linearLayout2 = this.f342138b;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("colorSelector");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(linearLayout2.getChildAt(((kz5.x0) it).b()));
        }
        for (com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextColorView emojiEditorTextColorView : kz5.j0.I(arrayList, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextColorView.class)) {
            emojiEditorTextColorView.setSelected(this.f342140d == emojiEditorTextColorView.getColor());
        }
    }
}
