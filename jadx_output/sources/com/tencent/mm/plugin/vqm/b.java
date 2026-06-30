package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.b f177316b = new com.tencent.mm.plugin.vqm.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vqm.ZIDL_qbXqC2cfFK f177317a;

    public b() {
        com.tencent.mm.plugin.vqm.ZIDL_qbXqC2cfFK zIDL_qbXqC2cfFK = new com.tencent.mm.plugin.vqm.ZIDL_qbXqC2cfFK();
        this.f177317a = zIDL_qbXqC2cfFK;
        this.zidlCreateName = "vqm.VQMConfAPI@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_vqm", "aff_biz");
        zIDL_qbXqC2cfFK.ZIDL_qbXqC2cfFC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public boolean a() {
        return this.f177317a.ZIDL_A(this.nativeHandler);
    }
}
