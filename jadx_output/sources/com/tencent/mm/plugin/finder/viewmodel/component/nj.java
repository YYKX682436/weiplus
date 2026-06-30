package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        super(0);
        this.f135334d = blVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135334d;
        if (com.tencent.mm.ui.fj.b(blVar.getActivity())) {
            androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
            android.content.Intent intent = blVar.getIntent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android:activity.enterSplitSideWithAdjacentFlag", 4);
            androidx.appcompat.app.AppCompatActivity activity2 = blVar.getActivity();
            android.content.Intent intent2 = blVar.getIntent();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(bundle);
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            activity2.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
            yj0.a.f(activity2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
        return jz5.f0.f302826a;
    }
}
