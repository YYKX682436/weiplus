package om5;

/* loaded from: classes10.dex */
public final class t6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.t6 f346661d = new om5.t6();

    public t6() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.q category = (com.tencent.mm.vfs.q) obj;
        kotlin.jvm.internal.o.g(category, "$this$category");
        ak0.a aVar = ak0.o.f5542a;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ak0.j.f5538a;
        boolean z17 = ak0.x.f5548k;
        java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(ak0.o.a());
        if (patchDirectory != null) {
            category.b(com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME, new int[0], new om5.l5(patchDirectory));
        }
        com.tencent.mm.vfs.p pVar = com.tencent.mm.vfs.p.f213119d;
        category.b("CheckResUpdate", new int[]{0, 4}, pVar);
        category.b("PublicResource", new int[0], om5.p5.f346616d);
        category.b("XNetLib", new int[]{0}, om5.q5.f346627d);
        category.b("face_detect", new int[0], om5.r5.f346638d);
        category.b("pay_palm_print_resource", new int[0], pVar);
        category.b("scan_passport_model", new int[0], pVar);
        category.b("compressed_shared_object", new int[0], om5.s5.f346649d);
        category.b("NewMsgRingtone", new int[]{16}, om5.t5.f346660d);
        category.b("regioncode", new int[0], pVar);
        category.b("DefaultRingtone", new int[]{16}, om5.u5.f346671d);
        category.b("EmojiFont", new int[0], om5.v5.f346682d);
        category.b("QBarXNet", new int[0], om5.w5.f346692d);
        category.b("WordDetect", new int[0], om5.m5.f346583d);
        category.b("uncompressed_strings", new int[0], om5.n5.f346594d);
        category.b("uncompressed_base_strings", new int[0], om5.o5.f346605d);
        return jz5.f0.f302826a;
    }
}
