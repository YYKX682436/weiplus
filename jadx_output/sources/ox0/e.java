package ox0;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349549d;

    public e(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349549d = cropView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m5(m7Var, null), 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Reset, ");
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349549d;
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = cropView.f69640p;
        if (mJCamSpatialDesc == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        sb6.append(mJCamSpatialDesc);
        sb6.append(" -> ");
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc2 = cropView.f69639o;
        if (mJCamSpatialDesc2 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        sb6.append(mJCamSpatialDesc2);
        com.tencent.mars.xlog.Log.i("MicroMsg.CropView", sb6.toString());
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc3 = cropView.f69640p;
        if (mJCamSpatialDesc3 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc4 = cropView.f69639o;
        if (mJCamSpatialDesc4 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc3.f47905c = mJCamSpatialDesc4.getRotationMode();
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc5 = cropView.f69640p;
        if (mJCamSpatialDesc5 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc6 = cropView.f69639o;
        if (mJCamSpatialDesc6 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc5.f47906d = mJCamSpatialDesc6.getFlipMode();
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc7 = cropView.f69640p;
        if (mJCamSpatialDesc7 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc8 = cropView.f69639o;
        if (mJCamSpatialDesc8 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc7.f47904b = mJCamSpatialDesc8.getScaleMode();
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc9 = cropView.f69640p;
        if (mJCamSpatialDesc9 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc10 = cropView.f69639o;
        if (mJCamSpatialDesc10 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc9.f47907e = mJCamSpatialDesc10.getScale();
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc11 = cropView.f69640p;
        if (mJCamSpatialDesc11 == null) {
            kotlin.jvm.internal.o.o("currentSpatialDesc");
            throw null;
        }
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc12 = cropView.f69639o;
        if (mJCamSpatialDesc12 == null) {
            kotlin.jvm.internal.o.o("initSpatialDesc");
            throw null;
        }
        mJCamSpatialDesc11.f47908f = mJCamSpatialDesc12.getPosition().m43clone();
        cropView.d();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
