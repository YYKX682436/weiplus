package gl5;

/* loaded from: classes15.dex */
public class j extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.cedit.edit.CustomTextView f273019a;

    /* renamed from: b, reason: collision with root package name */
    public int f273020b;

    public j(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        super(customTextView, true);
        this.f273019a = customTextView;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        synchronized (this) {
            if (this.f273020b < 0) {
                return false;
            }
            this.f273019a.u();
            this.f273020b++;
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        android.text.Editable editable = getEditable();
        if (editable == null) {
            return false;
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        android.text.method.KeyListener keyListener = customTextView.getKeyListener();
        if (keyListener == null) {
            return true;
        }
        try {
            keyListener.clearMetaKeyState(customTextView, editable, i17);
            return true;
        } catch (java.lang.AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        synchronized (this) {
            while (this.f273020b > 0) {
                endBatchEdit();
            }
            this.f273020b = -1;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        java.util.Objects.toString(completionInfo);
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        customTextView.u();
        customTextView.getClass();
        customTextView.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        java.util.Objects.toString(correctionInfo);
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        customTextView.u();
        gl5.e0 e0Var = customTextView.f211589g2;
        if (e0Var != null) {
            gl5.o oVar = e0Var.f272951i;
            if (oVar == null) {
                e0Var.f272951i = new gl5.o(e0Var);
            } else {
                oVar.a(false);
            }
            gl5.o oVar2 = e0Var.f272951i;
            oVar2.getClass();
            int offset = correctionInfo.getOffset();
            oVar2.f273050c = offset;
            oVar2.f273051d = offset + correctionInfo.getNewText().length();
            oVar2.f273052e = android.os.SystemClock.uptimeMillis();
            if (oVar2.f273050c < 0 || oVar2.f273051d < 0) {
                oVar2.f273054g.f272951i = null;
            }
        }
        customTextView.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        if (this.f273019a == null) {
            return super.commitText(charSequence, i17);
        }
        try {
            return super.commitText(charSequence, i17);
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("cmEdit.EditableInputConnection", "commitText err:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            fl5.b.a(6);
            return false;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        synchronized (this) {
            if (this.f273020b <= 0) {
                return false;
            }
            this.f273019a.G();
            this.f273020b--;
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        if (customTextView != null) {
            return customTextView.getEditableText();
        }
        return null;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        if (customTextView == null) {
            return null;
        }
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        customTextView.D();
        if (!customTextView.f211589g2.f(extractedTextRequest, -1, -1, -1, extractedText)) {
            return null;
        }
        if ((i17 & 1) != 0) {
            customTextView.setExtracting(extractedTextRequest);
        }
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f273019a;
        customTextView.u();
        customTextView.c0(i17);
        customTextView.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        this.f273019a.Z(i17);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        this.f273019a.a0(str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        if ((i17 & (-4)) != 0) {
            return false;
        }
        return false;
    }
}
