package ox0;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f349565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349566e;

    public r(yz5.l lVar, com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349565d = lVar;
        this.f349566e = cropView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$setExitOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = this.f349566e.f69640p;
        if (mJCamSpatialDesc == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        this.f349565d.invoke(mJCamSpatialDesc);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$setExitOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
