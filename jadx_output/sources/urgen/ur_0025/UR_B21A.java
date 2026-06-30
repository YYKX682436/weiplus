package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0087 J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0087 J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0087 J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0087 J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0087 J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\tH\u0087 ¨\u0006\u001b"}, d2 = {"Lurgen/ur_0025/UR_B21A;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_0FCB", "", "listenId", "", "fromScene", "", "task", "UR_4A4D", com.tencent.mm.plugin.appbrand.j0.f78445f, "", "info", "UR_EDB6", "ptr", "", "UR_5072", "item", "UR_013B", "UR_A5A0", "", "UR_4C57", com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_B21A {
    public static final urgen.ur_0025.UR_B21A INSTANCE = new urgen.ur_0025.UR_B21A();

    private UR_B21A() {
    }

    public static final native void UR_013B(long ptr, byte[] snapshot, byte[] info);

    public static final native void UR_0FCB(java.lang.String listenId, int fromScene, com.tencent.unit_rc.BaseObjectDef task);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_4A4D(byte[] snapshot, byte[] info);

    public static final native boolean UR_4C57(long ptr, java.lang.String clientId);

    public static final native void UR_5072(long ptr, byte[] item, byte[] info);

    public static final native boolean UR_A5A0(long ptr, byte[] item);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.e3();
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_EDB6(long ptr);
}
