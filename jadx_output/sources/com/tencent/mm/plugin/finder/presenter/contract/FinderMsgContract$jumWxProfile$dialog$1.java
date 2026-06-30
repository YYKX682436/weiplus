package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Intent;", "it", "Ljz5/f0;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderMsgContract$jumWxProfile$dialog$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$jumWxProfile$dialog$1(boolean z17, android.content.Context context) {
        super(1);
        this.f122949d = z17;
        this.f122950e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent it = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = this.f122949d;
        android.content.Context context = this.f122950e;
        if (z17) {
            it.setClass(context, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31.class);
        } else {
            it.putExtra("keyFromSource", 1);
            it.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI.class);
        }
        android.content.Context context2 = this.f122950e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(it);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$jumWxProfile$dialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$jumWxProfile$dialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
