package ot;

/* loaded from: classes3.dex */
public final class u implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f348337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f348338b;

    public u(android.widget.ImageView imageView, yz5.a aVar) {
        this.f348337a = imageView;
        this.f348338b = aVar;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        android.widget.ImageView imageView = this.f348337a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(result.f269404a == -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/feature/appmsg/AppMsgRecordLoaderFeatureService$attachRecordMsgItemThumb$1", "onResult", "(Lcom/tencent/mm/sdk/pipeline/PipelineResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/feature/appmsg/AppMsgRecordLoaderFeatureService$attachRecordMsgItemThumb$1", "onResult", "(Lcom/tencent/mm/sdk/pipeline/PipelineResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, imageView)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(imageView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(imageView, arrayList4.toArray(), "com/tencent/mm/feature/appmsg/AppMsgRecordLoaderFeatureService$attachRecordMsgItemThumb$1", "onResult", "(Lcom/tencent/mm/sdk/pipeline/PipelineResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/feature/appmsg/AppMsgRecordLoaderFeatureService$attachRecordMsgItemThumb$1", "onResult", "(Lcom/tencent/mm/sdk/pipeline/PipelineResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.a aVar = this.f348338b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
