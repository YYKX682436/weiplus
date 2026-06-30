package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class xe implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ye f200229b;

    public xe(com.tencent.mm.ui.chatting.component.ye yeVar, java.lang.String str) {
        this.f200229b = yeVar;
        this.f200228a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.ui.chatting.component.ye yeVar = this.f200229b;
        r35.a aVar = new r35.a(yeVar.f200313e.f198580d.g(), new com.tencent.mm.ui.chatting.component.we(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(3);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(yeVar.f200313e.f199687h, true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        aVar.m(str3);
        aVar.f369025z = true;
        aVar.a(yeVar.f200313e.f199687h, this.f200228a, linkedList);
    }
}
