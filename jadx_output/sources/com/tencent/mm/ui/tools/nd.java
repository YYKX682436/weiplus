package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class nd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.TestTimeForChatting f210609d;

    public nd(com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting) {
        this.f210609d = testTimeForChatting;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.od odVar = this.f210609d.f210262e;
        if (odVar != null) {
            odVar.a();
        }
    }
}
