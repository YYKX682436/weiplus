package uc5;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.a f426472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc5.d0 f426474f;

    public c0(aq.a aVar, java.lang.String str, uc5.d0 d0Var) {
        this.f426472d = aVar;
        this.f426473e = str;
        this.f426474f = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("person item clicked: labelId=");
        aq.a aVar = this.f426472d;
        sb6.append(aVar.f12826a);
        sb6.append(", talker=");
        java.lang.String talker = this.f426473e;
        sb6.append(talker);
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonRecommendRowConvert", sb6.toString());
        android.content.Context context = this.f426474f.itemView.getContext();
        int i17 = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.F;
        kotlin.jvm.internal.o.d(context);
        java.lang.String labelId = aVar.f12826a;
        java.lang.String cropImagePath = aVar.f12827b;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(labelId, "labelId");
        kotlin.jvm.internal.o.g(cropImagePath, "cropImagePath");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.class);
        intent.putExtra("kTalker", talker);
        intent.putExtra("kLabelId", labelId);
        intent.putExtra("kCropImagePath", cropImagePath);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
