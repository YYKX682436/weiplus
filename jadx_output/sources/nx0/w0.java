package nx0;

/* loaded from: classes5.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView f341256d;

    public w0(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView) {
        this.f341256d = beautyView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView.f69574w;
        this.f341256d.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
