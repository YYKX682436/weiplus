package ee5;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f252043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ee5.z zVar) {
        super(1);
        this.f252043d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        aq.a it = (aq.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ee5.z zVar = this.f252043d;
        androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).O6();
        androidx.appcompat.app.AppCompatActivity activity2 = zVar.getActivity();
        android.content.Intent intent = new android.content.Intent(zVar.getContext(), (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryPersonUI.class);
        intent.putExtra("KEY_CROP_IMAGE_PATH", it.f12827b);
        fn5.n0 Q6 = zVar.Q6();
        Q6.getClass();
        java.lang.String labelId = it.f12826a;
        kotlin.jvm.internal.o.g(labelId, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (java.util.ArrayList) ((java.util.LinkedHashMap) Q6.f264735u).get(labelId));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
