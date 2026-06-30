package zu0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.maas_api.MJMediaItem f475670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.maas_api.MJMediaItem mJMediaItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f475670e = mJMediaItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zu0.e eVar = new zu0.e(this.f475670e, continuation);
        eVar.f475669d = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zu0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.maas_api.MJMediaItem mJMediaItem = this.f475670e;
        java.lang.String str = mJMediaItem.f68639e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(str);
            boolean z17 = true;
            int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            int attributeInt2 = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 0);
            int attributeInt3 = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 0);
            if (attributeInt2 <= 0 || attributeInt3 <= 0) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                arrayList.add(str);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/data/beans/MCMediaFileKt$toMCImageMediaFile$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                yj0.a.e(obj2, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/mj_publisher/finder/movie_composing/data/beans/MCMediaFileKt$toMCImageMediaFile$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                attributeInt2 = options.outWidth;
                attributeInt3 = options.outHeight;
            }
            qg.c cVar = qg.c.Image;
            if (attributeInt != 6 && attributeInt != 8) {
                z17 = false;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(zu0.g.b(mJMediaItem, attributeInt2, attributeInt3, cVar, z17));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MovieComp.MCMediaFile", "toMCMediaFile: image " + m524exceptionOrNullimpl, m524exceptionOrNullimpl);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
