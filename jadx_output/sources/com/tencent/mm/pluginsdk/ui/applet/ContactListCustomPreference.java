package com.tencent.mm.pluginsdk.ui.applet;

/* loaded from: classes3.dex */
public class ContactListCustomPreference extends com.tencent.mm.ui.base.preference.Preference {
    public int L;
    public final android.view.View.OnTouchListener M;

    public ContactListCustomPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
        this.M = new r35.c2(this);
        this.G = com.tencent.mm.R.layout.bz6;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        int i17 = this.L;
        if (i17 >= 0) {
            view.setBackgroundResource(i17);
        }
    }

    public ContactListCustomPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        this.M = new r35.c2(this);
        this.G = com.tencent.mm.R.layout.bz6;
    }
}
