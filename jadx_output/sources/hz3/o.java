package hz3;

/* loaded from: classes12.dex */
public final class o implements hz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz3.z f286353a;

    public o(hz3.z zVar) {
        this.f286353a = zVar;
    }

    @Override // hz3.r
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        hz3.z zVar = this.f286353a;
        if (zVar != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new iz3.a(((iz3.d) zVar).f296069a, mediaId));
        }
    }

    @Override // hz3.r
    public void b(hz3.t checkImageResult) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(checkImageResult, "checkImageResult");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(checkImageResult.f286363c);
        objArr[1] = java.lang.Integer.valueOf(checkImageResult.f286364d);
        r45.si siVar = checkImageResult.f286362b;
        if (siVar != null) {
            str = java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f385746g, java.lang.Integer.valueOf(siVar.f385744e), java.lang.Integer.valueOf(siVar.f385745f), java.lang.Integer.valueOf(siVar.f385743d), java.lang.Integer.valueOf(siVar.f385748i)}, 5));
            kotlin.jvm.internal.o.f(str, "format(...)");
        } else {
            str = null;
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanDefaultImageCDNStrategy", "getCDNImageInfoList-default errType: %s, errCode: %s: reUploadInfo: %s", objArr);
        int i17 = checkImageResult.f286363c;
        hz3.z zVar = this.f286353a;
        if (i17 != 0 || checkImageResult.f286364d != 0) {
            if (zVar != null) {
                ((iz3.d) zVar).a(i17, checkImageResult.f286364d, checkImageResult.f286365e);
                return;
            }
            return;
        }
        if (checkImageResult.f286362b == null) {
            if (zVar != null) {
                ((iz3.d) zVar).a(4, 403, "checkImageCdnStatus re-upload cdn error");
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.si siVar2 = new r45.si();
        siVar2.f385748i = 1;
        siVar2.f385743d = 3;
        r45.si siVar3 = checkImageResult.f286362b;
        siVar2.f385746g = siVar3 != null ? siVar3.f385746g : null;
        siVar2.f385747h = siVar3 != null ? siVar3.f385747h : null;
        arrayList.add(siVar2);
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }
}
