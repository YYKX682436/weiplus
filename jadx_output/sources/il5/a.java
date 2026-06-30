package il5;

/* loaded from: classes15.dex */
public interface a {
    boolean canSelectArbitrarily();

    void initialize(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable);

    boolean onGenericMotionEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent);

    boolean onKeyDown(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent);

    boolean onKeyOther(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.KeyEvent keyEvent);

    boolean onKeyUp(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent);

    void onTakeFocus(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, int i17);

    boolean onTouchEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent);

    boolean onTrackballEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, android.text.Spannable spannable, android.view.MotionEvent motionEvent);
}
