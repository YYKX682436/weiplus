package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class p2 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199668g;

    public p2(com.tencent.mm.ui.chatting.component.q2 q2Var, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f199668g = q2Var;
        this.f199665d = f9Var;
        this.f199666e = linkedList;
        this.f199667f = linkedList2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f199668g.w0(this.f199665d, 2, this.f199666e, this.f199667f.size(), 0, 1, "");
    }
}
