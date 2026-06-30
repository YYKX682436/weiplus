package cx3;

/* loaded from: classes14.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment f224580d;

    public z(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment demoSixFragment) {
        this.f224580d = demoSixFragment;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f224580d.f158077d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        cx3.y holder = (cx3.y) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        int i18 = i17 % 2;
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment demoSixFragment = this.f224580d;
        android.widget.ImageView imageView = holder.f224579d;
        if (i18 == 0) {
            android.content.res.Resources resources = demoSixFragment.getResources();
            java.lang.ThreadLocal threadLocal = d3.q.f226108a;
            imageView.setImageDrawable(d3.l.a(resources, com.tencent.mm.R.drawable.bhm, null));
        } else {
            android.content.res.Resources resources2 = demoSixFragment.getResources();
            java.lang.ThreadLocal threadLocal2 = d3.q.f226108a;
            imageView.setImageDrawable(d3.l.a(resources2, com.tencent.mm.R.drawable.bho, null));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment demoSixFragment = this.f224580d;
        android.view.View inflate = android.view.LayoutInflater.from(demoSixFragment.getContext()).inflate(com.tencent.mm.R.layout.f489402cf4, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new cx3.y(demoSixFragment, inflate);
    }
}
