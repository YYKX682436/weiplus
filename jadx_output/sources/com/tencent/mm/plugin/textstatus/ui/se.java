package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class se extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f174297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f174298e = textStatusOtherTopicFriendsActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.textstatus.ui.se(this.f174298e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.textstatus.ui.se) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f174297d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f174297d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object value = ((jz5.n) this.f174298e.f173659f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
