package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class uc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202742d;

    public uc(java.util.List list) {
        this.f202742d = list;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f202742d.iterator();
        while (it.hasNext()) {
            g4Var.add((java.lang.String) it.next());
        }
    }
}
