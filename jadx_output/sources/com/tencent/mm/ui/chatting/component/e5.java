package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class e5 implements java.util.Comparator {
    public e5(com.tencent.mm.ui.chatting.component.f5 f5Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return (int) (((com.tencent.mm.plugin.msg.MsgIdTalker) obj2).f149480d - ((com.tencent.mm.plugin.msg.MsgIdTalker) obj).f149480d);
    }
}
