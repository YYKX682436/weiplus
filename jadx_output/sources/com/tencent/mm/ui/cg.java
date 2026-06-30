package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class cg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.dg f198096d;

    public cg(com.tencent.mm.ui.dg dgVar) {
        this.f198096d = dgVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.dg dgVar = this.f198096d;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dgVar.f208340h.f197027n;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = dgVar.f208340h.f197027n;
        if (baseChattingUIFragment2 != null) {
            baseChattingUIFragment2.onActivityResult(dgVar.f208337e & 65535, dgVar.f208338f, dgVar.f208339g);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|PostSelectImageJob_onActivityResult";
    }
}
