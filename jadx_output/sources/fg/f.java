package fg;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.widget.input.e4 {
    public pl1.f A;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f261757v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tenpay.miniapp.MiniAppSecureEditText f261758w;

    /* renamed from: x, reason: collision with root package name */
    public fg.c f261759x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f261760y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f261761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, android.view.inputmethod.InputConnection sameLayerInputConnection) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sameLayerInputConnection, "sameLayerInputConnection");
        this.f261757v = sameLayerInputConnection;
        com.tenpay.miniapp.MiniAppSecureEditText miniAppSecureEditText = new com.tenpay.miniapp.MiniAppSecureEditText(context);
        this.f261758w = miniAppSecureEditText;
        setImeOptions(1);
        new com.tencent.mm.plugin.appbrand.widget.input.i6(this);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                miniAppSecureEditText.setSelection(selectionStart, selectionEnd);
            } catch (java.lang.Exception unused) {
            }
        }
        miniAppSecureEditText.setOnPasswdInputListener(new fg.a(this));
        miniAppSecureEditText.addTextChangedListener(new fg.b());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void b(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.view.KeyEvent keyEvent = w(event) ? new android.view.KeyEvent(event.getAction(), 155) : event;
        event.toString();
        keyEvent.toString();
        if (w(event) && event.getAction() == 0) {
            android.text.Editable text = getText();
            if ((text != null ? text.length() : 0) >= getMaxEms()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DelegateEditText", "over max ems, return");
                return false;
            }
        }
        super.dispatchKeyEvent(keyEvent);
        com.tenpay.miniapp.MiniAppSecureEditText miniAppSecureEditText = this.f261758w;
        miniAppSecureEditText.requestFocus();
        boolean dispatchKeyEvent = miniAppSecureEditText.dispatchKeyEvent(event);
        miniAppSecureEditText.clearFocus();
        android.view.inputmethod.InputConnection inputConnection = this.f261757v;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        }
        return dispatchKeyEvent;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.t4
    public boolean e() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public boolean f() {
        return false;
    }

    public final fg.c getListener() {
        return this.f261759x;
    }

    public final android.text.Editable getRealText$luggage_xweb_ext_release() {
        return this.f261758w.getText();
    }

    public final com.tenpay.miniapp.MiniAppSecureEditText getSecureInputWidgetLogic$luggage_xweb_ext_release() {
        return this.f261758w;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void h(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void i(java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.e("MicroMsg.DelegateEditText", "appendText, text: " + ((java.lang.Object) charSequence));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void m() {
        dispatchKeyEvent(new android.view.KeyEvent(0, 67));
        dispatchKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void o() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 inputPanel;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this) || (inputPanel = getInputPanel()) == null) {
            return;
        }
        inputPanel.setInputWidget(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if (contextMenu != null) {
            contextMenu.clearHeader();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DelegateEditText", "onSelectionChanged, selStart: " + i17 + ", selEnd: " + i18);
        android.text.Editable text = getText();
        int length = text != null ? text.length() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelegateEditText", "onSelectionChangedDisable, sel: " + length);
        if (i17 != length || i18 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i17, i18);
            post(new fg.d(this, i17, i18));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void setInputId(int i17) {
        super.setInputId(i17);
    }

    public final void setListener(fg.c cVar) {
        this.f261759x = cVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.EditText, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String str;
        if (charSequence != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length = charSequence.length();
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = charSequence.charAt(i17);
                if (java.lang.Character.isLetterOrDigit(charAt)) {
                    charAt = '*';
                }
                sb6.append(charAt);
            }
            str = sb6.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = (java.lang.String) charSequence;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DelegateEditText", "setText, text: " + ((java.lang.Object) charSequence) + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f261758w.setText(charSequence, bufferType);
        } catch (java.lang.NullPointerException unused) {
        }
        android.view.inputmethod.InputConnection inputConnection = this.f261757v;
        if (inputConnection != null) {
            inputConnection.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
            inputConnection.commitText(str, 1);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void v(char c17) {
        if (java.lang.Character.isLetterOrDigit(c17)) {
            c17 = '*';
        }
        this.f91421u = c17;
    }

    public final boolean w(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (7 <= keyCode && keyCode < 17) {
            return true;
        }
        int keyCode2 = keyEvent.getKeyCode();
        return 29 <= keyCode2 && keyCode2 < 55;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public com.tencent.mm.plugin.appbrand.widget.input.f3 getInputPanel() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 a17 = com.tencent.mm.plugin.appbrand.widget.input.f3.f91442n.a(this);
        java.util.Objects.toString(a17);
        return a17;
    }
}
