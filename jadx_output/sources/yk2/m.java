package yk2;

/* loaded from: classes3.dex */
public final class m extends yk2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        dk2.ef efVar = dk2.ef.f233372a;
        boolean z17 = dk2.ef.D;
        com.tencent.mars.xlog.Log.i("LiveReservedRecordPersonal", "checkPersonalItemShow enable_reserved_notice_record: " + z17);
        this.f462791d.setVisibility(z17 ? 0 : 8);
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        android.content.Intent intent = new android.content.Intent();
        android.view.ViewGroup viewGroup = this.f462791d;
        android.content.Intent intent2 = !(viewGroup.getContext() instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(viewGroup.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveReservedRecordUI.class);
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/personal/LiveReservedRecordPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/personal/LiveReservedRecordPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
