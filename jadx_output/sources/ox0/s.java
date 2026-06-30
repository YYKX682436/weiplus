package ox0;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f349567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349568e;

    public s(yz5.l lVar, com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349567d = lVar;
        this.f349568e = cropView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$setExitOnClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = this.f349568e.f69639o;
        if (mJCamSpatialDesc == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        this.f349567d.invoke(mJCamSpatialDesc);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$setExitOnClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
