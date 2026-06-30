package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/SignatureEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/text/Editable;", "getOriginText", "getText", "", "G", "Z", "getAllowEmptyLine", "()Z", "setAllowEmptyLine", "(Z)V", "allowEmptyLine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SignatureEditText extends com.tencent.mm.ui.widget.MMEditText {

    /* renamed from: G, reason: from kotlin metadata */
    public boolean allowEmptyLine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        addTextChangedListener(new com.tencent.mm.plugin.finder.view.cs(this));
        setOnEditorActionListener(new com.tencent.mm.plugin.finder.view.ds(this));
        this.f212086q.add(new com.tencent.mm.plugin.finder.view.es(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.text.Editable getOriginText() {
        android.text.Editable text = super.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        return text;
    }

    public final boolean getAllowEmptyLine() {
        return this.allowEmptyLine;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    public final void setAllowEmptyLine(boolean z17) {
        this.allowEmptyLine = z17;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        android.text.Editable text = super.getText();
        if (!this.allowEmptyLine) {
            kotlin.jvm.internal.o.d(text);
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(?m)^[ \t]*\r?\n");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.f(compile.matcher(text).replaceAll(""), "replaceAll(...)");
        }
        kotlin.jvm.internal.o.d(text);
        return text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        addTextChangedListener(new com.tencent.mm.plugin.finder.view.cs(this));
        setOnEditorActionListener(new com.tencent.mm.plugin.finder.view.ds(this));
        this.f212086q.add(new com.tencent.mm.plugin.finder.view.es(this));
    }
}
