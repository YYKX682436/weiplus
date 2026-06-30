package ei4;

/* loaded from: classes11.dex */
public final class j implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment f253222d;

    public j(com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f253222d = fragment;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        hi4.a item = (hi4.a) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        boolean a17 = ii4.b.a(item);
        com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment textStatusConversationFragment = this.f253222d;
        if (a17) {
            int i17 = com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity.f173210e;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ni4.x xVar = ni4.x.f337776d;
            li4.b k17 = xVar.k();
            k17.getClass();
            java.lang.String[] strArr = mj4.n.f327076e;
            k17.f318788d.A("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
            k17.doNotify(li4.b.f318787f, 6, null);
            androidx.fragment.app.FragmentActivity activity = textStatusConversationFragment.getActivity();
            if (activity != null) {
                xVar.o();
                pf5.z zVar = pf5.z.f353948a;
                boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
                ((com.tencent.mm.plugin.textstatus.ui.tf) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.textstatus.ui.tf.class)).U6(1);
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a18 = zVar.a(appCompatActivity).a(hi4.m.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                qj4.s.o(qj4.s.f363958a, 51, null, hi4.m.f281556g, 0, null, 0, 0, 0, 0, null, null, null, null, null, 16378, null);
            }
        } else {
            view.setSelected(true);
            java.lang.String a19 = en1.a.a();
            wn.u uVar = textStatusConversationFragment.f64738u;
            if (uVar == null) {
                kotlin.jvm.internal.o.o("readyChattingUIC");
                throw null;
            }
            wn.t tVar = uVar.f447380d;
            if (tVar != null) {
                ((rb5.l) tVar).l(item.field_sessionId, a19, null, new ei4.i(item, this, view));
            }
        }
        return jz5.f0.f302826a;
    }
}
