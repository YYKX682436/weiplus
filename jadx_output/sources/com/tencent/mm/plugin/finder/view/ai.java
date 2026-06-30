package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ai implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f131649a;

    public ai(com.tencent.mm.plugin.finder.view.ei eiVar) {
        this.f131649a = eiVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (fVar.f70616b == 0 && i17 == 0) {
            java.util.LinkedList list = ((r45.vw0) fVar.f70618d).getList(2);
            kotlin.jvm.internal.o.f(list, "getNot_interested_wording_list(...)");
            this.f131649a.f132016k = list;
        }
        return jz5.f0.f302826a;
    }
}
