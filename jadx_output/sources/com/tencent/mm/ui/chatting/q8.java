package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class q8 implements m3.i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f202617a = false;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.db f202618b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUI f202619c;

    public q8(com.tencent.mm.ui.chatting.ChattingUI chattingUI) {
        this.f202619c = chattingUI;
    }

    @Override // m3.i
    public java.lang.Object get() {
        if (!this.f202617a) {
            int i17 = com.tencent.mm.ui.chatting.ChattingUI.f198253t;
            for (com.tencent.mm.ui.component.UIComponent uIComponent : this.f202619c.activeUIComponents(true)) {
                if (uIComponent instanceof com.tencent.mm.ui.chatting.db) {
                    this.f202618b = (com.tencent.mm.ui.chatting.db) uIComponent;
                }
            }
        }
        this.f202617a = true;
        return this.f202618b;
    }
}
