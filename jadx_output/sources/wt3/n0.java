package wt3;

/* loaded from: classes5.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final wt3.q f449451a;

    /* renamed from: b, reason: collision with root package name */
    public int f449452b;

    /* renamed from: c, reason: collision with root package name */
    public int f449453c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f449454d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f449455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f449456f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f449457g;

    /* renamed from: h, reason: collision with root package name */
    public r45.iz6 f449458h;

    public n0(wt3.q classifier) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        this.f449451a = classifier;
        this.f449452b = 299;
        this.f449453c = 299;
        this.f449454d = new int[0];
        this.f449457g = new java.util.LinkedList();
    }

    public final void a() {
        boolean z17;
        f();
        int i17 = 0;
        int i18 = 1;
        boolean z18 = this.f449455e && this.f449456f;
        java.util.LinkedList linkedList = this.f449457g;
        java.lang.Object obj = null;
        int i19 = 2;
        if (z18) {
            int i27 = this.f449452b;
            int i28 = this.f449453c;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i28));
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInMaas", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInMaas", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            linkedList.clear();
            int[] iArr = this.f449454d;
            int length = iArr.length;
            int i29 = 0;
            int i37 = 0;
            while (i29 < length) {
                int i38 = iArr[i29];
                android.graphics.Bitmap d17 = d(i37);
                new android.graphics.Canvas(createBitmap).drawBitmap(d17, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, this.f449452b, this.f449453c), (android.graphics.Paint) null);
                int i39 = this.f449452b;
                int i47 = this.f449453c;
                long j17 = this.f449454d[i37];
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "use maasClassifier");
                this.f449451a.b(d17, i39, i47, j17);
                d17.getByteCount();
                i29++;
                i37++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "imageData size thumbWidth:" + this.f449452b + " thumbHeight:" + this.f449453c);
        } else {
            int i48 = this.f449452b;
            int i49 = this.f449453c;
            while (i49 > 0 && i48 > 0) {
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i49));
                arrayList2.add(java.lang.Integer.valueOf(i48));
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInOriginal", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(i17)).intValue(), ((java.lang.Integer) arrayList2.get(i18)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(i19));
                yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInOriginal", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
                linkedList.clear();
                int[] iArr2 = this.f449454d;
                int length2 = iArr2.length;
                int i57 = i17;
                int i58 = i57;
                int i59 = i58;
                while (i59 < length2) {
                    int i66 = iArr2[i59];
                    int i67 = i57 + 1;
                    android.graphics.Bitmap d18 = d(i57);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap2);
                    kotlin.jvm.internal.o.d(d18);
                    canvas.drawBitmap(d18, (android.graphics.Rect) null, new android.graphics.Rect(i17, i17, i48, i49), (android.graphics.Paint) null);
                    int i68 = this.f449454d[i57];
                    com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(com.tencent.mm.sdk.platformtools.x.b(d18, 50));
                    linkedList.add(gVar);
                    i58 += gVar.f192156a.length;
                    i59++;
                    obj = null;
                    i57 = i67;
                    iArr2 = iArr2;
                    i17 = 0;
                }
                java.lang.Object obj4 = obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "imageData size:" + i58 + " thumbWidth:" + i48 + " thumbHeight:" + i49);
                i48 /= 2;
                i49 /= 2;
                if (i58 <= 102400) {
                    z17 = true;
                    break;
                }
                obj = obj4;
                i17 = 0;
                i18 = 1;
                i19 = 2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "get image data fail!");
            z17 = false;
            if (!z17) {
                linkedList.clear();
                android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(config3);
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(299);
                arrayList3.add(299);
                java.lang.Object obj5 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj5, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInOriginal", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                yj0.a.e(obj5, createBitmap3, "com/tencent/mm/plugin/recordvideo/model/audio/MediaFrameFeatureExtractor", "processImageDataInOriginal", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap3, "createBitmap(...)");
                int i69 = 0;
                for (int i76 : this.f449454d) {
                    com.tencent.mm.protobuf.g gVar2 = new com.tencent.mm.protobuf.g(com.tencent.mm.sdk.platformtools.x.b(createBitmap3, 50));
                    linkedList.add(gVar2);
                    i69 += gVar2.f192156a.length;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "backup imageData size:" + i69);
            }
        }
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt3.n0.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int Ni = ((h62.d) ((e42.e0) c17)).Ni(e42.d0.clicfg_story_music_story_thumb_size, 299);
        this.f449452b = Ni;
        this.f449453c = Ni;
        boolean z17 = false;
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_MediaAudioUseMaasClassifier_Int, 0);
        if (g17 == 0) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_audio_edit_use_mass_classifier_07, false);
        } else if (g17 == 1) {
            z17 = true;
        }
        this.f449455e = z17;
        i95.m c18 = i95.n0.c(pp0.n0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        boolean a17 = py0.b.f358971a.a();
        this.f449456f = a17;
        if (this.f449455e && a17) {
            this.f449451a.e();
            this.f449453c = 224;
            this.f449452b = 224;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "init thumbWidth:" + this.f449452b + " thumbWidth:" + this.f449452b + " useMaasClassifier:" + this.f449455e + " isMaasSupport:" + this.f449456f);
    }

    public abstract android.graphics.Bitmap d(int i17);

    public abstract void e();

    public abstract void f();
}
