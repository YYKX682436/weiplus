package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199664g;

    public p1(com.tencent.mm.ui.chatting.component.q2 q2Var, int i17, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList) {
        this.f199664g = q2Var;
        this.f199661d = i17;
        this.f199662e = f9Var;
        this.f199663f = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f199661d == 1) {
            com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199664g;
            com.tencent.mm.storage.f9 f9Var = this.f199662e;
            int intValue = q2Var.f199744p.intValue();
            java.util.LinkedList linkedList = this.f199663f;
            q2Var.w0(f9Var, intValue, linkedList, 1, 1, 1, (java.lang.String) linkedList.get(0));
        }
    }
}
