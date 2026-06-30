package ox0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349548d;

    public d(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349548d = cropView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.k5(m7Var, null), 3, null);
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349548d;
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = cropView.f69640p;
        if (mJCamSpatialDesc == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        sg.a flipMode = mJCamSpatialDesc.getFlipMode();
        int i17 = flipMode == null ? -1 : ox0.c.f349547a[flipMode.ordinal()];
        sg.a aVar = sg.a.Horizontal;
        if (i17 != 1) {
            if (i17 == 2) {
                aVar = sg.a.None;
            } else if (i17 == 3) {
                aVar = sg.a.HorizontalAndVertical;
            } else if (i17 == 4) {
                aVar = sg.a.Vertical;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Flip, ");
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc2 = cropView.f69640p;
        if (mJCamSpatialDesc2 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        sb6.append(mJCamSpatialDesc2.getFlipMode());
        sb6.append(" -> ");
        sb6.append(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CropView", sb6.toString());
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc3 = cropView.f69640p;
        if (mJCamSpatialDesc3 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc3.f47906d = aVar;
        cropView.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
