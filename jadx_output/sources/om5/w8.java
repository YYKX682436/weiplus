package om5;

/* loaded from: classes10.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.w8 f346695d = new om5.w8();

    public w8() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.q category = (com.tencent.mm.vfs.q) obj;
        kotlin.jvm.internal.o.g(category, "$this$category");
        category.b("image2", new int[]{1, 16, 4, 32, 128, 1024}, om5.v7.f346684d);
        category.b("video", new int[]{1, 4, 32, 128, 16, 1024}, om5.x7.f346704d);
        com.tencent.mm.vfs.p pVar = com.tencent.mm.vfs.p.f213119d;
        category.b("voice", new int[]{1, 8, 4}, pVar);
        category.b("voice2", new int[]{1, 4, 32, 128, 1024}, om5.z7.f346724d);
        category.b("attachment", new int[]{1, 4, 32, 128, 16, 1024}, om5.b8.f346465d);
        category.b("Download", new int[]{8, 4, 16, 1024}, pVar);
        category.b("record", new int[]{1, 4, 32, 128, 16, 1024}, om5.d8.f346487d);
        category.b("selectrecord", new int[]{1, 8, 4, 1024}, pVar);
        category.b("chatroom_notice", new int[]{0, 4, 16, 1024}, pVar);
        category.b("c2c", new int[]{1, 16, 32, 1024}, om5.e8.f346498d);
        category.b("c2c_temp", new int[]{1, 16, 32, 1024}, om5.f8.f346509d);
        category.b("multitask", new int[]{1, 16, 32, 1024}, pVar);
        category.b("MassSendImg", new int[]{1, 8}, om5.h8.f346531d);
        return jz5.f0.f302826a;
    }
}
