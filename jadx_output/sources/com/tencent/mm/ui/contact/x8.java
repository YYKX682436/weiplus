package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class x8 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SayHiEditUI f207250d;

    public x8(com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI) {
        this.f207250d = sayHiEditUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && 66 != keyEvent.getAction()) {
            return false;
        }
        com.tencent.mm.ui.contact.SayHiEditUI.T6(this.f207250d);
        return true;
    }
}
