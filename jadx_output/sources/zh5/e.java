package zh5;

/* loaded from: classes12.dex */
public final class e extends lf3.n implements qf3.b, zh5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public e60.t0 f473019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473019d = new e60.t0(null, 0, 0, 0, false, false, null, 127, null);
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_media_gallery_data");
        java.io.Serializable serializableExtra = intent.getSerializableExtra("key_media_gallery_config");
        e60.t0 t0Var = serializableExtra instanceof e60.t0 ? (e60.t0) serializableExtra : null;
        if (parcelableArrayListExtra == null || t0Var == null) {
            return false;
        }
        this.f473019d = t0Var;
        mf3.f fVar = new mf3.f();
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            com.tencent.mm.feature.gallery.api.GalleryParams galleryParams = (com.tencent.mm.feature.gallery.api.GalleryParams) it.next();
            com.tencent.mm.feature.gallery.api.GalleryParams galleryParams2 = galleryParams == null ? null : galleryParams;
            if (galleryParams2 == null || (str2 = galleryParams2.f67107f) == null) {
                return false;
            }
            int i17 = galleryParams2.f67105d;
            mf3.k xVar = i17 != 0 ? i17 != 1 ? null : new zh5.x(galleryParams.f67106e, str2, this.f473019d) : new zh5.w(galleryParams.f67106e, str2, this.f473019d);
            if (xVar != null && xVar.getType() != mf3.u.f326122d) {
                fVar.add(xVar);
            }
        }
        int i18 = t0Var.f249736g;
        mf3.k kVar = (mf3.k) kz5.n0.a0(fVar, i18);
        if (kVar == null || (str = kVar.getId()) == null) {
            str = "";
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(i18);
        return true;
    }
}
