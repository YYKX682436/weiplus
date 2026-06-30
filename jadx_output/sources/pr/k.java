package pr;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final pr.k f357722d = new pr.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.storage.e5 a17 = com.tencent.mm.storage.d5.f193836a.a(intValue);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPack: checkDesigner ");
        sb6.append(intValue);
        sb6.append(' ');
        java.util.LinkedList linkedList = a17.f193858b;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", sb6.toString());
        if (linkedList.isEmpty()) {
            new pr.d(intValue, null).b();
        }
        return jz5.f0.f302826a;
    }
}
