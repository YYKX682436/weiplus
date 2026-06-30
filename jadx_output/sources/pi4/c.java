package pi4;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout f354824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f354825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout topicErrorLayout, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354824d = topicErrorLayout;
        this.f354825e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi4.c(this.f354824d, this.f354825e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pi4.c cVar = (pi4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout topicErrorLayout;
        java.util.ArrayList arrayList;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        while (true) {
            topicErrorLayout = this.f354824d;
            int childCount = topicErrorLayout.getChildCount();
            arrayList = this.f354825e;
            i17 = 0;
            if (childCount <= arrayList.size()) {
                break;
            }
            topicErrorLayout.removeViewAt(0);
        }
        while (topicErrorLayout.getChildCount() < arrayList.size()) {
            android.view.View inflate = com.tencent.mm.ui.id.b(topicErrorLayout.getContext()).inflate(com.tencent.mm.R.layout.f489557dx5, (android.view.ViewGroup) topicErrorLayout, false);
            kotlin.jvm.internal.o.d(inflate);
            topicErrorLayout.addView(inflate, -1, -2);
        }
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            mj4.h hVar = (mj4.h) obj2;
            android.view.View childAt = topicErrorLayout.getChildAt(i17);
            childAt.setTag(hVar);
            android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.tencent.mm.R.id.rex);
            mj4.k kVar = (mj4.k) hVar;
            mj4.a aVar2 = kVar.f327067b;
            int i19 = aVar2.field_state;
            if (i19 == 5) {
                textView.setText(i65.a.r(topicErrorLayout.getContext(), com.tencent.mm.R.string.jx_));
            } else if (i19 == 6) {
                pj4.g2 b17 = oj4.j.f345815a.b(aVar2.field_CreateTime);
                textView.setText(b17 != null ? b17.f355071p : null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update: index=");
            sb6.append(i17);
            sb6.append(", createTime=");
            mj4.a aVar3 = kVar.f327067b;
            sb6.append(aVar3.field_CreateTime);
            sb6.append(", state=");
            sb6.append(aVar3.field_state);
            sb6.append(", text=");
            sb6.append((java.lang.Object) textView.getText());
            com.tencent.mars.xlog.Log.i("MicroMsg.TopicErrorLayout", sb6.toString());
            childAt.setOnClickListener(new pi4.b(topicErrorLayout));
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
