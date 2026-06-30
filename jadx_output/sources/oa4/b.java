package oa4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f343852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343853e;

    public b(com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str) {
        this.f343852d = finderObject;
        this.f343853e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f343852d;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc != null && (media = objectDesc.getMedia()) != null && (first = media.getFirst()) != null) {
            java.lang.String str = first.getThumbUrl() + first.getThumb_url_token();
            java.lang.String str2 = this.f343853e;
            java.lang.String c17 = com.tencent.mm.plugin.sns.model.f6.c(str2);
            com.tencent.mm.vfs.w6.h(c17);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342082f = c17;
            fVar.f342078b = true;
            b17.d(str, fVar.a(), new oa4.a(c17, str2, finderObject, str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
    }
}
