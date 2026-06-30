package fl5;

/* loaded from: classes5.dex */
public interface i {
    void a(nl5.p pVar);

    void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    void addTextChangedListener(android.text.TextWatcher textWatcher);

    void append(java.lang.CharSequence charSequence);

    void b(java.lang.String str, java.lang.String str2, nl5.a0 a0Var, nl5.w wVar);

    void c(fl5.g gVar);

    void clearComposingText();

    void clearFocus();

    void d(boolean z17);

    void destroy();

    boolean e();

    void f();

    android.view.ViewParent g();

    java.lang.CharSequence getContentDescription();

    java.lang.CharSequence getHint();

    int getImeOptions();

    android.view.inputmethod.InputConnection getInputConnection();

    android.os.Bundle getInputExtras(boolean z17);

    int getInputType();

    android.text.Layout getLayout();

    int getLineCount();

    int getMeasuredHeight();

    int getMinimumHeight();

    android.text.TextPaint getPaint();

    java.lang.CharSequence getPasterContent();

    int getPasterLen();

    fl5.i getRealEditText();

    nl5.s0 getSelectHelper();

    int getSelectionStart();

    boolean getSimilarPasteChange();

    java.lang.String getSimilarPasteSeqStr();

    qa5.g getSizeAnimController();

    java.lang.Object getTag(int i17);

    android.text.Editable getText();

    float getTextSize();

    int getVisibility();

    void h();

    int i();

    android.view.View j();

    boolean k();

    android.view.View l();

    int length();

    void m(boolean z17);

    void n(java.lang.String str);

    void o();

    void onPause();

    android.content.Context p();

    void q();

    void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    void removeTextChangedListener(android.text.TextWatcher textWatcher);

    void setAlpha(float f17);

    void setBackListener(al5.n1 n1Var);

    void setBreakStrategy(int i17);

    void setContentDescription(java.lang.CharSequence charSequence);

    void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback);

    void setEnableSendBtn(boolean z17);

    void setFilters(android.text.InputFilter[] inputFilterArr);

    void setHint(java.lang.CharSequence charSequence);

    void setImeOptions(int i17);

    void setImeSendImageCallback(fl5.e eVar);

    void setInputListener(fl5.f fVar);

    void setInputType(int i17);

    void setKeyCodeEnterListener(al5.q1 q1Var);

    void setMaxHeight(int i17);

    void setMaxLines(int i17);

    void setMinHeight(int i17);

    void setOnClickListener(android.view.View.OnClickListener onClickListener);

    void setOnDragListener(android.view.View.OnDragListener onDragListener);

    void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener);

    void setOnKeyListener(android.view.View.OnKeyListener onKeyListener);

    void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener);

    void setOnMsgPasteListener(fl5.c cVar);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setPadding(int i17, int i18, int i19, int i27);

    void setPasterLen(int i17);

    void setSelection(int i17);

    void setSelectionChangedListener(fl5.h hVar);

    void setTag(int i17, java.lang.Object obj);

    void setText(java.lang.CharSequence charSequence);

    void setTextColor(int i17);

    void setTextCursorDrawable(android.graphics.drawable.Drawable drawable);

    void setTextSize(int i17, float f17);

    void setVisibility(int i17);
}
