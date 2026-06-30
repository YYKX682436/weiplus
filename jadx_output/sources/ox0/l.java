package ox0;

/* loaded from: classes5.dex */
public final class l extends bv0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349558a;

    public l(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView) {
        this.f349558a = cropView;
    }

    @Override // bv0.f
    public void a(bv0.h hVar) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw;
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw3;
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.o5(m7Var, null), 3, null);
        yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.l5(m7Var2, null), 3, null);
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349558a;
        cropDraw = cropView.getCropDraw();
        cropDraw.f69625o = true;
        cropDraw.invalidate();
        cropDraw2 = cropView.getCropDraw();
        cropDraw2.f69623m = false;
        cropDraw2.f69624n = false;
        cropDraw2.invalidate();
        cropDraw3 = cropView.getCropDraw();
        cropDraw3.f69626p = false;
        cropDraw3.f69627q = false;
        cropDraw3.f69628r = false;
        cropDraw3.f69629s = false;
        cropDraw3.invalidate();
    }

    @Override // bv0.f
    public void b(bv0.h hVar) {
        if (hVar != null) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349558a;
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = cropView.f69640p;
            if (mJCamSpatialDesc == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            float scale = mJCamSpatialDesc.getScale() * hVar.a();
            if (scale > 5.0f) {
                scale = 5.0f;
            }
            if (scale < 0.2f) {
                scale = 0.2f;
            }
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc2 = cropView.f69640p;
            if (mJCamSpatialDesc2 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            mJCamSpatialDesc2.getScale();
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc3 = cropView.f69640p;
            if (mJCamSpatialDesc3 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            mJCamSpatialDesc3.f47907e = scale;
            cropView.d();
        }
    }

    @Override // bv0.g, bv0.f
    public void c(bv0.h hVar) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw;
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw2;
        if (hVar != null) {
            float f17 = hVar.f24696b - hVar.f24698d;
            com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349558a;
            cropDraw = cropView.getCropDraw();
            float width = f17 / cropDraw.getClipRect().width();
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = cropView.f69640p;
            if (mJCamSpatialDesc == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            float f18 = width * mJCamSpatialDesc.getViewPointSize().f47799x;
            float f19 = -(hVar.f24697c - hVar.f24699e);
            cropDraw2 = cropView.getCropDraw();
            float height = f19 / cropDraw2.getClipRect().height();
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc2 = cropView.f69640p;
            if (mJCamSpatialDesc2 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            float f27 = height * mJCamSpatialDesc2.getViewPointSize().f47800y;
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc3 = cropView.f69640p;
            if (mJCamSpatialDesc3 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            mJCamSpatialDesc3.getPosition().f47799x += f18;
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc4 = cropView.f69640p;
            if (mJCamSpatialDesc4 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            mJCamSpatialDesc4.getPosition().f47800y += f27;
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc5 = cropView.f69640p;
            if (mJCamSpatialDesc5 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            com.tencent.maas.base.Vec2 m43clone = mJCamSpatialDesc5.getPosition().m43clone();
            kotlin.jvm.internal.o.f(m43clone, "clone(...)");
            com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView.b(cropView);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gesture, move: (");
            sb6.append(f18);
            sb6.append(", ");
            sb6.append(f27);
            sb6.append("), position: ");
            sb6.append(m43clone);
            sb6.append(", snapPosition: ");
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc6 = cropView.f69640p;
            if (mJCamSpatialDesc6 == null) {
                kotlin.jvm.internal.o.o("currentSpatialDesc");
                throw null;
            }
            sb6.append(mJCamSpatialDesc6.getPosition());
            com.tencent.mars.xlog.Log.i("MicroMsg.CropView", sb6.toString());
            cropView.d();
        }
    }

    @Override // bv0.f
    public boolean d(bv0.h hVar) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw;
        cropDraw = this.f349558a.getCropDraw();
        cropDraw.f69625o = false;
        cropDraw.invalidate();
        return true;
    }
}
