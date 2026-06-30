package zy4;

/* loaded from: classes15.dex */
public class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f477678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477679e;

    public f(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477679e = welabAppInfoUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f477678d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        zy4.g gVar = (zy4.g) k3Var;
        gVar.f477680d.setTag(this.f477678d.get(i17));
        n11.a.b().h((java.lang.String) this.f477678d.get(i17), gVar.f477680d, sy4.m.f413884c.f413886b);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI = this.f477679e;
        android.view.View inflate = welabAppInfoUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.d_8, viewGroup, false);
        zy4.g gVar = new zy4.g(welabAppInfoUI, inflate);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ha_);
        gVar.f477680d = imageView;
        imageView.setOnClickListener(welabAppInfoUI.f188098w);
        return gVar;
    }
}
