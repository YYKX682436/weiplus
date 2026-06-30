package vl5;

/* loaded from: classes13.dex */
public class d extends vl5.c implements android.widget.Checkable {
    @Override // android.widget.Checkable
    public boolean isChecked() {
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof android.widget.Checkable) {
            return ((android.widget.Checkable) childAt).isChecked();
        }
        return false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z17) {
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof android.widget.Checkable) {
            ((android.widget.Checkable) childAt).setChecked(z17);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof android.widget.Checkable) {
            ((android.widget.Checkable) childAt).toggle();
        }
    }
}
