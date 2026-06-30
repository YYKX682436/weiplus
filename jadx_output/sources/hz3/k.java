package hz3;

/* loaded from: classes12.dex */
public final class k implements hz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f286338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f286339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f286340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f286341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f286342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f286343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry3.p f286344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hz3.s f286345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hz3.s f286346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hz3.z f286347j;

    public k(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, java.util.ArrayList arrayList, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, long j17, ry3.p pVar, hz3.s sVar, hz3.s sVar2, hz3.z zVar) {
        this.f286338a = h0Var;
        this.f286339b = h0Var2;
        this.f286340c = arrayList;
        this.f286341d = c0Var;
        this.f286342e = c0Var2;
        this.f286343f = j17;
        this.f286344g = pVar;
        this.f286345h = sVar;
        this.f286346i = sVar2;
        this.f286347j = zVar;
    }

    @Override // hz3.r
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        hz3.z zVar = this.f286347j;
        if (zVar != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new iz3.a(((iz3.d) zVar).f296069a, mediaId));
        }
    }

    @Override // hz3.r
    public void b(hz3.t checkImageResult) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(checkImageResult, "checkImageResult");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCDNImageInfoList-chat checkImageStatus result errType: ");
        sb6.append(checkImageResult.f286363c);
        sb6.append(", errCode: ");
        sb6.append(checkImageResult.f286364d);
        sb6.append(", reUploadInfo: ");
        r45.si siVar = checkImageResult.f286362b;
        if (siVar != null) {
            str = java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f385746g, java.lang.Integer.valueOf(siVar.f385744e), java.lang.Integer.valueOf(siVar.f385745f), java.lang.Integer.valueOf(siVar.f385743d), java.lang.Integer.valueOf(siVar.f385748i)}, 5));
            kotlin.jvm.internal.o.f(str, "format(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageStrategy", sb6.toString());
        int i17 = checkImageResult.f286363c;
        hz3.z zVar = this.f286347j;
        if (i17 != 0 || checkImageResult.f286364d != 0) {
            if (zVar != null) {
                ((iz3.d) zVar).a(i17, checkImageResult.f286364d, checkImageResult.f286365e);
                return;
            }
            return;
        }
        r45.si siVar2 = checkImageResult.f286362b;
        kotlin.jvm.internal.h0 h0Var = this.f286338a;
        kotlin.jvm.internal.h0 h0Var2 = this.f286339b;
        java.util.ArrayList arrayList = this.f286340c;
        if (siVar2 != null) {
            r45.si siVar3 = (r45.si) h0Var.f310123d;
            if (siVar3 != null) {
                siVar3.f385748i = 2;
            }
            r45.si siVar4 = (r45.si) h0Var2.f310123d;
            if (siVar4 != null) {
                siVar4.f385748i = 2;
            }
            kotlin.jvm.internal.o.d(siVar2);
            arrayList.add(siVar2);
            z17 = true;
        } else {
            r45.si siVar5 = (r45.si) h0Var.f310123d;
            if (siVar5 != null) {
                siVar5.f385748i = 1;
            }
            r45.si siVar6 = (r45.si) h0Var2.f310123d;
            if (siVar6 != null) {
                siVar6.f385748i = 1;
            }
            z17 = false;
        }
        boolean z18 = this.f286341d.f310112d;
        ry3.p pVar = this.f286344g;
        if (z18) {
            r45.si siVar7 = (r45.si) h0Var2.f310123d;
            if (siVar7 != null) {
                arrayList.add(siVar7);
            }
            r45.si siVar8 = (r45.si) h0Var.f310123d;
            if (siVar8 != null) {
                siVar8.f385744e = 0;
                siVar8.f385745f = 0;
                arrayList.add(siVar8);
            }
        } else if (!this.f286342e.f310112d || z18) {
            r45.si siVar9 = (r45.si) h0Var2.f310123d;
            if (siVar9 != null) {
                arrayList.add(siVar9);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat hasHd but hd not exist");
            hz3.s sVar = new hz3.s(this.f286343f, 1);
            hz3.m.a(sVar, pVar.f401529c, pVar.f401530d, 1);
            r45.si a17 = sVar.a();
            a17.f385743d = 1;
            arrayList.add(a17);
            r45.si siVar10 = (r45.si) h0Var2.f310123d;
            if (siVar10 != null) {
                arrayList.add(siVar10);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat checkImageStatus result reUpload: %s, list size: %s, request.pHash: %s, needPHash: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(arrayList.size()), pVar.f401537k, java.lang.Boolean.valueOf(pVar.f401538l));
        if (pVar.f401537k == null && pVar.f401538l) {
            hz3.s sVar2 = this.f286345h;
            if (com.tencent.mm.vfs.w6.j(sVar2.f286355b)) {
                str2 = sVar2.f286355b;
            } else {
                hz3.s sVar3 = this.f286346i;
                str2 = com.tencent.mm.vfs.w6.j(sVar3.f286355b) ? sVar3.f286355b : "";
            }
            if (str2.length() > 0) {
                pVar.f401537k = com.tencent.mm.plugin.scanner.model.o1.f158972a.a(str2);
            }
        }
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }
}
