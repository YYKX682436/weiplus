package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class v implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.InputPreference f197854d;

    public v(com.tencent.mm.ui.base.preference.InputPreference inputPreference) {
        this.f197854d = inputPreference;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        this.f197854d.getClass();
        return false;
    }
}
