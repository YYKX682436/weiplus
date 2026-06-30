package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class lk implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public int f204486d;

    /* renamed from: e, reason: collision with root package name */
    public int f204487e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f204488f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f204489g;

    /* renamed from: h, reason: collision with root package name */
    public int f204490h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f204491i;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.lk lkVar = (com.tencent.mm.ui.chatting.viewitems.lk) obj;
        if (lkVar != null) {
            return this.f204486d - lkVar.f204486d;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LineNode", "compareTo fail, should not be null");
        return 1;
    }
}
