package yt3;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f465472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f465473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f465474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f465475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f465476i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465477m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.graphics.Bitmap bitmap, yt3.p0 p0Var, long j17, java.util.ArrayList arrayList, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465472e = bitmap;
        this.f465473f = p0Var;
        this.f465474g = j17;
        this.f465475h = arrayList;
        this.f465476i = z17;
        this.f465477m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yt3.h0(this.f465472e, this.f465473f, this.f465474g, this.f465475h, this.f465476i, this.f465477m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yt3.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465471d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu3.i iVar = nu3.i.f340218a;
            android.graphics.Bitmap bitmap = this.f465472e;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", new java.lang.Integer(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", new java.lang.Integer(bitmap.getHeight()));
            iVar.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            yt3.p0 p0Var = this.f465473f;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = p0Var.f465584i;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, compressFormat, recordConfigProvider != null ? recordConfigProvider.E : null, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBitmapToImage  cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - this.f465474g);
            sb6.append("  path:");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = p0Var.f465584i;
            sb6.append(recordConfigProvider2 != null ? recordConfigProvider2.E : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
            boolean z17 = false;
            p0Var.f465589q = false;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            for (com.tencent.mm.api.IEmojiInfo iEmojiInfo : this.f465475h) {
                if (iEmojiInfo != null && iEmojiInfo.o0() != null) {
                    arrayList.add(iEmojiInfo.o0());
                }
            }
            ut3.f.f431176c.f431178b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = p0Var.f465584i;
            java.lang.String str = recordConfigProvider3 != null ? recordConfigProvider3.E : null;
            if (str == null) {
                str = "";
            }
            qk.e0.b(str, arrayList);
            dw3.c0 c0Var = dw3.c0.f244182a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = p0Var.f465584i;
            ct0.b bVar = p0Var.f465585m;
            if (bVar != null && bVar.f222206c) {
                z17 = true;
            }
            boolean z18 = this.f465476i;
            c0Var.u(recordConfigProvider4, z17, z18);
            android.os.SystemClock.elapsedRealtime();
            arrayList.size();
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yt3.g0 g0Var = new yt3.g0(p0Var, z18, this.f465477m, null);
            this.f465471d = 1;
            if (kotlinx.coroutines.l.g(g3Var, g0Var, this) == aVar) {
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
