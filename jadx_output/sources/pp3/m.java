package pp3;

/* loaded from: classes5.dex */
public final class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f357490d;

    public m(pp3.u uVar) {
        this.f357490d = uVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        android.text.TextPaint paint;
        pp3.u uVar = this.f357490d;
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = uVar.f357504n;
        if (mMClearEditText != null) {
            mMClearEditText.removeTextChangedListener(uVar.f357506p);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText2 = uVar.f357504n;
        h12.m mVar = new h12.m(valueOf, (mMClearEditText2 == null || (paint = mMClearEditText2.getPaint()) == null) ? 0 : (int) paint.getTextSize());
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        com.tencent.mars.xlog.Log.i(uVar.f357500g, "afterTextChanged inputCount:" + a17);
        java.lang.String valueOf2 = java.lang.String.valueOf(editable);
        int i17 = uVar.f357501h;
        if (a17 > i17) {
            valueOf2 = mVar.b(i17, t4Var);
            android.widget.TextView textView = uVar.f357505o;
            if (textView != null) {
                textView.setText(uVar.f357499f.getString(com.tencent.mm.R.string.hg7, java.lang.Integer.valueOf(uVar.f357501h / 2)));
            }
            android.widget.TextView textView2 = uVar.f357505o;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(uVar.f357499f, com.tencent.mm.R.color.f479482a31));
            }
            android.widget.TextView textView3 = uVar.f357505o;
            if (textView3 != null) {
                textView3.performHapticFeedback(3, 2);
            }
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText3 = uVar.f357504n;
            if (mMClearEditText3 != null) {
                mMClearEditText3.setText(pg5.d.a(uVar.f357499f, valueOf2));
            }
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText4 = uVar.f357504n;
            if (mMClearEditText4 != null) {
                mMClearEditText4.setSelection((mMClearEditText4 == null || (text = mMClearEditText4.getText()) == null) ? 0 : text.length());
            }
            if (uVar.f357508r.e()) {
                uVar.f357508r.c(3000L, 3000L);
            }
        } else if (a17 < i17) {
            uVar.f357508r.d();
            valueOf2 = java.lang.String.valueOf(editable);
            android.widget.TextView textView4 = uVar.f357505o;
            if (textView4 != null) {
                textView4.setText(uVar.f357499f.getString(com.tencent.mm.R.string.hg8));
            }
            android.widget.TextView textView5 = uVar.f357505o;
            if (textView5 != null) {
                textView5.setTextColor(i65.a.d(uVar.f357499f, com.tencent.mm.R.color.f478873jj));
            }
        }
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText5 = uVar.f357504n;
        if (mMClearEditText5 != null) {
            mMClearEditText5.addTextChangedListener(uVar.f357506p);
        }
        android.view.View findViewById = uVar.findViewById(com.tencent.mm.R.id.khs);
        if (findViewById != null) {
            findViewById.setEnabled(!kotlin.jvm.internal.o.b(valueOf2, uVar.f357503m));
        }
        if (a17 > 0) {
            com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = uVar.f357502i;
            if (emojiPanelInputComponent != null) {
                emojiPanelInputComponent.setSmileySendButtonEnable(true);
                return;
            }
            return;
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent2 = uVar.f357502i;
        if (emojiPanelInputComponent2 != null) {
            emojiPanelInputComponent2.setSmileySendButtonEnable(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
