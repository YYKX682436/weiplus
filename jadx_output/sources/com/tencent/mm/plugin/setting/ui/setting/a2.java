package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class a2 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.z1 f160792d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f160793e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f160794f;

    /* renamed from: g, reason: collision with root package name */
    public ip.k f160795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.view.View itemView, com.tencent.mm.plugin.setting.ui.setting.z1 iRingtoneChooseCallback) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(iRingtoneChooseCallback, "iRingtoneChooseCallback");
        this.f160792d = iRingtoneChooseCallback;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hjt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160793e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nh8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160794f = (android.widget.ImageView) findViewById2;
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        ip.k kVar = this.f160795g;
        sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f293571a) : null);
        sb6.append(", ");
        ip.k kVar2 = this.f160795g;
        sb6.append(kVar2 != null ? kVar2.f293572b : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingMessageRingtoneUI", sb6.toString());
        ip.k kVar3 = this.f160795g;
        com.tencent.mm.plugin.setting.ui.setting.z1 z1Var = this.f160792d;
        if (kVar3 != null) {
            z1Var.X3(kVar3);
        }
        z1Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
