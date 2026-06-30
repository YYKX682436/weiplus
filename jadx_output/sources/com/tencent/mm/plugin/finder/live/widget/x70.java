package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(android.content.Context context) {
        super(0);
        this.f120302d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vw4 vw4Var = r45.vw4.Auto;
        android.content.Context context = this.f120302d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491726m91);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491727m92);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        linkedList.add(new com.tencent.mm.plugin.finder.live.widget.w70(vw4Var, string, string2));
        r45.vw4 vw4Var2 = r45.vw4.Manual;
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f491730m95);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.m96);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        linkedList.add(new com.tencent.mm.plugin.finder.live.widget.w70(vw4Var2, string3, string4));
        return linkedList;
    }
}
