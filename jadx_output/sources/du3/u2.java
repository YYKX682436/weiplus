package du3;

/* loaded from: classes10.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f243742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f243744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f243745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f243746i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.graphics.Bitmap bitmap, du3.t3 t3Var, long j17, java.util.ArrayList arrayList, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243742e = bitmap;
        this.f243743f = t3Var;
        this.f243744g = j17;
        this.f243745h = arrayList;
        this.f243746i = z17;
        this.f243747m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.u2(this.f243742e, this.f243743f, this.f243744g, this.f243745h, this.f243746i, this.f243747m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243741d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu3.i iVar = nu3.i.f340218a;
            android.graphics.Bitmap bitmap = this.f243742e;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", new java.lang.Integer(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", new java.lang.Integer(bitmap.getHeight()));
            iVar.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            du3.t3 t3Var = this.f243743f;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = t3Var.f243724n;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, compressFormat, recordConfigProvider != null ? recordConfigProvider.E : null, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBitmapToImage  cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - this.f243744g);
            sb6.append("  path:");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = t3Var.f243724n;
            sb6.append(recordConfigProvider2 != null ? recordConfigProvider2.E : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", sb6.toString());
            boolean z17 = false;
            t3Var.A = false;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            for (com.tencent.mm.api.IEmojiInfo iEmojiInfo : this.f243745h) {
                if (iEmojiInfo != null && iEmojiInfo.o0() != null) {
                    arrayList.add(iEmojiInfo.o0());
                }
            }
            ut3.f.f431176c.f431178b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = t3Var.f243724n;
            java.lang.String str = recordConfigProvider3 != null ? recordConfigProvider3.E : null;
            if (str == null) {
                str = "";
            }
            qk.e0.b(str, arrayList);
            dw3.c0 c0Var = dw3.c0.f244182a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = t3Var.f243724n;
            ct0.b bVar = t3Var.f243725o;
            boolean z18 = bVar != null && bVar.f222206c;
            boolean z19 = this.f243746i;
            c0Var.u(recordConfigProvider4, z18, z19);
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigC2CModifyPicKeepUserCommentInExifInfo()) == 1) {
                l45.q qVar = t3Var.f243726p;
                if (qVar instanceof l45.n) {
                    kotlin.jvm.internal.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
                    java.lang.String str2 = ((l45.n) qVar).f316478s;
                    if (str2 != null && !str2.isEmpty()) {
                        z17 = true;
                    }
                    if (z17) {
                        l45.q qVar2 = t3Var.f243726p;
                        kotlin.jvm.internal.o.e(qVar2, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
                        java.lang.String str3 = ((l45.n) qVar2).f316478s;
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = t3Var.f243724n;
                        java.lang.String str4 = recordConfigProvider5 != null ? recordConfigProvider5.E : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        java.lang.String i18 = com.tencent.mm.vfs.w6.i(str4, true);
                        if (i18 != null) {
                            android.media.ExifInterface exifInterface = new android.media.ExifInterface(i18);
                            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, str3);
                            exifInterface.saveAttributes();
                        }
                    }
                }
            }
            nu3.e eVar = nu3.e.f340198a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider6 = t3Var.f243724n;
            java.lang.String str5 = recordConfigProvider6 != null ? recordConfigProvider6.D : null;
            if (str5 == null) {
                str5 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[parseImageOriginMediaInfo]");
            nu3.b b17 = eVar.b(str5);
            nu3.e.f340202e = b17;
            ((java.util.ArrayList) nu3.e.f340205h).add(b17.g());
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider7 = t3Var.f243724n;
            java.lang.String str6 = recordConfigProvider7 != null ? recordConfigProvider7.E : null;
            java.lang.String str7 = str6 != null ? str6 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[parseImageEditedMediaInfo]");
            nu3.b b18 = eVar.b(str7);
            nu3.e.f340203f = b18;
            ((java.util.ArrayList) nu3.e.f340206i).add(b18.g());
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider8 = t3Var.f243724n;
            bundle.putString("PARAM_1_STRING", recordConfigProvider8 != null ? recordConfigProvider8.E : null);
            t3Var.f465332d.w(ju3.c0.Z1, bundle);
            android.os.SystemClock.elapsedRealtime();
            arrayList.size();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            du3.t2 t2Var = new du3.t2(t3Var, z19, this.f243747m, null);
            this.f243741d = 1;
            if (kotlinx.coroutines.l.g(g3Var, t2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
