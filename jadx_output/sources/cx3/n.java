package cx3;

/* loaded from: classes5.dex */
public final class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f224568d = {android.R.color.holo_blue_dark, android.R.color.holo_green_dark, android.R.color.holo_red_dark, android.R.color.holo_orange_dark};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment f224569e;

    public n(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment) {
        this.f224569e = demoNineFragment;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f224569e.f158090h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        int[] iArr = this.f224568d;
        view.setBackgroundResource(iArr[i17 % iArr.length]);
        android.widget.TextView textView = ((cx3.m) holder).f224567d;
        textView.setText("这是数据项" + i17);
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.aaw));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment demoNineFragment = this.f224569e;
        android.view.View inflate = android.view.LayoutInflater.from(demoNineFragment.getContext()).inflate(com.tencent.mm.R.layout.cfh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        return new cx3.m(demoNineFragment, inflate);
    }
}
