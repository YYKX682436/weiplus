package tr2;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr2.v f421412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tr2.v vVar) {
        super(1);
        this.f421412d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) obj;
        tr2.v vVar = this.f421412d;
        vVar.f421414e = 1;
        android.view.ViewGroup viewGroup = vVar.f421419m;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewGroup, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC$openAddHalfScreen$showAddHalfScreen$1", "invoke", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC$openAddHalfScreen$showAddHalfScreen$1", "invoke", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(viewGroup, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vVar.f421413d = iEmojiInfo;
        vVar.O6(iEmojiInfo);
        return jz5.f0.f302826a;
    }
}
