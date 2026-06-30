package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b8 f208309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.tencent.mm.ui.conversation.b8 b8Var) {
        super(1);
        this.f208309d = b8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String obj2 = ((com.tencent.mm.ui.base.NoMeasuredTextView) it.findViewById(com.tencent.mm.R.id.kbq)).getText().toString();
        java.lang.Object parent = it.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        if (kotlin.jvm.internal.o.b(((android.view.View) parent).getTag(com.tencent.mm.R.id.apj), java.lang.Boolean.TRUE)) {
            obj2 = obj2 + (char) 65292 + this.f208309d.getContext().getResources().getString(com.tencent.mm.R.string.an8);
        }
        return obj2 + (char) 65292 + ((com.tencent.mm.ui.base.NoMeasuredTextView) it.findViewById(com.tencent.mm.R.id.otg)).getText().toString() + (char) 65292 + ((com.tencent.mm.ui.base.NoMeasuredTextView) it.findViewById(com.tencent.mm.R.id.f485478ht5)).getText().toString();
    }
}
