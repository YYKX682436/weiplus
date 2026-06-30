package ox0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349546d;

    public b(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349546d = cropView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.n5(m7Var, null), 3, null);
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349546d;
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = cropView.f69640p;
        if (mJCamSpatialDesc == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        sg.b rotationMode = mJCamSpatialDesc.getRotationMode();
        int i17 = rotationMode == null ? -1 : ox0.a.f349545a[rotationMode.ordinal()];
        sg.b bVar = sg.b.CW90;
        if (i17 != 1) {
            if (i17 == 2) {
                bVar = sg.b.CW180;
            } else if (i17 == 3) {
                bVar = sg.b.CCW90;
            } else if (i17 == 4) {
                bVar = sg.b.None;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Rotate, ");
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc2 = cropView.f69640p;
        if (mJCamSpatialDesc2 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        sb6.append(mJCamSpatialDesc2.getRotationMode());
        sb6.append("-> ");
        sb6.append(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CropView", sb6.toString());
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc3 = cropView.f69640p;
        if (mJCamSpatialDesc3 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc3.f47905c = bVar;
        cropView.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
