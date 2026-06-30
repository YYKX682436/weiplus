package km4;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.l lVar) {
        super(2);
        this.f309299d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pi0.l1 l1Var = (pi0.l1) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ting/utils/TingPlatformHybridRouterCreator$handleOpenInner$1", "invoke", "(Lcom/tencent/mm/flutter/base/MMFlutterInstance;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ting/utils/TingPlatformHybridRouterCreator$handleOpenInner$1", "invoke", "(Lcom/tencent/mm/flutter/base/MMFlutterInstance;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (l1Var != null) {
            bw5.k20 k20Var = new bw5.k20();
            k20Var.f29208d = l1Var.f354647f;
            k20Var.f29209e[1] = true;
            yz5.l lVar = this.f309299d;
            if (lVar != null) {
                lVar.invoke(k20Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
