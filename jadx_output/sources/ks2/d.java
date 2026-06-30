package ks2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cq4 f311602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f311603e;

    public d(r45.cq4 cq4Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f311602d = cq4Var;
        this.f311603e = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f311602d.getCustom(3);
        if (finderJumpInfo != null) {
            xc2.y2 y2Var = xc2.y2.f453343a;
            android.content.Context context = this.f311603e.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
