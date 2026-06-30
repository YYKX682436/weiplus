package zm5;

/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f474247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(zm5.r0 r0Var) {
        super(1);
        this.f474247d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        aq.a it = (aq.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        zm5.r0 r0Var = this.f474247d;
        androidx.appcompat.app.AppCompatActivity activity = r0Var.getActivity();
        android.content.Intent intent = new android.content.Intent(r0Var.getContext(), (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryPersonUI.class);
        intent.putExtra("KEY_CROP_IMAGE_PATH", it.f12827b);
        fn5.n0 O6 = r0Var.O6();
        O6.getClass();
        java.lang.String labelId = it.f12826a;
        kotlin.jvm.internal.o.g(labelId, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (java.util.ArrayList) ((java.util.LinkedHashMap) O6.f264735u).get(labelId));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        f65.o.f259912a.c(55);
        return jz5.f0.f302826a;
    }
}
