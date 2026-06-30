package com.tencent.mm.ui.widget;

/* loaded from: classes12.dex */
public class AutoMatchKeywordEditText extends com.tencent.mm.ui.widget.MMEditText {
    public al5.e G;
    public int H;
    public int I;

    public AutoMatchKeywordEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    @Override // android.widget.EditText
    public void extendSelection(int i17) {
        super.extendSelection(i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    public al5.e getOnSelectionChangeListener() {
        return this.G;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    @Override // android.widget.TextView
    public boolean moveCursorToVisibleOffset() {
        return super.moveCursorToVisibleOffset();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.H == selectionStart && this.I == selectionEnd) {
            return;
        }
        this.H = selectionStart;
        this.I = selectionEnd;
        al5.e eVar = this.G;
        if (eVar != null) {
            ((com.tencent.mm.ui.tools.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        return super.performAccessibilityAction(i17, bundle);
    }

    public void setOnSelectionChangeListener(al5.e eVar) {
        this.G = eVar;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, android.widget.EditText, fl5.i
    public void setSelection(int i17) {
        al5.e eVar;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
        if ((selectionStart == getSelectionStart() && selectionEnd == getSelectionEnd()) || (eVar = this.G) == null) {
            return;
        }
        ((com.tencent.mm.ui.tools.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
    }

    public AutoMatchKeywordEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, android.widget.EditText
    public void setSelection(int i17, int i18) {
        al5.e eVar;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i17, i18);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
        if ((selectionStart == getSelectionStart() && selectionEnd == getSelectionEnd()) || (eVar = this.G) == null) {
            return;
        }
        ((com.tencent.mm.ui.tools.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
    }
}
