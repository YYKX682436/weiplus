package hz3;

/* loaded from: classes8.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286323d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f286324e;

    /* renamed from: f, reason: collision with root package name */
    public int f286325f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f286328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286327h = str;
        this.f286328i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hz3.f fVar = new hz3.f(this.f286327h, this.f286328i, continuation);
        fVar.f286326g = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        f04.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f286325f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str2 = this.f286327h;
            f04.a aVar2 = new f04.a(str2);
            int i18 = this.f286328i;
            if (i18 < 0) {
                jz5.g gVar = hz3.i.f286332a;
                i18 = ((java.lang.Number) ((jz5.n) hz3.i.f286332a).getValue()).intValue();
            }
            aVar2.f258419c = i18;
            f04.i a17 = f04.f.a(aVar2, (f04.b) ((jz5.n) hz3.i.f286334c).getValue());
            android.graphics.Bitmap bitmap2 = a17.f258425a;
            if (bitmap2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "decode error, bitmap is null");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "decode result,width:" + bitmap2.getWidth() + ", height:" + bitmap2.getHeight());
            byte[] bytes = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String str3 = "wcf://ImageSearchFilePath/" + kk.k.g(bytes);
            this.f286326g = a17;
            this.f286323d = bitmap2;
            this.f286324e = str3;
            this.f286325f = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new hz3.h(bitmap2, str3, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            str = str3;
            bitmap = bitmap2;
            iVar = a17;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f286324e;
            bitmap = (android.graphics.Bitmap) this.f286323d;
            iVar = (f04.i) this.f286326g;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        if (!booleanValue || !j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "save Image Fail, saveSuccess:" + booleanValue + ", fileExist:" + j17);
            return null;
        }
        hz3.b bVar = new hz3.b();
        android.graphics.Point point = iVar.f258426b;
        bVar.f286315b = point != null ? point.y : 0;
        bVar.f286314a = point != null ? point.x : 0;
        bVar.f286317d = bitmap.getWidth();
        bVar.f286318e = bitmap.getHeight();
        bVar.f286316c = str;
        return bVar;
    }
}
