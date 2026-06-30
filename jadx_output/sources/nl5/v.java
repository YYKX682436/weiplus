package nl5;

/* loaded from: classes14.dex */
public final class v implements android.view.inputmethod.InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f338382a;

    public v(android.view.inputmethod.InputConnection ic6) {
        kotlin.jvm.internal.o.g(ic6, "ic");
        this.f338382a = ic6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        return this.f338382a.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        return this.f338382a.clearMetaKeyStates(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f338382a.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        return this.f338382a.commitCompletion(completionInfo);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo p07, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(p07, "p0");
        return this.f338382a.commitContent(p07, i17, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        return this.f338382a.commitCorrection(correctionInfo);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        return this.f338382a.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        return this.f338382a.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i17, int i18) {
        return this.f338382a.deleteSurroundingTextInCodePoints(i17, i18);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return this.f338382a.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return this.f338382a.finishComposingText();
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i17) {
        return this.f338382a.getCursorCapsMode(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        return this.f338382a.getExtractedText(extractedTextRequest, i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return this.f338382a.getHandler();
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int i17) {
        return this.f338382a.getSelectedText(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i17, int i18) {
        try {
            return this.f338382a.getTextAfterCursor(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.d("SafeProxyInputConnection", th6, "getTextAfterCursor err", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i17, int i18) {
        try {
            return this.f338382a.getTextBeforeCursor(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.d("SafeProxyInputConnection", th6, "getTextBeforeCursor err", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        return this.f338382a.performContextMenuAction(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        return this.f338382a.performEditorAction(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        return this.f338382a.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z17) {
        return this.f338382a.reportFullscreenMode(z17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        return this.f338382a.requestCursorUpdates(i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f338382a.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i17, int i18) {
        return this.f338382a.setComposingRegion(i17, i18);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i17) {
        return this.f338382a.setComposingText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i17, int i18) {
        return this.f338382a.setSelection(i17, i18);
    }
}
